<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="common/head.jsp"></jsp:include>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<body class="hold-transition skin-blue sidebar-mini">
	<!-- ===============================查看模态框===================================================-->
	<div class="modal fade" id="look_modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">系统详细信息</h4>
				</div>
				<div class="modal-body">

					<table class="table table-hover">
						<tr>
							<td>系统名称</td>
							<td><span id="s_name"></span></td>
						</tr>
						<tr>
							<td>系统简介</td>
							<td id="s_info">简介</td>
						</tr>
						<tr>
							<td>系统内容</td>
							<td><textarea style="width: 460px; height: 70px"
									id="s_content"></textarea></td>
						</tr>
					</table>

				</div>
				<div class="modal-footer">
					<!-- <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> -->
					<button type="button" class="btn btn-primary" id="p_btn"
						rel="popover">个人账号申请</button>
					<button type="button" class="btn btn-primary" id="com_btn"
						rel="popover">企业账号申请</button>
					<button type="button" class="btn btn-primary" id="m_btn"
						rel="popover">管理员账号申请</button>
				</div>
			</div>
		</div>
	</div>
	<!-- ===============================注册选择模态框===================================================-->
	<div class="modal fade" id="reg_model" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h3 class="modal-title" id="myModalLabel">账号类型</h3>
				</div>
				<div class="modal-body">
					<div class="row">
						<!-- 个人注册 -->
						<div class="col-md-4">
							<div class="small-box bg-aqua">
								<div class="inner">
									<h4>个人</h4>

									<p>账号</p>
								</div>
								<div class="icon">
									<i class="ion ion-person"></i>
								</div>
								<a href="#" class="small-box-footer" id="p_a"> 前去申请 <i
									class="fa fa-arrow-circle-right"></i>
								</a>
							</div>
						</div>
						<div class="col-md-4">
							<div class="small-box bg-yellow">
								<div class="inner">
									<h4>公司</h4>

									<p>账号</p>
								</div>
								<div class="icon">
									<i class="ion ion-person-stalker"></i>
								</div>
								<a href="#" class="small-box-footer" id="com_a"> 前去申请 <i
									class="fa fa-arrow-circle-right"></i>
								</a>
							</div>
						</div>
						<div class="col-md-4">
							<div class="small-box bg-blue">
								<div class="inner">
									<h4>管理员</h4>

									<p>账号</p>
								</div>
								<div class="icon">
									<i class="ion ion-person-add"></i>
								</div>
								<a href="#" class="small-box-footer" id="m_a"> 前去申请 <i
									class="fa fa-arrow-circle-right"></i>
								</a>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<!-- ===============================注册模态框内容===================================================-->
	<div class="modal fade" id="register_modal" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">系统注册信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="row">
							<div class="col-md-2"></div>
							<div class="col-md-8">
								<div class="form-group">
									<label for="name" class="col-sm-3 control-label">姓名:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_s_name" disabled>
									</div>
								</div>
								<div class="form-group">
									<label for="idcard" class="col-sm-3 control-label">身份证:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_s_idcard"
											disabled>
									</div>
								</div>
								<div class="form-group">
									<label for="email" class="col-sm-3 control-label">邮箱:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_s_email">
										<span class="input-group-addon" id="email_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="email_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>
									</div>
									<span id="emailSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="phone" class="col-sm-3 control-label">手机:</label>
									<div class="input-group col-sm-8">
										<input type="text" class="form-control" id="p_s_phone">
										<span class="input-group-addon" id="phone_true"
											style="display: none"><i
											class="fa fa-check text-green"></i></span> <span
											class="input-group-addon" id="phone_false"
											style="display: none"><i class="fa fa-close text-red"></i></span>
									</div>
									<span id="phoneSpan" class="col-sm-8 col-sm-offset-3"></span>
								</div>
								<div class="form-group">
									<label for="certName" class="col-sm-3 control-label">报考方向:</label>
									<div class="input-group col-sm-8">
										<select class="select_search" style="width: 100%"
											id="p_s_certName">
											<option value="">--选择报考方向--</option>
										</select>
									</div>
								</div>

							</div>
						</div>
					</form>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="p_reg_btn"
						rel="popover">提交</button>
				</div>
			</div>
		</div>
	</div>
	<!-- ===============================页面主内容===================================================-->
	<div class="wrapper">
		<!-- ===============================顶部工具栏===================================================-->
		<jsp:include page="common/bodyHeader.jsp"></jsp:include>
		<!--===================================左侧菜单栏=====================================================-->
		<jsp:include page="common/leftmenu.jsp"></jsp:include>

		<div class="content-wrapper">
			<!--===================================主内容头部=====================================================-->
			<section class="content-header">
			<h1>
				<font color="red" size=6>系统管家</font> <small>列表</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> 主页</a></li>
				<li class="active">系统列表</li>
			</ol>
			</section>
			<!--===================================主内容主体=====================================================-->
			<section class="content">

			<div class="box">

				<div class="row">

					<div class="col-md-12">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>序号</th>
									<th>系统名称</th>
									<th>系统简介</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody id="s_body">
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
	<script type="text/javascript" src="${APP_PATH }/myjs/systemlist.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('.select_search').select2();
		});
	</script>
	<%-- <script type="text/javascript" src="${APP_PATH}/myjs/bodyleft.js"></script> --%>
</body>
</html>
