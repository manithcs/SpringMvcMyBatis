<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<s:form modelAttribute="employee" action="saveProcess">
    <s:hidden path="id"/>  	
	
	<s:hidden path="" value="${employee.hobbie}" id="hobbie"/>
	
 NAME: <s:input path="fullname" /><br>
 EmaiL:<s:input path="email" /></br>
 Gender<s:radiobutton path="gender" value="male" />Male
  	   <s:radiobutton path="gender" value="famale" />Famale
 </br>
 Hobbie:<s:checkbox path="hobbie" value="books"/>books
		<s:checkbox path="hobbie" value="Swim"/>Swim
		<s:checkbox path="hobbie" value="watch-Tv"/>watch-Tv
		<s:checkbox path="hobbie" value="football"/>football
</br>
Country:<s:select path="country">
			<s:option value="india">India</s:option>
			<s:option value="khmer">khmer</s:option>
			<s:option value="thia">thia</s:option>
			<s:option value="viet">viet</s:option>
		</s:select>
</br>		
Address:<s:textarea path="address"/>
</br>
<input type="submit" value="Save Employee">	
</s:form>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script >

 //bug number 2
$(document).ready(function(){
	var hobbie = $("#hobbie").val().split(",");
	 var $checkboxes = $("input[type=checkbox]");
	 $checkboxes.each(function(idx,element){
		 if(hobbie.indexOf(element.value)!= -1){
			 element.setAttribute("checked","checked")
		 }else{
			 element.removeAttribute("checked");
		 }
		 
	 });
	 
});

</script>





</body>
</html>