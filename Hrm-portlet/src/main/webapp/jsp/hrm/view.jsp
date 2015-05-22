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

					</div>

					<div class="actionButtons">
						<div class="buttons">
							<a data-toggle="modal" href="#modify-candidate-modal"
								class="btn btn-primary"> <i class="icon-plus"></i> <liferay-ui:message
									key="global.button.add" />
							</a>
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
									<th>FullName</th>
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
									<th>FullName</th>
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
					<a data-toggle="modal" href="#modify-vacancy-modal"
						class="btn btn-primary"> <i class="icon-plus"></i> <liferay-ui:message
							key="global.button.add" />
					</a>
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
						<th>Job Title</th>
						<th>Hiring Manager</th>
						<th>Location</th>
						<th>Status</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<!-- <th><input type="checkbox" id="select_all_candidates"/>Id</th> -->
						<th><input type="checkbox" id="v_checkAll"/></th>
						<th><liferay-ui:message key="vacancy.name" /></th>
						<th>Job Title</th>
						<th>Hiring Manager</th>
						<th>Location</th>
						<th>Status</th>
					</tr>
				</tfoot>
				<tbody></tbody>
			</table>
		</div>
	</div>

</div>

<!-- ########################################### MODALS ########################################### -->

<div class="modal modal-dialog" id="modify-candidate-modal">
	<!-- <div class="modal-dialog"> -->
	<!-- <div class="modal-content"> -->
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Candidate</h4>
	</div>
	<%-- <form method="post" action="<%=saveCandidateURL%>>" id="cForm"
		enctype="multipart/form-data" name="cForm"> --%>
	<div class="modal-body" id="candidateInfo">
		<form class="form-horizontal">
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
		</form>
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
	<!-- </div> -->
	<!-- </div> -->
	<!-- </form> -->
</div>

<div class="modal" id="modify-vacancy-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Vacancy</h4>
	</div>

	<div class="modal-body" id="vacancyInfo">
		<input type="hidden" id="v_id" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="jTitleSelect">Job Title</label>
				<c:if test="${fn:length(allJTitles) > 0}">
					<select class="form-control select2-container" id="jTitleSelect"
						class="jTitleSelect2">
						<c:forEach items="${allJTitles}" var="jTitle">
							<option value="${jTitle.jobtitleId}">${jTitle.title }</option>
						</c:forEach>
					</select>
				</c:if>
				<a data-toggle="modal" href="#modify-jtitle-modal" class="btn">
					<i class="icon-plus"></i>Add
				</a>
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="v_name"><liferay-ui:message key="vacancy.name" /></label>
				<input type="text" class="form-control" id="v_name"
					placeholder="Name">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="status"><liferay-ui:message key="vacancy.status" /></label>
				<input type="text" class="form-control" id="status" value="Status"
					placeholder="Status">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="location"><liferay-ui:message
						key="vacancy.location" /></label> <select id="location">
					<option value="ECO HCM">ECO HCM</option>
					<option value="ECO HN">ECO HN</option>
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
				<label for="published_in_feed">Published in feed</label> <input
					type="checkbox" class="form-control" id="published_in_feed">
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
</div>

<!-- JOB TITLE MODAL -->
<div class="modal" id="modify-jtitle-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Job Title</h4>
	</div>

	<div class="modal-body" id="jobTitleInfo">
		<input type="hidden" id="jTitleId" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="title">Title</label> <input type="text"
					value="TestTitle" class="form-control" id="jtitle"
					placeholder="Title">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="jdesc">Description</label> <input type="text"
					class="form-control" id="jdesc" value="Test Description"
					placeholder="Description Here">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="jnote">Note</label> <input type="text"
					class="form-control" id="jnote" value="Test Note"
					placeholder="Note Here">
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="saveJobTitle()">
			<liferay-ui:message key="global.button.save" />
		</button>
		<button class="btn" onclick="clearFields()">
			<liferay-ui:message key="global.button.clear_all" />
		</button>
		<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
				key="global.button.cancel" /></a>
	</div>
</div>

<!-- ########################################### END MODALS ########################################### -->

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

	$("#v_checkAll").click(function(){
		console.log("clicked");
		if ($(this).is(':checked')) {
			console.log("checked");
			$('tbody input').attr('checked', true);
		} else {
			console.log("unchecked");
			$('tbody input').attr('checked', false);
		}
	})
	
	var vTabClickCount = 0;
	var cTable;

	$('#addCandidate_resume').change(function() {
		console.log("aaaaaaaaaaaaaaaa");
		sendFile(this.files[0]);
	});

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
				var obj = response;
				$('#v_id').val(obj.v_id);
				//$('#jTitleSelect').val(obj.jTitle);
				$('#v_name').val(obj.v_name);
				/* $('#status').val(obj.status); */
				$('#location').val(obj.location);
				$('#hiring_managers').val(obj.hiring_managers);
				$('#no_of_pos').val(obj.no_of_pos);
				$('#published_in_feed').val(obj.published_in_feed);
				$('#job_posting').val(obj.job_posting);
				/* Show edit vacancy modal */
				$('#modify-vacancy-modal').modal('show');
			}
		});
	}

	function saveVacancy() {
		var vacancy = new Object();

		vacancy.v_id = $("#v_id").val();
		vacancy.jobtitleId = $('#jTitleSelect').val();
		vacancy.hiring_manager_id = $('#hiring_managers').val();
		vacancy.name = $('#v_name').val();
		vacancy.description = $('#desc').val();
		vacancy.no_of_positions = $('#no_of_pos').val();
		vacancy.published_in_feed = $('#published_in_feed').val();
		vacancy.job_post = $("#job_posting").val();
		// 		candidate.file = $('#addCandidate_resume');

		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='saveVacancy'/>",
			data : JSON.stringify(vacancy),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				$('#vtable').dataTable().fnDraw();
			}
		});

	};

	function deleleVacancy() {
		console.log("deleleVacancy");
	}

	// JOB TITLE FUNC

	function saveJobTitle() {
		console.log("calling saveJobTitle");
		var obj = new Object();
		obj.jTitleId = $("#jTitleId").val();
		obj.title = $("#jtitle").val();
		obj.description = $("#jdesc").val();
		obj.note = $("#jnote").val();
		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='saveJTitle'/>",
			data : JSON.stringify(obj),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(data) {
				//$('#ctable').dataTable().fnDraw();
				console.log("INSIDE RESPONSE");
				console.log(data);
				//data = $.parseJSON(data);
				$.each(data, function(i, item) {
					console.log(item.jTitleId + " : " + item.jTitle);
				});

				select = document.getElementById('jTitleSelect');

				select.options.length = 0;
				$.each(data, function(i, item) {
					select.options.add(new Option(item.jTitle, item.jTitleId));
				});
			}
		})
	};

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

	function loadVacancyTable() {
		$('#vtable')
				.dataTable(
						{
							bProcessing : true,
							bServerSide : true,
							bPaginate : true,
							sPaginationType : "full_numbers",
							sAjaxSource : '<portlet:resourceURL id="get_all_vacancies"/>',
							oLanguage : {
								sLoadingRecords : 'Dang tai, vui long doi...'
							},
							aoColumns : [
									{
										"mData" : "v_id",
										"bSortable" : false,
										"mRender" : function(data, type, full) {
											return "<input id='vCheckbox' type='checkbox' id='"+full.v_id+"' value='"+full.v_id+"'/>";
										}
									},
									{
										"mData" : "vacancy_name",
										"mRender" : function(data, type, full) {
											var vacancy_name = data;
											return "<a id='"
													+ full.v_id
													+ "' href='#vtable' onclick='getVacancy("
													+ full.v_id + ");'>"
													+ vacancy_name + "</a>";
										}
									}, {
										"mData" : "job_title"
									}, {
										"mData" : "hiring_manager"
									}, {
										"mData" : "location"
									}, {
										"mData" : "status"
									} ]
						}).columnFilter({
					aoColumns : [ null, {
						type : "text"
					}, {
						type : "select",
						values : [ "JT1", "JT2", "JT3" ]
					}, null, {
						type : "select",
						values : [ "HCM", "HN" ]
					}, {
						type : "select",
						values : [ 'STATUS1', 'STATUS2', 'STATUS3' ]
					} ]

				});
		;
	}

	jQuery(document)
			.ready(
					/*	 loadCandidateTable(); */
					function() {
						$('#ctable')
								.dataTable(
										{
											bServerSide : true,
											sAjaxSource : '<portlet:resourceURL id="get_all_candidates"/>',
											bProcessing : true,
											bPaginate : true,
											sPaginationType : "full_numbers",
											order : [ 1, 'asc' ],
											bUseColVis : true,
											aoColumns : [
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
														"mData" : "full_name",
														"type" : "text",
														"mRender" : function(
																data, type,
																full) {
															return "<a id='"
																	+ full.c_id
																	+ "' href='#ctable' onclick='getCandidate("
																	+ full.c_id
																	+ ");'>"
																	+ data
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
											"olanguage" : {
												sLoadingRecords : 'Dang tai, vui long doi...'
											},
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

										}).columnFilter(
										{
											aoColumns : [
													null,
													{
														type : "text"
													},
													{
														type : "text"
													},
													{
														type : "text"
													},
													{
														type : "text"
													},
													{
														type : "date-range"
													},
													{
														type : "select",
														values : [ 'STATUS1',
																'STATUS2',
																'STATUS3',
																'STATUS1' ]
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
	width: 90px !important;
}
</style>