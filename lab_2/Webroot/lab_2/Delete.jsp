<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Delete.jsp' starting page</title>
    
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
    <h1 text align="center";>BookList</h1>
    <%
    	List<String> Title = (List)request.getAttribute("bookname");
    	//System.out.println(Title);
    	if(Title!=null){
    		for(String title:Title){
    			//System.out.println(title);
     %>
     <p style="text-align:center">
     	<a href="inf_a?title=<%=title %>"> <%=title %></a>
			
		</p>
     	
   <%}
   }
    %>
   
  </body>
</html>
