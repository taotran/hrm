<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

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
						<option value="-1">--Please select--</option>
						<optgroup label="Excel">
							<option>XLS</option>
							<option>XLSX</option>
						</optgroup>
						<optgroup label="CSV">
							<option>CSV Default</option>
							<option>CSV Custom</option>
						</optgroup>
						<optgroup label="Others">
							<option>PDF</option>
						</optgroup>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="export_name"><liferay-ui:message
						key="vacancy.name" /></label>
				<div class="controls">
					<input type="text" id="export_name" placeholder="Name"
						class="required number">
				</div>
			</div>

			<label class="control-label">Conditions:</label>
			
			<!-- <a href="javascript:void(0)" class="button" onclick="addCondition()">Add attribute</a> -->
			
			<div class="noConditions" id="noConditions">
				<span>No conditions found.</span>
				<button type="button" class="button addCondition" onclick="addCondition()"><i class="icon-plus-sign" style="color: green"></i>Add condition</button>
			</div>
			
			<ul id="exportAttributes" class="options">
			</ul>
		</div>
		<div class="modal-footer">
			<button type="submit" class="btn btn-primary">Download</button>	
			<a href="#" class="btn"
				data-dismiss="modal"><liferay-ui:message
					key="global.button.cancel" /></a>
		</div>
	</div>
</form>

<script type="text/javascript">
	var attrCount = 0;
	
 	$('#exportForm').submit(function(e){
 		var obj = new Object();
		var conditions = [];
		var count = 0;
		$('#exportAttributes li').each(function(i) {
			count+=1;
			var obj = new Object();
			obj.restriction = $('#restriction' + count).val();
			obj.attribute = $('#attributeSelect' + count).val();
			obj.searchOption = $('#search-options' + count).val() == "contains" ? "LIKE" : "=";
			if (obj.attribute == "xport_date_of_application") {
				/* obj.attributeValue = $('#xport_date_of_application' + count).val(); */
				var dateFrom = $('#xport_dateFrom' + count).val();
				var dateTo = $('#xport_dateTo' + count).val();
				var d = new Date();
				
				var month = d.getMonth() + 1;
				var day = d.getDate();
				var currentDate = (month < 10 ? '0' : '') + month + '/' + (day < 10 ? '0' : '') + day + d.getFullYear();
				if (dateFrom == null || dateFrom == '') {
					dateFrom = '01/01/1970';
				} 
				
				if (dateTo == null || dateTo == '') {
					dateTo = currentDate;
				} 
				
				obj.attributeValue = "(c.date_of_application >= STR_TO_DATE('" + dateFrom +"','%m/%d/%Y') AND c.date_of_application <= STR_TO_DATE('" + dateTo +"','%m/%d/%Y')) " ;
				
			} else if (obj.attribute == "xport_candidate_status") {
				obj.attributeValue = $('#xport_candidate_status_select' + count).val();
			} else {
				obj.attributeValue = $('#attributeString' + count).val();
			}
			conditions.push(obj);
		});
		
		obj.conditions = conditions;
		obj.name = $('#export_name').val();
		
		console.log(obj);
		
		function onSuccessExportCandidate(response) {
			/* trigger download file  */
			window.location.href = response.docURL;
		}
		
		genericAJAXCalling("<portlet:resourceURL id='export_result'/>", obj, onSuccessExportCandidate);
		
		e.preventDefault();
	})
	
	function addCondition() {
 		$('#noConditions').hide();
		var totalPossibleAttributes = 7;
		attrCount+=1;
		if (attrCount < 7) {
			var s = '<li id="attr' + attrCount + '"><div id="attributeContainer' + attrCount + '" class="attribute" style="display: inline-block;">' 
			+ '<div class="edit-buttons">' 
			+ '<button type="button"><i class="icon-minus-sign" onclick="removeCondition(' + attrCount + ')"></i></button>'
			+ '<button type="button"><i class="icon-plus-sign" onclick="addCondition()"></i></button>';
			
			if (attrCount > 1) {
				s+= '<select id="restriction' + attrCount + '" class="restrictionSelect"><option>AND</option><option>OR</option></select>'
			}
			
			s+= '</div>'
			+ '<select id="attributeSelect' + attrCount + '" class="attribute-select" onchange="onAttributeSelectChange(' + attrCount + ')">'
				+ '<option value="xport_first_name">FirstName</option>'
				+ '<option value="xport_middle_name">MiddleName</option>'
				+ '<option value="xport_last_name">LastName</option>'
				+ '<option value="xport_email">Email</option>'
				+ '<option value="xport_date_of_application">Application Date</option>'
				+ '<option value="xport_contact_number">Contact Number</option>'
				+ '<option value="xport_candidate_status">Status</option>'
			+ '</select>'
			+ '<select id="search-options' + attrCount + '" class="search-options">'
				+ '<option>contains</option>'
				+ '<option>equals</option>'
			+ '</select>'
			+ '<input type="text" name="attribute1" id="attributeString' + attrCount + '" class="attribute-text" placeholder="Input value" />'
			+ '</div></li>';
			
			$('#exportAttributes').append(s);
		}
	}
 	
 	function removeCondition(idSuffix){
 		$('li#attr' + idSuffix).remove();
 		attrCount--;
 		if (attrCount == 0) {
 			$('#noConditions').show();
 		}
 	}
	
	function onAttributeSelectChange(attrCount) {
		if ($('#attributeSelect' + attrCount).val() == 'xport_candidate_status') {
			if ($('#attributeContainer' + attrCount).find('#attributeString' + attrCount).length) {
				$('#attributeString' + attrCount).remove();
			} else if ($('#attributeContainer' + attrCount).find('#xport_Date' + attrCount).length) {
				$('#xport_Date' + attrCount).remove();	
				$('#date_bw_label' + attrCount).remove();	
			}
			
			$('#attributeContainer' + attrCount).append('<select class="xport_candidate_status_select" id="xport_candidate_status_select' + attrCount + '">'
														+ '<option>APPLICATION_INITIATED</option>'
														+ '<option>HIRE</option>'
														+ '<option>REJECT</option>'
														+ '<option>JOB_OFFERED</option></select>');
			
		} else if ($('#attributeSelect' + attrCount).val() == 'xport_date_of_application') {
			if ($('#attributeContainer' + attrCount).find('#attributeString' + attrCount).length) {
				$('#attributeString' + attrCount).remove();
			} else if ($('#attributeContainer' + attrCount).find('#xport_candidate_status_select' + attrCount).length) {
				$('#xport_candidate_status_select' + attrCount).remove();				
			}
			
			$('#search-options' + attrCount).remove();
			$('#attributeContainer' + attrCount).append('<span id="date_bw_label' + attrCount + '"> Between </span>');
			
			
			var s = '<div id="xport_Date' + attrCount + '" style="display: inherit;">'
						+ '<input type="text" class="xport_date_of_application small70 required" id="xport_dateFrom' + attrCount + '"> '
						+ ' - <input class="xport_date_of_application small70 required" type="text" id="xport_dateTo' + attrCount + '">'
					+ '</div>';
			$('#attributeContainer' + attrCount).append(s);
			$('.xport_date_of_application').datepicker();
		} else {
			if ($('#attributeContainer' + attrCount).find('#xport_candidate_status_select' + attrCount).length) {
				$('#xport_candidate_status_select' + attrCount).remove();				
			} else if ($('#attributeContainer' + attrCount).find('#xport_Date' + attrCount).length) {
				$('#xport_Date' + attrCount).remove();	
				$('#date_bw_label' + attrCount).remove();	
			} else {
				$('#attributeString' + attrCount).remove();
			}
			$('#attributeContainer' + attrCount).append('<input type="text" name="attribute1" id="attributeString' + attrCount + '" class="attribute-text" placeholder="' + $('#attributeSelect' + attrCount + " option:selected").text() + '" />');
		}
	}
	
	$('#export-modal').on('hide.bs.modal', function(){
		attrCount = 0;
		$('#noConditions').show();
	});
</script>
