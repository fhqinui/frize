package com.fhqinui.frize.web.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.fhqinui.frize.common.http.CommonResult;
import com.fhqinui.frize.dal.PermissionResult;
/**
 * boss系统主页相关controller
 * @author JiaoJian
 */
@Controller
@RequestMapping("/main")
public class MainController {
	
	public static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	/**
	 * 系统主页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/page.do", method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, HttpServletResponse response){
		return  "index";
	}
	
	/**
	 * 根据菜单查询子菜单
	 * @param pCode
	 * @return
	 */
	@RequestMapping(value="/menus.do", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Object getMainMenus(@RequestParam(value="pCode", required=false)String pCode,
			HttpServletRequest request, HttpServletResponse response) {
		
		//HttpSession session = request.getSession();
		//Object permission = session.getAttribute("permission");
		List<PermissionResult> permissionList = new ArrayList<PermissionResult>();
		PermissionResult permession = new PermissionResult();
		permession.setBusinesscode("com.fhqinui.frize.core.user");
		permession.setParentPermissionCode("com.fhqinui.frize.core");
		permession.setPermissionName("用户");
		permession.setPermissionType("module");
		
		PermissionResult permession2 = new PermissionResult();
		permession2.setBusinesscode("com.fhqinui.frize.core");
		permession2.setPermissionName("用户");
		permession2.setPermissionType("module");
		permissionList.add(permession);
		CommonResult commonResult = new CommonResult();
		commonResult.setCode("1");
		commonResult.setMessage("操作成功");
		commonResult.setData(permissionList);
		return JSON.toJSONString(commonResult);
	}
}
