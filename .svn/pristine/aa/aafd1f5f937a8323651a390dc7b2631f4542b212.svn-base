var totalRecord,currentPage;
		$(function(){
			to_page(1);
		});
		function to_page(pn){
			$.ajax({
				url:"systemlist",
				data:"pn="+pn,
				type:"POST",
				success:function(result){
					analyze_tbody_info(result);
					build_page_info(result);
					build_page_nav(result);
				}
			});
		}
	function analyze_tbody_info(result){
		$("#s_body").empty();
		$.each(result.extend.pageInfo.list,function(index,system){
			var s_index_td=$("<td></td>").append(index+1);
			var s_name_td=$("<td></td>").append(system.name);
			var s_info_td=$("<td></td>").append(system.content);
			var s_look_btn=$("<button></button>").addClass("btn btn-info btn-sm look_btn").append($("<span></span>").addClass("glyphicon glyphicon-eye-open")).append("查看");
			s_look_btn.attr("system_id",system.id);
			var s_reg_btn=$("<button></button>").addClass("btn btn-info btn-sm reg_btn").append($("<span></span>").addClass("glyphicon glyphicon-user")).append("申请账号");
			s_reg_btn.attr("system_id",system.id);
			var s_btn_td=$("<td></td>").append(s_look_btn).append("  ").append(s_reg_btn);
			$("<tr></tr>").append(s_index_td).append(s_name_td).append(s_info_td).append(s_btn_td).appendTo("#s_body");
		});
	}
	function build_page_info(result){
		$("#page_info_area").empty();
		$("#page_info_area").append("第"+result.extend.pageInfo.pageNum+"页,总共"+
				result.extend.pageInfo.pages+"页,总共"+
				result.extend.pageInfo.total+"条记录");
		totalRecord = result.extend.pageInfo.total;
		currentPage = result.extend.pageInfo.pageNum;
	}
	function build_page_nav(result){
		$("#page_nav_area").empty();
		var ul = $("<ul></ul>").addClass("pagination");
		
		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
		var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
		if(result.extend.pageInfo.hasPreviousPage == false){
			firstPageLi.addClass("disabled");
			prePageLi.addClass("disabled");
		}else{
			firstPageLi.click(function(){
				to_page(1);
			});
			prePageLi.click(function(){
				to_page(result.extend.pageInfo.pageNum -1);
			});
		}
		var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
		var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
		if(result.extend.pageInfo.hasNextPage == false){
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		}else{
			nextPageLi.click(function(){
				to_page(result.extend.pageInfo.pageNum +1);
			});
			lastPageLi.click(function(){
				to_page(result.extend.pageInfo.pages);
			});
		}
		ul.append(firstPageLi).append(prePageLi);
		$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
			var numLi = $("<li></li>").append($("<a></a>").append(item));
			if(result.extend.pageInfo.pageNum == item){
				numLi.addClass("active");
			}
			numLi.click(function(){
				to_page(item);
			});
			ul.append(numLi);
		});
		ul.append(nextPageLi).append(lastPageLi);
		var navEle = $("<nav></nav>").append(ul);
		navEle.appendTo("#page_nav_area");
	}
	$(document).on("click",".look_btn",function(){
		$.ajax({
			url:"check_personInfo",
			type:"POST",
			data:"systemId="+$(this).attr("system_id"),
			success:function(result){
				var sysInfo=result.extend.systemInfo;
				$("#s_name").text(sysInfo.name);
				$("#s_content").text(sysInfo.content);
				$("#p_btn").attr("systemId",sysInfo.id);
				$("#com_btn").attr("systemId",sysInfo.id);
				$("#m_btn").attr("systemId",sysInfo.id);
				if(result.code==200){
					$("#p_btn").click(function(){
						$("#look_modal").modal('hide');
						$("#look_modal").on('hide.bs.modal',function(){
							$("#emailSpan").html("");
							$("#phoneSpan").html("");
							$("#email_false").hide();
							$("#email_true").hide();
							$("#phone_false").hide();
							$("#phone_true").hide();
						});
						$("#register_modal").modal({
							keyboard: true
						});
					});
				}else{
					$("#p_btn").popover({html:true,title:"<font color='red'>"+result.extend.title+"</font>",content:"<font color='red'>"+result.extend.msg+"</font>",placement:'auto bottom',trigger:"focus"});
				}
			}
		});
		$("#look_modal").modal({
			keyboard: true
		});
		
		
	});
	
	$(document).on("click",".reg_btn",function(){
		$.ajax({
			url:"check_personInfo",
			type:"POST",
			data:"systemId="+$(this).attr("system_id"),
			success:function(result){
				$("#p_a").attr("systemId",$(this).attr("system_id"));
				$("#com_a").attr("systemId",$(this).attr("system_id"));
				$("#m_a").attr("systemId",$(this).attr("system_id"));
				if(result.code==200){
					$("#p_a").click(function(){
						$("#reg_model").modal('hide');
						$("#reg_model").on('hide.bs.modal',function(){
							$("#emailSpan").html("");
							$("#phoneSpan").html("");
							$("#email_false").hide();
							$("#email_true").hide();
							$("#phone_false").hide();
							$("#phone_true").hide();
						});
						$("#register_modal").modal({
							keyboard: true
						});
						
					});
				}else{
					$("#p_a").popover({html:true,content:"<font color='red'>"+"注意:"+"<br>"+result.extend.msg+"</font>",placement:'auto bottom',trigger:"focus"});
				}
			}
		});
		$("#reg_model").modal({
			keyboard: true
		});
		
	});
	
   function ckeckEmail(){
	   var reg_mail=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	   var email=$("#p_s_email").val();
	   if(reg_mail.test(email)){
		   $("#email_true").show();
			$("#email_false").hide();
			$("#emailSpan").html("");
			return true;
	   }else {
			$("#email_true").hide();
			$("#email_false").show();
			$("#emailSpan").css("color", "red").html(
					"请正确填写邮箱地址");
			return false;
		}
   }
   $("#p_s_email").blur(function(){
	   ckeckEmail();
   });
   function checkPhone(){
	   var reg_phone=/^1[34578]\d{9}$/;
	   var email=$("#p_s_phone").val();
	   if(reg_phone.test(email)){
		   $("#phone_true").show();
			$("#phone_false").hide();
			$("#phoneSpan").html("");
			return true;
	   }else {
			$("#phone_true").hide();
			$("#phone_false").show();
			$("#phoneSpan").css("color", "red").html(
					"请正确填写手机号码");
			return false;
		}
   }
   $("#p_s_phone").blur(function(){
	   checkPhone();
   });
