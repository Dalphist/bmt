package bmt.mapper;

import java.util.List;

import bmt.entity.system.SysMenu;

/**
* Title: SysMenuMapper  
* Description:菜单Mapper
* @author Dalphist  
* @date 2019年5月8日
 */
public interface SysMenuMapper
{
	public List<SysMenu> selectMenuNormalAll();
}
