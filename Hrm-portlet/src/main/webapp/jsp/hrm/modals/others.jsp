<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

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