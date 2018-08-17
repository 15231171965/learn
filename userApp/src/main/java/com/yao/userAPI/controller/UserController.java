package com.yao.userAPI.controller;


import com.yao.userAPI.entity.User;
import com.yao.userAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.html")
    public String login(){
        return "login/login";
    }

    @RequestMapping("/doLogin")
    @ResponseBody
    public String doLogin(@RequestParam("userName") String userName,
                          @RequestParam("passWord") String passWord,
                          HttpServletRequest request){
        User user = userService.doLogin(userName, passWord);
        if (user == null){
            return "false";
        }
        request.getSession().setAttribute("userSession",user);
        return "true";
    }


    @RequestMapping("userInfo.html")
    public String userInfo(HttpSession session){
        return "/user/userInfo";
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        //获取列表页
        List list = userService.getListUser();
        model.addAttribute("list", list);
        //list.jsp + model = ModelAndView
        return "list";// /WEB-INF/jsp/"list".jsp
    }



}
