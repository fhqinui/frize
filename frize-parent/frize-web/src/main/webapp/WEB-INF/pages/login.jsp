<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>  
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />  
<title>XXXX管理系统</title>
<link rel="stylesheet" type="text/css" href="${ctx}/css/commons/login_style.css">
<link rel="stylesheet" type="text/css" href="${ctx}/css/commons/fwslider.css" >
<script type="text/javascript" src="${ctx}/js/commons/jquery.js"></script> 
<script type="text/javascript" src="${ctx}/js/commons/replaceSpecialChar.js"></script>
<script type="text/javascript" src="${ctx}/js/commons/jquery-ui.js"></script>
<script type="text/javascript" src="${ctx}/js/commons/fwslider.js"></script>
<script type="text/javascript" src="${ctx}/js/login/customer.js" ></script> 
<script type="text/javascript" src="${ctx}/js/login/md5.js"></script>
<script type="text/javascript" src="${ctx}/js/login/jsMD5.js"></script>
<script type="text/javascript">
	$().ready(function() {
		$(".showPlaceholder input").each(function() {
			if ($(this).val() != '') {
				$(this).prev().attr("style", "display: none;");
			}
			$(this).bind("blur", function() {
				if ($(this).val() == '') {
					$(this).prev().attr("style", "display: block;");
				} else {
					$(this).val(replaceSpecialChar($(this).val()));
				}
			});
			$(this).bind("focus", function() {
				if ($(this).val() == '') {
					$(this).prev().attr("style", "display: none;");
				}
			});
		});
	});
</script>
</head>

<body >
<form name="loginForm" action="${ctx}/main/page.do" method="GET" id="loginForm">
<div class="top">
  <div class="top_cont">
    <div class="logo">
        <img src="${ctx }/images/logo.png" width="42" height="42">
        <h1>XXXX管理系统</h1>
        <span>XXXX Managenment system</span>
    </div>
    <div class="it_tel">IT服务热线：XXXXXXXX</div>
  </div>
</div>

<div class="banner">
	<div id="fwslider">
	    <div class="slider_container">
	      <div class="slide slide_item1" > <img src="${ctx }/images/login/6.jpg"  />
	        <div class="slide_content">
	          <div class="slide_content_wrap">
	              <!--<a href="#" target="_blank" class="slide_into">详情进入</a> -->
	          </div>
	        </div>
	      </div>
	      <div class="slide slide_item2"> <img src="${ctx }/images/login/7.jpg">
	        <div class="slide_content">
	          <div class="slide_content_wrap">
	          </div>
	        </div>
	      </div>
	      <div class="slide slide_item3"> <img src="${ctx }/images/login/8.jpg"/>
	        <div class="slide_content">
	          <div class="slide_content_wrap">
	          </div>
	        </div>
	      </div>
	      <div class="slide slide_item3"> <img src="${ctx }/images/login/9.jpg"/>
	        <div class="slide_content">
	          <div class="slide_content_wrap">
	          </div>
	        </div>
	      </div>
	    </div>
	    <div class="timers"></div>
	    <div class="slidePrev"><span class="pngFix"></span></div>
	    <div class="slideNext"><span class="pngFix"></span></div>
	</div>
	<!--login-->
	<div class="login tab-1" id="loginBlock">
		<div class="loginFunc">
			<div class="loginFuncNormal" id="lbNormal">
				用户登录
			</div>
			<!--<div class="loginFuncMobile" id="lbMob">
				手机号登录
			</div>-->
		</div>
		<div class="loginForm">
			<div class="loginFormIpt showPlaceholder" id="idInputLine">
				<b class="ico ico-uid"></b>
				<label id="idPlaceholder" class="placeholder" for="code">请输入您的用户名</label>
				<input type="text" value="" name="code" maxlength="50" id="code" title="请输入用户名" tabindex="1" class="loginFormTdIpt" autocomplete="off" onkeyup="changePngForCode()"/>
				<div id="idInputTest"></div>
			</div>
		    <!--error start-->   
		    <!--error username start-->
			<div id="errorAlert" class=" errorAlert-hd" style="top: 15px;">
				<div class="error-hd"></div>
				<div class="error-mid">
					<div class="error-tt">
						<p id="errorTitle">请先输入您的用户名</p>
					</div>
					<div style="display:none" class="error-detail" id="errorDetail">
						<p>提示：</p>
						<p class="error-info" id="errorInfo"></p>
					</div>
				</div>
				<div class="error-ft"></div>
				<div class="error-arrow" id="errorArr" style="top: 25.5px;"></div>
			</div>
		    <!--error pwd start-->
		    <div id="errorAlert" class=" errorAlert-hd" style="top: 72px;">
				<div class="error-hd"></div>
				<div class="error-mid">
					<div class="error-tt">
						<p id="errorTitle">请输入您的密码</p>
					</div>
					<div style="display:none" class="error-detail" id="errorDetail">
						<p>提示：</p>
						<p class="error-info" id="errorInfo"></p>
					</div>
				</div>
				<div class="error-ft"></div>
				<div class="error-arrow" id="errorArr" style="top: 25.5px;"></div>
			</div>
			<!--error pwd end-->
		    <!--提交错误结果-->
		    <c:if test="${fn:length(errList)!=0}">
		    <div id="errorAlert" class=" errorAlert-show" style="top: 0;">
				<div class="error-hd"></div>
				<div class="error-mid">
					<c:choose>
						<c:when test="${isLoginFail}">
							<div class="error-tt">
								<p id="errorTitle">帐号或密码错误</p>
							</div>
							<div style="display: block;" class="error-detail" id="errorDetail">
								<p>提示：</p>
								<p class="error-info" id="errorInfo">1. 请检查帐号拼写，是否输入有误。<br>2. 若您忘记密码，请联系管理员。<br>3. 若登录用户名已更换，可联系管理员索取帐号。<br>4.若IP地址受限，请联系管理员。</br></p>
							</div>
						</c:when>
						<c:otherwise>
							<div class="error-tt">
								<p id="errorTitle">错误</p>
							</div>
							<div style="display: block;" class="error-detail" id="errorDetail">
								<p>提示：</p>
								<p class="error-info" id="errorInfo">
									<c:forEach items="${errList}" varStatus="status" var="errmsg">
										${status.count}. ${errmsg} <br/> 
									</c:forEach>
								</p>
							</div>
						</c:otherwise>
					</c:choose>
				</div>
				<div class="error-ft"></div>
				<div class="error-arrow" id="errorArr" style="top: 87.5px;"></div>
			</div>
			</c:if>
		      <!--error end-->          
			<div class="loginFormIpt showPlaceholder" id="pwdInputLine">
				<b class="ico ico-pwd"></b>
				<label id="pwdPlaceholder" class="placeholder" for="password">密码</label>
				<input type="password" name="password" id="password" title="请输入密码" tabindex="2" class="loginFormTdIpt" onkeyup="changePngForPwd()" onKeyPress="if (event.keyCode == 13) { validateLoign(); }"/>
				<p style="display: none" id="capsLockHint">大写状态开启</p>
			</div>
			<div class="loginFormBtn">
				<input type="button" tabindex="6" class="btn btn-login" id="loginBtn" onclick="validateLoign()" value="登&nbsp;&nbsp;录"></input>
			</div>
		</div>
	</div>
</div>
<div class="footer">版权所有 © fhqinui Copyright©  <span id="w_7" high-light-id="w_7,w_12">Innovation</span> Software Technology Co .,Ltd</div>
</form>
</body>
</html>