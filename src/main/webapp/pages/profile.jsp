<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:import url="template/header.jsp" />

<h2>UserId: ${User.id}</h2>
<h2>User Name: ${User.firstName} ${User.lastName}</h2>
<h2>Email: ${User.email}</h2>
<h2>Team: ${User.team.name}</h2>


<c:import url="template/footer.jsp" />