<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

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