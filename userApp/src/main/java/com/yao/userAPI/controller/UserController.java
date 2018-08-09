package com.yao.userAPI.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.yao.userAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class UserController {
    @Reference
    private UserService userService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        //获取列表页
        List list = userService.getListUser();
        model.addAttribute("list", list);
        //list.jsp + model = ModelAndView
        return "list";// /WEB-INF/jsp/"list".jsp
    }

}
