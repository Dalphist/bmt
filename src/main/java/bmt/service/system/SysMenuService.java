package bmt.service.system;

import java.util.List;

import bmt.entity.system.SysMenu;
import bmt.entity.system.SysUser;

/**
 * 菜单 业务层
 * 
 * @author ruoyi
 */
public interface SysMenuService
{
    /**
     * 根据用户ID查询菜单
     * 
     * @param user 用户信息
     * @return 菜单列表
     */
    public List<SysMenu> selectMenusByUser(SysUser user);

}
