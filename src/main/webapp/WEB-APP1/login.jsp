<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
    <link href="<%= request.getContextPath() %>/css/home.css" rel="stylesheet" type="text/css" />
    <link href="<%= request.getContextPath() %>/css/bootstrapForLogin.css" rel="stylesheet" type="text/css" />
    <link href="<%= request.getContextPath() %>/css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div class="container" >
        <div class="" style="margin-top: 10%"></div>
        <div class="" style="margin-top: 10%;"></div>
            <div class="logo">
                <img src="<%= request.getContextPath() %>/images/logo.png"  alt="Logo"  >
            </div>
        <div class="loginbox">
            <form id="loginForm" name="loginForm" method="post" action="j">
                <div class="">
                    <input id="username" type="text" name="j_username" class="" ></input>
                </div>
                <div class="">
                    <input id="password" type="password" name="j_password" class="">
                </div>
                <div class="">
                    <input name="login" type="submit" value="Log in" id="submit" class="">
                </div>
                </br>
                </br>
                </br>
            <div class="" style="margin-top: 10px; color: #ac0633; font-weight: bold; text-align: center;">
                <%= (request.getParameter("error")!=null)? "Wrong username or password": "" %>
            </div>
            </form>
        </div>
        <div class=""></div>
    </div>
</body>
</html>
