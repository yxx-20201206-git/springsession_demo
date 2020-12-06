package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Auther: yxx
 * @Date: 2020/12/4 09:11
 * @Description:
 */
@RestController
public class TextController {

    //    Set
    @RequestMapping("/setValue")
    public String setValue(HttpSession session) {
        session.setAttribute("msg", "hello session");
        return "success";
    }

    //    get
    @RequestMapping("/getValue")
    public String getValue(HttpSession session) {
        return (String) session.getAttribute("msg");
    }
}
