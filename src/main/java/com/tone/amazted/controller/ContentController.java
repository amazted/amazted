package com.tone.amazted.controller;

import com.tone.amazted.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> className:    User
 * <p> package:    com.tone.amazted
 * <p> description:    测试Springboot 整合JSP
 * <p> datetime:    2020/1/22   15:59
 * <p> author:   scshfei@gmail.com
 */

@Controller
public class ContentController {
    @GetMapping(value = {"/showUsers"})
    public ModelAndView getUsers(){
        //构建测试数据
        List<User> userList = new ArrayList<User>();
        User u1 = new User(1, "Tom", "America");
        User u2 = new User(2, "LeiLi", "China");
        userList.add(u1);
        userList.add(u2);
        //创建一个模型视图对象
        ModelAndView modelAndView = new ModelAndView();
        //将数据放置到ModelAndView对象中
        modelAndView.addObject("userList", userList);
        // 指定content.jsp视图接受model
        modelAndView.setViewName("content");
        //返回ModelAndView对象mav
        return modelAndView;
    }
}