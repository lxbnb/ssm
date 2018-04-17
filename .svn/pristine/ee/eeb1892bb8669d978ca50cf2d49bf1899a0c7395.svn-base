<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="common/head.jsp"></jsp:include>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<body class="hold-transition skin-blue sidebar-mini">

	<!-- ===============================页面主内容===================================================-->
	<div class="wrapper">
		<!-- ===============================顶部工具栏===================================================-->
		<jsp:include page="common/bodyHeader.jsp"></jsp:include>

		<!--===================================左侧菜单栏=====================================================-->
		<jsp:include page="common/leftmenu.jsp"></jsp:include>

		<div class="content-wrapper">

			<section class="content-header">
			<h1>
				<font color="red" size=6>基本信息管理</font> <small>公司信息</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> 主页</a></li>
				<li><a href="#">基本信息</a></li>
				<li class="active">公司列表</li>
			</ol>
			</section>

			<section class="content">

			<div class="box">

				<div class="row">

					<div class="col-md-12">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>序号</th>
									<th>公司名称</th>
									<th>公司简介</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody id="t_body">
							</tbody>
						</table>

					</div>
					<div>
						<div class="col-md-8" id="page_info_area"></div>
						<div class="col-md-4 pull-right" id="page_nav_area"></div>
					</div>
				</div>
			</div>
			</section>
		</div>

		<footer class="main-footer">
		<div class="pull-right hidden-xs">
			<b>版本</b> 1.0.0
		</div>
		<strong>系统制作时间 &copy; 2017- <a href="#">木子李之家</a>.
		</strong> 系统制作人:木子李 </footer>
		<jsp:include page="common/bodyRight.jsp"></jsp:include>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$('.select_search').select2();
		});
	</script>
</body>
</html>
