function topage(pn){
	$.ajax({
		url:"company_info",
		type:"POST",
		data:"pn="+pn,
		success:function(result){
			var pageInfo=result.extend.pageInfo;
			/*tbody_info(pageInfo);
			page_area_info(pageInfo);
			page_area_nav(pageInfo);*/
		}
	});
}
$(function(){
	topage(1);
});
/**
 * 表格数据填充
 * @param info_list
 * @returns
 */
function tbody_info(pageInfo){
	$("t_body").empty();
	$.each(pageInfo,function(index,info){
		var index_td=$("<td></td>").append(index+1);
		var name_td=$("<td></td>").append(info.comName);
		var contact_td=$("<td></td>").append(info.comHaver);
		var edit_btn=$("<button></button>").addClass("btn btn-info btn-sm edit_id").append($("<span></span>").addClass("glyphicon glyphicon-eye-open")).append("修改");
		edit_btn.attr("edit_id",info.id);
		var del_btn=$("<button></button>").addClass("btn btn-info btn-sm del_id").append($("<span></span>").addClass("btn btn-info btn-sm del_id")).append("删除");
		del_btn.attr("del_id",info.id);
		var btn_td=$("<td></td>").append(edit_btn).append(" ").append(del_btn);
		$("<tr></tr>").append(index_td).append(name_td).append(contact_td).append(btn_td).appendTo("#t_body");
	});
}
/**
 * 分析分页数据
 * @param pageInfo
 * @returns
 */
function page_area_info(pageInfo){
	$("#page_info_area").empty();
	$("#page_info_area").append("当前为第"+pageInfo.pageNum+"页,有"+pageInfo.size+"条数据,总共有"+pageInfo.pages+"页,"+pageInfo.total+"条数据");
}
/**
 * 分析分页条
 * @param pageInfo
 * @returns
 */
function page_area_nav(pageInfo){
	$("#page_nav_area").enpty();
	var ul=$("<ul></ul>").addClass("pagination");
	var f_Page=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
	var pre_page=$("<li></li>").append($("<a></a>").append("&laquo;"));
	if(pageInfo.hasPreviousPage==false){
		f_page.addClass("disabled");
		pre_page.addClass("disabled");
	}else{
		f_page.click(function(){
			topage(1);
		});
		pre_page.click(function(){
			topage(pageInfo.pageNum-1);
		});
	}
	var next_page=$("<li></li>").append("<a></a>").append("&raquo;");
	var l_page=$("<li></li>").append("<a></a>").append("末页").attr("href","#");
	if(pageInfo.hasNextPage==false){
		next_page.addClass("disabled");
		l_page.addClass("disabled");
	}else{
		next_page.click(function(){
			topage(pageInfo.pageNum+1);
		});
		l_page.click(function(){
			topage(pageInfo.pages);
		});
	}
	ul.append(f_page).append(pre_page);
	$.each(pageInfo.navigatepageNums,function(index,num){
		var num_li=$("<li></li>").append($("<a></a>").append(num));
		if(num==pageInfo.pageNum){
			num_li.addClass("active");
		}
		num_li.click(function(){
			topage(num);
		});
		ul.append(num_li);
	});
	ul.append(next_page).append(l_page);
	var nav=$("<nav></nav>").append(ul);
	nav.appendTo("#page_nav_area");
}
