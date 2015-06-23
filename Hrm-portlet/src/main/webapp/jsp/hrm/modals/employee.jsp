<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

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
</form>