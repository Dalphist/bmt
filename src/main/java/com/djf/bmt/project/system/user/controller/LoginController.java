package com.djf.bmt.project.system.user.controller;

import static com.djf.bmt.framework.web.domain.AjaxResult.success;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.djf.bmt.framework.web.domain.AjaxResult;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public AjaxResult ajaxLogin(String username, String password, Boolean rememberMe)
    {
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
//        Subject subject = SecurityUtils.getSubject();
//        try
//        {
//            subject.login(token);
            return success();
//        }
//        catch (AuthenticationException e)
//        {
//            String msg = "用户或密码错误";
//            if (StringUtils.isNotEmpty(e.getMessage()))
//            {
//                msg = e.getMessage();
//            }
//            return error(msg);
//        }
    }
}
