package com.lee.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * simple test
 *
 * @author shangjianli
 * @since 2017-04-12-上午2:46
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/home")
    public String hello() {
        return "home";
    }
}
