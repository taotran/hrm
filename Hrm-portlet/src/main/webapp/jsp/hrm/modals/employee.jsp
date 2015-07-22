<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<form id="employeeForm" class="form-horizontal">
	<div class="hrm-modal modal employee-modal" id="modify-employee-modal"
		style="width: 1000px !important">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">x</button>
			<span class="modal-title">Employee</span>
		</div>

		<div class="modal-body" id="interviewScheduleInfo">
			<input type="hidden" class="entityId" id="employeeId" value="-1">
			<input type="hidden" class="entityId" id="e_candidateId" value="-1">
			<input type="hidden" class="entityId" id="e_vacancyId" value="-1">
			<div class="split_info">
				<div id="employee_basic_info" class="employee_basic_info">
					<span>Employee Information</span>
				
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


					<!-- BASIC EMPLOYEE INFO -->
					<div class="expandable_info_header" id="basic_info_expandable_header">
						<span>Show basic information</span>
					</div>
					<div class="expandable_content" id="basic_info_expandable_content" style="display: none;">

						<div class="control-group">
							<label class="control-label" for="e_gender_select">Gender<span
								class="required">*</span></label>
							<div class="controls">
								<input type="radio" name="e_gender_select" value="male"> Male
								<input type="radio" name="e_gender_select" value="female"> Female
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
							<label class="control-label" for="e_companyEmail">Company
								Email</label>
							<div class="controls">
								<input type="email" id="e_companyEmail" placeholder="Email">
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="e_birthday">Birthday:<span
								class="required">*</span></label>
							<div class="controls">
								<input type="text" data-date-format="dd/mm/yyyy"
									class="hrm_dateTimePicker small70 required" id="e_birthday"
									placeholder="dd/mm/yyyy">
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="e_contact_number"><liferay-ui:message
									key="candidate.contact_number" /></label>
							<div class="controls">
								<input type="text" id="e_contact_number" class="required" value="123-456-789"
									placeholder="eg. 0902 548822">
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="e_subUnit_select" class="subUnitSelect">Sub Unit</label>
							<div class="controls">
								<select id="e_subUnit_select">
									<option>IT</option>
									<option>Financial</option>
									<option>Human Resources</option>	
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_jobTitle_select">Job Title</label>
							<div class="controls">
								<select id="e_jobTitle_select" class="jTitleSelect">
								</select>
								<div class="currentSelect2Selected" id="e_current_jTitle"
									style="display: none;">
									<input type="hidden" value="-1" name="e_current_jTitleId"> 
									<span class="current_label">Current: </span>
									<span class="current_value"
										id="e_current_jTitleValue"></span>
								</div>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="e_start_date">Start
								Date:<span class="required">*</span>
							</label>
							<div class="controls">
								<input type="text" data-date-format="dd/mm/yyyy"
									class="hrm_dateTimePicker small70 required" id="e_start_date"
									placeholder="dd/mm/yyyy">
							</div>
						</div>

					</div>
					<!-- END BASIC EMPLOYEE INFO -->
					
					<!-- DETAILS EMPLOYEE INFO -->
					<div class="expandable_info_header" id="detail_info_expandable_header">
						<span>Show Detail Employee Info</span>
					</div>
					<div class="expandable_content" id="detail_info_expandable_content" style="display: none;">

						<div class="control-group">
							<label class="control-label" for="e_title_select">Title<span
								class="required">*</span></label>
							<div class="controls">
								<select id="e_title_select">
									<option value="1">Director</option>
									<option value="2">Sample</option>
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_level_select">Level<span
								class="required">*</span></label>
							<div class="controls">
								<select id="e_gender_select">
									<option value="1">Senior</option>
									<option value="2">Junior</option>
								</select>
							</div>
						</div>


						<div class="control-group">
							<label class="control-label" for="e_promoted_date">Promoted date<span class="required">*</span></label>
							<div class="controls">
								<input type="text" data-date-format="dd/mm/yyyy" class="hrm_dateTimePicker small70 required" id="e_promoted_date"
									placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_lc_signed_date">Labour contract signed date<span class="required">*</span></label>
							<div class="controls">
								<input type="text" data-date-format="dd/mm/yyyy" class="hrm_dateTimePicker small70" id="e_lc_signed_date"
									placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_lc_expired_date">Labour contract expired date<span class="required">*</span></label>
							<div class="controls">
								<input type="text" data-date-format="dd/mm/yyyy" class="hrm_dateTimePicker small70" id="e_lc_expired_date"
									placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_lc_type">Labour contract type<span class="required">*</span></label>
							<div class="controls">
								<select id="e_lc_type">
									<option value="1">Temporary</option>
									<option value="2">Permanent</option>
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_edu">Education<span class="required">*</span></label>
							<div class="controls">
								<select id="e_edu">
									<option value="DIPLOMA">Diploma</option>
									<option value="UNIVERSITY">University</option>
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_edu_spec">Education Specialize<span class="required">*</span></label>
							<div class="controls">
								<input type="text" id="e_edu_spec" placeholder="" class="required">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_edu_uni">Educated Place<span class="required">*</span></label>
							<div class="controls">
								<select id="e_edu_uni">
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_marital_status">Marital Status<span class="required">*</span></label>
							<div class="controls">
								<div id="e_marital_status"> 
									<input type="radio" name="e_marital_status" value="married">Married
									<input type="radio" name="e_marital_status" value="single">Single
								 </div>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_identity_no">Identity card number<span class="required">*</span></label>
							<div class="controls">
								<input type="text" id="e_identity_no" placeholder="CMND" class="required">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_identity_issued_date">Issued Date<span class="required">*</span></label>
							<div class="controls">
								<input type="text" data-date-format="dd/mm/yyyy" class="hrm_dateTimePicker small70 required" id="e_identity_issued_date" placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_identity_issued_place">Issued Place<span class="required">*</span></label>
							<div class="controls">
								<input type="text" id="e_identity_issued_place" placeholder="CA. TPHCM" class="required">
							</div>
						</div>
						
						<!-- Address part -->
						<div class="expandable_info_header" id="address_expandable_header">
							<span>Show address information</span>
						</div>
						<div class="expandable_content" id="address_expandable_content" style="display: none;">
						
							<div class="control-group">
								<label class="control-label" for="e_street1">Street 1<span
									class="required">*</span></label>
								<div class="controls">
									<input type="text" name="e_street1" placeholder="Street 1" class="required">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="e_street2">Street 2</label>
								<div class="controls">
									<input type="text" name="e_street2" placeholder="Street 2">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="e_street3">Street 3</label>
								<div class="controls">
									<input type="text" name="e_street3" placeholder="Street 3">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="e_city">City</label>
								<div class="controls">
									<input type="text" name="e_city" placeholder="City" class="required">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="e_addr_region_select">Region<span
									class="required">*</span></label>
								<div class="controls">
									<select id="e_addr_region_select" class="regionSelect">
									</select>
								</div>
							</div>
						</div>	
						
						<!-- EO Address part -->
						<div class="control-group">
							<label class="control-label" for="e_personal_tax_code">Personal Tax Code</label>
							<div class="controls">
								<input type="text" id="e_personal_tax_code" placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_no_of_dependents">Number of Dependents</label>
							<div class="controls">
								<input type="text" id="e_no_of_dependents" value="0" placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_dependent_names">Dependent Names</label>
							<div class="controls">
								<input type="text" id="e_dependent_names" placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_social_ins_code">Social Insurance Code</label>
							<div class="controls">
								<input type="text" id="e_social_ins_code" placeholder="">
							</div>
						</div>	
											
						<div class="control-group">
							<label class="control-label" for="e_health_ins_code">Health Insurance Code</label>
							<div class="controls">
								<input type="text" id="e_health_ins_code" placeholder="">
							</div>
						</div>	

						<div class="control-group">
							<label class="control-label" for="e_bank_acc">Bank Account</label>
							<div class="controls">
								<input type="text" id="e_bank_acc" placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_bank_name">Bank name</label>
							<div class="controls">
								<input type="text" id="e_bank_name" placeholder="">
							</div>
						</div>				
						
						<div class="control-group">
							<label class="control-label" for="e_base_wage_rates">Base Wage Rates</label>
							<div class="controls">
								<input type="text" id="e_base_wage_rates" placeholder="">
							</div>
						</div>	
							
						<div class="control-group">
							<label class="control-label" for="e_position_wage_rates">Position Wage Rates</label>
							<div class="controls">
								<input type="text" id="e_position_wage_rates" placeholder="">
							</div>
						</div>		
						
						<div class="control-group">
							<label class="control-label" for="e_capacity_salary">Capacity Salary</label>
							<div class="controls">
								<input type="text" id="e_capacity_salary" placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_total_salary">Total Salary</label>
							<div class="controls">
								<input type="text" id="e_total_salary" placeholder="">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="e_bonus">Bonus</label>
							<div class="controls">
								<input type="text" id="e_bonus" placeholder="">
							</div>
						</div>					
						
						<div class="control-group">
							<label class="control-label" for="e_resigned_date">Resigned Date<span class="required">*</span></label>
							<div class="controls">
								<input type="text" data-date-format="dd/mm/yyyy" id="e_resigned_date" class="hrm_dateTimePicker small70" placeholder="__/__/___">
							</div>
						</div>	
					</div>
				</div>

				<!-- <div id="divider"></div> -->

				<!-- ACCOUNT INFORMATION PART -->
				<div class="account_info">
					<div class="account_info_content">
						<span>User Information</span>
						<div class="control-group">
							<label class="control-label" for="u_username">Username<span
								class="required">*</span>
							</label>
							<div class="controls">
								<input type="text" id="u_username" class="required"
									placeholder="Username" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="u_password1">Password<span class="required">*</span></label>
							<div class="controls">
								<input type="text" class="required" id="u_password1"
									placeholder="Middle Name">
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label" for="u_password2">Re-Password<span class="required">*</span></label>
							<div class="controls">
								<input type="text" class="required" id="u_password2"
									placeholder="Middle Name">
							</div>
						</div>
						
					<div class="expandable_info_header" id="user_security_expandable_header">
						<span>Security information</span>
					</div>
					<div class="expandable_content" id="user_security_expandable_content" style="display: none;">

						<!-- <div class="control-group">
							<label class="control-label" for="e_gender_select">Gender<span
								class="required">*</span></label>
							<div class="controls">
								<input type="radio" name="e_gender_select" value="male"> Male
								<input type="radio" name="e_gender_select" value="female"> Female
							</div>
						</div> -->
					</div>
						
					</div>
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


<script type="text/javascript">


	function loadSelect2(classOrElementId, URL, placeholderText) {
		function dataFormatUniResult(state) {
			return state.text;
		}
		 
		function dataFormatUniSelection(state) {
			return state.id;
		}
		
		$(classOrElementId).select2({
			placeholder: {
				id: '-1',
				text: placeholderText
			},
			/* initSelection: function(element, callback){}, */
			allowClear: true,
		 	minimumInputLength: 1,
		 	ajax: {
		 		url: URL,
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
		 	formatResult : dataFormatUniResult,
	        formatSelection : dataFormatUniSelection,
	        dropdownCssClass : "bigdrop",
	        escapeMarkup : function(m) { return m; } 
		 });		
	}

	$(document).ready(function() {	
		/* loadUniversitySelect(); */
		loadSelect2('#e_edu_uni', '<portlet:resourceURL id="filterUniversitiesByTerm"/>', 'Select a university');
		loadSelect2('.regionSelect','<portlet:resourceURL id="loadRegionData"/>', 'Select a region');
		loadSelect2('.jTitleSelect', '<portlet:resourceURL id="filterJobTitleByTerm"/>', 'Select jobTitle');
	})
	
	$('#modify-employee-modal').on('show.bs.modal', function () {
		console.log("modify-employee-modal open");
		/* rSelect = document.getElementById('vacancySelect');
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
	 	}  */
	});
	
	/* $(".expandable_info.header").click(function () { */
	/* $header = $(this); */
	/*     $content = $('.expandable_content');
	 $content.slideToggle(500, function () {
	 $header.text(function () {
	 if ($content.is(':visible')) {
	 return "Hide CANDIDATE history";
	 } else {
	 return "Show CANDIDATE history";
	 }
	 });
	 }); */
	/*     if ($('.expandable_content').is(':visible')) {
	 $('.expandable_content').hide();
	 } else {
	 $('.expandable_content').show();
	 } */

	/* }); */

	/* $('.hrm_dateTimePicker').datepicker(); */
	
	function saveEmployee() {
		if ($('#e_firstname').valid() && $('#e_middle_name').valid() && $('#e_last_name').valid() &&
				$('#e_inputEmail').valid() && $('#e_birthday').valid() && $('#e_start_date').valid() && 
				$('#e_promoted_date').valid() && $('#e_edu_spec').valid() && $('#e_identity_no').valid() &&
				$('#e_identity_issued_date').valid() && $('#e_identity_issued_place').valid() && $('#e_promoted_date').valid()) {
			var obj = new Object();
			obj.employeeId = $('#employeeId').val();
			obj.vacancyId = $('#e_vacancyId').val();
			obj.candidateId = $('#e_candidateId').val();
			obj.first_name = $('#e_firstname').val();
			obj.middle_name = $('#e_middle_name').val();
			obj.last_name = $('#e_last_name').val();
			
			obj.gender_select = $('input:radio[name="e_gender_select"]:checked').val();
			obj.email = $('#e_inputEmail').val();
			obj.companyEmail = $('#e_companyEmail').val();
			obj.birthday = $('#e_birthday').val();
			obj.contact_number = $('#e_contact_number').val();
			obj.subUnit = $('#e_subUnit_select').val();
			obj.start_date = $('#e_start_date').val();
			obj.title_select = $('#e_title_select').val();
			obj.promoted_date = $('#e_promoted_date').val();
			obj.lc_signed_date = $('#e_lc_signed_date').val();
			obj.lc_expired_date = $('#e_lc_expired_date').val();
			obj.lc_type = $('#e_lc_type').val();
			obj.edu = $('#e_edu').val();
			obj.edu_spec = $('#e_edu_spec').val();
			obj.edu_uni = $('#e_edu_uni').val();
			obj.marital_status = $('input:radio[name="e_marital_status"]:checked').val();
			obj.identity_no = $('#e_identity_no').val();
			obj.identity_issued_date = $('#e_identity_issued_date').val();
			obj.identity_issued_place = $('#e_identity_issued_place').val();
			
			
			obj.personal_tax_code = $('#e_personal_tax_code').val();
			obj.no_of_dependents = $('#e_no_of_dependents').val();
			obj.dependent_names = $('#e_dependent_names').val();
			obj.social_ins_code = $('#e_social_ins_code').val();
			obj.health_ins_code = $('#e_health_ins_code').val();
			obj.bank_acc = $('#e_bank_acc').val();
			obj.bank_name = $('#e_bank_name').val();
			obj.base_wage_rates = $('#e_base_wage_rates').val();
			obj.position_wage_rates = $('#e_position_wage_rates').val();
			obj.capacity_salary = $('#e_capacity_salary').val();
			obj.total_salary = $('#e_total_salary').val();
			obj.bonus = $('#e_bonus').val();
			obj.resigned_date = $('#e_resigned_date').val();
			
			obj.username = $('#u_username').val();
			obj.password1 = $('#u_password1').val();
			obj.password2 = $('#u_password2').val();
	
			console.log(obj);
			
			/* function onSuccessSaveEmployee(response) {
				$('#ctable').dataTable().fnDraw();
			}
			genericAJAXCalling("<portlet:resourceURL id='saveEmployee'/>", obj, onSuccessSaveEmployee);
			$('#modify-employee-modal').modal('hide'); */
		} else {
			showBottomRightErrorNotifyShortDelay("All * fields are required! Please check");
		} 
	}
	
	
	
	$('#basic_info_expandable_header').click(function() {
		$header = $(this);
		$('#basic_info_expandable_content').slideToggle(500, function() {
			$content = $('#basic_info_expandable_content');
			$header.text(function() {
				if ($content.is(':visible')) {
					return "Hide basic information";
				} else {
					return "Show basic information";
				}
			});
		});
	});
	
	$('#address_expandable_header').click(function() {
		$header = $(this);
		$('#address_expandable_content').slideToggle(500, function() {
			$content = $('#address_expandable_content');
			$header.text(function() {
				if ($content.is(':visible')) {
					return "Hide address information";
				} else {
					return "Show address information";
				}
			});
		});
	});
	
	$('#detail_info_expandable_header').click(function() {
		$header = $(this);
		$('#detail_info_expandable_content').slideToggle(500, function() {
			$content = $('#detail_info_expandable_content');
			$header.text(function() {
				if ($content.is(':visible')) {
					return "Hide basic information";
				} else {
					return "Show basic information";
				}
			});
		});
	});
	
	
	$('#user_security_expandable_header').click(function() {
		$header1 = $(this);
		$('#user_security_expandable_content').slideToggle(500, function() {
			$content1 = $('#user_security_expandable_content');
			$header1.text(function() {
				if ($content1.is(':visible')) {
					return "Hide details information";
				} else {
					return "Show details information";
				}
			});
		});
	});
	
</script>

<style type="text/css">
.split_info {
	display: inline-block !important;
}

.split_info .employee_basic_info {
	width: inherit;
	float: left;
}

.split_info .expandable_info_header {
	width: 100%;
	background-color: #555;
	color: #fff;
	cursor: pointer;
	margin-bottom: 7px;
}

.split_info .account_info {
	width: 50%;
	float: right;
	margin-right: -45px;
	position: relative;
}

.divider{
    position:absolute;
    left:50%;
    top:10%;
    bottom:10%;
    border-left:1px solid white;
}
</style>