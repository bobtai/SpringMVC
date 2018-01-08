<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 
<html>
<head>
    <title>Spring MVC Example</title>
</head>
 
<body>
    <h2>All Employees</h2>
 
    <table border="1">
        <tr>
            <th>Employee Id</th>
            <th>Name</th>
            <th>Title</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.title}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>