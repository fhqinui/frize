package com.fhqinui.frize.biz.dao.sys.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.fhqinui.frize.biz.dao.sys.ISysMenuDao;
import com.fhqinui.frize.common.entity.sys.SysMenu;
import com.fhqinui.frize.common.entity.sys.SysMenuExample;
import com.fhqinui.frize.common.utils.PrimaryKeyCreater;
import com.fhqinui.frize.dal.mybatis.mapper.sys.SysMenuMapper;

@Component
public class SysMenuDaoImpl implements ISysMenuDao{
	
	@Resource
	private SysMenuMapper sysMenuMapper;
	
	@Override
	public void insert(SysMenu menu) {
		menu.setId(PrimaryKeyCreater.getPrimaryKey());
		menu.setRawAddTime(new Date());
		this.sysMenuMapper.insertSelective(menu);
	}

	@Override
	public List<SysMenu> selectAllMenu() {
		SysMenuExample example = new SysMenuExample();
		return sysMenuMapper.selectByExample(example);
	}

}
