<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>
<%-- <portlet:actionURL var="submitFileAction" name="submitFile"></portlet:actionURL> --%>

<portlet:renderURL var="reportTabURL">
	<portlet:param name="mvcPath" value="/jsp/hrm/reports.jsp"></portlet:param>
</portlet:renderURL>

<%-- <button type="button" onclick="<%= reportTabURL.toString()%>">Go to Reports</button>
<aui:button cssClass="btn" value="Go to Reports" onClick="<%= reportTabURL.toString()%>"/> --%>
<div id="myTab">
	<ul class="nav nav-tabs">
		<li class="active"><a href="#cTab" onclick="candidateTabClick()"><liferay-ui:message
					key="tab.candidate.title" /></a></li>
		<li><a href="#vTab" onclick="vacancyTabClick()"><liferay-ui:message
					key="tab.vacancy.title" /></a></li>
		<li><a href="#reportTab" style="display: none">z</a><a href="#"
			onclick="location.href = '<%= reportTabURL.toString() %>';">Reports</a></li>
		<%-- <li><aui:a href="#reportTab" onClick="<%= reportTabURL.toString()%>"></aui:a></li> --%>

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
							<a href="javascript:void(0);" class="btn btn-primary"
								onclick="showAddCandidateModal()"> <i class="icon-plus"></i>
								<liferay-ui:message key="global.button.add" />
							</a>
							<button data-toggle="modal" id="cDeleteBtn"
								class="btn btn-danger" onclick="deleteCandidates()">
								<liferay-ui:message key="global.button.delete" />
							</button>

							<a data-toggle="modal" class="btn" href="#export-modal">Export
								CSV</a> <a data-toggle="modal" id="iAddBtn" class="btn"
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
									<th>Application Date</th>
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
						<th><liferay-ui:message key="vacancy.id" /></th>
						<th><liferay-ui:message key="vacancy.name" /></th>
						<th>Job Title</th>
						<th>Location</th>
						<th>Status</th>
						<th>Applicants / Positions</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th><input type="checkbox" id="v_checkAll" /></th>
						<th><liferay-ui:message key="vacancy.name" /></th>
						<th>Job Title</th>
						<th>Location</th>
						<th>Status</th>
						<th></th>
					</tr>
				</tfoot>
				<tbody></tbody>
			</table>
		</div>
		<div id="reportTab" style="display: none;"></div>
	</div>

</div>

<!-- ########################################### MODALS ########################################### -->

<form id="candidateForm" class="form-horizontal"
	enctype="multipart/form-data" method="POST">
	<div class="hrm-modal modal candidate-modal"
		id="modify-candidate-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<span class="modal-title">Add New Candidate</span>
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
					<input type="text" id="contact_number" value="123-456-789"
						placeholder="Contact Number">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="select2"><liferay-ui:message
						key="candidate.job_vacancy" /></label>
				<div class="controls">
					<select class="select2-container" id="vacancySelect"
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
					<div class="resume-actions" id="resume-actions">
						<input id="resumeId" type="hidden" value="-1" /> <a
							id="resumeLink" href="javascript:void(0);"
							onclick="candidateModalGetPreviewResume()">candidateResume</a>
						<div class='inline-edit'>
							<a href="javascript:void(0);" onclick="onReplaceResume()"><i
								class='icon-pencil'></i></a> <a href="javascript:void(0);"
								onclick="onModifyResume()"><i class='icon-remove'></i></a> <a
								id="downloadResumeLink" href="javascript:void(0);"><i
								class='icon-download'></i></a>
						</div>
					</div>
					<div class="noresume-actions" id="noresume-actions"
						style='display: none;'>
						<input type="file" name='addCandidate_resume'
							accept="application/pdf,application/msword,application/vnd.openxmlformats-officedocument.wordprocessingml.document"
							id="addCandidate_resume" /> <a id="resetResumeLink"
							style='display: none;' href="javascript:void(0);"
							onclick="onModifyResume()"><i class='icon-repeat'></i></a>
					</div>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="comment"><liferay-ui:message
						key="candidate.comment" /></label>
				<!-- 				<textarea rows="5" cols="50" class="form-control" id="comment">Test Test</textarea> -->
				<div class="controls">
					<input type="text" id="comment" value="Ghi chú"
						placeholder="Comment..." />
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="date_of_application">Date
					of application<span class="required">*</span>
				</label>
				<div class="controls">
					<input type="text" data-date-format="dd/mm/yyyy"
						id="date_of_application" class="small70 required">
				</div>
			</div>
			<div id="candidate-history-container"
				class="candidate-history-container" style="display: none;">
				<div class="header">
					<span>Expand</span>

				</div>
				<div class="content">
					<table id="candidateHistoryTable"
						class="table table-striped table-bordered">
						<!-- 		<thead>
							<tr>
								<th>Performed Date</th>
								<th>Description</th>
								<th>Details</th>
							</tr>
						</thead>
						<tbody>
						</tbody> -->
					</table>
				</div>
			</div>

		</div>

		<div class="modal-footer">
			<!-- <input type="submit" value="submit"/> -->
			<!-- 			<button type="button" class="btn btn-primary"
				onclick="saveCandidate()">Save</button> -->

			<button type="submit" class="btn btn-primary">Save</button>
			<button class="btn" onclick="clearFields()">
				<liferay-ui:message key="global.button.clear_all" />
			</button>
			<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</div>
</form>

<!-- VACANCY MODAL -->
<form id="vacancyForm" class="form-horizontal"
	enctype="multipart/form-data" method="POST">
	<div class="hrm-modal modal vacancy-modal" id="modify-vacancy-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<span class="modal-title">Add New Vacancy</span>
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
				<label class="control-label" for="jd-actions">Job Description</label>
				<div class="controls">
					<div class="resume-actions" id="jd-actions">
						<input id="jdId" type="hidden" value="-1" /> <a
							id="jdLink" href="javascript:void(0);"
							onclick="vacancyModalGetPreviewJD()">Job Description</a>
						<div class='inline-edit'>
							<a href="javascript:void(0);" onclick="onReplaceJD()"><i
								class='icon-pencil'></i></a> <a href="javascript:void(0);"
								onclick="onModifyJD()"><i class='icon-remove'></i></a> <a
								id="downloadJDLink" href="javascript:void(0);"><i
								class='icon-download'></i></a>
						</div>
					</div>
					<div class="noresume-actions" id="nojd-actions"
						style='display: none;'>
						<input type="file" name='addVacancy_JD'
							accept="application/pdf,application/msword,application/vnd.openxmlformats-officedocument.wordprocessingml.document"
							id="addVacancy_JD" /> <a id="resetJDLink"
							style='display: none;' href="javascript:void(0);"
							onclick="onModifyJD()"><i class='icon-repeat'></i></a>
					</div>
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
				<label class="control-label" for="subUnitSelect">Sub Unit</label>
				<div class="controls">
					<select id="subUnitSelect">
					</select>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="hiring_managers"><liferay-ui:message
						key="vacancy.hiring_managers" /><span class="required">*</span></label>
				<div class="controls">
					<select id="managerSelect2" class="managerSelect"
						onchange="onManagerSelect(2)"></select> <label
						id="managerSelect2Warning" for="managerSelect2" class="error"
						style="display: none;">Manager is required</label>
					<ul id="managers2" class="options"></ul>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="no_of_pos"><liferay-ui:message
						key="vacancy.no_positions" /></label>
				<div class="controls">
					<input type="text" id="no_of_pos" value="3" placeholder=""
						class="small70 required number">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="desc">Description</label>
				<div class="controls">
					<textarea id="desc" rows="5" cols="50"></textarea>
				</div>
			</div>
			
			<%-- <label for="job_posting" style="font-weight: bold; font-size: 12px;"><liferay-ui:message
					key="vacancy.job_posting" /></label>
			<textarea id="job_posting" cols="7">Job Posting</textarea> --%>
			
		</div>
		<div class="modal-footer">
			<button type="submit" class="btn btn-primary">Save</button>
			<button class="btn" onclick="clearFields()">
				<liferay-ui:message key="global.button.clear_all" />
			</button>
			<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</div>
</form>

<!-- JOB TITLE MODAL -->
<div class="hrm-modal modal job-title-modal" id="modify-jtitle-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<span class="modal-title">Add New Job Title</span>
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
<div class="hrm-modal modal location-modal" id="modify-location-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<span class="modal-title">Add New Location</span>
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
<div class="hrm-modal modal interview-modal" id="modify-interview-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<span class="modal-title">Add New Interview Status</span>
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
	<div class="hrm-modal modal schedule-interview-modal"
		id="modify-interviewSchedule-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				onclick="resetCandidateStatus()">x</button>
			<span class="modal-title">Schedule Interview</span>
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
				<label class="control-label" for="itvName">Interviewer Name<span
					class="required">*</span></label>
				<div class="controls">
					<select id="managerSelect1" name="managerSelect1"
						class="managerSelect" onChange="onManagerSelect(1)"></select>

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
				<label class="control-label" for="itvDate">Date<span
					class="required">*</span></label>
				<div class="controls">
					<input type="text" data-date-format="dd/mm/yyyy" id="itvDate"
						class="itvDate small70 required" placeholder="dd/mm/yyyy">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="itvTime">Time<span
					class="required">*</span></label>
				<div class="controls">
					<div id="itvTime">
						<label class="small70" for="itvTimeFrom">From</label> <input
							type="text" class="small70 required" id="itvTimeFrom"
							placeholder="HH:MM"> <label class="small70"
							for="itvTimeTo">To</label> <input class="small70 required"
							type="text" id="itvTimeTo" placeholder="HH:MM">
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

<form id="exportForm" class="form-horizontal">
	<div class="hrm-modal modal export-modal" id="export-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<span class="modal-title">Export Modal</span>
		</div>

		<div class="modal-body" id="exportSetting">
			<input type="hidden" class="entityId" id="v_id" value="-1" />
			<div class="control-group">
				<label class="control-label" for="jTitleSelect">Choose
					Preset:</label>
				<div class="controls">
					<select class="select2-container" id="exportPresetSelect"
						class="exportPresetSelect">
						<optgroup label="Excel">
							<option>XLS</option>
							<option>XLSX</option>
						</optgroup>
						<optgroup label="CSV">
							<option>CSV Default</option>
							<option>CSV Custom</option>
						</optgroup>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="noOfRecords"><liferay-ui:message
						key="vacancy.name" /></label>
				<div class="controls">
					<input type="text" id="noOfRecords" placeholder="Name"
						class="required">
				</div>
			</div>

			<label class="control-label">Conditions:</label>
			<ul id="managers1" class="options">
				<li>
					<div class="attributes" style="display: inline-block;">
						<div class="edit-buttons">
							<button type="button">
								<i class="icon-minus-sign"></i>
							</button>
							<button type="button">
								<i class="icon-plus-sign"></i>
							</button>
						</div>
						<select id="attribute1" class="attribute-select">
							<option>Firstname</option>
							<option>Middle name</option>
							<option>Last name</option>
						</select> <select id="search-options" class="search-options">
							<option>contains</option>
							<option>equals</option>
						</select> <input type="text" name="attribute1" class="attribute-text"
							placeholder="Firstname" />
					</div>
				</li>

				<li>
					<div class="attributes" style="display: inline-block;">
						<div class="edit-buttons">
							<button type="button">
								<i class="icon-minus-sign"></i>
							</button>
							<button type="button">
								<i class="icon-plus-sign" onclick="addCondition"></i>
							</button>
						</div>
						<select id="attribute1" class="attribute-select">
							<option>Firstname</option>
							<option>Middle name</option>
							<option>Last name</option>
						</select> <select id="search-options" class="search-options">
							<option>contains</option>
							<option>equals</option>
						</select> <input type="text" name="attribute1" class="attribute-text"
							placeholder="Firstname" />
					</div>
				</li>
			</ul>
			<%-- 
			<div class="control-group">
				<label class="control-label" for="vacancy_status"><liferay-ui:message
						key="vacancy.status" /></label>
				<div class="controls">
					<input disabled id="vacancy_status" value="NEW"
						style="border: 0px;">
				</div>
			</div> --%>
		</div>
		<div class="modal-footer">
			<!--  			<button type="button" class="btn btn-primary" onclick="downloadExport()">
				Download
			</button> -->
			<a href="<portlet:resourceURL id='export_result'/>"
				class="btn btn-primary">Download</a> <a href="#" class="btn"
				data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</div>
</form>

<form id="employeeForm" class="form-horizontal">
	<div class="hrm-modal modal employee-modal" id="modify-employee-modal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<span class="modal-title">Hire Candidate</span>
		</div>

		<div class="modal-body" id="interviewScheduleInfo">
			<input type="hidden" class="entityId" id="employeeId" value="-1">
			<input type="hidden" class="entityId" id="e_candidateId" value="-1">
			<input type="hidden" class="entityId" id="e_vacancyId" value="-1">
			<div class="control-group">
				<label class="control-label" for="e_firstname">FirstName<span
					class="required">*</span>
				</label>
				<div class="controls">
					<input type="text" id="e_firstname" class="required"
						placeholder="FirstName" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="e_middle_name"><liferay-ui:message
						key="candidate.middle_name" /><span class="required">*</span></label>
				<div class="controls">
					<input type="text" class="required" id="e_middle_name"
						placeholder="Middle Name">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="e_last_name"><liferay-ui:message
						key="candidate.last_name" /><span class="required">*</span></label>
				<div class="controls">
					<input type="text" class="required" id="e_last_name"
						placeholder="Last Name">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="e_gender_select">Gender<span
					class="required">*</span></label>
				<div class="controls">
					<select id="e_gender_select">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
					</select>
				</div>
			</div>


			<div class="control-group">
				<label class="control-label" for="e_inputEmail"><liferay-ui:message
						key="candidate.email" /><span class="required">*</span></label>
				<div class="controls">
					<input type="email" class="required email" id="e_inputEmail"
						placeholder="Email">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="e_birthday">Birthday:<span
					class="required">*</span></label>
				<div class="controls">
					<input type="text" data-date-format="dd/mm/yyyy"
						class="small70 required" id="e_birthday" placeholder="dd/mm/yyyy">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="e_contact_number"><liferay-ui:message
						key="candidate.contact_number" /></label>
				<div class="controls">
					<input type="text" id="e_contact_number" value="123-456-789"
						placeholder="eg. 0902 548822">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="e_subUnit">Sub Unit</label>
				<div class="controls">
					<input disabled id="e_subUnit" value="" style="border: 0px;">
				</div>
			</div>

			<div class="control-group">
				<label class="control-label" for="e_start_date">Start Date:<span
					class="required">*</span></label>
				<div class="controls">
					<input type="text" data-date-format="dd/mm/yyyy"
						class="small70 required" id="e_start_date"
						placeholder="dd/mm/yyyy">
				</div>
			</div>

		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-primary"
				onclick="saveEmployee()">
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

	<!-- PREVIEW MODAL -->
</form>
<div class="hrm-modal modal preview-modal" id="preview-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<span class="modal-title">Preview</span>
	</div>

	<div class="modal-body" id="previewInfo">
		<div class="lfr-preview-file" id="previewFile">
			<div class="lfr-preview-file-content" id="previewFileContent">
				<div class="lfr-preview-file-image-current-column">
					<div class="lfr-preview-file-image-container">
						<img class="lfr-preview-file-image-current" id="previewFileImage"
							src="${previewFileURL}${initial}" />
					</div>
					<span class="lfr-preview-file-actions hide" id="previewFileActions">
						<span class="lfr-preview-file-toolbar" id="previewToolbar"></span>
						<span class="lfr-preview-file-info"> <span
							class="lfr-preview-file-index" id="previewFileIndex">1</span> of
							<span class="lfr-preview-file-count" id='previewFileCount'>${previewFileCount}</span>
					</span>
					</span>
				</div>

				<div class="lfr-preview-file-images" id="previewImagesContent">
					<div class="lfr-preview-file-images-content"
						id="previewImagesContentSub"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<a type="button" class="btn btn-primary" id="preview_downloadLink">
			Download </a> <a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
				key="global.button.cancel" /></a>
	</div>
</div>


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
var isCandidateHistoriesLoaded = false;


$(document).ready(function() {
	
	loadCandidateTable();
	
	function dataFormatResult(state) {
		return state.text;
	}
	 
	function dataFormatSelection(state) {
		return state.id;
	}
	 
	$('.managerSelect').select2({
		placeholder: {
			id: '-1',
			text: 'Select a manager'
		},
		/* initSelection: function(element, callback){}, */
		allowClear: true,
	 	minimumInputLength: 1,
	 	ajax: {
	 		url: '<portlet:resourceURL id="getManagerSelectData"/>',
	 		dataType: 'json',
	 		quietMillis: 100,
	 		data: function (params) {
	 			return {
	 				q: params.term,
	 				iDisplayStart: (params.page-1)*10,
	 				iDisplayLength: 10,
	 				sEcho: 0,
	 				iSortCol_0: 0,
	 				sSortDir_0: 'asc',
	 				page: params.page
	 			};
	 		},
	 		processResults: function(data, page) {
	 			var more= (page * 10) < data.iTotalDisplayRecords;
	 			return {
	 				results: data.aaData, more: more
	 			}
	 		}
	 	},
	 	formatResult : dataFormatResult,
         formatSelection : dataFormatSelection,
         dropdownCssClass : "bigdrop",
         escapeMarkup : function(m) { return m; } 
	 });
	 

/* 	var cTable = $('#ctable').DataTable();
		$('#job_posting').summernote({
			height: 100,
			
		});  */
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
	$('#e_birthday').datepicker();
	$('#e_start_date').datepicker();
	$('#itvTimeFrom').timepicker();
	$('#itvTimeTo').timepicker();

	$.ajax ({
		type: 'GET',
		url: "<portlet:resourceURL id='loadDataForFooterFilter'/>",
		contentType: 'application/json;',
		dataType: 'json',
		success: function(response) {
			ListJobTitle = response.jTitles;
			ListLocation = response.locations;	
		},
		error: function (xhr, textStatus, errorThrown) {
			console.log('error on loading AJAX');
		}
	})
	
});

$('#modify-interviewSchedule-modal').on('shown.bs.modal', function(){
	console.log("#modify-interviewSchedule-modal shown!!!")
});


$('#preview-modal').on('hide.bs.modal', function(){
	$('#previewImagesContent').empty();
	console.log("#preview-modal close!!!")
});

/* clear modal data on closing */
 $('.modal').each(function(index) {
	$(this).on('hidden.bs.modal', function () {
	    $(this)
	    .find("input,textarea")
	    .val('')
	    .end()
	    .find("input[type=checkbox], input[type=radio]")
	       .prop("checked", "")
	       .end()
	       .find("input[type=hidden]")
	       .val('-1')
	       .end()
		       .find("select")
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
	$('#modify-vacancy-modal').modal('show');
	var obj = new Object();
	obj.v_id = id;

	function onSuccessGetVacancy(response) {
		var obj = response;
		console.log(obj);
		$('#v_id').val(obj.v_id);
		$('#v_name').val(obj.v_name);
		$('#location').val(obj.location);
		$('#no_of_pos').val(obj.no_of_pos);
		$('#vacancy_status').val(obj.vacancy_status);
		$('#job_posting').val(obj.job_posting);
		$('#jTitleSelect').val(obj.jTitleId);
		$('#subUnitSelect').val(obj.subUnitId);
		/* add to managers list and show */
		var emps = obj.employees;
		$.each(emps, function(i, item){
			addManagerToList('2', item.employeeId, item.name);	
		});
		
		if (obj.jd != "-1") {
			$('#nojd-actions').hide();
			$('#jd-actions').show();
			$('#resetJDLink').show();
			
			$('a#downloadJDLink').attr("href", obj.jd);
			$('a#jdLink').text(obj.jdFileName);
			$('a#jdLink').attr("href", "javascript:void(0);");
			$('#jdId').val(obj.jdId);
		} else {
			$('#nojd-actions').show();
			$('#jd-actions').hide();
			$('#resetJDLink').hide();
		}
	}
	genericAJAXCalling("<portlet:resourceURL id='getVacancy'/>", obj, onSuccessGetVacancy);
}

$('#vacancyForm').submit(function(e){
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
				obj.subUnitId = $("#subUnitSelect").val();
				/* add selected managers */
				obj.selectedManagers = selectedManagers;
			
				if (document.getElementById('addVacancy_JD').files.length == 0) {
					obj.jdId = -1;
					if ($('#nojd-actions').css('display') == 'none') {
						obj.isDeleteOrChange = false;
					} else {
						obj.isDeleteOrChange = true;
					}
					function onSuccessSaveVacancy(response) { 
						$('#vtable').dataTable().fnDraw();
						showBottomRightSuccessNotify('Successfully saved Vacancy!');
					}
					
					genericAJAXCalling("<portlet:resourceURL id='saveVacancy'/>", obj, onSuccessSaveVacancy);
					$('#modify-vacancy-modal').modal('hide');	
				} else {
					$.ajax({
						url: '<portlet:resourceURL id="uploadVacancyJD"/>',
						type: 'POST',
						data: new FormData($(this)[0]),
						processData: false,
						contentType: false,
						success: function(data) {
							obj.jdId=$.parseJSON(data).id;
							obj.isDeleteOrChange = true;
							function onSuccessSaveVacancy(response) { 
								$('#vtable').dataTable().fnDraw();
								showBottomRightSuccessNotify('Successfully saved Vacancy!');
							}
							
							genericAJAXCalling("<portlet:resourceURL id='saveVacancy'/>", obj, onSuccessSaveVacancy);
							$('#modify-vacancy-modal').modal('hide');
						}
					});	
				}
				
/* 				function onSuccessModifyVacancy(data) {
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
				$('#modify-vacancy-modal').modal('hide'); */
		} else {
			$('#managerSelect2Warning').show();
			showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");	
		}
	} else {
		showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");			
	}
	e.preventDefault();
})

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
				obj.subUnitId = $("#subUnitSelect").val();
				/* add selected managers */
				obj.selectedManagers = selectedManagers;
			
				if (document.getElementById('addVacancy_JD').files.length == 0) {
					obj.jdId = -1;
					if ($('#nojd-actions').css('display') == 'none') {
						obj.isDeleteOrChange = false;
					} else {
						obj.isDeleteOrChange = true;
					}
					function onSuccessSaveVacancy(response) { 
						$('#vtable').dataTable().fnDraw();
						showBottomRightSuccessNotify('Successfully saved Vacancy!');
					}
					
					genericAJAXCalling("<portlet:resourceURL id='saveVacancy'/>", obj, onSuccessSaveVacancy);
					$('#modify-vacancy-modal').modal('hide');	
				} else {
					$.ajax({
						url: '<portlet:resourceURL id="uploadVacancyJD"/>',
						type: 'POST',
						data: new FormData($(this)[0]),
						processData: false,
						contentType: false,
						success: function(data) {
							obj.jdId=$.parseJSON(data).id;
							obj.isDeleteOrChange = true;
							function onSuccessSaveVacancy(response) { 
								$('#vtable').dataTable().fnDraw();
								showBottomRightSuccessNotify('Successfully saved Vacancy!');
							}
							
							genericAJAXCalling("<portlet:resourceURL id='saveVacancy'/>", obj, onSuccessSaveVacancy);
							$('#modify-vacancy-modal').modal('hide');
						}
					});	
				}
				
/* 				function onSuccessModifyVacancy(data) {
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
				$('#modify-vacancy-modal').modal('hide'); */
		} else {
			$('#managerSelect2Warning').show();
			showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");	
		}
	} else {
		showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");			
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

$('#candidateForm').submit(function(e){
	if ($('#first_name').valid() && $('#middle_name').valid() && 
			$('#last_name').valid() && $('#inputEmail').valid() && $('#date_of_application').valid()) {
		
		var obj = new Object();
		obj.c_id = $("#c_id").val();
		obj.first_name = $('#first_name').val();
		obj.middle_name = $('#middle_name').val();
		obj.last_name = $('#last_name').val();
		obj.email = $('#inputEmail').val();
		obj.contact_number = $('#contact_number').val();
		obj.vacancy = $('#vacancySelect').val();
		obj.comment = $('#comment').val();
		obj.date_of_application = $('#date_of_application').val();
		
		if (document.getElementById('addCandidate_resume').files.length == 0) {
			obj.cv_file_id = -1;
			if ($('#noresume-actions').css('display') == 'none') {
				obj.isDeleteOrChange = false;
			} else {
				obj.isDeleteOrChange = true;
			}
			function onSuccessSaveCandidate(response) { 
				$('#ctable').dataTable().fnDraw();
				showBottomRightSuccessNotify('Successfully saved Candidate!');
			}
			
			genericAJAXCalling("<portlet:resourceURL id='saveCandidate'/>", obj, onSuccessSaveCandidate);
			$('#modify-candidate-modal').modal('hide');	
		} else {
			$.ajax({
				url: '<portlet:resourceURL id="uploadCandidateResume"/>',
				type: 'POST',
				data: new FormData($(this)[0]),
				processData: false,
				contentType: false,
				success: function(data) {
					console.log("INSIDE RESPONSE AFTER CREATING FILE_ENTRY");
					obj.cv_file_id=$.parseJSON(data).id;
					obj.isDeleteOrChange = true;
					function onSuccessSaveCandidate(response) { 
						$('#ctable').dataTable().fnDraw();
						showBottomRightSuccessNotify('Successfully saved Candidate!')
					}
					
					genericAJAXCalling("<portlet:resourceURL id='saveCandidate'/>", obj, onSuccessSaveCandidate);
					$('#modify-candidate-modal').modal('hide');
				}
			});	
		}
	} else {
		showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");			
	}
	e.preventDefault();
});

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
		obj.vacancy = $('#vacancySelect').val();
		obj.comment = $('#comment').val();
		obj.date_of_application = $('#date_of_application').val();
		function onSuccessSaveCandidate(response) { 
			$('#ctable').dataTable().fnDraw();
			showBottomRightSuccessNotify('Successfully saved Candidate!')
		}
		
		genericAJAXCalling("<portlet:resourceURL id='saveCandidate'/>", obj, onSuccessSaveCandidate);
		$('#modify-candidate-modal').modal('hide');
	} else {
		showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");			
	}
	
}

function saveEmployee() {
	if ($('#e_firstname').valid() && $('#e_middle_name').valid() && $('#e_last_name').valid() &&
			$('#e_inputEmail').valid() && $('#e_birthday').valid() && $('#e_start_date').valid()) {
		var obj = new Object();
		obj.employeeId = $('#employeeId').val();
		obj.vacancyId = $('#e_vacancyId').val();
		obj.candidateId = $('#e_candidateId').val();
		obj.first_name = $('#e_firstname').val();
		obj.middle_name = $('#e_middle_name').val();
		obj.last_name = $('#e_last_name').val();
		obj.email = $('#e_inputEmail').val();
		obj.contact_number = $('#e_contact_number').val();
		obj.birthday = $('#e_birthday').val();
		obj.joined_date = $('#e_start_date').val();
		obj.gender = $('#e_gender_select').val();
		function onSuccessSaveEmployee(response) {
			$('#ctable').dataTable().fnDraw();
		}
		genericAJAXCalling("<portlet:resourceURL id='saveEmployee'/>", obj, onSuccessSaveEmployee);
		$('#modify-employee-modal').modal('hide');
	} else {
		showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");
	}
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

$('#modify-candidate-modal').on('show.bs.modal', function () {
	console.log("modify-candidate-modal open");
	$('a#resumeLink').attr("href", '');
	$('a#resumeLink').text('');
	$('#addCandidate_resume').val('');
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

$('#modify-vacancy-modal').on('show.bs.modal', function () {
	$('a#jdLink').attr("href", '');
	$('a#jdLink').text('');
	$('#addVacancy_JD').val('');
	jSelect = document.getElementById('jTitleSelect');
	lSelect = document.getElementById('locationSelect');
	mSelect = document.getElementById('managerSelect2');
	sSelect = document.getElementById('subUnitSelect');
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
				sSelect.options.length = 0;
				var data = $.parseJSON(response);
				$.each(data.jTitles, function(i, item) {
					jSelect.options.add(new Option(item.title, item.jTitleId));
				});
				
				$.each(data.locations, function(i, item){
					lSelect.options.add(new Option(item.name, item.locationId));	
				}); 
				
				$.each(data.subUnits, function(i, item){
					sSelect.options.add(new Option(item.name, item.subUnitId));
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
									showBottomRightInfoNotify('Vacancies loaded!');
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
								}, {
									"mData" : "validApplicants",
									"bSortable" : false,
									"mRender" : function(data, type, full) {
										var s = "<div class='applicantsStatistic'><span class='validApplications'><i class='icon-user'></i> "
										+ data 
										+"</span><span class='numberOfPositions'><i class='icon-eye-open'></i> " 
										+ full.numberOfPositions
										+ "</span></div";
										return s.toString();
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
				bProcessing : true,
				bPaginate : true,
				order : [ 0, 'asc' ],
				sPaginationType : "full_numbers",
				sAjaxSource : '<portlet:resourceURL id="get_all_candidates"/>',
				fnServerData : function ( sSource, aoData, fnCallback ) {
		            $.ajax({
		                "dataType": 'json',
		                "contentType": "application/json; charset=utf-8",
		                "type": "GET",
		                "url": sSource,
		                "data": aoData,
		                "success": function(json){
		                	showBottomRightInfoNotify('Candidates loaded!');
		                	console.log(json);
		                    fnCallback(json);
		                    $('#ctable').show();
		                }
		            });               
		        },
				createdRow : function ( row, data, index ) {
		        	$('td', row).eq(2).addClass('highlight');
		        },
		        fnRowCallback : function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {
					console.log("row selected");
		        },
				oLanguage : {
					<%-- sProcessing : "<img src='<%=renderRequest.getContextPath()%>/images/loading_animator.gif'/><span>Please wait...</span>" --%>
					sProcessing : "<div class='modal-backdrop'><div class='loading-indicator'><img src='<%=renderRequest.getContextPath()%>/images/loading_animator.gif'/><br /><span>Please wait...</span></div></div>"
							},
							aoColumns : [
									{
										"mData" : "c_id",
										"bSortable" : false,
										"mRender" : function(data, type, full) {
											return "<input id='cCheckbox' class='cCheckbox' type='checkbox' id='"+full.c_id+"' value='"+full.c_id+"'/>";
										}
									},
									{
										"mData" : "vacancy",
									},

									{
										"mData" : "full_name",
										"mRender" : function(data, type, full) {
											if (full.status != 'HIRE') {
												return "<a id='"
													+ full.c_id
													+ "' href='javascript:void(0)' onclick='getCandidate("
													+ full.c_id + ");'>" + data
													+ "</a>";
											} else {
												return data;
											}
										}
									},
									{
										"mData" : "email",
									},
									{
										"mData" : "contact_number",
									},
									{
										"mData" : "date_of_application",
									},
									{
										"mData" : "status",
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
										"bSortable" : false,
										"mRender" : function(data, type, full) {
											var s = '';
											if (data != '') {
												console.log(full);
												s += "<div class='candidateResume'><a hef='javascript:void(0);' title='View Resume' onclick='getPreview(" + full.fileEntryId +");'><i class='icon-eye-open'></i> "
													+"</a><a href='" + data + "' title='Download Resume'><i class='icon-download'></i> " 
													+ "</a></div";
											} 
											return s;
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
									}, null ]

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
								$this));
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

		var obj = new Object();
		obj.c_id = selectorId;
		obj.v_id = vacancyId;
		obj.changedStatus = $(
				"#availStatusSelect" + selectorId + " option:selected").text();
		if (selectorId != -1) {
			if (obj.changedStatus == 'INTERVIEW_SCHEDULED') {
				
				function onSuccessGetInterviewScheduleFormData(response) {
					console.log('HERERRRRRRRR');
					/* var data = $.parseJSON(response); */
					var data = response;
					console.log(data);
					iSelect = document
							.getElementById('interviewTitleSelect');
					/* mSelect = document
							.getElementById('managerSelect1'); */
					iSelect.options.length = 0;

					$.each(data.interviews, function(i, item) {
						iSelect.options.add(new Option(
								item.interviewName,
								item.interviewId));
					});

					
					 function dataFormatResult(state) {
						 return state.text;
					 }
					 
					 function dataFormatSelection(state) {
						 return state.id;
					 }
					$('#managers1').empty();	
				}
				
				genericAJAXCalling('<portlet:resourceURL id="getInterviewScheduleFormDataAJX"/>', obj, onSuccessGetInterviewScheduleFormData);
				$('#vacancyId').val(vacancyId);
				$('#candidateId').val(selectorId);
				$('#modify-interviewSchedule-modal').modal('show');
			} else if (obj.changedStatus == 'HIRE') {
				$('#modify-employee-modal').modal('show');
 				function onSuccessHireCandidateStatusChange(response) {
					var obj = response;
					$('#employeeId').val('-1');
					$('#e_candidateId').val(selectorId);
					$('#e_vacancyId').val(vacancyId);
					$('#e_firstname').val(obj.first_name);
					$('#e_middle_name').val(obj.middle_name);
					$('#e_last_name').val(obj.last_name);
					$('#e_inputEmail').val(obj.email);
					$('#e_contact_number').val(obj.contact_number);
					$('#e_subUnit').val(obj.subUnit);
				}
				genericAJAXCalling('<portlet:resourceURL id="hireCandidateStatusChange"/>', obj, onSuccessHireCandidateStatusChange);
				
			} else {

				$.ajax({
					type : 'POST',
					url : '<portlet:resourceURL id="candidateStatusChange"/>',
					contentType : "application/json; charset=utf-8",
					data : JSON.stringify(obj),
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
		var employeeId = $('#managerSelect' + selectPrefix).val();
		var employeeName = $(
					'#managerSelect' + selectPrefix + ' option:selected')
					.text();
		if (employeeName != null && employeeName != "") {
				/* add to managers list and show */
			addManagerToList(selectPrefix, employeeId, employeeName);
				/* remove from select after adding to list */
			$('#managerSelect' + selectPrefix + ' option[value='
								+ employeeId + ']').remove();
			$('#managerSelect' + selectPrefix).select2('data',null);
		}
	}

	function addManagerToList(selectPrefix, employeeId, employeeName) {
		var existed = false;
		$('#managers' + selectPrefix + ' li').each(function(i) {
			if (($(this).attr('id')) == 'li' + selectPrefix + employeeId ) {
				existed = true;
			}
		});
		
		if (existed == false) {
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
		} else {
			showBottomRightErrorNotifyShortDelay("This manager has been selected. Duplication is not allowed");				
		}
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
		        	
		            if ($content.is(':visible') == true) {
		            	if (isCandidateHistoriesLoaded == false) {
		            		/* $('#candidateHistoryTable').dataTable({
		        				bProcessing : true,
		        				bServerSide : false,
		        	    		bPaginate : false,
		        	    		ajax : {
		        	    			'type' : 'POST',
		        	    			'url' : '<portlet:resourceURL id="get_all_candidate_histories"/>',
		        	    			'data' : {
		        	    				c_id: $('#c_id').val()
		        	    			}
		        	    		},
		        	    		aoColumns : [
		        	    		             {
		        	    		            	 "mData" : "performedDate",
		        	    		             },
		        	    		             {
		        	    		            	 "mData" : "note",
		        	    		             },
		        	    		             {
		        	    		            	 "mData" : "candidateHistoryId",
		        	    		             }
		        	    		             ]
		        	    		
		        	    	});	 */
		        	    	var obj = new Object();
		        	    	obj.c_id = $('#c_id').val();
		        	    	var dataSet = [['Trident','Internet Explorer 4.0','Win 95+'], ['Trident','Internet Explorer 4.0','Win 95+']];
		        	    	$('#candidateHistoryTable').dataTable({
		        	    		bServerSide : false,
		        	    		bPaginate : false,
		        	    		bProcessing : false,
	        	    			"aaData" : dataSet,
	        	    			columns : [
			        	    		             {
			        	    		            	 "title" : "performedDate",
			        	    		             },
			        	    		             {
			        	    		            	 "title" : "note",
			        	    		             },
			        	    		             {
			        	    		            	 "title" : "candidateHistoryId",
			        	    		             }
		        	    		             ] 
		        	    		             
	        	    		});
		        	    	function onSuccessGetCandidateHistory(response) {
		        	    		console.log(response.aaData);
		        	    		
		        	    	
		        	    	}
		        	    	
		        	    	genericAJAXCalling("<portlet:resourceURL id='get_all_candidate_histories'/>", obj, onSuccessGetCandidateHistory);
		        	    	
		        	    	
		            		isCandidateHistoriesLoaded = true;
		            	} else {
		            		console.log("HEREEEE");
		            		/* var obj = new Object();
		            		obj.c_id = $('#c_id').val(); */
		            		/* $('#candidateHistoryTable').DataTable().ajax.reload();	 */	
		            		$('#candidateHistoryTable').dataTable().fnDestroy();	
/* 		            		function onSuccessGetCandidateHistories(response) {
		            			$('#candidateHistoryTable').dataTable().fnClearTable();		
		            		}
		            		genericAJAXCalling('<portlet:resourceURL id="get_all_candidate_histories"/>', obj, onSuccessGetCandidateHistories);
		            		
		            		 */
		            	}
		            	
		            	return "Hide CANDIDATE history";
		            } else {
		            	return "Show CANDIDATE history";
		            }
		        });
		    });
		    

	});

	
	function showBottomRightSuccessNotify(ntf_msg) {
		showBottomRightSuccessNotifyShortDelay(2000, ntf_msg);
	}
	
	function showBottomRightSuccessNotifyShortDelay(ntf_delay, ntf_msg) {
		showNotify('',ntf_msg,'success',ntf_delay,'bottom','right');
	}
	
	
	function showBottomRightInfoNotify(ntf_msg) {
		showBottomRightInfoNotifyShortDelay(2000, ntf_msg);
	}
	
	function showBottomRightInfoNotifyShortDelay(ntf_delay, ntf_msg) {
		showNotify('',ntf_msg,'info',ntf_delay,'bottom','right');
	}
	
	function showBottomRightWarningNotifyShortDelay(ntf_msg) {
		showBottomRightWarningNotify(2000,ntf_msg);
	}
	
	function showBottomRightWarningNotify(ntf_delay, ntf_msg) {
		showNotify('',ntf_msg,'warning',ntf_delay,'bottom','right');
	}
	
	function showBottomRightErrorNotifyShortDelay(ntf_msg) {
		showBottomRightErrorNotify(2000, ntf_msg);
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
		$('.hrm-modal .in :input').each(function() {
			$(this).val('');
		});
		$('.entityId').val('-1');
	};

	/*
	 * Usage: call AJAX to get Candidate from Db for editting
	 * id: candidateId
	 *
	 */
	function getCandidate(id) {
		var obj = new Object();
		obj.c_id = id;
		
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
			if (obj.vacancyStateUnpublished == true) {
				$('#vacancySelect').val('-1');
				$('#unpublish-vacancy-warn').show();
				showBottomRightWarningNotify(5000, 'The Vacany for this Candidate was set to UNPUBLISH');
			} else {
				$('#vacancySelect').val(obj.v_id);
				$('#unpublish-vacancy-warn').hide();
			}
			if (obj.resume != "-1") {
				$('#noresume-actions').hide();
				$('#resume-actions').show();
				$('#resetResumeLink').show();
				
				$('a#downloadResumeLink').attr("href", obj.resume);
				$('a#resumeLink').text(obj.resumeFileName);
				$('a#resumeLink').attr("href", "javascript:void(0);");
				$('#resumeId').val(obj.resumeId);
			} else {
				$('#noresume-actions').show();
				$('#resume-actions').hide();
				$('#resetResumeLink').hide();
			}
			
		};
		
		genericAJAXCalling("<portlet:resourceURL id='getCandidate'/>", obj, onSuccessGetCandidate);
		$('#modify-candidate-modal').modal('show');
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
			$('#ctable').dataTable().fnDraw();
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
			var selectedManagers = [];
			$('#managers1 li').each(function(i) {
				selectedManagers.push(($(this).attr('id')));
			}); 
		if ($('#itvDate').valid() && $('#itvTimeFrom').valid() && $('#itvTimeTo').valid() && selectedManagers.length > 0) {
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
				console.log(selectedInterviewers);
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
		} else {
			showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");			
		}
	}
	
	function onReplaceResume() {
		$('#noresume-actions').show();
		$('#addCandidate_resume').trigger('click');
		$('#resume-actions').hide();
	}
	
	function onModifyResume() {
		if ($('#resume-actions').is(':visible')) {
			$('#resume-actions').hide();
			$('#noresume-actions').show();
		} else {
			$('#resume-actions').show();
			$('#noresume-actions').hide();
		}
	}
	
	function showAddCandidateModal() {
		$('#resume-actions').hide();
		$('#noresume-actions').show();
		$('#resetResumeLink').hide();
		$('#modify-candidate-modal').modal('show');
	}
	
	function onReplaceJD() {
		$('#nojd-actions').show();
		$('#addVacancy_JD').trigger('click');
		$('#jd-actions').hide();
	}
	
	function onModifyJD() {
		if ($('#jd-actions').is(':visible')) {
			$('#jd-actions').hide();
			$('#nojd-actions').show();
		} else {
			$('#jd-actions').show();
			$('#nojd-actions').hide();
		}
	}
	
	function showAddVacancyModal() {
		$('#jd-actions').hide();
		$('#nojd-actions').show();
		$('#resetJDLink').hide();
		$('#modify-vacancy-modal').modal('show');
	}
	
	function getPreview(id) {
		var obj = new Object();
		obj.id = id;
		$('#previewImagesContent').empty();
		function onSuccessGetPreview(response) {
			$('#previewFileImage').attr('src', response.previewFileURL + '1');
			$('#previewFileCount').text(response.previewFileCount);
			$('#preview_downloadLink').attr('href',response.docURL);
			AUI().use('liferay-preview', function(A) {
			    new Liferay.Preview(
			                       	{
			                        	actionContent: '#previewFileActions',
			                        	baseImageURL: response.previewFileURL,
			                        	boundingBox: '#previewFile',
			                        	contentBox: '#previewFileContent',
			                        	currentPreviewImage: '#previewFileImage',
			                        	imageListContent: '#previewImagesContent',
			                        	maxIndex: response.previewFileCount,
			                        	previewFileIndexNode: '#previewFileIndex',
			                        	toolbar: '#previewToolbar'
			                        }
			                ).render();
			});
			
			$('#preview-modal').modal('show');
		}
		
		genericAJAXCalling("<portlet:resourceURL id='getPreview'/>", obj, onSuccessGetPreview);
		
	}
	
	function candidateModalGetPreviewResume() {
		var id = $('#resumeId').val();
		getPreview(id);
	}

	function vacancyModalGetPreviewJD() {
		var id = $('#jdId').val();
		getPreview(id);
	}
	
	function saveLocation() {
		var obj = new Object();
		obj.name = $('#locationName').val();
		obj.province = $('#locationProvince').val();
		obj.city = $('#locationCity').val();
		obj.address = $('#locationAddress').val();
		obj.zip_code = $('#locationZipcode').val();
		obj.phone = $('#locationPhone').val();
		obj.fax = $('#locationFax').val();
		obj.note = $('#locationNote').val();
		function onSuccessSaveLocation(response) {
			console.log('SAVED LOCATION');
		}
		genericAJAXCalling("<portlet:resourceURL id='saveLocation'/>", obj, onSuccessSaveLocation);
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
</script>


