package com.boot.web.controllor;

/**
 * @author codethink
 * @date 12/19/16 11:15 AM
 */
import com.boot.config.UserSetting;
import com.boot.exception.MyException;
import com.boot.web.annotation.AuthRequest;
import com.boot.web.intercepter.HttpContentTraceInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SampleController {

    private final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Resource
    private UserSetting userSetting;


    @RequestMapping("/test")
    @ResponseBody
    String home() {
        String result =
            String.format("Hello ,name:%s,age:%s", userSetting.getName(), userSetting.getAge());

        return result;
    }

    @RequestMapping("/hello")
    @ResponseBody
    @AuthRequest
    String hello(){
        logger.info("Hello World");
        return "Hello World";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }



    @RequestMapping("/index2")
    public String index2(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index2";
    }

    @RequestMapping("/index3")
    public String index3(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index3";
    }

    @RequestMapping("/ex")
    public String ex() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json/ex")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
