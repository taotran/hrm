<%@page import="vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.VacancyServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.persistence.VacancyUtil"%>
<%@page import="vn.com.ecopharma.hrm.model.Vacancy"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>

<liferay-ui:tabs
	names="Sample Tab 1, Sample Tab 2, Sample Tab 3"
	refresh="<%= false %>">
	<liferay-ui:section>
		sample 1
	</liferay-ui:section>
	<liferay-ui:section>
		sample 2
	</liferay-ui:section>
	<liferay-ui:section>
		sample 3
	</liferay-ui:section>
</liferay-ui:tabs>