<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<body>

<table width="1200" border="0">
<tr>
<td colspan="2" style="background-color:#99bbbb;">
<h1 text align="center";>BookDB</h1>
</td>
</tr>

<tr valign="top">
<td style="background-color:#ffff99;width:400px;text-align:top;">
<p><b>Menu</b></p>
<p>Find</p>
<p>Show inf</p>
<p>Delete</p>
</td>
<td style="background-color:#EEEEEE;height:200px;width:800px;text-align:top;">
<!-- <form name="input" action="<%=path%>/lab_2/findbook_a.action" method="post"> -->
<form name="input" action="findbook_a" method="post">
<p style="text-align:center;"><font size="4">Author's name:</font> 
<input type="text" name="name" />
<input type="submit" value="Submit" /></p>
</form>

<form name="input" action="delete_a" method="post">
<p style="text-align:center;"><font size="4">Book's name:</font> 
<input type="text" name="name" />
<input type="submit" value="Delete" /></p>
</form>

</td>
</tr>


</table>

</body>
</html>