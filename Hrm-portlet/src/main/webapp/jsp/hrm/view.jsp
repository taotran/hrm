<%@page
	import="vn.com.ecopharma.hrm.service.permission.CandidatePermission"%>
<%@page import="vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.VacancyServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.persistence.VacancyUtil"%>
<%@page import="vn.com.ecopharma.hrm.model.Vacancy"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>

<portlet:resourceURL id="saveCandidate" var="saveCandidateURL" />

<div id="myTab">

	<ul class="nav nav-tabs">
		<li class="active"><a href="#cTab"><liferay-ui:message
					key="tab.candidate.title" /></a></li>
		<li><a href="#vTab"><liferay-ui:message
					key="tab.vacancy.title" /></a></li>
	</ul>

	<div class="tab-content">
		<div id="cTab" class="tab-pane">
			<div class="box searchForm" id="candidateSrchForm">
				<div class="srch-header"></div>
				<div class="srch-body">
					<!-- Bootstrap trigger to open modal -->
					<div class="advancedSearchBox">
						<div class="searchFields">
							<label for="jTitle">Job Title</label> <select
								class="select2-container" id="jTitle">
								<option value="1">Test 1</option>
								<option value="2">Test 2</option>
								<option value="3">Test 3</option>
								<option value="4">Test 4</option>
							</select> <label for="vSelect">Vacancy</label> <select
								class="select2-container" id="vSelect">
								<option value="1">Test 1</option>
								<option value="2">Test 2</option>
								<option value="3">Test 3</option>
								<option value="4">Test 4</option>
							</select> <input id="cName" placeholder="Type..." />
						</div>
						<div class="searchButtons">
							<button class="btn btn-primary">Search</button>
							<button class="btn">Reset</button>
						</div>
					</div>

					<div class="actionButtons">
						<div class="buttons">
							<a data-toggle="modal" class="btn btn-primary"
								href="#modify-candidate-modal"><liferay-ui:message
									key="global.button.add" /></a>
							<button data-toggle="modal" id="cDeleteBtn" class="btn"
								onclick="deleteCandidates()">
								<liferay-ui:message key="global.button.delete" />
							</button>
						</div>
					</div>

					<!-- <table id="ctable" class="table table-striped table-bordered"> -->
					<form>
						<table id="ctable" class="table table-striped table-bordered">
							<thead>
								<tr>
									<!-- <th><input type="checkbox" id="select_all_candidates"/>Id</th> -->
									<th><liferay-ui:message key="candidate.id" /></th>
									<th>Vacancy</th>
									<th><liferay-ui:message key="candidate.first_name" /></th>
									<th>Email</th>
									<th>Contact Number</th>
									<th>Date of Application</th>
									<th>Status</th>
									<th>Resume</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<!-- <th><input type="checkbox" id="select_all_candidates"/>Id</th> -->
									<th></th>
									<th>Vacancy</th>
									<th><liferay-ui:message key="candidate.first_name" /></th>
									<th>Email</th>
									<th>Contact Number</th>
									<th>Date of Application</th>
									<th>Status</th>
									<th>Resume</th>
								</tr>
							</tfoot>
							<tbody></tbody>


						</table>
					</form>
				</div>
			</div>


		</div>
		<div id="vTab">
			<div class="actionButtons">
				<div class="buttons">
					<a data-toggle="modal" class="btn btn-primary"
						href="#modify-vacancy-modal"><liferay-ui:message
							key="global.button.add" /></a>
					<button data-toggle="modal" id="vDeleteBtn" class="btn"
						onclick="deleteVacancies()">
						<liferay-ui:message key="global.button.delete" />
					</button>
				</div>
			</div>

			<table id="vtable" class="table table-striped table-bordered">
				<thead>
					<tr>
						<!-- <th><input type="checkbox" id="select_all_candidates"/>Id</th> -->
						<th><liferay-ui:message key="vacancy.id" /></th>
						<th><liferay-ui:message key="vacancy.name" /></th>
						<th><liferay-ui:message key="vacancy.hiring_manager" /></th>
						<th><liferay-ui:message key="vacancy.published_in_feed" /></th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</div>
	</div>

</div>

<div class="modal" id="modify-candidate-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Candidate</h4>
	</div>
	<form method="post" action="<%=saveCandidateURL%>>" id="cForm"
		enctype="multipart/form-data" name="cForm">
		<div class="modal-body" id="candidateInfo">
			<input type="hidden" id="c_id" value="-1" />
			<div class="form-group">
				<div class="form-inline">
					<label for="first_name"><liferay-ui:message
							key="candidate.first_name" /></label> <input type="text"
						class="form-control" id="first_name" placeholder="First Name">
				</div>
			</div>
			<div class="form-group">
				<div class="form-inline">
					<label for="middle_name"><liferay-ui:message
							key="candidate.middle_name" /></label> <input type="text"
						class="form-control" id="middle_name" value="testValue"
						placeholder="Middle Name">
				</div>
			</div>
			<div class="form-group">
				<div class="form-inline">
					<label for="last_name"><liferay-ui:message
							key="candidate.last_name" /></label> <input type="text"
						class="form-control" id="last_name" value="testValue"
						placeholder="Last Name">
				</div>
			</div>

			<div class="form-group">
				<div class="form-inline">
					<label for="inputEmail"><liferay-ui:message
							key="candidate.email" /></label> <input type="email"
						class="form-control" id="inputEmail" value="testValue@eco.com"
						placeholder="Email">
				</div>
			</div>

			<div class="form-group">
				<div class="form-inline">
					<label for="contact_number"><liferay-ui:message
							key="candidate.contact_number" /></label> <input type="text"
						class="form-control" id="contact_number" value="123-456-789"
						placeholder="Contact Number">
				</div>
			</div>

			<div class="form-group">
				<div class="form-inline">
					<label for="select2"><liferay-ui:message
							key="candidate.job_vacancy" /></label>
					<c:if test="${fn:length(allVacancies) > 0}">
						<select class="form-control select2-container" id="vacancySelect"
							class="vacancySelect2">
							<c:forEach items="${allVacancies}" var="vacancy">
								<option value="${vacancy.v_id}">${vacancy.name }</option>
							</c:forEach>
						</select>
					</c:if>
				</div>
			</div>

			<div class="form-group">
				<div class="form-inline">
					<label for="addCandidate_resume">Resume</label> <input type="file"
						name='<porlet:namespace/>addCandidate_resume'
						id="addCandidate_resume" />
				</div>
			</div>

			<div class="form-group">
				<div class="form-inline">
					<label for="comment"><liferay-ui:message
							key="candidate.comment" /></label>
					<!-- 				<textarea rows="5" cols="50" class="form-control" id="comment">Test Test</textarea> -->
					<input class="form-control" id="comment" value="Ghi chú"
						placeholder="Comment..." />
				</div>
			</div>

			<div class="form-group">
				<div class="form-inline">
					<!-- 				<label for="date_of_application">Date of application</label> <input
					type="text" class="form-control" id="date_of_application"
					placeholder="Date of Application">
					<label class="control-label">Date picker</label> -->
					<label class="control-label">Date picker</label> <input type="text"
						value="02/16/12" data-date-format="mm/dd/yy" id="datepicker"
						class="datepicker">
				</div>
			</div>
		</div>

		<div class="modal-footer">
			<button type="button" class="btn btn-primary" data-dismiss="modal"
				onclick="saveCandidate()">SUBMIT</button>
			<!-- <input type="submit" class="btn btn-primary" data-dismiss="modal" /> -->



			<button class="btn" onclick="clearFields()">
				<liferay-ui:message key="global.button.clear_all" />
			</button>
			<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</form>
</div>

<!-- <div class="modal" id="modify-vacancy-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Vacancy</h4>
	</div>

	<div class="modal-body" id="vacancyInfo">
		<input type="hidden" id="v_id" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="jTitleSelect"><liferay-ui:message
						key="vacancy.jTitle" /></label> <select id="jTitleSelect">
					<option value="1">Application Dev</option>
					<option value="2">Human Resource Manager</option>
					<option value="3">Quality Assurance</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="name"><liferay-ui:message key="vacancy.name" /></label>
				<input type="text" class="form-control" id="name" placeholder="Name">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="status"><liferay-ui:message key="vacancy.status" /></label>
				<input type="text" class="form-control" id="status"
					value="Published" placeholder="Status">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="location"><liferay-ui:message
						key="vacancy.location" /></label> <select id="location">
					<option value="1">ECO HCM</option>
					<option value="2">ECO HN</option>
				</select>
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="hiring_managers"><liferay-ui:message
						key="vacancy.hiring_managers" /></label> <input type="text"
					class="form-control" id="hiring_managers" value="TEST"
					placeholder="Hiring Manager">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="no_of_pos"><liferay-ui:message
						key="vacancy.no_positions" /></label> <input type="text"
					class="form-control" id="no_of_pos" value="3"
					placeholder="Number of positions">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="job_posting"><liferay-ui:message
						key="vacancy.job_posting" /></label>
				<textarea id="job_posting" rows="5" cols="50"></textarea>
			</div>
		</div>

		<div class="modal-footer">
			<button type="button" class="btn btn-primary" data-dismiss="modal"
				onclick="saveVacancy()">
				<liferay-ui:message key="global.button.save" />
			</button>
			<button class="btn" onclick="clearFields()">
				<liferay-ui:message key="global.button.clear_all" />
			</button>
			<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</div> 
</div>-->

<script type="text/javascript">
	var cForm = $('#cForm');
	cForm.submit(function(ev) {
		console.log("SUBMIT");
		$.ajax({
			type : cForm.attr('method'),
			url : cForm.attr('action'),
			data : cForm.serialize(),
			success : function(data) {
				alert('OK');
			}
		});
		ev.preventDefault();

	});

	var vTabClickCount = 0;
	var cTable;

	$('#addCandidate_resume').change(function() {
		console.log("aaaaaaaaaaaaaaaa");
		sendFile(this.files[0]);
	});

	function sendFile(file) {
		jQuery
				.ajax({
					type : 'POST',
					url : '<portlet:resourceURL id="uploadResume"/>',
					enctype : 'multipart/form-data',
					data : file,
					success : function() {

					},
					xhrFields : {
						// add listener to XMLHTTPRequest object directly for progress (jquery doesn't have this yet)
						onprogress : function(progress) {
							// calculate upload progress
							var percentage = Math
									.floor((progress.total / progress.totalSize) * 100);
							// log upload progress to console
							console.log('progress', percentage);
							if (percentage === 100) {
								console.log('DONE!');
							}
						}
					},
					processData : false,
					contentType : file.type
				});
	}

	YUI().use('aui-tabview', function(Y) {
		new Y.TabView({
			srcNode : '#myTab'
		}).render();
	});

	function ajaxCall(url, parameters, successCallback) {
		jQuery.ajax({
			type : 'POST',
			url : url,
			data : JSON.stringify(parameters),
			contentType : 'application/json;',
			dataType : 'json',
			contentType : 'application/json',
			mimeType : 'application/json',
			success : successCallback,
			error : function(xhr, textStatus, errorThrown) {
				console.log('error');
			}
		});
	}

	//AJAX save new/updated candidate
	function saveCandidate() {
		var candidate = new Object();

		candidate.c_id = $("#c_id").val();
		candidate.first_name = $('#first_name').val();
		candidate.middle_name = $('#middle_name').val();
		candidate.last_name = $('#last_name').val();
		candidate.email = $('#inputEmail').val();
		candidate.contact_number = $('#contact_number').val();
		candidate.vacancy = $('#vacancySelect').val();
		candidate.comment = $('#comment').val();
		// 		candidate.file = $('#addCandidate_resume');

		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='saveCandidate'/>",
			data : JSON.stringify(candidate),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				$('#ctable').dataTable().fnDraw();
			}
		});
	}
	//AJAX save new/updated candidate
	/*function saveCandidate() {
		var formData = $('#cForm');
		var candidate = new Object();

		candidate.c_id = $("#c_id").val();
		candidate.first_name = $('#first_name').val();
		candidate.middle_name = $('#middle_name').val();
		candidate.last_name = $('#last_name').val();
		candidate.email = $('#inputEmail').val();
		candidate.contact_number = $('#contact_number').val();
		candidate.vacancy = $('#vacancySelect').val();
		candidate.comment = $('#comment').val();
		// 		candidate.file = $('#addCandidate_resume');

		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='saveCandidate'/>",
			data : JSON.stringify(candidate),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				$('#ctable').dataTable().fnDraw();
			}
		});

		/* ajaxCall("<portlet:resourceURL id='addCandidate'/>", candidate, $('#ctable').dataTable().fnDraw()); */

	//clear input fields after creating new
	/* 		$('#candidateInfo :input').each(function() {
	 $(this).val('');
	 }); 
	};*/

	function loadCandidateTable() {
		$('#ctable')
				.dataTable(
						{
							'bPaginate' : true,
							'order' : [ 0, 'asc' ],
							'bInfo' : true,
							'iDisplayStart' : 0,
							'bProcessing' : true,
							'bServerSide' : true,
							'sAjaxSource' : '<portlet:resourceURL id="get_all_candidates"/>',
							'dom' : 'C<"clear">lfrtip',
							'aoColumns' : [
									{
										"mData" : "c_id",
										"type" : "number",
										"bSortable" : false,
										"mRender" : function(data, type, full) {
											return "<input id='cCheckbox' type='checkbox' id='"+full.c_id+"' value='"+full.c_id+"'/>";
										}
									},
									{
										"mData" : "vacancy",
										"type" : "text"
									},

									{
										"mData" : "first_name",
										"type" : "text",
										"mRender" : function(data, type, full) {
											var fullName = data + " "
													+ full.middle_name + " "
													+ full.last_name;
											return "<a id='"
													+ full.c_id
													+ "' href='#ctable' onclick='getCandidate("
													+ full.c_id + ");'>"
													+ fullName + "</a>";
										}
									}, {
										"mData" : "email",
										"type" : "text"
									}, {
										"mData" : "contact_number",
										"type" : "text"
									}, {
										"mData" : "date_of_application",
										"type" : "text"
									}, {
										"mData" : "status",
										"type" : "text"
									}, {
										"mData" : "resume",
										"type" : "text"
									} ]
						});
	}

	function loadVacancyTable() {
		$('#vtable')
				.dataTable(
						{
							bProcessing : true,
							bServerSide : true,
							bPaginate : true,
							iDisplayRecords : 20,
							sPaginationType : "full_numbers",
							sAjaxSource : '<portlet:resourceURL id="get_all_vacancies"/>',
							"aoColumns" : [
									{
										"mData" : "_v_id",
										"bSortable" : false,
										"mRender" : function(data, type, full) {
											return "<input id='vCheckbox' type='checkbox' id='"+full._v_id+"' value='"+full._v_id+"'/>";
										}
									},
									{
										"mData" : "_name",
										"mRender" : function(data, type, full) {
											var name = data;
											return "<a id='"
													+ full._v_id
													+ "' href='#vtable' onclick='getVacancy("
													+ full._v_id + ");'>"
													+ name + "</a>";
										}
									}, {
										"mData" : "_hiring_manager_id"
									}, {
										"mData" : "_published_in_feed"
									} ]

						});
	}

	jQuery(document)
			.ready(
					/*	 loadCandidateTable(); */
					function() {
						$('#ctable')
								.dataTable(
										{
											"bServerSide" : true,
											"sAjaxSource" : '<portlet:resourceURL id="get_all_candidates"/>',
											"bProcessing" : true,
											"sPaginationType" : "full_numbers",
											"bJQueryUI" : true,
											"order" : [ 1, 'asc' ],
											"bUseColVis" : true,
											'aoColumns' : [
													{
														"mData" : "c_id",
														"type" : "number",
														"bSortable" : false,
														"mRender" : function(
																data, type,
																full) {
															return "<input id='cCheckbox' type='checkbox' id='"+full.c_id+"' value='"+full.c_id+"'/>";
														}
													},
													{
														"mData" : "vacancy",
														"type" : "text"
													},

													{
														"mData" : "first_name",
														"type" : "text",
														"mRender" : function(
																data, type,
																full) {
															var fullName = data
																	+ " "
																	+ full.middle_name
																	+ " "
																	+ full.last_name;
															return "<a id='"
																	+ full.c_id
																	+ "' href='#ctable' onclick='getCandidate("
																	+ full.c_id
																	+ ");'>"
																	+ fullName
																	+ "</a>";
														}
													},
													{
														"mData" : "email",
														"type" : "text"
													},
													{
														"mData" : "contact_number",
														"type" : "text"
													},
													{
														"mData" : "date_of_application",
														"type" : "text"
													}, {
														"mData" : "status",
														"type" : "text"
													}, {
														"mData" : "resume",
														"type" : "text"
													} ],
											bColVis : true,
											colVis : {
												"align" : "right",
												restore : "Restore",
												showAll : "Show all",
												showNone : "Show none",
												order : 'alpha',
												"buttonText" : "Show/Hide Columns"
											},
											"language" : {
												"infoFiltered" : ""
											},
											"dom" : 'Cf<"toolbar"">rtip',

										}).columnFilter({
									aoColumns : [ null, {
										type : "text"
									}, {
										type : "text"
									}, {
										type : "text"
									}, {
										type : "text"
									}, {
										type : "date-range"
									}, {
										type : "select",
										values : ['STATUS1', 'STATUS2', 'STATUS3', 'STATUS1']
									}, {
										type : "text"
									} ]

								});
						

						/*cTable = $('#ctable')
								.dataTable(
										{
											'order' : [ 1, 'asc' ],
											'bInfo' : true,
											'bProcessing' : true,
											'bServerSide' : true,
											'sPaginationType' : "full_numbers",
											'sAjaxSource' : '<portlet:resourceURL id="get_all_candidates"/>',
											'dom' : 'C<"clear">lfrtip',
											'aoColumns' : [
													{
														"mData" : "c_id",
														"type" : "number",
														"bSortable" : false,
														"mRender" : function(
																data, type,
																full) {
															return "<input id='cCheckbox' type='checkbox' id='"+full.c_id+"' value='"+full.c_id+"'/>";
														}
													},
													{
														"mData" : "first_name",
														"type" : "text",
														"mRender" : function(
																data, type,
																full) {
															var fullName = full.first_name
																	+ " "
																	+ full.middle_name
																	+ " "
																	+ full.last_name;
															return "<a id='"
																	+ full.c_id
																	+ "' href='#ctable' onclick='getCandidate("
																	+ full.c_id
																	+ ");'>"
																	+ fullName
																	+ "</a>";
														}
													},
													{
														"mData" : "middle_name",
														"type" : "text"
													}, {
														"mData" : "last_name",
														"type" : "text"
													} ],
											colVis : {
												"align" : "right",
												restore : "Restore",
												showAll : "Show all",
												showNone : "Show none",
												order : 'alpha',
												"buttonText" : "Columns <img src=\"../images/caaret.png\"/>"
											},
											"language" : {
												"infoFiltered" : ""
											},
											"dom" : 'Cf<"toolbar"">rtip',

										});
						$("#ctable_length").hide();
						$("div.toolbar")
								.append(
										'<div class="btn-group" style="padding:5px "><button class="btn btn-default" id="refreshbtn" style="background:none;border:1px solid #ccc;height:30px" type="button"><span class="glyphicon glyphicon-refresh" style="padding:3px"></span></button></div>');
						$("div.toolbar").css("float", "right");
						$('#refreshbtn').click(function() {
							cTable.fnStandingRedraw();
						}); */

								      
						loadVacancyTable();
						$(".select2-container").select2();
						$(".select_filter").select2();
						$('#datepicker').datepicker();
						/* var cCheckboxes = $('#ctable tbody tr input[type=checkbox]'); */

						$('#cCheckbox').change(function() {
							alert("checked");
							if ($("#cCheckbox:checked").length) {
								$("#cDeleteBtn").removeAttr('disabled');
							} else {
								$("#cDeleteBtn").attr('disabled', 'disabled');
							}

						});
					});

	/* 	function vTabClick(){
	 console.log("inside click");
	 if (vTabClickCount == 0) {
	 console.log("load Vancancies");
	 loadVacancyTable();
	 vTabClickCount=1;
	 }
	 }; */

	function clearFields() {
		$('#candidateInfo :input').each(function() {
			$(this).val('');
		});
		$('#c_id').val('-1');
	};

	function getCandidate(id) {
		var obj = new Object();
		obj.c_id = id;
		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='getCandidate'/>",
			data : JSON.stringify(obj),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				var obj = response;
				$('#c_id').val(obj.c_id);
				$('#first_name').val(obj.first_name);
				$('#middle_name').val(obj.middle_name);
				$('#last_name').val(obj.last_name);
				$('#inputEmail').val(obj.email);
				$('#contact_number').val(obj.contact_number);
				$('#comment').val(obj.comment);
				/* Show edit vacancy modal */
				$('#modify-candidate-modal').modal('show');
			}
		});

	}

	function deleteCandidates() {
		var selectedArr = [];
		$('#ctable tbody tr input[type=checkbox]:checked').each(function() {
			var id = $(this).val();
			selectedArr.push({
				c_id : id
			});
		});
		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='deleteCandidates'/>",
			data : JSON.stringify(selectedArr),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				$('#ctable').dataTable().fnDraw();
			}
		});
	}

	function getVacancy(id) {
		var obj = new Object();
		obj.v_id = id;
		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='getVacancy'/>",
			data : JSON.stringify(obj),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				var obj = response.candidate;
				$('#v_id').val(obj.c_id);
				$('#first_name').val(obj.first_name);
				$('#middle_name').val(obj.middle_name);
				$('#last_name').val(obj.last_name);
				$('#inputEmail').val(obj.email);
				$('#contact_number').val(obj.contact_number);
				$('#comment').val(obj.comment);
				/* Show edit vacancy modal */
				$('#modify-candidate-modal').modal('show');
			}
		});

	}

	//Util functions
</script>

<!-- <style>
tfoot input {
	width: 100%;
	padding: 3px;
	box-sizing: border-box;
}

.tableHeader {
	text-align: left;
}

tfoot {
	display: table-header-group;
}

.dataTables_length {
	position: absolute;
	top: 10px;
	left: 220px;
}

.dataTables_info {
	position: absolute;
	top: 0px;
	left: 5px;
}

.ColVis {
	padding-right: 10px;
	padding-top: 5px;
}

.dataTables_filter {
	position: absolute;
	top: 10px;
	left: 200px;
	font-size: 15px;
}

.dataTables_filter input {
	height: 22px;
	width: 150px
}

input {
	-moz-border-radius: 15px;
	border-radius: 3px;
	border: solid 1px #c7c7c7;
	padding: 5px;
}

table.dataTable tbody td {
	padding: 5px;
	padding-left: 20px;
}
</style> -->

<style>
.date_range_filter {
	width : 90px !important;
}
</style>