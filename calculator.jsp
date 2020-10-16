<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("button")!=null){%>
<%String string=request.getParameter("button");
int number1,number2;
if(request.getParameter("number1").equals("")) {
	number1=0;
} else {
	number1=Integer.valueOf(request.getParameter("number1"));
}
if(request.getParameter("number2").equals("")) {
	number2=0;
} else {
	number2=Integer.valueOf(request.getParameter("number2"));
}
if(string.equals("ADD")){
	out.println("Result : "+(number1+number2));
} else if(string.equals("SUB")){
	out.println("Result : "+(number1-number2));
} else if(string.equals("DIV")){
	out.println("Result : "+(number1/number2));
} else if(string.equals("MUL")){
	out.println("Result : "+(number1*number2));
}
}
%>
</body>
</html>