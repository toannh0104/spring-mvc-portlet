<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="portlet-content">
	<div class="content-body">
		<div class="form-row">
			<div class="form-controls">
				<font color="red">
					<c:out value="${exception.message }" />
				</font>
			</div>
		</div>
	</div>
</div>