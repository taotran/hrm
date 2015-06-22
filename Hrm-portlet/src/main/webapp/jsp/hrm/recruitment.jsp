<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>

<div id="myTab">

	<ul class="nav nav-tabs">
		<li><a href="#leaveManagementTab">Leave</a></li>
		<li><a href="#timeManagementTab">Time</a></li>
		<li class="active"><a href="#recruitmentTab">Recruitment</a></li>
		<li><a href="#disciplineTab">Test Tab</a></li>
	</ul>

	<div class="tab-content">
		<div id="leaveManagementTab" class="tab-pane"></div>
		<div id="timeManagementTab" class="tab-pane"></div>
		<div id="recruitmentTab" class="tab-pane">

			<div id="recruitmentTabMain">

				<ul class="nav nav-tabs">
					<li class="active"><a href="#cTab">Candidates</a></li>
					<li><a href="#vTab">Vacancies</a></li>
				</ul>

				<div class="tab-content">
					<div id="cTab" class="tab-pane">THIS IS CTAB</div>

					<div id="vTab" class="tab-pane">THIS IS V</div>
				</div>

			</div>



		</div>
		<div id="disciplineTab" class="tab-pane"></div>
	</div>

	
</div>

<script>
	YUI().use('aui-tabview', function(Y) {
		new Y.TabView({
			srcNode : '#myTab'
		}).render();
		new Y.TabView({
			srcNode : '#recruitmentTabMain'
		}).render();
	});
</script>