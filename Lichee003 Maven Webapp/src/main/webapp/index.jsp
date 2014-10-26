<%@ page  contentType = "text/html; charset=UTF-8"%> 
<%@taglib prefix="s" uri = "/struts-tags"%> 
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>user register</title>
	</head>

<body>
<s:form name="userregist" method="post" action="userAction" namespace="/" > 


		<s:textfield name="name"></s:textfield>
		<s:password name="password"></s:password>
		<s:submit name="submit"></s:submit>
		
		</s:form>
</body>

</html>