$(function(){
	
	//全选和取消全选
	$("input[name='checkAll']").click(function(){
		if($("input[name='checkAll']").is(":checked") == true){//全选
			$("input[name='check']").each(function(){
				this.checked = true;
			});
		}else{//取消全选
			$("input[name='check']").removeAttr("checked");
		}
	});
	
	$("input[name='check']").click(function(){
		var len = $("input[name='check']").length;
		var checklen = $("input[name='check']:checked").length;
		if(checklen < len){//没有被选中的
			$("input[name='checkAll']").removeAttr("checked");
		}else if(checklen == len){//全部都被选中
			$("input[name='checkAll']").each(function(){
				this.checked = true;
			});
		}
	});
	
	//批量删除
	$("#delGly").click(function(){
		
		var len = $("input[name='check']:checked").length;
		if(len == 0){
			alert("请选择需要删除的记录！");
			return false;
		}else{
			if(confirm("确定要删除这" + len + "条记录吗？")){
				var ids = "";
				$("input[name='check']:checked").each(function(){
					ids += $(this).val() + ",";
				});
				ids = ids.substring(0, ids.length - 1);
				window.location.href="delGlyById?ids=" + ids;
			}
		}
		
	});
	
	//设置权限
	$("#setPrivilege").click(function(){

		var len = $("input[id='check1']:checked").length;
		var glyId = $("#roleId").val();
		if(len == 0){
			alert("请选择需要分配的权限！");
			return false;s
		}else{
			if(confirm("确定要添加这" + len + "条权限吗？")){
				var ids = "";
				$("input[id='check1']:checked").each(function(){
					ids += $(this).val() + ",";
				});
				ids = ids.substring(0, ids.length - 1);
				window.location.href="setPrivilegeById?ids=" + ids + "&glyId=" + glyId;
			}
		}
	});
});
