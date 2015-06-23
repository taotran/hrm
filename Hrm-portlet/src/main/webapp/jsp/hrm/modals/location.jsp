<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

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
