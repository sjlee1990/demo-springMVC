package com.lee.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * simple test
 *
 * @author shangjianli
 * @since 2017-04-12-上午2:46
 */
@ResponseBody
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/home")
    public String hello() {
        return "home";
    }
}
