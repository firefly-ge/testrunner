package com.run.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/aa")
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "hello runner!";
    }

    @RequestMapping("/dd")
    @ResponseBody
    public String indexdd() {
        return "hello runner dd!";
    }
    @RequestMapping("/bb")
    @ResponseBody
    public String index2() {
        return "hello runner cc!";
    }
}
