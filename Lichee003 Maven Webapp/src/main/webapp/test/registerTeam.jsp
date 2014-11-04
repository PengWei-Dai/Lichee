<%@ page  contentType = "text/html; charset=UTF-8"%> 
<%@taglib prefix="s" uri = "/struts-tags"%> 
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>user register</title>
	</head>
<body>

<s:form method="post" action="registerTeamAction" namespace="/" > 


		<s:textfield name="userMail" label="mail"></s:textfield>
		<s:textfield name="userName" label="name"></s:textfield>
		<s:password name="userPassword" label="password"></s:password>
		<s:textfield name="userNumbel" label="numbel"></s:textfield>
		<s:textfield name="userPartment" lael="partment"></s:textfield>
		<s:textfield name="userSex" label="sex"> </s:textfield>
		<s:textfield name="teamName" label="Teamname"></s:textfield>
		<s:submit name="submit"></s:submit>
		
		</s:form>
</body>

</html>