var isVacanciesLoaded = 0;

var List1;
/*
 * var cForm = $('#cForm'); cForm.submit(function(ev) { console.log("SUBMIT");
 * $.ajax({ type : cForm.attr('method'), url : cForm.attr('action'), data :
 * cForm.serialize(), success : function(data) { alert('OK'); } });
 * ev.preventDefault();
 * 
 * });
 */

$('#modify-interviewSchedule-modal').on('shown.bs.modal', function() {
	console.log("#modify-interviewSchedule-modal shown!!!")
});

/* clear modal data on closing */
$('.modal')
		.each(
				function(index) {
					$(this)
							.on(
									'hidden.bs.modal',
									function() {
										console.log("clear modal");
										$(this)
												.find("input,textarea,select")
												.val('')
												.end()
												.find(
														"input[type=checkbox], input[type=radio]")
												.prop("checked", "").end()
												.find("input[type=hidden]")
												.val('-1').end();
									});
				});

/* select/deselect all base on header select/deselect */
$("#v_checkAll").click(function() {
	if ($(this).is(':checked')) {
		console.log("checked");
		$('tbody input').attr('checked', true);
	} else {
		console.log("unchecked");
		$('tbody input').attr('checked', false);
	}
})

$('#addCandidate_resume').change(function() {
	sendFile(this.files[0]);
});

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
			$('#hiring_managers').val(obj.hiring_managers);
			$('#no_of_pos').val(obj.no_of_pos);
			$('#vacancy_status').val(obj.vacancy_status);
			$('#job_posting').val(obj.job_posting);
			$('#jTitleSelect').val(obj.jTitleId);
			/* Show edit vacancy modal */
		}
	});
}

function saveVacancy() {
	var vacancy = new Object();

	vacancy.v_id = $("#v_id").val();
	vacancy.jTitleId = $('#jTitleSelect').val();
	vacancy.hiring_manager_id = $('#hiring_managers').val();
	vacancy.v_name = $('#v_name').val();
	vacancy.description = $('#desc').val();
	vacancy.no_of_positions = $('#no_of_pos').val();
	vacancy.published_in_feed = $('#published_in_feed').val();
	vacancy.job_posting = $("#job_posting").val();

	jQuery.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='saveVacancy'/>",
		data : JSON.stringify(vacancy),
		dataType : "json",
		contentType : 'application/json',
		mimeType : 'application/json',
		error : function(e) {

		},
		success : function(data) {
			$('#vtable').dataTable().fnDraw();
			select = document.getElementById('vacancySelect');

			select.options.length = 0;
			select.options.add(new Option("Please select", null));
			$.each(data, function(i, item) {
				select.options.add(new Option(item.v_name, item.v_id));
			});
		}
	});

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
	jQuery.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='saveJTitle'/>",
		data : JSON.stringify(obj),
		dataType : "json",
		contentType : 'application/json',
		mimeType : 'application/json',
		error : function(e) {

		},
		success : function(data) {
			select = document.getElementById('jTitleSelect');

			select.options.length = 0;
			$.each(data, function(i, item) {
				select.options.add(new Option(item.title, item.jTitleId));
			});
		}
	})
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

function sendFile(file) {
	jQuery.ajax({
		type : 'POST',
		url : '<portlet:resourceURL id="uploadResume"/>',
		enctype : 'multipart/form-data',
		data : file,
		success : function() {

		},
		xhrFields : {
			// add listener to XMLHTTPRequest object directly for progress
			// (jquery doesn't have this yet)
			onprogress : function(progress) {
				// calculate upload progress
				var percentage = Math
						.floor((progress.total / progress.totalSize) * 100);
				// log upload progress to console
				console.log('progress', percentage);
				if (percentage === 100) {
					console.log('DONE!');
				}
			}
		},
		processData : false,
		contentType : file.type
	});
}

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

// AJAX save new/updated candidate
function saveCandidate() {
	var candidate = new Object();

	candidate.c_id = $("#c_id").val();
	candidate.first_name = $('#first_name').val();
	candidate.middle_name = $('#middle_name').val();
	candidate.last_name = $('#last_name').val();
	candidate.email = $('#inputEmail').val();
	candidate.contact_number = $('#contact_number').val();
	console.log($('#vacancySelect').val());
	if ($('#vacancySelect').val() != null) {
		candidate.vacancy = $('#vacancySelect').val();
	} else {
		candidate.vacancy = -1;
	}
	candidate.comment = $('#comment').val();
	candidate.date_of_application = $('#date_of_application').val();

	jQuery.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='saveCandidate'/>",
		data : JSON.stringify(candidate),
		dataType : "json",
		contentType : 'application/json',
		mimeType : 'application/json',
		error : function(e) {

		},
		success : function(response) {
			$('#ctable').dataTable().fnDraw();
		}
	});
}
// AJAX save new/updated candidate
/*
 * function saveCandidate() { var formData = $('#cForm'); var candidate = new
 * Object();
 * 
 * candidate.c_id = $("#c_id").val(); candidate.first_name =
 * $('#first_name').val(); candidate.middle_name = $('#middle_name').val();
 * candidate.last_name = $('#last_name').val(); candidate.email =
 * $('#inputEmail').val(); candidate.contact_number =
 * $('#contact_number').val(); candidate.vacancy = $('#vacancySelect').val();
 * candidate.comment = $('#comment').val(); // candidate.file =
 * $('#addCandidate_resume');
 * 
 * jQuery.ajax({ type : 'POST', url : "<portlet:resourceURL
 * id='saveCandidate'/>", data : JSON.stringify(candidate), dataType : "json",
 * contentType : 'application/json', mimeType : 'application/json', error :
 * function(e) {
 *  }, success : function(response) { $('#ctable').dataTable().fnDraw(); } });
 *  /* ajaxCall("<portlet:resourceURL id='addCandidate'/>", candidate,
 * $('#ctable').dataTable().fnDraw());
 */

// clear input fields after creating new
/*
 * $('#candidateInfo :input').each(function() { $(this).val(''); }); };
 */

function vacancyTabClick() {
	console.log("VACANCY CLICK");
	if (isVacanciesLoaded == 0) {
		isVacanciesLoaded = 1;
		loadVacancyTable();
	}
};

$('#modify-candidate-modal')
		.on(
				'shown.bs.modal',
				function() {
					select = document.getElementById('vacancySelect');
					/* check if vacancySelect is already loaded or not */
					if (select.options.length == 0) {
						$
								.ajax({
									type : 'POST',
									url : "<portlet:resourceURL id='getCandidatesFormDataAJX'/>",
									cache : false,
									error : function(e) {

									},
									success : function(data) {
										$.each($.parseJSON(data), function(i,
												item) {
											select.options.add(new Option(
													item.vacancy_name,
													item.v_id));
										});
									}
								})
					}
				});

$('#modify-vacancy-modal').on('shown.bs.modal', function() {
	console.log("Vacancy Model OPENED");
	jSelect = document.getElementById('jTitleSelect');
	lSelect = document.getElementById('locationSelect');

	/* check if jTitleSelect is already loaded or not */
	/* if (jSelect.options.length == 0 || lSelect.options.length == 0) { */
	/* if (jSelect.options.length == 0) { */
	$.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='getVacanciesFormDataAJX'/>",
		cache : false,
		error : function(e) {

		},
		success : function(response) {
			jSelect.options.length = 0;
			lSelect.options.length = 0;
			var data = $.parseJSON(response);
			$.each(data.jTitles, function(i, item) {
				jSelect.options.add(new Option(item.title, item.jTitleId));
			});
			$.each(data.locations, function(i, item) {
				lSelect.options.add(new Option(item.name, item.locationId));
			});
		}
	})
	/* } */
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
						fnServerData : function(sSource, aoData, fnCallback) {
							$
									.ajax({
										"dataType" : 'json',
										"contentType" : "application/json; charset=utf-8",
										"type" : "GET",
										"url" : sSource,
										"data" : aoData,
										"success" : function(json) {
											var data = json.jTitles;
											select = document
													.getElementById('jTitleSelect');
											select.options.length = 0;
											$.each(data, function(i, item) {
												console.log(item.title);
												select.options.add(new Option(
														item.title,
														item.jTitleId));
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
										return "<input id='vCheckbox' type='checkbox' id='"
												+ full.v_id
												+ "' value='"
												+ full.v_id + "'/>";
									}
								},
								{
									"mData" : "vacancy_name",
									"mRender" : function(data, type, full) {
										var vacancy_name = data;
										return "<a id='"
												+ full.v_id
												+ "' href='#vtable' onclick='getVacancy("
												+ full.v_id + ");'>"
												+ vacancy_name + "</a>";
									}
								},
								{
									"mData" : "job_title"
								},
								{
									"mData" : "hiring_manager"
								},
								{
									"mData" : "location"
								},
								{
									"mData" : "status",
									"mRender" : function(data, type, full) {
										if (data != null || data != '') {
											var selectorId = "vAvailStatusSelect"
													+ full.v_id;
											var s = "<div class='candidateStatus'>"
													+ data
													+ "<select onchange='onVacancyStatusChange("
													+ full.v_id
													+ ")' id='"
													+ selectorId
													+ "' name='vAvailStatusSelect'>";
											/*
											 * var options = "<option value=''
											 * disabled selected
											 * style='display:none;'>Please
											 * Choose</option>";
											 */
											/*
											 * var options = "<option value='" +
											 * -1 + "' selected>" + data + "</option>";
											 */
											var options = "<option value='"
													+ -1
													+ "' selected>--Select status--</option>";
											for (var i = 0; i < full.availableStatuses.length; i++) {
												options += "<option value='"
														+ full.v_id
														+ "'>"
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
			type : "text"
		}, {
			type : "select",
			values : $.parseJSON(List1),
		}, null, {
			type : "select",
			values : [ "HCM", "HN" ]
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
						/* bUseColVis : true, */
						createdRow : function(row, data, index) {
							$('td', row).eq(2).addClass('highlight');
						},
						oLanguage : {
							sProcessing : "<div class='modal-backdrop'><div class='loading-indicator'><img src='<%=renderRequest.getContextPath()%>/images/loading_animator.gif'/><br /><span>Please wait...</span></div></div>"
						},
						aoColumns : [
								{
									"mData" : "c_id",
									"type" : "number",
									"bSortable" : false,
									"mRender" : function(data, type, full) {
										return "<input id='cCheckbox' type='checkbox' id='"
												+ full.c_id
												+ "' value='"
												+ full.c_id + "'/>";
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
												+ "' href='#ctable' onclick='getCandidate("
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
											var selectorId = "availStatusSelect"
													+ full.c_id;
											var s = "<div class='candidateStatus'>"
													+ data
													+ "<select onchange='onCandidateStatusChange("
													+ full.c_id
													+ ","
													+ full.vacancyId
													+ ")' id='"
													+ selectorId
													+ "' name='availStatusSelect'>";
											/*
											 * var options = "<option value=''
											 * disabled selected
											 * style='display:none;'>Please
											 * Choose</option>";
											 */
											/*
											 * var options = "<option value='" +
											 * -1 + "' selected>" + data + "</option>";
											 */
											var options = "<option value='"
													+ -1
													+ "' selected>--Select status--</option>";
											for (var i = 0; i < full.availableStatuses.length; i++) {
												options += "<option value='"
														+ full.c_id
														+ "'>"
														+ full.availableStatuses[i]
														+ "</option>";
											}
											s = s + options + "</select></div>";
											return s.toString();
										}
										return data;
									}
								}, {
									"mData" : "resume",
									"type" : "text"
								} ],
						/*
						 * bColVis : true, colVis : { "align" : "right", restore :
						 * "Restore", showAll : "Show all", showNone : "Show
						 * none", order : 'alpha', "buttonText" : "Show/Hide
						 * Columns" },
						 */
						"language" : {
							"infoFiltered" : ""
						},
						"dom" : 'Cf<"toolbar"">rtip',

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
											"JOB_OFFERED", "DECLINE_OFFERED",
											"HIRE", "INTERVIEW_FAILED",
											"MARK_INTERVIEW_PASS",
											"MARK_INTERVIEW_FAIL" ]
								}, {
									type : "text"
								} ]

					}).fnSetFilteringDelay();

	/* FILTER DELAYING */
	/*
	 * var searchWait = 0; var searchWaitInterval; $('.dataTables_filter
	 * input').unbind('keypress keyup').bind( 'keypress keyup', function(e) {
	 * var item = $(this); searchWait = 0; console.log("HEREEEE"); if
	 * (!searchWaitInterval) searchWaitInterval = setInterval(function() { if
	 * (searchWait >= 3) { clearInterval(searchWaitInterval); searchWaitInterval =
	 * ''; searchTerm = $(item).val(); cTable.fnFilter(searchTerm); searchWait =
	 * 0; } searchWait++; }, 500);
	 * 
	 * });
	 */

	/* */
}

/*
 * 
 * selectorId: candidateId - to determine WHICH candidate's status is being
 * CHANGED vacancyId: vacancyId - to pass to Interview Schedule modal incase
 * status -> INTERVIEW_SCHEDULE
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
							eSelect = document
									.getElementById('interviewerSelect');
							/* $('#itv_c_id').val(selectorId); */
							iSelect.options.length = 0;

							$.each(data.interviews, function(i, item) {
								iSelect.options.add(new Option(
										item.interviewName, item.interviewId));
							});

							eSelect.options.length = 0;
							$.each(data.employees, function(i, item) {
								eSelect.options.add(new Option(
										item.employeeName, item.employeeId));
							});
							/* clear managers selected list */
							$('#managers').empty();
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

function onInterviewSelect() {
	console.log("Selected changed");
	var employeeId = $('#interviewerSelect').val();
	var employeeName = $('#interviewerSelect option:selected').text();
	console.log(employeeId);

	/* add to managers list and show */
	$('#managers')
			.append(
					"<li id='li"
							+ employeeId
							+ "'><div class='edit-buttons'><button type='button' onclick='onRemoveManager("
							+ employeeId
							+ ")'><i class='icon-minus-sign'></i></button></div> <span>"
							+ employeeName + "</span></li>");
	/* remove from select after adding to list */
	$('#interviewerSelect option[value=' + employeeId + ']').remove();
}

function onRemoveManager(employeeId) {
	var employeeName = $('#li' + employeeId + " span").text();
	console.log(employeeName);
	$('#li' + employeeId).remove();
	document.getElementById('interviewerSelect').options.add(new Option(
			employeeName, employeeId));
}

/*
 * 
 * selectorId: candidateId - to determine WHICH vacancy's status is being
 * CHANGED
 * 
 */
function onVacancyStatusChange(selectorId) {
	var object = new Object();
	object.v_id = selectorId;
	object.changedStatus = $(
			"#vAvailStatusSelect" + selectorId + " option:selected").text();
	if (selectorId != -1) {
		$.ajax({
			type : 'POST',
			url : '<portlet:resourceURL id="vacancyStatusChange"/>',
			contentType : "application/json; charset=utf-8",
			data : JSON.stringify(object),
			success : function(response) {
				$('#vtable').dataTable().fnDraw();
			},
			error : function(msg) {

			}
		});
	}
}

$(document).ready(function() {
	console.log("on document ready");
	loadCandidateTable();
	/*
	 * $(".select2-container").select2(); $(".select_filter").select2();
	 */
	$('#date_of_application').datepicker();
	$('#itvDate').datepicker();
	$('#cCheckbox').change(function() {
		alert("checked");
		if ($("#cCheckbox:checked").length) {
			$("#cDeleteBtn").removeAttr('disabled');
		} else {
			$("#cDeleteBtn").attr('disabled', 'disabled');
		}

	});

	$.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='loadJTitles'/>",
		contentType : "application/json; charset=utf-8",
		success : function(data) {
			List1 = data;
		},
		error : function(msg) {

		}

	});

});

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
 * Usage: call AJAX to get Candidate from Db for editting id: candidateId
 * 
 */
function getCandidate(id) {
	var obj = new Object();
	obj.c_id = id;
	$('#modify-candidate-modal').modal('show');
	jQuery.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='getCandidate'/>",
		data : JSON.stringify(obj),
		dataType : "json",
		contentType : 'application/json',
		mimeType : 'application/json',
		error : function(e) {

		},
		success : function(response) {
			var obj = response;
			$('#c_id').val(obj.c_id);
			$('#first_name').val(obj.first_name);
			$('#middle_name').val(obj.middle_name);
			$('#last_name').val(obj.last_name);
			$('#inputEmail').val(obj.email);
			$('#contact_number').val(obj.contact_number);
			$('#comment').val(obj.comment);
			$('#date_of_application').val(obj.date_of_application);
			$('#vacancySelect').val(obj.v_id);
		}
	});

}

function deleteCandidates() {
	var selectedArr = [];
	$('#ctable tbody tr input[type=checkbox]:checked').each(function() {
		var id = $(this).val();
		selectedArr.push({
			c_id : id
		});
	});
	jQuery.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='deleteCandidates'/>",
		data : JSON.stringify(selectedArr),
		dataType : "json",
		contentType : 'application/json',
		mimeType : 'application/json',
		error : function(e) {

		},
		success : function(response) {
			$('#ctable').dataTable().fnDraw();
		}
	});
}

function deleteVacancies() {
	var selectedArr = [];
	$('#vtable tbody tr input[type=checkbox]:checked').each(function() {
		var id = $(this).val();
		selectedArr.push({
			v_id : id
		});
	});
	jQuery.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='deleteVacancies'/>",
		data : JSON.stringify(selectedArr),
		dataType : "json",
		contentType : 'application/json',
		mimeType : 'application/json',
		error : function(e) {

		},
		success : function(response) {
			$('#vtable').dataTable().fnDraw();
			if (response.isNotified == true) {
				$('#ctable').dataTable().fnDraw();
			}
		}
	});

}

function addLocation() {
	$('#modify-location-modal').modal('show');
}

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
	$('#managers li').each(function(i) {
		selectedInterviewers.push(($(this).attr('id')));
	});

	object.selectedInterviewers = selectedInterviewers;

	console.log(object.selectedInterviewers);

	jQuery.ajax({
		type : 'POST',
		url : "<portlet:resourceURL id='saveInterviewSchedule'/>",
		data : JSON.stringify(object),
		dataType : "json",
		contentType : 'application/json',
		mimeType : 'application/json',
		error : function(e) {

		},
		success : function(response) {
			console.log("DATA RESPONSE FOR saveInterviewSchedule");
		}
	});
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

// Util functions
