function checkname(){
	var reg_name=/^[\u2E80-\u9FFF]{2,15}$/;
	var name=$("#p_name").val();
	if(reg_name.test(name)){
		$("#name_true").show();
		$("#name_false").hide();
		$("#nameSpan").html("");
		return true;
	}else {
		$("#name_true").hide();
		$("#name_false").show();
		$("#nameSpan").css("color", "red").html(
				"姓名必须为您的真实姓名");
		return false;
	}
}
$("#p_name").blur(function(){
	checkname();
});
function checkIdcard(){
	var reg_idcard=/(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X)$)/;
	var idcard=$("#p_idCard").val();
	if(reg_idcard.test(idcard)){
		$("#idcard_true").show();
		$("#idcard_false").hide();
		$("#idCardSpan").html("");
		return true;
	}else {
		$("#idcard_true").hide();
		$("#idcard_false").show();
		$("#idCardSpan").css("color", "red").html(
				"身份证为15或18位，最后一位是X的要大写");
		return false;
	}
}
$("#p_idCard").blur(function(){
	checkIdcard();
});

function checkSchool(){
	var reg_school=/^[\u2E80-\u9FFF]{2,17}$/;
	var school=$("#p_school").val();
	if(reg_school.test(school)){
		$("#school_true").show();
		$("#school_false").hide();
		$("#schoolSpan").html("");
		return true;
	}else {
		$("#school_true").hide();
		$("#school_false").show();
		$("#schoolSpan").css("color", "red").html(
				"请正确填写学校名称");
		return false;
	}
}
$("#p_school").blur(function(){
	checkSchool();
});
function checkProfession(){
	var reg_school=/^[\u2E80-\u9FFF]{2,10}$/;
	var school=$("#p_profession").val();
	if(reg_school.test(school)){
		$("#profession_true").show();
		$("#profession_false").hide();
		$("#professionSpan").html("");
		return true;
	}else {
		$("#profession_true").hide();
		$("#profession_false").show();
		$("#professionSpan").css("color", "red").html(
				"请正确填写所学专业名称");
		return false;
	}
}
$("#p_profession").blur(function(){
	checkProfession();
});
function checkNation(){
	var nation=$("#p_nation").val();
	alert(nation);
	if(nation==""){
		$("#nationSpan").css("color", "red").html(
		"请选择您的民族");
		return false;
	}else{
		$("#nationSpan").html("");
		return true;
	}
}
$("#p_nation").click(function(){
	alert("执行");
	checkNation();
});
function checkgradate(){
	var gra_date=$("#p_gradate").val();
	if(gra_date==""){
		$("#gradateSpan").css("color", "red").html(
		"请选择您的毕业日期");
		return false;
	}else{
		$("#gradateSpan").html("");
		return true;
	}
}
$("#p_gradate").change(function(){
	checkgradate();
});
function checkDiploma(){
	var diploma=$("#p_diploma").val();
	if(diploma==""){
		$("#diplomaSpan").css("color", "red").html(
		"请选择您的学历");
		return false;
	}else{
		$("#diplomaSpan").html("");
		return true;
	}
}
$("#p_diploma").change(function(){
	checkDiploma();
});