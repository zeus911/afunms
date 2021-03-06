<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	String alias = java.net.URLDecoder.decode(request.getParameter("alias") , "UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>指标编辑</title>
<link href="<%=basePath%>css/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<link href="<%=basePath%>css/Gray/css/all.css" rel="stylesheet" type="text/css" />
<script src="<%=basePath%>js/jquery-1.3.2.min.js" type="text/javascript"></script>
<script src="<%=basePath%>js/base.js" type="text/javascript"></script>
<script src="<%=basePath%>jsp/js/commonMethod.js" type="text/javascript"></script>
<script src="<%=basePath%>js/ligerui.all.js" type="text/javascript"></script>
<script src="<%=basePath%>js/ligerForm.js" type="text/javascript"></script>
<script src="js/diskThresHoldEdit.js" type="text/javascript"></script>

<style type="text/css">
.l-form-container {
	border-bottom: dotted 1px #000;
}

.l-form-buttons {
	width: 140px;
	margin-left: auto;
	margin-right: auto;
}

#nodeInfo {
	height: 20px;
	line-height: 20px;
	float: left;
	color: white;
	padding: 5px 0 3px 10px;
	margin: 0 0 5px 0;
	background: url('<%=basePath%>css/img/common/blue-sides.gif');
	width: 97%;
}
</style>

</head>
<body>
	<input id="basePath" type="hidden" value="<%=basePath%>" />
	<input id="alias" type="hidden" value="<%=alias%>" />
	<div>
		<div id="nodeInfo"></div>
		<div id="formDiv">
			<form id="form"></form>
		</div>
	</div>
</html>