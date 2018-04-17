
$(function(){
	//alert(location.pathname);
	$("#left_menu").empty();
	var ul=$("#left_menu");
	var top_li=$("<li></li>").addClass("header").append("功能列表");
	ul.append(top_li);
	power_tree(0,ul);
})

/**
 * 构建左侧菜单栏，回调
 * @param id
 * @param ul
 * @returns
 */
function power_tree(id,ul){
	$.ajax({
		url:"powerlist",
		type:"POST",
		data:"super_id="+id,
		success:function(result){
			power_list=result.extend.powerlist;
			$.each(power_list,function(index,power){
				if(power.ishave==true){
					var li=$("<li></li>").addClass("treeview").attr("id",power.id).attr("superId",power.superId);
					var p_a=$("<a></a>").attr("href","#").append($("<i></i>").addClass(power.fIcon)).append($("<span></span>").append(power.pwName))
					.append($("<span></span>").addClass("pull-right-container").append($("<i></i>").addClass(power.lIcon)));
					var p_ul=$("<ul></ul>").addClass("treeview-menu");
					power_tree(power.id,p_ul);
					li.append(p_a).append(p_ul);
					ul.append(li);
				}else{
					var path=location.pathname;
					var li=$("<li></li>").attr("id",power.id).attr("superId",power.superId).append($("<a></a>").attr("href",power.pwAction).append($("<i></i>").addClass(power.fIcon)).append($("<span></span>").append(power.pwName)));
					if(path.lastIndexOf(power.pwAction)!=-1){
						li.addClass("active");
						li_active(li);
					}
					ul.append(li);
				}
			});
		}
	});
}
function li_active(li){
	if(li.attr("superId")!=0){
		$("#"+li.attr("superId")).addClass("active");
		var top_li=$("#"+li.attr("superId"));
		li_active(top_li);
	}
}