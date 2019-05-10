package bmt.controller.system;

import java.util.List;

import org.apache.tomcat.jni.Global;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import bmt.common.utils.ShiroUtils;
import bmt.controller.BaseController;
import bmt.entity.system.SysMenu;
import bmt.entity.system.SysUser;
import bmt.service.system.SysMenuService;


@Controller
public class IndexController extends BaseController {
	@Autowired
    private SysMenuService menuService;
	
    @GetMapping("/index")
    public String index(ModelMap mmap) {
    	// 取身份信息
        SysUser user = ShiroUtils.getSysUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
//        mmap.put("copyrightYear", Global.getCopyrightYear());
    	return "index";
    }
    
 // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
//        mmap.put("version", Global.getVersion());
        return "system/main";
    }
}
