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
		<li><a href="#vTab" onclick="vacancyTabClick()"><liferay-ui:message
					key="tab.vacancy.title" /></a></li>
	</ul>

	<div class="tab-content">
		<div id="cTab" class="tab-pane">
			<div class="box searchForm" id="candidateSrchForm">
				<div class="srch-header"></div>
				<div class="srch-body">
					<!-- Bootstrap trigger to open modal -->
					<div class="advancedSearchBox"></div>

					<div class="actionButtons">
						<div class="buttons">
							<a href="#modify-candidate-modal" data-toggle="modal"
								class="btn btn-primary"> <i class="icon-plus"></i> <liferay-ui:message
									key="global.button.add" />
							</a>
							<button data-toggle="modal" id="cDeleteBtn" class="btn"
								onclick="deleteCandidates()">
								<liferay-ui:message key="global.button.delete" />
							</button>

							<a data-toggle="modal" id="iAddBtn" class="btn"
								href="#modify-interview-modal"> Add Interview </a>
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
						<th><input type="checkbox" id="v_checkAll" /></th>
						<th><liferay-ui:message key="vacancy.name" /></th>
						<th>Job Title</th>
						<th></th>
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
			<input type="hidden" class="entityId" id="c_id" value="-1" />
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
					<select class="form-control select2-container" id="vacancySelect"
						class="vacancySelect2">
					</select>

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
					<label for="date_of_application">Date of application</label> <input
						type="text" data-date-format="dd/mm/yyyy" id="date_of_application"
						class="date_of_application">
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
		<input type="hidden" class="entityId" id="v_id" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="jTitleSelect">Job Title</label> <select
					class="form-control select2-container" id="jTitleSelect"
					class="jTitleSelect2">
				</select> <a data-toggle="modal" href="#modify-jtitle-modal" class="btn">
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
				<label for="vacancy_status"><liferay-ui:message
						key="vacancy.status" /></label> <label id="vacancy_status">Unpublished</label>
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
					class="form-control" id="hiring_managers" value="1"
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
				<label for="desc">Description</label>
				<textarea id="desc" rows="5" cols="50"></textarea>
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
		<input type="hidden" class="entityId" id="jTitleId" value="-1" />
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

<!-- JOB INTERVIEW MODAL -->
<div class="modal" id="modify-interview-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Interview Status</h4>
	</div>

	<div class="modal-body" id="interviewInfo">
		<input type="hidden" class="entityId" id="interviewId" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="iname">Interview Name</label> <input type="text"
					value="Name" class="form-control" id="iname"
					placeholder="Interview Name">
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="saveInterview()">
			<liferay-ui:message key="global.button.save" />
		</button>
		<button class="btn" onclick="clearFields()">
			<liferay-ui:message key="global.button.clear_all" />
		</button>
		<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
				key="global.button.cancel" /></a>
	</div>
</div>

<!-- SCHEDULE INTERVIEW MODAL -->
<div class="modal" id="modify-interviewSchedule-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Schedule Interview</h4>
	</div>

	<div class="modal-body" id="interviewScheduleInfo">
		<!-- 		<input type="hidden" class="entityId" id="itvSchedId" value="-1" /> <input
			type="hidden" class="entityId" id="itv_c_id" value="-1" /> -->
		<div class="form-group">
			<div class="form-inline">
				<label for="interviewTitleSelect">Interview Round</label> <select
					id="interviewTitleSelect">
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="itvName">Interviewer Name</label> <input type="text"
					class="form-control" id="itvName" value="Mr. ABC"
					placeholder="Interviewer name here">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="itvDate">Date</label> <input type="text"
					data-date-format="dd/mm/yyyy" id="itvDate" class="itvDate">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="itvTime">Time</label>
				<div id="itvTime">
					<label class="small70" for="itvTimeFrom">From</label> <input
						type="text" class="small70" data-date-format="dd/mm/yyyy"
						id="itvDate" placeholder="HH:MM"> <label class="small70"
						for="itvTimeTo">To</label> <input class="small70" type="text"
						data-date-format="dd/mm/yyyy" id="itvDate" placeholder="HH:MM">
				</div>

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
	var isVacanciesLoaded = 0;
	
	var List1;
	/* 	
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

	}); */
	
	
	$('#modify-interviewSchedule-modal').on('shown.bs.modal', function(){
		console.log("#modify-interviewSchedule-modal shown!!!")
	});
	
	/* clear modal data on closing */
	 $('.modal').each(function(index) {
		$(this).on('hidden.bs.modal', function () {
			console.log("clear modal");
		    $(this)
		    .find("input,textarea,select")
		    .val('')
		    .end()
		    .find("input[type=checkbox], input[type=radio]")
		       .prop("checked", "")
		       .end()
		       .find("input[type=hidden]")
		       .val('-1')
		       .end();
		});
	});
	
	
	/* select/deselect all base on header select/deselect */
	$("#v_checkAll").click(function() {
		if ($(this).is(':checked')) {
			console.log("checked");
			$('tbody input').attr('checked', true);
		} else {
			console.log("unchecked");
			$('tbody input').attr('checked', false);
		}
	})

	$('#addCandidate_resume').change(function() {
		sendFile(this.files[0]);
	});

	function getVacancy(id) {
		var obj = new Object();
		obj.v_id = id;
		$('#modify-vacancy-modal').modal('show');
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
				$('#v_name').val(obj.v_name);
				$('#location').val(obj.location);
				$('#hiring_managers').val(obj.hiring_managers);
				$('#no_of_pos').val(obj.no_of_pos);
				$('#vacancy_status').val(obj.vacancy_status);
				$('#job_posting').val(obj.job_posting);
				$('#jTitleSelect').val(obj.jTitleId);
				/* Show edit vacancy modal */
			}
		});
	}

	function saveVacancy() {
		var vacancy = new Object();

		vacancy.v_id = $("#v_id").val();
		vacancy.jTitleId = $('#jTitleSelect').val();
		vacancy.hiring_manager_id = $('#hiring_managers').val();
		vacancy.v_name = $('#v_name').val();
		vacancy.description = $('#desc').val();
		vacancy.no_of_positions = $('#no_of_pos').val();
		vacancy.published_in_feed = $('#published_in_feed').val(); 
		vacancy.job_posting = $("#job_posting").val();
			
		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='saveVacancy'/>",
			data : JSON.stringify(vacancy),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(data) {
				$('#vtable').dataTable().fnDraw();
				select = document.getElementById('vacancySelect');

				select.options.length = 0;
				select.options.add(new Option("Please select", null));
				$.each(data, function(i, item) {
					select.options.add(new Option(item.v_name, item.v_id));
				});
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
				select = document.getElementById('jTitleSelect');

				select.options.length = 0;
				$.each(data, function(i, item) {
					select.options.add(new Option(item.title, item.jTitleId));
				});
			}
		})
	};

	// JOB INTERVIEW FUNC

	function saveInterview() {
		console.log("calling saveInterview");
		var obj = new Object();
		obj.name = $("#iname").val();
		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='saveInterview'/>",
			data : JSON.stringify(obj),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(data) {
	
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
		candidate.date_of_application = $('#date_of_application').val();
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
	
	function vacancyTabClick() {
		console.log("VACANCY CLICK");
		if (isVacanciesLoaded == 0) {
			isVacanciesLoaded = 1;
			loadVacancyTable();
		}
	};
	
	$('#modify-candidate-modal').on('shown.bs.modal', function () {
		select = document.getElementById('vacancySelect');
		/* check if vacancySelect is already loaded or not */
		if (select.options.length == 0) {
			$.ajax ({
				type : 'POST',
				url : "<portlet:resourceURL id='getCandidatesFormDataAJX'/>",
				cache: false,
				error : function(e) {
	
				},
				success : function(data) {
					$.each($.parseJSON(data), function(i, item) {
						select.options.add(new Option(item.vacancy_name, item.v_id));
					});
				}	
			})
		} 
	});
	
	$('#modify-vacancy-modal').on('shown.bs.modal', function () {
		select = document.getElementById('jTitleSelect');
		/* check if jTitleSelect is already loaded or not */
		if (select.options.length == 0) {
			$.ajax ({
				type : 'POST',
				url : "<portlet:resourceURL id='getVacanciesFormDataAJX'/>",
				cache: false,
				error : function(e) {
	
				},
				success : function(data) {
					$.each(data, function(i, item) {
						select.options.add(new Option(item.title, item.jTitleId));
					});
				}	
			})
		}
	});

	function loadVacancyTable() {
		var vtable = $('#vtable')
				.dataTable(
						{
							bProcessing : true,
							bServerSide : true,
							bPaginate : true,
							sPaginationType : "full_numbers",
							sAjaxSource : '<portlet:resourceURL id="get_all_vacancies"/>',
							fnServerData : function ( sSource, aoData, fnCallback ) {
					            $.ajax({
					                "dataType": 'json',
					                "contentType": "application/json; charset=utf-8",
					                "type": "GET",
					                "url": sSource,
					                "data": aoData,
					                "success": function(json){
					                 	var data = json.jTitles;
					                    select = document.getElementById('jTitleSelect');
										select.options.length = 0;
 										$.each(data, function(i, item) {
											console.log(item.title);
											select.options.add(new Option(item.title, item.jTitleId));
										});
					                    fnCallback(json);
					                    $('#vtable').show();
					                }
					            });               
					        },
							oLanguage : {
								sProcessing : "<img src='<%=renderRequest.getContextPath()%>/images/loading_animator.gif'/><span>Please wait...</span>"
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
										"mData" : "status",
										"mRender" : function(data, type, full) {
											if (data != null || data != '') {
												var selectorId = "vAvailStatusSelect"
													+ full.v_id;
												var s = "<div class='candidateStatus'>"
														+ data
														+ "<select onchange='onVacancyStatusChange("
														+ full.v_id
														+ ")' id='"
														+ selectorId
														+ "' name='vAvailStatusSelect'>";
												/* var options = "<option value='' disabled selected style='display:none;'>Please Choose</option>"; */
												/* 								var options = "<option value='" + -1 + "' selected>"
																						+ data + "</option>"; */
												var options = "<option value='" + -1 + "' selected>--Select status--</option>";
												for (var i = 0; i < full.availableStatuses.length; i++) {
													options += "<option value='" + full.v_id + "'>"
															+ full.availableStatuses[i]
															+ "</option>";
												}
												s = s + options + "</select></div>";
												return s.toString();
											} else {
												return data;
											}
										}
									} ]
						});
		vtable.columnFilter({
			aoColumns : [ null, {
				type : "text"
			}, {
				type : "select",
				values : $.parseJSON(List1),
			}, null, {
				type : "select",
				values : [ "HCM", "HN" ]
			}, {
				type : "select",
				values : [ 'NEW', 'PUBLISHED', 'UNPUBLISHED' ]
			} ]

		});
	};
	
	function loadCandidateTable() {
		var cTable = $('#ctable')
		.dataTable(
				{
					bServerSide : true,
					sAjaxSource : '<portlet:resourceURL id="get_all_candidates"/>',
					bProcessing : true,
					bPaginate : true,
					sPaginationType : "full_numbers",
					order : [ 1, 'asc' ],
				/* 	bUseColVis : true, */
					createdRow : function ( row, data, index ) {
			        	$('td', row).eq(2).addClass('highlight');
			        },
					oLanguage : {
						sProcessing : "<div class='modal-backdrop'><div class='loading-indicator'><img src='<%=renderRequest.getContextPath()%>/images/loading_animator.gif'/><br /><span>Please wait...</span></div></div>"
							},
							aoColumns : [
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
										"mData" : "full_name",
										"type" : "text",
										"mRender" : function(data, type, full) {
											return "<a id='"
													+ full.c_id
													+ "' href='#ctable' onclick='getCandidate("
													+ full.c_id + ");'>" + data
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
									},
									{
										"mData" : "status",
										"type" : "text",
										"mRender" : function(data, type, full) {
											/* console.log(full.availableStatuses);
											var selectorId = "availStatusSelect"
													+ full.c_id;
											var s = "<div class='candidateStatus'>"
													+ data
													+ "<select onchange='onCandidateStatusChange("
													+ full.c_id
													+ ")' id='"
													+ selectorId
													+ "' name='availStatusSelect'>"; */
											/* var options = "<option value='' disabled selected style='display:none;'>Please Choose</option>"; */
											/* 								var options = "<option value='" + -1 + "' selected>"
																					+ data + "</option>"; */
											/* var options = "<option value='" + -1 + "' selected>--Select status--</option>";
											for (var i = 0; i < full.availableStatuses.length; i++) {
												options += "<option value='" + full.c_id + "'>"
														+ full.availableStatuses[i]
														+ "</option>";
											}
											s = s + options + "</select></div>";
											return s.toString(); */
											return data;
										}
									}, {
										"mData" : "resume",
										"type" : "text"
									} ],
							/* 							bColVis : true,
							 colVis : {
							 "align" : "right",
							 restore : "Restore",
							 showAll : "Show all",
							 showNone : "Show none",
							 order : 'alpha',
							 "buttonText" : "Show/Hide Columns"
							 }, */
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
										values : [ "APPLICATION_INITIATED",
												"REJECT", "SHORTLIST",
												"INTERVIEW_SCHEDULED",
												"JOB_OFFERED",
												"DECLINE_OFFERED", "HIRE",
												"INTERVIEW_FAILED",
												"MARK_INTERVIEW_PASS",
												"MARK_INTERVIEW_FAIL" ]
									}, {
										type : "text"
									} ]

						}).fnSetFilteringDelay();

		/* FILTER DELAYING */
		/*var searchWait = 0;
		var searchWaitInterval;
		$('.dataTables_filter input').unbind('keypress keyup').bind(
				'keypress keyup', function(e) {
					var item = $(this);
					searchWait = 0;
					console.log("HEREEEE");
					if (!searchWaitInterval)
						searchWaitInterval = setInterval(function() {
							if (searchWait >= 3) {
								clearInterval(searchWaitInterval);
								searchWaitInterval = '';
								searchTerm = $(item).val();
								cTable.fnFilter(searchTerm);
								searchWait = 0;
							}
							searchWait++;
						}, 500);

				});*/

		/* */
	}

	function onCandidateStatusChange(selectorId) {
		var object = new Object();
		object.c_id = selectorId;
		object.changedStatus = $(
				"#availStatusSelect" + selectorId + " option:selected").text();
		if (selectorId != -1) {
			if (object.changedStatus == 'INTERVIEW_SCHEDULED') {
				$.ajax({
					type : 'GET',
					url : '<portlet:resourceURL id="get_all_interviews"/>',
					contentType : "application/json; charset=utf-8",
					success : function(data) {
						console.log(data);
						select = document.getElementById('interviewTitleSelect');
						/* $('#itv_c_id').val(selectorId); */
						select.options.length = 0;
						$.each($.parseJSON(data), function(i, item) {
							select.options.add(new Option(item.interviewName,
									item.interviewId));
						});
					},
				});
	
				$('#modify-interviewSchedule-modal').modal('show');
			} else {
	
				$.ajax({
					type : 'POST',
					url : '<portlet:resourceURL id="candidateStatusChange"/>',
					contentType : "application/json; charset=utf-8",
					data : JSON.stringify(object),
					success : function(response) {
						$('#ctable').dataTable().fnDraw();
					},
					error : function(msg) {
	
					}
				});
	
			}
		}
	}
	
	function onVacancyStatusChange(selectorId) {
		var object = new Object();
		object.v_id = selectorId;
		object.changedStatus = $(
				"#vAvailStatusSelect" + selectorId + " option:selected").text();
		if (selectorId != -1) {
				$.ajax({
					type : 'POST',
					url : '<portlet:resourceURL id="vacancyStatusChange"/>',
					contentType : "application/json; charset=utf-8",
					data : JSON.stringify(object),
					success : function(response) {
						$('#vtable').dataTable().fnDraw();
					},
					error : function(msg) {
	
					}
				});
		}
	}

	$(document).ready(function() {
		console.log("on document ready");
		loadCandidateTable();
		/* 		$(".select2-container").select2();
		 $(".select_filter").select2(); */
		$('#date_of_application').datepicker();
		$('#itvDate').datepicker();
		$('#cCheckbox').change(function() {
			alert("checked");
			if ($("#cCheckbox:checked").length) {
				$("#cDeleteBtn").removeAttr('disabled');
			} else {
				$("#cDeleteBtn").attr('disabled', 'disabled');
			}

		});

		$.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='loadJTitles'/>",
			contentType : "application/json; charset=utf-8",
			success : function(data) {
				List1 = data;
			},
			error : function(msg) {

			}

		});

	});

	function clearFields() {
		$('#candidateInfo :input').each(function() {
			$(this).val('');
		});
		$('#c_id').val('-1');
	};
	
	

	function getCandidate(id) {
		var obj = new Object();
		obj.c_id = id;
		$('#modify-candidate-modal').modal('show');
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
				$('#date_of_application').val(obj.date_of_application);
				$('#vacancySelect').val(obj.v_id);
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
	
	function deleteVacancies() {
		var selectedArr = [];
		$('#vtable tbody tr input[type=checkbox]:checked').each(function() {
			var id = $(this).val();
			selectedArr.push({
				v_id : id
			});
		});
		jQuery.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='deleteVacancies'/>",
			data : JSON.stringify(selectedArr),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				$('#vtable').dataTable().fnDraw();
				if (response.isNotified == true) {
					$('#ctable').dataTable().fnDraw();
				}
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

select {
	width: 200px !important;
}

select .select2-search__field {
	width: 175px !important;
}

label {
	display: inline-block;
	width: 120px;
}

.small70 {
	width: 70px !important;
}
</style>