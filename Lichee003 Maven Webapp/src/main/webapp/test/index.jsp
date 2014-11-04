<%@ page  contentType = "text/html; charset=UTF-8"%> 
<%@taglib prefix="s" uri = "/struts-tags"%> 
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>user register</title>
	</head>

<body>
<s:form method="post" action="userLoginAction" validate="true"> 
	
		<s:textfield name="userMail" label="邮箱" required="true" requiredPosition="left"></s:textfield>
		<s:password name="userPassword" label="密码" required="true" requiredPosition="left"></s:password>
		<s:submit name="submit"></s:submit>
		</s:form>
</body>

</html>