<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../scripts/jquery-1.3.1.js" type="text/javascript"></script>
<script language="javascript">
	$(function() {
		$("#send").click(function() {
			var names=$("#username").val();
			window.alert(names);
			
			$.post("<%=request.getContextPath()%>/getMap.action", function(data, textStatus) {
				alert(data);
				var b=window.eval('('+data+')');
				alert(b.name);
				alert(b.password);
				alert(b.form.userData[0].id);
				
			}, "json");
		})
	})
</script>
</head>
<body>

<form id="form1" action="<%=request.getContextPath()%>/getList.action" method="post">
<p>评论:</p>
<p>姓名: <input type="text" name="username" id="username" /></p>
<p>内容: <textarea id="content"></textarea></p>
<p><input type="button" id="send" value="提交" /></p>
</form>
<div class='comment'>已有评论：</div>
<div id="resText"></div>
</body>
</html>