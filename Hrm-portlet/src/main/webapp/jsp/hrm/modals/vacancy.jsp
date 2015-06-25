<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

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
					<select id="jTitleSelect" class="select2-container jTitleSelect">
					</select> <a data-toggle="modal" href="#modify-jtitle-modal" class="btn">
						<i class="icon-plus"></i>Add
					</a>
					<div class="currentSelect2Selected" id="v_current_jTitle"
						style="display: none;">
						<input type="hidden" value="-1" name="v_current_jTitleId"> 
						<span class="current_label">Current: </span>
						<span class="current_value"
							id="v_current_jTitleValue"></span>
					</div>
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
				<label class="control-label" for="jd-actions">Job
					Description</label>
				<div class="controls">
					<div class="resume-actions" id="jd-actions">
						<input id="jdId" type="hidden" value="-1" /> <a id="jdLink"
							href="javascript:void(0);" onclick="vacancyModalGetPreviewJD()">Job
							Description</a>
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
							id="addVacancy_JD" /> <a id="resetJDLink" style='display: none;'
							href="javascript:void(0);" onclick="onModifyJD()"><i
							class='icon-repeat'></i></a>
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

<style type="text/css">

	span.current_label {
		font-size: 13px;
  		font-weight: bold;
  		font-style: italic;
  		color: #555;
  	}
  			
</style>
