package com.boot.web.intercepter;

import com.boot.web.annotation.AuthRequest;
import com.boot.web.annotation.SkipAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author codethink
 * @date 12/19/16 12:08 PM
 */
public class HttpContentTraceInterceptor implements HandlerInterceptor {
    private final Logger httpLogger = LoggerFactory.getLogger(HttpContentTraceInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            httpLogger.info("web....................handler.");
        }

        if (needAuth(request, handler)) {
            httpLogger.info("Need Auth....");
        }

        return true;
    }



    private boolean needAuth(HttpServletRequest request, Object handler) {

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            AuthRequest authReqAnno = handlerMethod.getMethodAnnotation(AuthRequest.class);
            if (authReqAnno != null) {
                return true;
            }

            SkipAuth skipAuthAnno = handlerMethod.getMethodAnnotation(SkipAuth.class);
            if (skipAuthAnno != null) {
                return false;
            }
        } else {
            return false;
        }

        String requestMethod = request.getMethod().toUpperCase();
        if (requestMethod.equals("GET") || requestMethod.equals("OPTIONS")) {
            return false;
        }

        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
    }

}
