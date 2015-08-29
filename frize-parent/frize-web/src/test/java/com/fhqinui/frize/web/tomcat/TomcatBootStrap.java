package com.fhqinui.frize.web.tomcat;

/** 
* @ClassName: permissionTomcatBootStrap 
* @Description:嵌入式tomcat
* @author zhaofei 
* @date 2014年3月3日 下午2:50:05  
*/
public class TomcatBootStrap {
	public static void main(String[] args) {
		new TomcatBootstrapHelper(8080, false, "local").start();
	}
}