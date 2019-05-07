<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>

<title>
<style>

.error {
	color : red
	}
</style>
</title>

<body>

<form:form action="processForm" modelAttribute="customer" >
First name : <form:input path="firstName"/>
Last name : <form:input path="lastName"/>
<br>
<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>

<br>
<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>


<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>

<input type="submit" value="submit"/>

</form:form>


</body>
</html>