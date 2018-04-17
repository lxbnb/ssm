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
				<font color="red" size=6>基本信息管理</font> <small>个人信息</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> 主页</a></li>
				<li><a href="#">基本信息</a></li>
				<li class="active">个人信息</li>
			</ol>
			</section>

			<section class="content">
			<div class="box box-primary">
				<div class="box-header" align="center">
					<h1 class="box-title">个人信息</h1>
				</div>
				<div class="box-body">
					<form class="form-horizontal">
						<div class="row">
							<div class="col-md-6">
								<div class="col-sm-8 col-sm-offset-3">
									<img class="img-responsive pad"
										src="${APP_PATH }/dist/img/idcard.jpg" alt="Photo">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="name" class="col-sm-3 control-label">姓名:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_name"> <span
											class="input-group-addon" id="name_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="name_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>

									</div>
									<span id="nameSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="idcard" class="col-sm-3 control-label">身份证:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_idCard">
										<span class="input-group-addon" id="idcard_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="idcard_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>

									</div>
									<span id="idCardSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="birthday" class="col-sm-3 control-label">出生年月:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_birthday"
											disabled>
									</div>
								</div>
								<div class="form-group">
									<label for="sex" class="col-sm-3 control-label">性别:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_sex" disabled>
									</div>
								</div>
								<div class="form-group">
									<label for="birthplace" class="col-sm-3 control-label">籍贯:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_birthplace"
											disabled>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="nation" class="col-sm-3 control-label">民族:</label>
									<div class="input-group col-sm-8">
										<select class="select_search" style="width: 100%"
											id="p_nation">
											<option value="">--选择民族--</option>
										</select>
									</div>
									<span id="nationSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="diploma" class="col-sm-3 control-label">学历:</label>
									<div class="input-group col-sm-8">
										<select class="select_search" style="width: 100%"
											id="p_diploma">
											<option value="">--选择学历--</option>
										</select>
									</div>
									<span id="diplomaSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="school" class="col-sm-3 control-label">毕业学校:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_school">
										<span class="input-group-addon" id="school_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="school_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>

									</div>
									<span id="schoolSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="graduate" class="col-sm-3 control-label">毕业日期:</label>
									<div class="input-group col-sm-8">
										<div class="input-group date">
											<div class="input-group-addon">
												<i class="fa fa-calendar"></i>
											</div>
											<input type="text" class="form-control pull-right"
												id="p_gradate">
										</div>
										<span id="gradateSpan" class="col-sm-8"></span>

									</div>
								</div>
								<div class="form-group">
									<label for="profession" class="col-sm-3 control-label">所学专业:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_profession">
										<span class="input-group-addon" id="profession_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="profession_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>

									</div>
									<span id="professionSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="checkbox col-md-8 col-md-offset-3">
								<label> <input type="checkbox" value="">
									我承诺我所填写的一切信息皆属实，信息不实引起的任何法律问题都将由我个人承担
								</label>
							</div>

							<div class="col-md-2 col-md-offset-5" style="margin-top: 20px">
								<button type="button" class="btn btn-info" style="width: 100%">保存</button>
							</div>

						</div>
					</form>
					<div style="height: 20px"></div>
					<div
						class="alert alert-info alert-dismissible col-md-10 col-md-offset-1">
						<h4>
							<i class="icon fa fa-info"></i> 提示信息:
						</h4>
						1、姓名、身份证为必填项。<br>2、生日、出生年月和籍贯不用填写，将自动从身份证中读取。<br>
						3、当未审核或审核不通过时，信息可以随意修改。当审核通过时信息将变为只读不可修改。<br>

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
	<script type="text/javascript" src="${APP_PATH }/myjs/personInfo.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('.select_search').select2();
		});
		$('#p_gradate').datepicker({
			autoclose : true
		})
	</script>
	<%-- <script type="text/javascript" src="${APP_PATH}/myjs/bodyleft.js"></script> --%>
</body>
</html>
