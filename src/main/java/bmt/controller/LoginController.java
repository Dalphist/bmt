package bmt.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bmt.common.beans.ResultBean;

@Controller
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public ResultBean<String> login(String username, String password,Boolean rememberMe) {
    	ResultBean<String> resultBean = new ResultBean<String>();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,rememberMe);
        try
        {
            subject.login(token);
            return resultBean.success();
        }
        catch (AuthenticationException e)
        {
            String msg = "用户或密码错误";
            return resultBean.fail().message(msg);
        }
    }
}
