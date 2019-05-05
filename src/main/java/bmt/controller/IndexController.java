package bmt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bmt.common.utils.ShiroUtils;
import bmt.entity.system.SysUser;


@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
    	// 取身份信息
        SysUser user = ShiroUtils.getSysUser();
        // 根据用户id取出菜单
//        List<SysMenu> menus = menuService.selectMenusByUser(user);
//        mmap.put("menus", menus);
//        mmap.put("user", user);
//        mmap.put("copyrightYear", Global.getCopyrightYear());
    	return "index";
    }
}
