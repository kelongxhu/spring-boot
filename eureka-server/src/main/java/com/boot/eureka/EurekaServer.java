package com.boot.eureka;

/**
 * @author codethink
 * @date 12/19/16 3:53 PM
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
        String errorString="emergency! eureka may be incorrectly claiming instances are up when they're not.";
        errorString="the self preservation mode is turned off.";
    }
}
