package com.example.demo.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Chenny
 * @version 1.0
 * @date 2019/7/22 10:19
 * @email bbc123good@163.com
 * @address http://106.12.38.131:8011
 * @describe 异常控制器
 */
@Controller
public class errorController {

    @GetMapping("/error")
    public ModelAndView error() {
        return new ModelAndView("/error");
    }
}
