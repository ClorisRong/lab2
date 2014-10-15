<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="lab_2.inf" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'NSinf.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table width="800"  border="1">
    <tr>
		<td colspan="2" style="background-color:#99bbbb;">
			<h1 text align="center";>Infor</h1>
		</td>
	</tr>
	
    <%
    	inf detail = (inf)request.getAttribute("allinf");
    	System.out.println("aaaaaaa");
    	System.out.println(detail.getAuhorID());
    	if(detail!=null){
    	

     %>
     <tr>
     	<td text align="center";width="400";>AuthorID</td>
     	<td><%= detail.getAuhorID()%></td>
     </tr>
     <tr>
     	<td text align="center";width="400";>AuthorName</td>
     	<td><%= detail.getName()%></td>
     </tr>
      <tr>
     	<td text align="center";width="400";>AuthorAge</td>
     	<td><%= detail.getAge()%></td>
     </tr>
     
     <tr>
     	<td text align="center";width="400";>AuthorCountry</td>
     	<td><%= detail.getCountry()%></td>
     </tr>
     
     <tr>
     	<td text align="center";width="400";>BookID</td>
     	<td><%= detail.getBookID()%></td>
     </tr>
     
      <tr>
     	<td text align="center";width="400";>BookTitle</td>
     	<td><%= detail.getTitle()%></td>
     </tr>
     
      <tr>
     	<td text align="center";width="400";>Publisher</td>
     	<td><%= detail.getPublisher()%></td>
     </tr>
     <tr>
     	<td text align="center";width="400";>PublishDate</td>
     	<td><%= detail.getPublishDate()%></td>
     </tr>
     
     <tr>
     	<td text align="center";width="400";>Price</td>
     	<td><%= detail.getPrice()%></td>
     </tr>
     	
     	
     	
     	
     	
     	
     	
     <%} %>
  </body>
</html>
