package com.boot.web;

import com.boot.web.listener.RequestListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author codethink
 * @date 12/19/16 11:19 AM
 */
@Configuration
@ComponentScan("com.boot")
@EnableAutoConfiguration
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addListeners(new RequestListener());
        application.run(args);
    }
}
