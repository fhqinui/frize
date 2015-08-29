<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
<div class="page-sidebar navbar-collapse collapse">
	<!-- BEGIN SIDEBAR MENU -->
	<!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
	<!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
	<!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
	<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
	<!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
	<!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
	<ul class="page-sidebar-menu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
		<!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
		<li class="sidebar-toggler-wrapper">
			<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
			<div class="sidebar-toggler">
			</div>
			<!-- END SIDEBAR TOGGLER BUTTON -->
		</li>
		<li class="start ">
			<a href="javascript:;">
			<i class="icon-home"></i>
			<span class="title">系统设置</span>
			<span class="arrow "></span>
			</a>
			<ul class="sub-menu">
				<li>
					<a href="index.html">
					<i class="icon-bar-chart"></i>
					菜单管理</a>
				</li>
				<li>
					<a href="index_2.html">
					<i class="icon-bulb"></i>
					用户管理</a>
				</li>
				<li>
					<a href="index_3.html">
					<i class="icon-graph"></i>
					权限管理</a>
				</li>
			</ul>
		</li>
		<li class="end ">
			<a href="javascript:;">
			<i class="icon-basket"></i>
			<span class="title">项目管理</span>
			<span class="arrow "></span>
			</a>
			<ul class="sub-menu">
				<li>
					<a href="ecommerce_index.html">
					<i class="icon-home"></i>
					项目申请</a>
				</li>
				<li>
					<a href="ecommerce_orders.html">
					<i class="icon-basket"></i>
					项目上报</a>
				</li>
				<li>
					<a href="ecommerce_orders_view.html">
					<i class="icon-tag"></i>
					项目审核</a>
				</li>
				<li>
					<a href="ecommerce_products.html">
					<i class="icon-handbag"></i>
					项目查询</a>
				</li>
			</ul>
		</li>
	</ul>
	<!-- END SIDEBAR MENU -->
</div>