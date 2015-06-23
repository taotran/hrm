<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

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
						<thead>
							<tr>
								<th>Performed Date</th>
								<th>Description</th>
								<th>Details</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
			</div>

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