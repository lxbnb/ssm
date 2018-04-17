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
				<li class="active">公司信息</li>
			</ol>
			</section>

			<section class="content">

			<div class="box box-primary">
				<div class="box-header" align="center">
					<h1 class="box-title">公司信息</h1>
				</div>
				<div class="box-body">
					<form class="form-horizontal">
						<div class="row">

							<div class="col-md-6">
								<div class="form-group">
									<label for="name" class="col-sm-3 control-label">公司名称:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="com_name">
										<span class="input-group-addon" id="name_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="name_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>

									</div>
									<span id="comNameSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>

								<div class="form-group">
									<label for="idcard" class="col-sm-3 control-label">组织机构代码:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="com_code">
										<span class="input-group-addon" id="code_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="code_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>

									</div>
									<span id="comCodeSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="name" class="col-sm-3 control-label">法定代表人:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="com_p_name">
										<span class="input-group-addon" id="p_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="p_false" style="display: none"><i
											class="fa fa-close text-red"></i></span>

									</div>
									<span id="comPNameSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="birthday" class="col-sm-3 control-label">成立日期:</label>
									<div class="input-group col-sm-8">
										<div class="input-group date">
											<div class="input-group-addon">
												<i class="fa fa-calendar"></i>
											</div>
											<input type="text" class="form-control pull-right"
												id="com_birthday">
										</div>
										<span id="comBirthdaySpan" class="col-sm-8"></span>

									</div>
								</div>
								

							</div>
							<div class="col-md-6">
								<div class="col-sm-8 col-sm-offset-3">
									<img class="img-responsive pad"
										src="${APP_PATH }/dist/img/company.jpg" alt="Photo">
								</div>
							</div>
						</div>
					</form>
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
		$('#com_birthday').datepicker({
			autoclose : true
		})
	</script>

</body>
</html>
