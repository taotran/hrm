<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>
<portlet:renderURL var="candidateURL">
	<portlet:param name="mvcPath" value="/jsp/hrm/view.jsp"/>
</portlet:renderURL>

<div id="myTab">

	<ul class="nav nav-tabs">
		<li><a href="#"  onclick="location.href = '<%= candidateURL.toString() %>';"><liferay-ui:message
					key="tab.candidate.title" /></a></li>
		<li><a href="#vTab" onclick="vacancyTabClick()"><liferay-ui:message
					key="tab.vacancy.title" /></a></li>
		<li class="active"><a href="#reportTab">Reports</a></li>
	</ul>
	<div class="tab-content">
		<div id="cTab" class="tab-pane"></div>
		<div id="vTab" class="tab-pane"></div>
		<div id="reportTab" class="tab-pane">
			<table id="vSuccessionReportTable"
				class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>Job Title</th>
						<th>Vacancy Name</th>
						<th>Vacancy Added Date</th>
						<th>Number of Positions</th>
						<th>Number of Applicants</th>
						<th>Number of ShortListed</th>
						<th>Number of Hire</th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
			
			<div style="width: 100%">
				<canvas id="myChart" height="450" width="600"></canvas>
			</div>
			
		</div>
	</div>

</div>
<script type="text/javascript">
	YUI().use('aui-tabview', function(Y) {
		new Y.TabView({
			srcNode : '#myTab'
		}).render();
	});

	$(document)
			.ready(
					function() {
						console.log("REPORT READY");
						var obj = new Object();
						obj.test = 'abc';
/* 						jQuery.ajax({
							type : 'POST',
							url : "<portlet:resourceURL id='generateVacancySuccessionReport'/>",
							data : JSON.stringify(obj),
							dataType : "json",
							contentType : 'application/json',
							mimeType : 'application/json',
							error : function(e) {
								alert("ERROR");
							},
							success : function(response) {
										console.log("inside response success");
										console.log(response.aaData);
									}
								}); */
						console.log("REPORT READY");
						var vsTable = $('#vSuccessionReportTable')
								.dataTable(
										{
											bServerSide: true,
											bProcessing : true,
											bPaginate : false,
											bFilter : false,
											bSort: false,
											sPaginationType : "full_numbers",
											sAjaxSource : '<portlet:resourceURL id="generateVacancySuccessionReport"/>',
											aoColumns : [ {
												"mData" : "job_title",
											}, {
												"mData" : "v_name",
											}, {
												"mData" : "vacancy_added_date",
											}, {
												"mData" : "no_of_pos",
												"mRender" : function(data, type, full) {
													if (data > 0) 
														return data;
													return "--";
												}
											}, {
												"mData" : "no_of_applicants",
												"mRender" : function(data, type, full) {
													if (data > 0) 
														return data;
													return "--";
												}
											}, {
												"mData" : "no_of_shortlist",
												"mRender" : function(data, type, full) {
													if (data > 0) 
														return data;
													return "--";
												}
											}, {
												"mData" : "no_of_hire",
												"mRender" : function(data, type, full) {
													if (data > 0) 
														return data;
													return "--";
												}
											} ]
										});
/* 						var ctx = document.getElementById("myChart").getContext("2d");
						var data = {
							    labels: ["January", "February", "March", "April", "May", "June", "July"],
							    datasets: [
							        {
							            label: "My First dataset",
							            fillColor: "rgba(220,220,220,0.5)",
							            strokeColor: "rgba(220,220,220,0.8)",
							            highlightFill: "rgba(220,220,220,0.75)",
							            highlightStroke: "rgba(220,220,220,1)",
							            data: [65, 59, 80, 81, 56, 55, 40]
							        },
							        {
							            label: "My Second dataset",
							            fillColor: "rgba(151,187,205,0.5)",
							            strokeColor: "rgba(151,187,205,0.8)",
							            highlightFill: "rgba(151,187,205,0.75)",
							            highlightStroke: "rgba(151,187,205,1)",
							            data: [28, 48, 40, 19, 86, 27, 90]
							        }
							    ]
							};
						
						var myBarChart = new Chart(ctx).Bar(data, options); */
						
						
						
						
						var barChartData = {
							labels : ["January","February","March","April","May","June","July"],
							datasets : [
								        {
								            label: "My First dataset",
								            fillColor: "rgba(220,220,220,0.5)",
								            strokeColor: "rgba(220,220,220,0.8)",
								            highlightFill: "rgba(220,220,220,0.75)",
								            highlightStroke: "rgba(220,220,220,1)",
								            data: [65, 59, 80, 81, 56, 55, 40]
								        },
								        {
								            label: "My Second dataset",
								            fillColor: "rgba(151,187,205,0.5)",
								            strokeColor: "rgba(151,187,205,0.8)",
								            highlightFill: "rgba(151,187,205,0.75)",
								            highlightStroke: "rgba(151,187,205,1)",
								            data: [28, 48, 40, 19, 86, 27, 90]
								        },
								        {
								            label: "My Third dataset",
								            fillColor: "rgba(151,187,205,0.5)",
								            strokeColor: "rgba(151,187,205,0.8)",
								            highlightFill: "rgba(151,187,205,0.75)",
								            highlightStroke: "rgba(151,187,205,1)",
								            data: [20, 47, 44, 10, 100, 33, 20]
								        }
								    ]
						}
						var ctx = document.getElementById("myChart").getContext("2d");
						var myBarChart = new Chart(ctx).Bar(barChartData);
					})
</script>