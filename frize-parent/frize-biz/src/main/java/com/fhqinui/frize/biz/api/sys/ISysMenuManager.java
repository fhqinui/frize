package com.fhqinui.frize.biz.api.sys;

import java.util.List;

import com.fhqinui.frize.common.entity.sys.SysMenu;

public interface ISysMenuManager {

	void createMenu(SysMenu menu);
	
	List<SysMenu> listMenus();
}
