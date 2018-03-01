<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>登录</title>
</head>
<body>
<form action="user/login" method="post">
	<label>账号：</label>
	<input type="text" id="txtUserName" name="userName" value="${user.userName}" placeholder="please input username!"></input>
	<br />
	<label>密码：</label>
	<input type="password" id="txtPassword" name="passWord" value="${user.passWord}" placeholder="please input password!"/><br />
	<input type="submit" value="提交"></input>
	<input type="reset" value="重置"></input>
</form>
</body>
</html>