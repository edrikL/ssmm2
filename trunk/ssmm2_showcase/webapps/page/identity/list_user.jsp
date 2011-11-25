<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  ---------------------
 <s:actionerror />
 <s:fielderror fieldName="a"></s:fielderror>
 <s:actionmessage/>
  -----------------------
  ognl:<s:property  value="%{#attr['id']}"/><br/>
  ognl:<s:property  value="#attr['id']"/><br/>
  ognl:<s:property  value="#attr.id"/><br/>

  ognl:<input type="text" value="#attr.id"><br/>
  ognl:<input type="text" value="%{#attr.id}"><br/>
  ognl:<s:textfield value="%{#pageContext.request.contextPath}"></s:textfield><br/>
  ognlroot:<s:textfield value="%{#root['id']}"></s:textfield><br/>
  ognlroot:<s:textfield value="%{#root['name']}"></s:textfield><br/>
  ognlrequest:<s:textfield value="%{#request['id']}"></s:textfield><br/>
  ognlrequest:<s:textfield value="%{#request['name']}"></s:textfield><br/>
  ognlrequest:<s:textfield value="#{id}"></s:textfield><br/>
  ognlrequest:<s:textfield value="#{name}"></s:textfield><br/>
  ognlrequest:<s:textfield value="%{#request['id']}"></s:textfield><br/>
  ognlrequest:<s:textfield value="%{#request['name']}"></s:textfield><br/>
  ognl:<s:property  value="#['id']"/><br/>
  ognl:<s:property  value="#['name']"/><br/>
  ognl: %{#attr["id"]}<br/>
  ognl: %{#attr["name"]}<br/>
  jsp:<%=request.getContextPath() %><br/>
  jsp: <%=request.getAttribute("id") %><br/>
  jsp: <%=request.getAttribute("name") %><br/>
  el:${pageContext.request.contextPath}<br/>
  el:${id}<br/>

  
   
</body>
</html>