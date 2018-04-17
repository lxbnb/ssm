function checkname() {
	var name = $("#name").val();
	var namegex = /(^[a-zA-Z][a-zA-Z0-9_-]{5,15}$)|(^[\u2E80-\u9FFF]{2,6}[a-zA-Z0-9]{0,}$)/;
	if (namegex.test(name)) {
		$("#name_true").show();
		$("#name_false").hide();
		$("#nameSpan").html("");
		return true;
	} else {
		$("#name_true").hide();
		$("#name_false").show();
		$("#nameSpan").css("color", "red").html(
				"用户名必须是2-6位中文开头或是6-16位以字母开头的字母数字下划线、中华线的组合");
		return false;
	}
}
function checkpwd() {
	var pwd = $("#pwd").val();
	var pwdgex = /^[a-zA-Z0-9-_]{6,16}$/;
	if (pwdgex.test(pwd)) {
		$("#pwd_true").show();
		$("#pwd_false").hide();
		$("#pwdSpan").html("");
		return true;
	} else {
		$("#pwd_true").hide();
		$("#pwd_false").show();
		$("#pwdSpan").css("color", "red").html("密码必须是6至16位字母数字下划线、中华线的组合");
		return false;
	}
}
function checkrepwd() {
	var pwd = $("#pwd").val();
	var repwd = $("#repwd").val();
	if ("" == repwd) {
		$("#repwd_true").hide();
		$("#repwd_false").show();
		$("#repwdSpan").css("color", "red").html("密码不能为空");
		return false;
	} else {
		if (pwd == repwd) {
			$("#repwd_true").show();
			$("#repwd_false").hide();
			$("#repwdSpan").html("");
			return true;
		} else {
			$("#repwd_true").hide();
			$("#repwd_false").show();
			$("#repwdSpan").css("color", "red").html("密码输入不一致，请重新输入");
			return false;
		}
	}

}
$("#name").blur(function() {
	checkname();
});
$("#pwd").blur(function() {
	checkpwd();
});
$("#repwd").blur(function() {
	checkrepwd();
});
$("#reg_btn").unbind("click").click(function() {
	var name = $("#name").val();
	if (checkname() && checkpwd() && checkrepwd()) {
		$.ajax({
			url : "register",
			data : $("#reg_form").serialize(),
			type : "POST",
			success : function(result) {
				console.log(result);
				var re_name = result.extend.name;
				var message = result.extend.msg;
				var f_errors = result.extend.errorfields;
				if (result.code == 200) {
					$("#result_btn").hide();
					$("#result_btn").removeClass("alert-success alert-danger");
					$("#result_btn").addClass("alert-success");
					$("#result_name").html("");
					$("#result_name").html(re_name);
					$("#result_msg").html("");
					$("#result_msg").html(message);
					$("#result_btn").show();
				} else if (undefined != result.extend.msg) {
					$("#result_btn").hide();
					$("#result_btn").removeClass("alert-success alert-danger");
					$("#result_btn").addClass("alert-danger");
					$("#result_name").html("");
					$("#result_name").html(re_name);
					$("#result_msg").html("");
					$("#result_msg").html(message);
					$("#result_btn").show();
				} else {
					$("#result_btn").hide();
					$("#result_btn").removeClass("alert-success alert-danger");
					$("#result_btn").addClass("alert-danger");
					$("#result_name").html("");
					$("#result_name").html(re_name);
					$("#result_msg").html("");
					if (undefined != f_errors.username) {
						$("#result_msg").html(f_errors.username);
					} else {
						if (undefined != f_errors.password) {
							$("#result_msg").html(f_errors.password);
						}
					}

					$("#result_btn").show();
				}
			}
		});
	} else {
		return false;
	}
});
$("#login_a").click(function() {
	$("#result_btn").hide();
	$("#result_login").hide();
});
$("#register_a").click(function() {
	$("#result_btn").hide();
	$("#result_login").hide();
});