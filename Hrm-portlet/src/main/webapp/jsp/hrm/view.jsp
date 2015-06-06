<%@page
	import="vn.com.ecopharma.hrm.service.permission.CandidatePermission"%>
<%@page import="vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.VacancyServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.persistence.VacancyUtil"%>
<%@page import="vn.com.ecopharma.hrm.model.Vacancy"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>

<div id="myTab">

	<ul class="nav nav-tabs">
		<li class="active"><a href="#cTab" onclick="candidateTabClick()"><liferay-ui:message
					key="tab.candidate.title" /></a></li>
		<li><a href="#vTab" onclick="vacancyTabClick()"><liferay-ui:message
					key="tab.vacancy.title" /></a></li>
		<li><a href="#testTab">Test Tab</a></li>
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
							<button data-toggle="modal" id="cDeleteBtn" disabled
								class="btn btn-danger" onclick="deleteCandidates()">
								<liferay-ui:message key="global.button.delete" />
							</button>

							<button data-toggle="modal" id="cExport" disabled class="btn"
								onclick="exportCSV()">Export CSV</button>

							<a data-toggle="modal" id="iAddBtn" class="btn"
								href="#modify-interview-modal"> Add Interview </a>
						</div>
					</div>

					<form>
						<table id="ctable" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th><liferay-ui:message key="candidate.id" /></th>
									<th>Vacancy</th>
									<th>FullName</th>
									<th>Email</th>
									<th>Phone</th>
									<th>Date of Application</th>
									<th>Status</th>
									<th>Resume</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th><input class="c_checkAll" type="checkbox"
										id="c_checkAll" /></th>
									<th>Vacancy</th>
									<th>FullName</th>
									<th>Email</th>
									<th>Phone</th>
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

					<button data-toggle="modal" id="addLocation" class="btn"
						onclick="addLocation()">Add location</button>
				</div>
			</div>

			<table id="vtable" class="table table-striped table-bordered">
				<thead>
					<tr>
						<!-- <th><input type="checkbox" id="select_all_candidates"/>Id</th> -->
						<th><liferay-ui:message key="vacancy.id" /></th>
						<th><liferay-ui:message key="vacancy.name" /></th>
						<th>Job Title</th>
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
						<th>Location</th>
						<th>Status</th>
					</tr>
				</tfoot>
				<tbody></tbody>
			</table>
		</div>
		<div id="testTab">This is TestTab</div>
	</div>

</div>

<!-- ########################################### MODALS ########################################### -->

<form id="candidateForm" class="form-horizontal">
	<div class="modal hrm-modal candidate-modal"
		id="modify-candidate-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<h4>Add New Candidate</h4>
		</div>
		<div class="modal-body" id="candidateInfo">

			<input type="hidden" class="entityId" id="c_id" value="-1">

			<div class="control-group">
				<label class="control-label" for="firstname">FirstName<span
					class="required">*</span>
				</label>
				<div class="controls">
					<input type="text" id="first_name" class="required"
						placeholder="FirstName" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="middle_name"><liferay-ui:message
						key="candidate.middle_name" /><span class="required">*</span></label>
				<div class="controls">
					<input type="text" class="required" id="middle_name"
						placeholder="Middle Name">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="last_name"><liferay-ui:message
						key="candidate.last_name" /><span class="required">*</span></label>
				<div class="controls">
					<input type="text" class="required" id="last_name"
						placeholder="Last Name">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="inputEmail"><liferay-ui:message
						key="candidate.email" /><span class="required">*</span></label>
				<div class="controls">
					<input type="email" class="required email" id="inputEmail"
						placeholder="Email">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="contact_number"><liferay-ui:message
						key="candidate.contact_number" /></label>
				<div class="controls">
					<input type="text" class="form-control" id="contact_number"
						value="123-456-789" placeholder="Contact Number">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="select2"><liferay-ui:message
						key="candidate.job_vacancy" /></label>
				<div class="controls">
					<select class="form-control select2-container" id="vacancySelect"
						class="vacancySelect2">
					</select> <a href="javascript:void(0);" id="unpublish-vacancy-warn"
						class="unpublish-vacancy-warn" data-toggle="tooltip"
						title="Vacancy Status has been set to UNPUBLISHED!"> <i
						class="icon-exclamation-sign"></i>
					</a>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="addCandidate_resume">Resume</label>
				<div class="controls">
					<input type="file" name='addCandidate_resume'
						id="addCandidate_resume" />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="comment"><liferay-ui:message
						key="candidate.comment" /></label>
				<!-- 				<textarea rows="5" cols="50" class="form-control" id="comment">Test Test</textarea> -->
				<div class="controls">
					<input id="comment" value="Ghi chú" placeholder="Comment..." />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="date_of_application">Date
					of application<span class="required">*</span>
				</label>
				<div class="controls">
					<input type="text" data-date-format="dd/mm/yyyy"
						id="date_of_application" class="small70 required">
					<button type="button"></button>
				</div>
			</div>
			<div class="modal-container">
				<div class="header">
					<span>Expand</span>

				</div>
				<div class="content">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Vacancy</th>
								<th>Date</th>
								<th>Executed Action</th>
								<th>Performed By</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Test</td>
								<td>15/04/2015</td>
								<td>APPLICATION_INITIATED -> SHORTLIST</td>
								<td>Admin1</td>
							</tr>
							<tr>
								<td>Test1</td>
								<td>15/04/2015</td>
								<td>APPLICATION_INITIATED -> SHORTLIST</td>
								<td>Admin2</td>
							</tr>
							<tr>
								<td>Test2</td>
								<td>15/04/2015</td>
								<td>APPLICATION_INITIATED -> SHORTLIST</td>
								<td>Admin3</td>
							</tr>
						</tbody>
						<tfoot></tfoot>
					</table>
				</div>
			</div>

		</div>

		<div class="modal-footer">
			<!-- 				<button type="button" class="btn btn-primary" data-dismiss="modal"
					onclick="saveCandidate()">SUBMIT</button> -->
			<button type="button" class="btn btn-primary"
				onclick="saveCandidate()">Save</button>
			<button class="btn" onclick="clearFields()">
				<liferay-ui:message key="global.button.clear_all" />
			</button>
			<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</div>
</form>





<form id="vacancyForm" class="form-horizontal">
	<div class="modal hrm-modal vacancy-modal" id="modify-vacancy-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<h4>Add New Vacancy</h4>
		</div>

		<div class="modal-body" id="vacancyInfo">
			<input type="hidden" class="entityId" id="v_id" value="-1" />
			<div class="control-group">
				<label class="control-label" for="jTitleSelect">Job Title</label>
				<div class="controls">
					<select class="select2-container" id="jTitleSelect"
						class="jTitleSelect2">
					</select> <a data-toggle="modal" href="#modify-jtitle-modal" class="btn">
						<i class="icon-plus"></i>Add
					</a>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="v_name"><liferay-ui:message
						key="vacancy.name" /></label>
				<div class="controls">
					<input type="text" id="v_name" placeholder="Name" class="required">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="vacancy_status"><liferay-ui:message
						key="vacancy.status" /></label>
				<div class="controls">
					<input disabled id="vacancy_status" value="NEW"
						style="border: 0px;">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="locationSelect"><liferay-ui:message
						key="vacancy.location" /></label>
				<div class="controls">
					<select id="locationSelect">
					</select>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="hiring_managers"><liferay-ui:message
						key="vacancy.hiring_managers" /><span class="required">*</span></label>
				<div class="controls">
					<select id="managerSelect2" onchange="onManagerSelect(2)"></select>
					<label id="managerSelect2Warning" for="managerSelect2"
						class="error" style="display: none;">Manager is required</label>
					<ul id="managers2" class="options"></ul>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="no_of_pos"><liferay-ui:message
						key="vacancy.no_positions" /></label>
				<div class="controls">
					<input type="text" id="no_of_pos" value="3"
						placeholder="Number of positions" class="required number">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="desc">Description</label>
				<div class="controls">
					<textarea id="desc" rows="5" cols="50"></textarea>
				</div>
			</div>

			<%-- 			<div class="control-group">
				<label class="control-label" for="job_posting"><liferay-ui:message
						key="vacancy.job_posting" /></label>
				<div class="controls">
					<textarea id="job_posting" rows="5" cols="50"></textarea>
				</div>
			</div> --%>
			<%-- 			<div class="control-group">
				<label class="control-label" for="summernote"><liferay-ui:message
						key="vacancy.job_posting" /></label>
				<div class="controls">
					<textarea id="summernote" cols="7">Hello summernote</textarea>
				</div>
			</div> --%>
			<label for="job_posting"><liferay-ui:message
					key="vacancy.job_posting" /></label>
			<textarea id="job_posting" cols="7">Job Posting</textarea>
		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-primary" onclick="saveVacancy()">
				<liferay-ui:message key="global.button.save" />
			</button>
			<button class="btn" onclick="clearFields()">
				<liferay-ui:message key="global.button.clear_all" />
			</button>
			<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</div>
</form>

<!-- JOB TITLE MODAL -->
<div class="modal hrm-modal job-title-modal" id="modify-jtitle-modal">
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

<!-- LOCATION MODAL -->
<div class="modal hrm-modal location-modal" id="modify-location-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Location</h4>
	</div>

	<div class="modal-body" id="jobTitleInfo">
		<input type="hidden" class="entityId" id="locationId" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="locationName">Name</label> <input type="text"
					value="TestTitle" class="form-control" id="locationName"
					placeholder="Title">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="locationProvince">Province</label> <input type="text"
					class="form-control" id="locationProvince" value="Province"
					placeholder="Province">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="locationCity">City</label> <select id="locationCity">
					<option value="HCM">HCM</option>
					<option value="HCM">HN</option>
				</select>
			</div>
		</div>

		<input type="hidden" class="entityId" id="locationId" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="locationAddress">Address</label> <input type="text"
					value="Address" class="form-control" id="locationAddress"
					placeholder="Address">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="locationZipcode">ZipCode</label> <input type="text"
					value="Zip Code" class="form-control" id="locationZipcode"
					placeholder="Zip Code">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="locationPhone">Phone</label> <input type="text"
					value="1234" class="form-control" id="locationPhone"
					placeholder="Phone">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="locationFax">Fax</label> <input type="text" value="1234"
					class="form-control" id="locationFax" placeholder="Fax">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="locationNote">Note</label>
				<!-- <input type="text"
					value="Note" class="form-control" id="locationNote"
					placeholder="Note"> -->
				<textarea rows="5" cols="50" id="locationNote">Note</textarea>
			</div>
		</div>

	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="saveLocation()">
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
<div class="modal hrm-modal interview-modal" id="modify-interview-modal">
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
<form id="intervewScheduleForm" class="form-horizontal">
	<div class="modal hrm-modal schedule-interview-modal"
		id="modify-interviewSchedule-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<h4>Schedule Interview</h4>
		</div>

		<div class="modal-body" id="interviewScheduleInfo">
			<input type="hidden" class="entityId" id="itvSchedId" value="-1" />
			<input type="hidden" class="entityId" id="vacancyId" value="-1" /> <input
				type="hidden" class="entityId" id="candidateId" value="-1" />
			<div class="control-group">
				<label class="control-label" for="interviewTitleSelect">Interview
					Round</label>
				<div class="controls">
					<select id="interviewTitleSelect">
					</select> <a data-toggle="modal" href="#modify-interview-modal" class="btn">
						<i class="icon-plus"></i>Add
					</a>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="itvName">Interviewer Name</label>
				<div class="controls">
					<select id="managerSelect1" onchange="onManagerSelect(1)">
					</select>
					<ul id="managers1" class="options">
						<li>
							<div class="edit-buttons">
								<button type="button">
									<i class="icon-minus-sign"></i>
								</button>
							</div> <span>Manager 1 </span>
						</li>
					</ul>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="itvDate">Date</label>
				<div class="controls">
					<input type="text" data-date-format="dd/mm/yyyy" id="itvDate"
						class="itvDate small70">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="itvTime">Time</label>
				<div class="controls">
					<div id="itvTime">
						<label class="small70" for="itvTimeFrom">From</label> <input
							type="text" class="small70" id="itvTimeFrom" placeholder="HH:MM">
						<label class="small70" for="itvTimeTo">To</label> <input
							class="small70" type="text" id="itvTimeTo" placeholder="HH:MM">
					</div>
				</div>
			</div>
		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-primary"
				onclick="saveInterviewSchedule()">
				<liferay-ui:message key="global.button.save" />
			</button>
			<button class="btn" onclick="clearFields()">
				<liferay-ui:message key="global.button.clear_all" />
			</button>
			<button type="button" class="btn" data-dismiss="modal"
				onclick="resetCandidateStatus()">
				<liferay-ui:message key="global.button.cancel" />
			</button>
		</div>
	</div>
</form>

<!-- ########################################### END MODALS ########################################### -->
<script type="text/javascript">
var isVacanciesLoaded = 0;
/*
 * State: 0: Initial
 * 		  1: Candidate table first loaded 	
 *        2: Vacancy table first loaded
 *        3: Vacancy table changes(CRUD)
 */
var _State = 0;
var ListJobTitle;
var ListLocation;
var isCandidateModalLoaded = false;


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
	    $('ul.options').empty();
	});
});


/* select/deselect all base on header select/deselect */
$("#v_checkAll").click(function(event) {
	if (this.checked) {
		$('.vCheckbox').each(function(){
			this.checked = true;	
		});
	} else {
		$('.vCheckbox').each(function(){
			this.checked = false;	
		});
	}
})

$("#c_checkAll").click(function(event) {
	if (this.checked) {
		$('.cCheckbox').each(function(){
			this.checked = true;	
		});
	} else {
		$('.cCheckbox').each(function(){
			this.checked = false;	
		});
	}
})


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
			$('#no_of_pos').val(obj.no_of_pos);
			$('#vacancy_status').val(obj.vacancy_status);
			$('#job_posting').val(obj.job_posting);
			$('#jTitleSelect').val(obj.jTitleId);
			/* add to managers list and show */
			var emps = obj.employees;
			$.each(emps, function(i, item){
				addManagerToList('2', item.employeeId, item.name);	
			});
			
			/* Show edit vacancy modal */
		}
	});
}

function saveVacancy() {
	if($('#v_name').valid() && $('#no_of_pos').valid()) {
		var selectedManagers = [];
		$('#managers2 li').each(function(i) {
			selectedManagers.push(($(this).attr('id')));
		});
			if (selectedManagers.length > 0) {
				var obj = new Object();
				obj.v_id = $("#v_id").val();
				obj.jTitleId = $('#jTitleSelect').val();
				obj.v_name = $('#v_name').val();
				obj.description = $('#desc').val();
				obj.no_of_positions = $('#no_of_pos').val();
				obj.published_in_feed = $('#published_in_feed').val(); 
				obj.job_posting = $("#job_posting").val();
				obj.locationId = $("#locationSelect").val();
				/* add selected managers */
				obj.selectedManagers = selectedManagers;
			
				function onSuccessModifyVacancy(data) {
					$('#vtable').dataTable().fnDraw();
					if (data != null) {
						var vObj = data;
						if (vObj.v_id != null && vObj.v_id != "") {
							vSelect = document.getElementById('vacancySelect');
							
							if (vObj.isNew == true) {
								vSelect.options.add(new Option(vObj.v_name, vObj.v_id));
							} else {
								$('#vacancySelect option').eq(vObj.v_id).text(vObj.v_name);
							}
							_State = 3;
						}
						
					}	
				}
				genericAJAXCalling("<portlet:resourceURL id='saveVacancy'/>", obj, onSuccessModifyVacancy);
				$('#modify-candidate-modal').modal('hide');
		} else {
			$('#managerSelect2Warning').show();
		}
	}
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
	
	function onSuccessSaveNewJTitle(response) {
		jSelect = document.getElementById('jTitleSelect');
		/* add new JTitle to Select if CREATE NEW */
		if (obj.jTitleId == -1) {
			console.log("CREATE NEW JTitle");
			jSelect.options.add(new Option(response.title, response.jTitleId));	
		} else {
			/* only change JTitle Text if EDIT */
			$('#jTitleSelect option').eq(response.jTitleId).text(response.title);
		}
	};
	genericAJAXCalling("<portlet:resourceURL id='saveJTitle'/>", obj, onSuccessSaveNewJTitle);
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
 	
	if ($('#first_name').valid() && $('#middle_name').valid() && 
			$('#last_name').valid() && $('#inputEmail').valid() && $('#date_of_application').valid()) {
		var obj = new Object();
		obj.c_id = $("#c_id").val();
		obj.first_name = $('#first_name').val();
		obj.middle_name = $('#middle_name').val();
		obj.last_name = $('#last_name').val();
		obj.email = $('#inputEmail').val();
		obj.contact_number = $('#contact_number').val();
		console.log($('#vacancySelect').val());
		if ($('#vacancySelect').val() != -1) {
			obj.vacancy = $('#vacancySelect').val();
		} else {
			obj.vacancy = -1;
		}
		obj.comment = $('#comment').val();
		obj.date_of_application = $('#date_of_application').val();
		function onSuccessSaveCandidate(response) { 
			$('#ctable').dataTable().fnDraw();
		}
		
		genericAJAXCalling("<portlet:resourceURL id='saveCandidate'/>", obj, onSuccessSaveCandidate);
		$('#modify-candidate-modal').modal('hide');
	}
	
}

function getCurrentDate() {
	var fullDate = new Date();
	console.log(fullDate);
	//Thu May 19 2011 17:25:38 GMT+1000 {}
	  
	//convert month to 2 digits
	var twoDigitMonth = ((fullDate.getMonth().length+1) === 1)? (fullDate.getMonth()+1) : '0' + (fullDate.getMonth()+1);
	  
	var currentDate = fullDate.getDate() + "/" + twoDigitMonth + "/" + fullDate.getFullYear();
	console.log(currentDate);
}

function candidateTabClick() {
	console.log("cTab click" + _State);
	if (_State === 3) {
		_State = 2;
		$('#ctable').dataTable().fnDraw();
	}
}

function vacancyTabClick() {
	if (_State != 2 && _State != 3) {
		_State = 2;//loaded
		loadVacancyTable();
	}
};

$('#modify-candidate-modal').on('shown.bs.modal', function () {
	console.log("modify-candidate-modal open");
	vSelect = document.getElementById('vacancySelect');
	/* check if vacancySelect is already loaded or not */
	 if (isCandidateModalLoaded == false) {
		console.log("Load vacancy data");
		$.ajax ({
			type : 'POST',
			url : "<portlet:resourceURL id='getCandidatesFormDataAJX'/>",
			cache: false,
			error : function(e) {

			},
			success : function(data) {
				//clear all
				vSelect.options.length = 0;
				vSelect.options.add(new Option('--Please Select--', '-1'));
				$.each($.parseJSON(data), function(i, item) {
					vSelect.options.add(new Option(item.vacancy_name, item.v_id));
				});
				$('#unpublish-vacancy-warn').hide();
			}	
		})
		isCandidateModalLoaded = true;
 	}  
});

$('#modify-vacancy-modal').on('shown.bs.modal', function () {
	console.log("Vacancy Model OPENED");
	jSelect = document.getElementById('jTitleSelect');
	lSelect = document.getElementById('locationSelect');
	mSelect = document.getElementById('managerSelect2');
	/* check if jTitleSelect is already loaded or not */
		$.ajax ({
			type : 'POST',
			url : "<portlet:resourceURL id='getVacanciesFormDataAJX'/>",
			cache: false,
			error : function(e) {

			},
			success : function(response) {
				jSelect.options.length = 0;
				lSelect.options.length = 0;
				mSelect.options.length = 0;
				var data = $.parseJSON(response);
				$.each(data.jTitles, function(i, item) {
					jSelect.options.add(new Option(item.title, item.jTitleId));
				});
				
				$.each(data.locations, function(i, item){
					lSelect.options.add(new Option(item.name, item.locationId));	
				}); 
				
				mSelect.add(new Option("--Select Manager--",
				"-1"));
				$.each(data.emps, function(i, item){
					mSelect.options.add(new Option(item.name, item.employeeId));	
				});
				
				$('#vacancy_status').val('NEW');
			}	
		})
		
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
										return "<input id='vCheckbox' type='checkbox' class='vCheckbox' id='"+full.v_id+"' value='"+full.v_id+"'/>";
									}
								},
								{
									"mData" : "vacancy_name",
									"mRender" : function(data, type, full) {
										var vacancy_name = data;
										return "<a id='"
												+ full.v_id
												+ "' href='javascript:void(0)' onclick='getVacancy("
												+ full.v_id + ");'>"
												+ vacancy_name + "</a>";
									}
								}, {
									"mData" : "job_title"
								}, {
									"mData" : "location"
								}, {
									"mData" : "status",
									"mRender" : function(data, type, full) {
										if (data != null || data != '') {
											if (full.availableStatuses == null || full.availableStatuses.length == 0) {
												return  "<div class='vacancyStatus'><span class='currentStatus "+ full.statusCssClass +"'>"
												+ data
												+ "</span></div>";		
											}
											var selectorId = "vAvailStatusSelect"
												+ full.v_id;
											var v_name = full.vacancy_name;
 											var s = "<div class='vacancyStatus'><span class='currentStatus "+ full.statusCssClass +"'>"
													+ data
													+ "</span><select class='statusSelect' onchange='onVacancyStatusChange("
													+ full.v_id
													+ ", \"" 
													+ v_name + "\")' id='"
													+ selectorId
													+ "' name='vAvailStatusSelect'>"; 
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
			type : "text",
		}, {
			type : "select",
			values : ListJobTitle,
		}, {
			type : "select",
			values : ListLocation,
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
				createdRow : function ( row, data, index ) {
		        	$('td', row).eq(2).addClass('highlight');
		        },
		        fnRowCallback : function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {
					console.log("row selected");
		        },
				oLanguage : {
					sProcessing : "<img src='<%=renderRequest.getContextPath()%>/images/loading_animator.gif'/><span>Please wait...</span>"
					<%-- sProcessing : "<div class='modal-backdrop'><div class='loading-indicator'><img src='<%=renderRequest.getContextPath()%>
	/images/loading_animator.gif'/><br /><span>Please wait...</span></div></div>" --%>
							},
							aoColumns : [
									{
										"mData" : "c_id",
										"type" : "number",
										"bSortable" : false,
										"mRender" : function(data, type, full) {
											return "<input id='cCheckbox' class='cCheckbox' type='checkbox' id='"+full.c_id+"' value='"+full.c_id+"'/>";
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
													+ "' href='javascript:void(0)' onclick='getCandidate("
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
										"sWidth" : "20px",
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
											if (data != null
													&& full.availableStatuses != null) {
												if (full.availableStatuses == null
														|| full.availableStatuses.length == 0) {
													return "<div class='candidateStatus'><span class='currentStatus "+ full.statusCssClass +"'>"
													+ data
													+ "</span></div>";
												}
												var selectorId = "availStatusSelect"
														+ full.c_id;
												var s = "<div class='candidateStatus'><span class='currentStatus "+ full.statusCssClass +"'>"
												+ data
												+ "</span><select class='statusSelect' onchange='onCandidateStatusChange("
														+ full.c_id
														+ ","
														+ full.vacancyId
														+ ")' id='"
														+ selectorId
														+ "' name='availStatusSelect'>";
												var options = "<option value='" + -1 + "' selected>--Select status--</option>";
												for (var i = 0; i < full.availableStatuses.length; i++) {
													options += "<option value='" + full.c_id + "'>"
															+ full.availableStatuses[i]
															+ "</option>";
												}
												s = s + options
														+ "</select></div>";
												return s.toString();
											}
											return data;
										}
									},
									{
										"mData" : "resume",
										"type" : "text",
										"mRender" : function(data, type, full) {
											return "<a href='javascript:void(0);'>View Resume</a>";
										}
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
						/* 							bColVis : true,
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
						"dom" : 'Cf<"toolbar"">rtip',*/

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
												"MARK_INTERVIEW_PASS",
												"MARK_INTERVIEW_FAIL" ]
									}, {
										type : "text"
									} ]

						});

		/* FILTER DELAYING */
		var searchWaitInterval = undefined;
		$('tfoot input.text_filter').unbind('keypress keyup').bind(
				'keypress keyup',
				function(e) {
					if (searchWaitInterval != undefined) {
						clearTimeout(searchWaitInterval);
					}
					$this = this;
					searchWaitInterval = setTimeout(function() {
						searchWaitInterval = undefined;
						console.log("Search value " + $this.value);
						console.log("Column " + $('tfoot input').index($this));
						cTable.fnFilter($this.value, $('tfoot input').index(
								$this) + 1);
					}, 1000);
				});

		_State = 1;
	}

	/*
	 *
	 * selectorId: candidateId - to determine WHICH candidate's status is being CHANGED 
	 * vacancyId: vacancyId - to pass to Interview Schedule modal incase status -> INTERVIEW_SCHEDULE
	 *
	 */
	function onCandidateStatusChange(selectorId, vacancyId) {

		var object = new Object();
		object.c_id = selectorId;
		object.changedStatus = $(
				"#availStatusSelect" + selectorId + " option:selected").text();
		if (selectorId != -1) {
			if (object.changedStatus == 'INTERVIEW_SCHEDULED') {
				$
						.ajax({
							type : 'GET',
							url : '<portlet:resourceURL id="getInterviewScheduleFormDataAJX"/>',
							contentType : "application/json; charset=utf-8",
							success : function(response) {
								var data = $.parseJSON(response);
								iSelect = document
										.getElementById('interviewTitleSelect');
								mSelect = document
										.getElementById('managerSelect1');
								/* $('#itv_c_id').val(selectorId); */
								iSelect.options.length = 0;

								$.each(data.interviews, function(i, item) {
									iSelect.options.add(new Option(
											item.interviewName,
											item.interviewId));
								});

								mSelect.options.length = 0;
								mSelect.add(new Option("--Select Manager--",
										"-1"));
								$.each(data.employees, function(i, item) {
									mSelect.options
											.add(new Option(item.employeeName,
													item.employeeId));
								});
								/* clear managers selected list */
								$('#managers1').empty();
							},
						});
				$('#vacancyId').val(vacancyId);
				$('#candidateId').val(selectorId);

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

	/* 
	 * De-select status of Candidate when canceling the SCHEDULE_INTERVIEW dialog action
	 *
	 */
	function resetCandidateStatus() {
		var candidateId = $('#candidateId').val();
		if (candidateId != -1) {
			$("#availStatusSelect" + candidateId).val('-1');
		}
	}

	function onManagerSelect(selectPrefix) {
		console.log("Selected changed");
		var employeeId = $('#managerSelect' + selectPrefix).val();
		if (employeeId != -1) {
			var employeeName = $(
					'#managerSelect' + selectPrefix + ' option:selected')
					.text();
			console.log(employeeId);

			/* add to managers list and show */
			addManagerToList(selectPrefix, employeeId, employeeName);
			/* remove from select after adding to list */
			$(
					'#managerSelect' + selectPrefix + ' option[value='
							+ employeeId + ']').remove();
			$('#managerSelect' + selectPrefix).val("-1");
		}
	}

	function addManagerToList(selectPrefix, employeeId, employeeName) {
		/* add to managers list and show */
		$('#managers' + selectPrefix)
				.append(
						"<li id='li"+ selectPrefix + employeeId +
			"'><div class='edit-buttons'><button type='button' onclick='onRemoveManager("
								+ selectPrefix
								+ ","
								+ employeeId
								+ ")'><i class='icon-minus-sign'></i></button></div> <span>"
								+ employeeName + "</span></li>");
	}

	function onRemoveManager(selectPrefix, employeeId) {
		var employeeName = $('#li' + selectPrefix + employeeId + " span")
				.text();
		console.log(employeeName);
		$('#li' + selectPrefix + employeeId).remove();
		document.getElementById('managerSelect' + selectPrefix).options
				.add(new Option(employeeName, employeeId));
	}

	/*
	 *
	 * selectorId: candidateId - to determine WHICH vacancy's status is being CHANGED 
	 *
	 */
	function onVacancyStatusChange(v_id, v_name) {
		var obj = new Object();
		obj.v_id = v_id;
		obj.changedStatus = $(
				"#vAvailStatusSelect" + v_id + " option:selected").text();
		console.log(v_id);
		console.log(obj.changedStatus);
		vSelect = document.getElementById('vacancySelect'); 
		if (v_id != -1) {
			function onSuccessUpdateNewStatus(response) {
				$('#vtable').dataTable().fnDraw();	
				/* send updates to vacancySelect */
				if (obj.changedStatus === 'PUBLISHED') {
					vSelect.options.add(new Option(v_name, v_id));
				} else {
					$('#vacancySelect option[value="'+v_id+'"]').remove();
				}
			};
			
			genericAJAXCalling('<portlet:resourceURL id="vacancyStatusChange"/>', obj, onSuccessUpdateNewStatus);
		}
	}
	
	
	$(".header").click(function () {
		    $header = $(this);
		    $content = $header.next();
		    $content.slideToggle(500, function () {
		        $header.text(function () {
		            return $content.is(":visible") ? "Hide CANDIDATE history" : "Show CANDIDATE history";
		        });
		    });
	});

	$(document).ready(function() {
		/* Add more validate for form */
		
/* 		var $validator = $("form").validate();
		$.validator.addMethod("alpha", function(value,element){
		return this.optional(element) || /^[a-zA-Z]+$/i.test(value); 
	}, "Please enter alphabets only"); 
		 */
		 

			
		loadCandidateTable();
		/* 		$(".select2-container").select2();
		 $(".select_filter").select2(); */

		/* SELECT A ROW */
		var cTable = $('#ctable').DataTable();
 		$('#job_posting').summernote({
 			height: 200,
 			
 		}); 
		$('#ctable tbody').on('click', 'tr', function() {
			if ($(this).hasClass('selected')) {
				$(this).removeClass('selected');
			} else {
				cTable.$('tr.selected').removeClass('selected');
				$(this).addClass('selected');
			}
		});

		$('#date_of_application').datepicker();
		$('#itvDate').datepicker();
		$('#itvTimeFrom').timepicker();
		$('#itvTimeTo').timepicker();

		function onSuccessLoadDataForFooterFilter(response) {
			data = $.parseJSON(response);
			console.log(data);
			ListJobTitle = data.jTitles;
			ListLocation = data.locations;	
		}
		
		genericAJAXCalling("<portlet:resourceURL id='loadDataForFooterFilter'/>", obj, onSuccessLoadDataForFooterFilter);

	});
	
	function showBottomRightWarningNotifyShortDelay(ntf_msg) {
		showNotify('',ntf_msg,'warning',2000,'bottom','right');
	}
	
	function showBottomRightWarningNotify(ntf_delay, ntf_msg) {
		showNotify('',ntf_msg,'warning',ntf_delay,'bottom','right');
	}
	
	function showBottomRightErrorNotifyShortDelay(ntf_msg) {
		showNotify('',ntf_msg,'danger',2000,'bottom','right');
	}
	
	function showBottomRightErrorNotify(ntf_delay, ntf_msg) {
		showNotify('',ntf_msg,'danger',ntf_delay,'bottom','right');
	}
	
	function showNotify(ntf_title, ntf_msg, ntf_type, ntf_delay, ntf_placement, ntf_align) {
		$.notify({
			title: ntf_title,
			message: ntf_msg,
		}, {
			type: ntf_type,
			delay: ntf_delay,
			placement: {
				from: ntf_placement,
				align: ntf_align
			},
			z_index: 2000,
			animate: {
				enter: 'animated fadeInDown',
				exit: 'animated fadeOutUp'
			},
		});
	}

	/*
	 * Usage: clear all input fields
	 *  
	 *
	 */
	function clearFields() {
		$('#candidateInfo :input').each(function() {
			$(this).val('');
		});
		$('#c_id').val('-1');
	};

	/*
	 * Usage: call AJAX to get Candidate from Db for editting
	 * id: candidateId
	 *
	 */
	function getCandidate(id) {
		var obj = new Object();
		obj.c_id = id;
		$('#modify-candidate-modal').modal('show');
		
		function onSuccessGetCandidate(response) {
			var obj = response;
			$('#c_id').val(obj.c_id);
			$('#first_name').val(obj.first_name);
			$('#middle_name').val(obj.middle_name);
			$('#last_name').val(obj.last_name);
			$('#inputEmail').val(obj.email);
			$('#contact_number').val(obj.contact_number);
			$('#comment').val(obj.comment);
			$('#date_of_application').val(obj.date_of_application);
			console.log("V_ID " + obj.v_id);
			if (obj.vacancyStateUnpublished == true) {
				$('#vacancySelect').val('-1');
				$('#unpublish-vacancy-warn').show();
				showBottomRightWarningNotify(5000, 'The Vacany for this Candidate was set to UNPUBLISH');
				notify.close();
			} else {
				$('#vacancySelect').val(obj.v_id);
				$('#unpublish-vacancy-warn').hide();
			}
		};
		
		genericAJAXCalling("<portlet:resourceURL id='getCandidate'/>", obj, onSuccessGetCandidate);

	}

	function deleteCandidates() {
		var selectedArr = [];
		$('#ctable tbody tr input[type=checkbox]:checked').each(function() {
			var id = $(this).val();
			selectedArr.push({
				c_id : id
			});
		});
		
		function onSuccessDeleteCandidates(response) {
			_State = 3;
		};
		
		genericAJAXCalling("<portlet:resourceURL id='deleteCandidates'/>", selectedArr, onSuccessDeleteCandidates);
	}

	function deleteCandidates1() {
		var cTable = $('cTable').DataTable();

		cTable.row('.selected').remove().draw(false);

	}

	function deleteVacancies() {
		var selectedArr = [];
		$('#vtable tbody tr input[type=checkbox]:checked').each(function() {
			var id = $(this).val();
			selectedArr.push({
				v_id : id
			});
		});
		function onSuccessDeleteVacancies(response) {
			$('#vtable').dataTable().fnDraw();
			if (response.isNotified == true) {
				/* $('#ctable').dataTable().fnDraw(); */
				_State = 3;
			}	
		};
		genericAJAXCalling("<portlet:resourceURL id='deleteVacancies'/>", selectedArr, onSuccessDeleteVacancies);
	}
	
	

	function addLocation() {
		$('#modify-location-modal').modal('show');
	}

	/*
	 * Usage: save Interview Schedule
	 *
	 */
	function saveInterviewSchedule() {
		console.log("on SAVE INTERVIEW SCHEDULE");
		var object = new Object();
		object.interviewId = $('#interviewTitleSelect').val();
		object.candidateId = $('#candidateId').val();
		object.vacancyId = $('#vacancyId').val();
		object.itvDate = $('#itvDate').val();
		object.itvTimeFrom = $('#itvTimeFrom').val();
		object.itvTimeTo = $('#itvTimeTo').val();

		/* add selected managers */
		var selectedInterviewers = [];
		$('#managers1 li').each(function(i) {
			selectedInterviewers.push(($(this).attr('id')));
		});

		if (selectedInterviewers.length != 0) {
			object.selectedInterviewers = selectedInterviewers;
			function onSuccessSaveInterviewSchedule(response) {
				console.log("DATA RESPONSE FOR saveInterviewSchedule");
				/* Clear candidate status */
				/* resetCandidateStatus(); */
				$('#modify-interviewSchedule-modal').modal('hide');
				$('#ctable').dataTable().fnDraw();
			}
			
			genericAJAXCalling("<portlet:resourceURL id='saveInterviewSchedule'/>", object, onSuccessSaveInterviewSchedule);
		}
	}

	function saveLocation() {
		console.log("SAVE LOCATION");
		var obj = new Object();
		obj.name = $('#locationName').val();
		obj.province = $('#locationProvince').val();
		obj.city = $('#locationCity').val();
		obj.address = $('#locationAddress').val();
		obj.zip_code = $('#locationZipcode').val();
		obj.phone = $('#locationPhone').val();
		obj.fax = $('#locationFax').val();
		obj.note = $('#locationNote').val();
		console.log(obj);
		$.ajax({
			type : 'POST',
			url : "<portlet:resourceURL id='saveLocation'/>",
			data : JSON.stringify(obj),
			dataType : "json",
			contentType : 'application/json',
			mimeType : 'application/json',
			error : function(e) {

			},
			success : function(response) {
				console.log('SAVED LOCATION');
			}
		});
	}
	
	function genericAJAXCalling(url, parameters, successCallback) {
		$.ajax ({
			type: 'POST',
			url: url,
			data: JSON.stringify(parameters),
			contentType: 'application/json;',
			dataType: 'json',
			success: successCallback,
			error: function (xhr, textStatus, errorThrown) {
				console.log('error on loading AJAX');
			}
		})
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

ul.options {
	over-flow: hidden;
	list-style: none;
	margin-left: 0;
	margin-bottom: 0;
}

ul.options>li {
	padding: 2px 6px 3px;
	margin: 0 0 5px;
	/* 	float: left;
	
	display: inline-block; 
	margin-left: 117px;*/
	clear: both;
}

div.edit-buttons {
	display: inline-block;
	float: left;
	padding: 0 5px 0 0;
	white-space: nowrap;
	overflow: hidden;
}

.unpublish-vacancy-warn, .edit-buttons button {
	width: 16px;
	height: 16px;
	position: relative;
	display: inline-block;
	overflow: visible;
	padding: 0;
	margin: 0;
	background: transparent;
	border: none;
	z-index: 3;
	text-align: center;
}

.unpublish-vacancy-warn:hover {
	
}

span.unpubish_warn {
	display: none;
	font-style: italic;
	color: red;
}

div.vacancyStatus, div.candidateStatus {
	width: 100px;
}

div.vacancyStatus select, div.candidateStatus select {
	width: 30px !important;
	height: 14px;
	margin-top: 22px;
	border-color: inherit;
	border-radius: .55em;
	font-size: 12px;
	cursor: default;
}

span.currentStatus {
	/* right: 20px; */
	display: block;
	position: absolute;
	margin: 0;
	font-size: 11px;
	line-height: 20px;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, .2);
	padding: 0 6px;
	float: right !important;
	text-align: center;
	white-space: nowrap;
	vertical-align: baseline;
	border-radius: .25em;
}

.status-green {
	color: #fff;
	background: green;
}

.status-red {
	color: #fff;
	background: maroon;
}

.status-grey {
	color: #fff;
	background: grey;
}

.status-yellow {
	color: #fff;
	background: #f4b04f;
}

textarea.note-codable {
	display: none !important;
}

.note-editor .btn-toolbar {
	margin-top: 0px !important;
}

.form-horizontal .control-label {
	text-align: left !important;
}

.hrm-modal label {
	font-size: 12px;
}

.hrm-modal .controls input[type=text] {
	font-size: 12px;
}

.modal-container {
	width: 100%;
	border: 1px solid #d3d3d3;
}

.modal-container div {
	width: 100%;
}

.modal-container .header {
	background-color: #d3d3d3;
	padding: 2px;
	cursor: pointer;
	font-weight: bold;
}

.modal-container .content {
	display: none;
	padding: 5px;
}
</style>