package com.boot.web.controllor;

/**
 * @author codethink
 * @date 12/19/16 11:15 AM
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping("/test")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
