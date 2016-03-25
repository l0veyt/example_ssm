package com.example.ssm.controller;

import com.example.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Xin.Lee on 2016/3/24.
 *
 */
@Controller
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public ModelAndView register() {
        return null;
    }

    @RequestMapping(value = "/logon", method = RequestMethod.GET)
    public ModelAndView logon(String username, String password) {
        userService.getPassword(username);
        return null;
    }
}
