package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //controller调用service
    @Autowired
    //@Qualifier("userServiceImpl")
    private UserService userService;
    //查询所有用户，返回到一个用户展示界面
    @RequestMapping("/as")
    public String list(Model model){
        List<User> list=userService.selectAll();
        model.addAttribute("list",list);
        return "as";
    }
    @RequestMapping("/save.do")
    public String insert(User user){
        userService.insert(user);
        return "redict:/user/as";
    }


}
