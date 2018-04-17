<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<jsp:include page="common/head.jsp"></jsp:include>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<h1 class="box-title">木子李的java屋</h1>
		</div>

		<div class="alert alert-success alert-dismissible"
			style="display: none" id="result_btn">
			<button type="button" class="close" data-dismiss="alert"
				aria-hidden="true"></button>
			<h4>
				<i class="icon fa fa-check"></i> <span id="result_name"></span>
			</h4>
			<span id="result_msg"></span>
		</div>
		<c:if test="${msg!=null}">
			<div class="alert alert-danger alert-dismissible" id="result_login">
				<button type="button" class="close" data-dismiss="alert"
					aria-hidden="true">&times;</button>
				<h4>
					<i class="icon fa fa-check"></i> <span>登陆失败!</span>
				</h4>
				<span>${msg}</span>
			</div>
		</c:if>
		<div class="login-box-body">
			<ul class="nav nav-tabs" role="tablist">
				<li role="presentation" class="active"><a href="#home"
					aria-controls="home" role="tab" data-toggle="tab" id="login_a">登陆</a></li>
				<li role="presentation "><a href="#profile"
					aria-controls="profile" role="tab" data-toggle="tab"
					id="register_a">注册</a></li>
			</ul>
			<p class="login-box-msg"></p>
			<div class="tab-content">
				<div role="tabpanel" class="tab-pane active" id="home">
					<form action="${APP_PATH}/main" method="POST">
						<div class="form-group has-feedback">
							<label>用户名</label> <input type="text"
								class="form-control" placeholder="请输入用户名" name="username" style="width:100%">
							<span class="fa fa-user text-blue form-control-feedback"></span>
						</div>
						<div class="form-group has-feedback">
							<label style="padding-left: 3px">密码</label> <input
								type="password" class="form-control" placeholder="请输入密码"
								name="password"> <span
								class="fa fa-lock text-blue form-control-feedback"></span>
						</div>
						<div class="form-group has-feedback">
							<input type="checkbox"> 记住密码
						</div>
						<div class="form-group has-feedback">
							<button type="submit" class="btn btn-primary btn-block btn-flat">登陆</button>
						</div>
						<div class="form-group has-feedback" style="text-align: center;">
							<hr>
							<a href="#">忘记密码?请点我</a>
						</div>
					</form>
				</div>
				<div role="tabpanel" class="tab-pane" id="profile">
					<form id="reg_form">
						<div class="form-group has-feedback">
							<label class="control-label" for="inputSuccess"><i
								class="fa fa-user" style="color:#562D2D"></i> 用户名</label>
							<div class="input-group col-md-12">
								<input type="text" class="form-control" id="name"
									placeholder="请输入用户名" name="username"> <span
									class="input-group-addon" id="name_true" style="display: none"><i
									class="fa fa-check text-green"></i></span> <span
									class="input-group-addon" id="name_false" style="display: none"><i
									class="fa fa-close text-red"></i></span>
							</div>
							<span class="help-block" id="nameSpan"></span>
						</div>
						<div class="form-group has-feedback">
							<label class="control-label" for="inputSuccess"><i
								class="fa fa-lock" style="color:#562D2D"></i> 密码</label>
							<div class="input-group col-md-12">
								<input type="password" class="form-control" id="pwd"
									placeholder="请输入密码" name="password"> <span
									class="input-group-addon" id="pwd_true" style="display: none"><i
									class="fa fa-check text-green"></i></span> <span
									class="input-group-addon" id="pwd_false" style="display: none"><i
									class="fa fa-close text-red"></i></span>
							</div>
							<span class="help-block" id="pwdSpan"></span>
						</div>
						<div class="form-group has-feedback">
							<label class="control-label" for="inputSuccess"><i
								class="fa fa-user" style="color:#562D2D"></i> 确认密码</label>
							<div class="input-group col-md-12">
								<input type="password" class="form-control" id="repwd"
									placeholder="请再次输入密码" name="repassword"> <span
									class="input-group-addon" id="repwd_true" style="display: none"><i
									class="fa fa-check text-green"></i></span> <span
									class="input-group-addon" id="repwd_false"
									style="display: none"><i class="fa fa-close text-red"></i></span>
							</div>
							<span class="help-block" id="repwdSpan"></span>
						</div>
						<div class="form-group has-feedback" style="text-align: center;">
							<button type="button" class="btn btn-primary btn-block btn-flat" id="reg_btn">注册</button>
						</div>
					</form>

				</div>
			</div>



		</div>
	</div>
	<script type="text/javascript" src="${APP_PATH }/myjs/login.js">
		
	</script>
</body>
</html>