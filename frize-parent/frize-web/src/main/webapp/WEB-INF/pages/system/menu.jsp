<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>  
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<%@ include  file="../page-head.jsp"%>
<body style="background-color: #FFFFFF;">
	<div class="row">
		<div class="col-md-3">
			<div class="portlet blue-hoki box">
				<div class="portlet-title">
					<div class="caption">
						<i class="fa fa-cogs"></i>菜单管理
					</div>
					<div class="tools">
						<a href="javascript:;" class="collapse">
						</a>
						<a href="#portlet-config" data-toggle="modal" class="config">
						</a>
						<a href="javascript:;" class="reload">
						</a>
						<a href="javascript:;" class="remove">
						</a>
					</div>
				</div>
				<div class="portlet-body" >
					<div id="tree_1" class="tree-demo scroller">
						<ul>
							<li>
								 Root node 1
								<ul>
									<li data-jstree='{ "selected" : true }'>
										<a href="#">
										Initially selected </a>
									</li>
									<li data-jstree='{ "icon" : "fa fa-briefcase icon-state-success " }'>
										 custom icon URL
									</li>
									<li data-jstree='{ "opened" : true }'>
										 initially open
										<ul>
											<li data-jstree='{ "disabled" : true }'>
												 Disabled Node
											</li>
											<li data-jstree='{ "type" : "file" }'>
												 Another node
											</li>
										</ul>
									</li>
									<li data-jstree='{ "icon" : "fa fa-warning icon-state-danger" }'>
										 Custom icon class (bootstrap)
									</li>
								</ul>
							</li>
							<li data-jstree='{ "type" : "file" }'>
								<a href="http://www.jstree.com">
								Clickanle link node </a>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-9">
			<div class="portlet green-meadow box">
				<div class="portlet-title">
					<div class="caption">
						<i class="fa fa-cogs"></i>Checkable Tree
					</div>
					<div class="tools">
						<a href="javascript:;" class="collapse">
						</a>
						<a href="#portlet-config" data-toggle="modal" class="config">
						</a>
						<a href="javascript:;" class="reload">
						</a>
						<a href="javascript:;" class="remove">
						</a>
					</div>
				</div>
				<div class="portlet-body">
					<div id="tree_2" class="tree-demo">
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include  file="../page-footer.jsp"%>
	<script src="${cxt}/assets/global/plugins/jstree/dist/jstree.min.js"></script>
	<script src="${cxt}/assets/admin/pages/scripts/ui-tree.js"></script>
	<script>
	   jQuery(document).ready(function() {    
		   UITree.init();
	   });
	</script>
</body>
</html>