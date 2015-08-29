package com.fhqinui.frize.biz.dao.sys;

import java.util.List;

import com.fhqinui.frize.common.entity.sys.SysMenu;

public interface ISysMenuDao {
	
	void insert(SysMenu menu); 
	
	List<SysMenu> selectAllMenu();
}
