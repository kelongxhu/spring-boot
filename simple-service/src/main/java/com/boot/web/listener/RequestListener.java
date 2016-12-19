package com.boot.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.ServletRequestHandledEvent;

/**
 * @author codethink
 * @date 12/19/16 1:04 PM
 */
@Configuration
public class RequestListener implements ApplicationListener<ServletRequestHandledEvent> {

    private final Logger logger = LoggerFactory.getLogger(RequestListener.class);

    @Override
    public void onApplicationEvent(ServletRequestHandledEvent event) {

        logger.info(event.getMethod());
        logger.info(event.getRequestUrl());
    }
}
