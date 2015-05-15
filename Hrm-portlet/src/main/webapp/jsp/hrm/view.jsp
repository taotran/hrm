<%@page import="vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.VacancyServiceUtil"%>
<%@page import="vn.com.ecopharma.hrm.service.persistence.VacancyUtil"%>
<%@page import="vn.com.ecopharma.hrm.model.Vacancy"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>



<div id="myTab">

	<ul class="nav nav-tabs">
		<li class="active"><a href="#tab-1"><liferay-ui:message
					key="tab.candidate.title" /></a></li>
		<li><a href="#tab-2"><liferay-ui:message
					key="tab.vacancy.title" /></a></li>
	</ul>

	<div class="tab-content">
		<div id="tab-1" class="tab-pane">
			<div class="box searchForm" id="candidateSrchForm">
				<div class="srch-header"></div>
				<div class="srch-body">
					<!-- Bootstrap trigger to open modal -->
					<div class="advancedSearchBox">
						<div class="searchFields">
							<label for="jTitle">Job Title</label> <select
								class="select2-container" id="jTitle">
								<option value="1">Test 1</option>
								<option value="2">Test 2</option>
								<option value="3">Test 3</option>
								<option value="4">Test 4</option>
							</select> <label for="vSelect">Vacancy</label> <select
								class="select2-container" id="vSelect">
								<option value="1">Test 1</option>
								<option value="2">Test 2</option>
								<option value="3">Test 3</option>
								<option value="4">Test 4</option>
							</select> <input id="cName" placeholder="Type..." />
						</div>
						<div class="searchButtons">
							<button class="btn btn-primary">Search</button>
							<button class="btn">Reset</button>
						</div>
					</div>

					<div class="actionButtons">
						<div class="buttons">
							<a data-toggle="modal" class="btn btn-primary" href="#add-modal"><liferay-ui:message
									key="global.button.add" /></a>
							<button disabled='disabled' data-toggle="modal" id="cDeleteBtn"
								class="btn" onclick="deleteCandidates()">
								<liferay-ui:message key="global.button.delete" />
							</button>
						</div>
					</div>

					<table id="ctable" class="table table-striped table-bordered">
						<thead>
							<tr>
								<!-- <th><input type="checkbox" id="select_all_candidates"/>Id</th> -->
								<th><liferay-ui:message key="candidate.id" /></th>
								<th><liferay-ui:message key="candidate.first_name" /></th>
								<th><liferay-ui:message key="candidate.middle_name" /></th>
								<th><liferay-ui:message key="candidate.last_name" /></th>
							</tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
			</div>


		</div>
		<div id="tab-2">
			<div class="actionButtons">
				<div class="buttons">
					<a data-toggle="modal" class="btn btn-primary" href="#add-modal"><liferay-ui:message
							key="global.button.add" /></a>
					<button disabled='disabled' data-toggle="modal" id="cDeleteBtn"
						class="btn" onclick="deleteCandidates()">
						<liferay-ui:message key="global.button.delete" />
					</button>
				</div>
			</div>

			<table id="ctable" class="table table-striped table-bordered">
				<thead>
					<tr>
						<!-- <th><input type="checkbox" id="select_all_candidates"/>Id</th> -->
						<th><liferay-ui:message key="vacancy.id" /></th>
						<th><liferay-ui:message key="vacancy.name" /></th>
						<th><liferay-ui:message key="vacancy.hiring_manager" /></th>
						<th><liferay-ui:message key="vacancy.published_in_feed" /></th>
					</tr>
				</thead>
				<tbody></tbody>
			</table>
		</div>
	</div>

</div>

<div class="modal" id="add-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<h4>Add New Candidate</h4>
	</div>

	<div class="modal-body" id="candidateInfo">
		<input type="hidden" id="c_id" value="-1" />
		<div class="form-group">
			<div class="form-inline">
				<label for="first_name"><liferay-ui:message
						key="candidate.first_name" /></label> <input type="text"
					class="form-control" id="first_name" placeholder="First Name">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="middle_name"><liferay-ui:message
						key="candidate.middle_name" /></label> <input type="text"
					class="form-control" id="middle_name" value="testValue"
					placeholder="Middle Name">
			</div>
		</div>
		<div class="form-group">
			<div class="form-inline">
				<label for="last_name"><liferay-ui:message
						key="candidate.last_name" /></label> <input type="text"
					class="form-control" id="last_name" value="testValue"
					placeholder="Last Name">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="inputEmail"><liferay-ui:message
						key="candidate.email" /></label> <input type="email" class="form-control"
					id="inputEmail" value="testValue@eco.com" placeholder="Email">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="contact_number"><liferay-ui:message
						key="candidate.contact_number" /></label> <input type="text"
					class="form-control" id="contact_number" value="123-456-789"
					placeholder="Contact Number">
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="select2"><liferay-ui:message
						key="candidate.job_vacancy" /></label>
				<c:if test="${fn:length(allVacancies) > 0}">
					<select class="form-control select2-container" id="vacancySelect"
						class="vacancySelect2">
						<c:forEach items="${allVacancies}" var="vacancy">
							<option value="${vacancy.v_id}">${vacancy.name }</option>
						</c:forEach>
					</select>
				</c:if>
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<label for="comment"><liferay-ui:message
						key="candidate.comment" /></label>
				<!-- 				<textarea rows="5" cols="50" class="form-control" id="comment">Test Test</textarea> -->
				<input class="form-control" id="comment" value="Ghi chú"
					placeholder="Comment..." />
			</div>
		</div>

		<div class="form-group">
			<div class="form-inline">
				<!-- 				<label for="date_of_application">Date of application</label> <input
					type="text" class="form-control" id="date_of_application"
					placeholder="Date of Application">
					<label class="control-label">Date picker</label> -->
				<label class="control-label">Date picker</label> <input type="text"
					value="02/16/12" data-date-format="mm/dd/yy" id="datepicker"
					class="datepicker">
			</div>
		</div>
	</div>

	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="saveCandidate()">
			<liferay-ui:message key="global.button.save" />
		</button>
		<button class="btn" onclick="clearFields()">
			<liferay-ui:message key="global.button.clear_all" />
		</button>
		<a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
				key="global.button.cancel" /></a>
	</div>
</div>

<script type="text/javascript">
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

	//AJAX save new/updated candidate
	function saveCandidate() {
		var candidate = new Object();

		candidate.c_id = $("#c_id").val();
		candidate.first_name = $('#first_name').val();
		candidate.middle_name = $('#middle_name').val();
		candidate.last_name = $('#last_name').val();
		candidate.email = $('#inputEmail').val();
		candidate.contact_number = $('#contact_number').val();
		candidate.comment = $('#comment').val();

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

		/* ajaxCall("<portlet:resourceURL id='addCandidate'/>", candidate, $('#ctable').dataTable().fnDraw()); */

		//clear input fields after creating new
		/* 		$('#candidateInfo :input').each(function() {
		 $(this).val('');
		 }); */
	};

	function loadCandidateTable() {
		$('#ctable')
				.dataTable(
						{
							// 							bAutoWidth : true,
							bProcessing : true,
							bServerSide : true,
							bPaginate : true,
							iDisplayRecords : 20,
							// 							bFilter : true,
							// 							bRetrieve : true,
							// 							bStateSave : true,
							sPaginationType : "full_numbers",
							sAjaxSource : '<portlet:resourceURL id="get_all_candidates"/>',
							"aoColumns" : [
									{
										"mData" : "_c_id",
										"bSortable" : false,
										"mRender" : function(data, type, full) {
											return "<input id='cCheckbox' type='checkbox' id='"+full._c_id+"' value='"+full._c_id+"'/>";
										}
									},
									{
										"mData" : "_first_name",
										"mRender" : function(data, type, full) {
											var fullName = data + " "
													+ full._middle_name + " "
													+ full._last_name;
											return "<a id='"
													+ full._c_id
													+ "' href='#ctable' onclick='getCandidate("
													+ full._c_id + ");'>"
													+ fullName + "</a>";
										}
									}, {
										"mData" : "_middle_name"
									}, {
										"mData" : "_last_name"
									} ]

						});
	}

	$(document).ready(function() {
		loadCandidateTable();
		/* $("#vacancySelect").select2(); */
		$(".select2-container").select2();
		$('#datepicker').datepicker();
		/* var cCheckboxes = $('#ctable tbody tr input[type=checkbox]'); */
		$('#cCheckbox').change(function() {
			alert("checked");
			if ($("#cCheckbox:checked").length) {
				$("#cDeleteBtn").removeAttr('disabled');
			} else {
				$("#cDeleteBtn").attr('disabled', 'disabled');
			}

		});
	});

	function getCandidate(id) {
		var obj = new Object();
		obj.c_id = id;
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
				var obj = response.candidate;
				$('#c_id').val(obj._c_id);
				$('#first_name').val(obj._first_name);
				$('#middle_name').val(obj._middle_name);
				$('#last_name').val(obj._last_name);
				$('#inputEmail').val(obj._email);
				$('#contact_number').val(obj._contact_number);
				$('#comment').val(obj._comment);
				$('#add-modal').modal('show');
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

	//Util functions
	function clearFields() {
		$('#candidateInfo :input').each(function() {
			$(this).val('');
		});
		$('#c_id').val('-1');
	}
</script>
