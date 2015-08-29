package com.fhqinui.frize.biz.impl.sys;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fhqinui.frize.biz.api.sys.ISysMenuManager;
import com.fhqinui.frize.biz.dao.sys.ISysMenuDao;
import com.fhqinui.frize.common.entity.sys.SysMenu;

/**
 * 系统菜单
 *  
 * @author zhaofei
 * @date 2015年7月31日 下午1:50:40
 */
@Service
public class SysMenuManagerImpl implements ISysMenuManager{

	@Resource
	private ISysMenuDao sysMenuDao;
	
	@Override
	public void createMenu(SysMenu menu) {
		this.sysMenuDao.insert(menu);
	}

	@Override
	public List<SysMenu> listMenus() {
		List<SysMenu> menuList = sysMenuDao.selectAllMenu();
		return menuList;
	}
	
}
