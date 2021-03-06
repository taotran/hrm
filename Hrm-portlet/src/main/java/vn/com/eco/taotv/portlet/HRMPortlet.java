package vn.com.eco.taotv.portlet;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.codehaus.jackson.annotate.JsonUnwrapped;
import org.hsqldb.lib.StopWatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException;

import vn.com.ecopharma.hrm.constant.CandidateStatus;
import vn.com.ecopharma.hrm.constant.VacancyStatus;
import vn.com.ecopharma.hrm.exceptions.InterviewScheduleExistedException;
import vn.com.ecopharma.hrm.exceptions.VacancyCandidateNotFoundException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.CandidateHistory;
import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.EmployeeVacancy;
import vn.com.ecopharma.hrm.model.Interview;
import vn.com.ecopharma.hrm.model.InterviewSchedule;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Location;
import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.service.CandidateHistoryLocalServiceUtil;
import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeVacancyLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewScheduleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.LocationLocalServiceUtil;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;
import vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;
import vn.com.ecopharma.hrm.util.HRMUtil;
import vn.com.ecopharma.hrm.util.JSONServiceUtil;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Region;
import com.liferay.portal.model.Repository;
import com.liferay.portal.service.AddressLocalServiceUtil;
import com.liferay.portal.service.RegionServiceUtil;
import com.liferay.portal.service.RepositoryLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileEntryType;
import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLContentLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.portlet.documentlibrary.util.PDFProcessorUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class HRMPortlet
 */

/**
 * @author TaoTran
 *
 */
public class HRMPortlet extends MVCPortlet {

	private static final String FILTER_DATE_FORMAT = "dd/MM/yyyy";
	private static final String SOURCE_DATE_FORMAT = "MM/dd/yyyy";

	private static final String GET_ALL_CANDIDATES = "get_all_candidates";
	private static final String SAVE_CANDIDATE = "saveCandidate";
	private static final String GET_CANDIDATE = "getCandidate";
	private static final String DELETE_CANDIDATES = "deleteCandidates";
	private static final String HIRE_CANDIDATE_STATUS_CHANGE = "hireCandidateStatusChange";
	private static final String UPLOAD_CANDIDATE_RESUME = "uploadCandidateResume";

	private static final String GET_ALL_VACANCIES = "get_all_vacancies";
	private static final String SAVE_VACANCY = "saveVacancy";
	private static final String GET_VACANCY = "getVacancy";
	private static final String DELETE_VACANCIES = "deleteVacancies";

	private static final String UPLOAD_VACANCY_JD = "uploadVacancyJD";
	private static final String GENERATE_VACANCIES_SUCCESSION_REPORT = "generateVacancySuccessionReport";

	private static final String GET_ALL_JOB_TITLES = "get_all_jTitles";
	private static final String SAVE_JOB_TITLE = "saveJTitle";
	private static final String GET_JOB_TITLE = "getJTitle";
	private static final String DELETE_JOB_TITLE = "deleteJTitles";

	private static final String GET_ALL_INTERVIEWS = "get_all_interviews";
	private static final String SAVE_INTERVIEW = "saveInterview";
	private static final String GET_INTERVIEW = "getInterview";
	private static final String DELETE_INTERVIEW = "deleteInterview";

	private static final String GET_ALL_LOCATIONS = "get_all_locations";
	private static final String SAVE_LOCATION = "saveLocation";
	private static final String GET_LOCATION = "getLocation";
	private static final String DELETE_LOCATION = "deleteLocation";

	private static final String GET_ALL_INTERVIEW_SCHEDULE = "get_all_interview_schedule";
	private static final String SAVE_INTERVIEW_SCHEDULE = "saveInterviewSchedule";
	private static final String GET_INTERVIEW_SCHEDULE = "getInterviewSchedule";
	private static final String DELETE_INTERVIEW_SCHEDULE = "deleteInterviewSchedule";

	private static final String SAVE_EMPLOYEE = "saveEmployee";

	private static final String GET_ALL_CANDIDATE_HISTORIES = "get_all_candidate_histories";

	private static final String EXPORT_RESULT = "export_result";

	private static final String GET_PREVIEW = "getPreview";

	private int C_INITIAL, V_INITIAL;
	private int C_RECORD_SIZE, V_RECORD_SIZE;
	private String C_GLOB_SEARCH, C_VACANCY_SEARCH, C_NAME_SEARCH,
			C_EMAIL_SEARCH, C_CONTACT_NO_SEARCH, C_STATUS_SEARCH,
			C_START_DATE_SEARCH, C_END_DATE_SEARCH, DATE_RANGE_STR;

	private String V_GLOB_SEARCH, V_NAME_SEARCH, V_JOB_TITLE_SEARCH,
			V_MANAGERS_SEARCH, V_LOCATION_SEARCH, V_STATUS_SEARCH;

	@Override
	public void render(javax.portlet.RenderRequest request,
			javax.portlet.RenderResponse response) throws PortletException,
			IOException {
		super.render(request, response);
	}

	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response)
			throws IOException, PortletException {
		final String resourceRequestId = request.getResourceID();

		try {
			onCandidateServeResourceAction(request, response, resourceRequestId);

			onVacancyServeResourceAction(request, response, resourceRequestId);

			onJTitleServeResourceAction(request, response, resourceRequestId);

			onInterviewServeResourceAction(request, response, resourceRequestId);

			onLocationServeResourceActions(request, response, resourceRequestId);

			onInterviewScheduleServeResourceActions(request, response,
					resourceRequestId);

			onEmployeeServeResourceActions(request, response, resourceRequestId);

			onGetCandidatesFormDataAJX(request, response, resourceRequestId);

			onGetVacanciesFormDataAJX(request, response, resourceRequestId);

			onGetInterviewScheduleFormDataAJX(request, response,
					resourceRequestId);

			onExportResult(request, response, resourceRequestId);

			onVacancyReportActions(request, response, resourceRequestId);

			if (UPLOAD_CANDIDATE_RESUME.equals(resourceRequestId)) {
				final DLFileEntry dlFileEntry = HRMUtil.uploadFileFromRequest(
						request, "addCandidate_resume", "candidateResume", "",
						"", 43008);
				final FileEntry fileEntry = HRMUtil
						.getUploadFileEntry(dlFileEntry);
				JSONObject object = new JSONObject();
				object.put("id", fileEntry.getFileEntryId());
				response.getWriter().print(object);

			}

			if (GET_PREVIEW.equalsIgnoreCase(resourceRequestId)) {
				final JsonObject reqObj = getPOSTJsonObjectFromRequest(request);
				final long dlFileEntryId = reqObj.get("id").getAsLong();
				final JSONObject result = HRMUtil.getFilePreviewInfo(request,
						dlFileEntryId);
				JSONServiceUtil.writeJSON(response.getWriter(), result);
			}

			if (UPLOAD_VACANCY_JD.equals(resourceRequestId)) {
				final DLFileEntry dlFileEntry = HRMUtil.uploadFileFromRequest(
						request, "addVacancy_JD", "vacancyJD", "", "", 43008);
				final FileEntry fileEntry = HRMUtil
						.getUploadFileEntry(dlFileEntry);
				final JSONObject object = new JSONObject();
				object.put("id", fileEntry.getFileEntryId());
				response.getWriter().print(object);

			}
			
			if ("loadRegionData".equalsIgnoreCase(resourceRequestId)) {
				final List<Region> allRegions = RegionServiceUtil.getRegions(17L, true);
				final String term = ParamUtil.getString(request, "q");
				final JSONObject result = new JSONObject();
				final JSONArray resultArr = new JSONArray();
				System.out.println("REGIONS SIZE: " + allRegions.size());
				System.out.println("TERM: " + term);
				if (term.equalsIgnoreCase("") || term.equalsIgnoreCase("*")) {
					for (Region r: allRegions) {
						JSONObject obj = new JSONObject();
						obj.put("id", r.getRegionId());
						obj.put("text", r.getName());
						resultArr.put(obj);
					}
				} else {
					for(Region r: allRegions) {
						String s = r.getName();
						System.out.println(HRMUtil.replaceVietnameseLocaleChar(s.toLowerCase()));
						if (HRMUtil.replaceVietnameseLocaleChar(s.toLowerCase()).contains(term.toLowerCase())) {
							JSONObject obj = new JSONObject();
							obj.put("id", r.getRegionId());
							obj.put("text", r.getName());
							resultArr.put(obj);
						}
					}
				}
				System.out.println(resultArr);
				result.put("aaData", resultArr);
				JSONServiceUtil.writeJSON(response.getWriter(), result);
			}
			
			if ("filterJobTitleByTerm".equalsIgnoreCase(resourceRequestId)) {
				final List<JTitle> allJTitles = JTitleLocalServiceUtil.findAll();
				final String term = ParamUtil.getString(request, "q");
				final JSONObject result = new JSONObject();
				final JSONArray resultArr = new JSONArray();
				System.out.println("REGIONS SIZE: " + allJTitles.size());
				System.out.println("TERM: " + term);
				if (term.equalsIgnoreCase("") || term.equalsIgnoreCase("*")) {
					for (JTitle r: allJTitles) {
						JSONObject obj = new JSONObject();
						obj.put("id", r.getJobtitleId());
						obj.put("text", r.getTitle());
						resultArr.put(obj);
					}
				} else {
					for(JTitle r: allJTitles) {
						if (r.getTitle().toLowerCase().contains(term.toLowerCase())) {
							System.out.println(r.getTitle());
							JSONObject obj = new JSONObject();
							obj.put("id", r.getJobtitleId());
							obj.put("text", r.getTitle());
							resultArr.put(obj);
						}
					}
				}
				System.out.println(resultArr);
				result.put("aaData", resultArr);
				JSONServiceUtil.writeJSON(response.getWriter(), result);
			}
			

		} catch (InterviewScheduleExistedException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (VacancyCandidateNotFoundException e) {
			e.printStackTrace();
		}
		super.serveResource(request, response);
	}
	
	

	private void onCandidateServeResourceAction(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws JSONException, PortalException, SystemException,
			IOException, ParseException {
		final Map<String, Object> map = new HashMap<String, Object>();
		final ServiceContext serviceContext = ServiceContextFactory
				.getInstance(Candidate.class.getName(), request);
		if (GET_ALL_CANDIDATES.equals(resourceRequestId)) {
			int iTotalRecords; // total number of records (unfiltered)
			int iTotalDisplayRecords;// value will be set when code filters
										// companies by keyword

			C_GLOB_SEARCH = ParamUtil.getString(request, "sSearch");
			C_VACANCY_SEARCH = ParamUtil.getString(request, "sSearch_1");
			C_NAME_SEARCH = ParamUtil.getString(request, "sSearch_2");
			C_EMAIL_SEARCH = ParamUtil.getString(request, "sSearch_3");
			C_CONTACT_NO_SEARCH = ParamUtil.getString(request, "sSearch_4");
			DATE_RANGE_STR = ParamUtil.getString(request, "sSearch_5");
			System.out.println(DATE_RANGE_STR + " length "
					+ DATE_RANGE_STR.length() + " "
					+ DATE_RANGE_STR.indexOf("~"));
			if (DATE_RANGE_STR != null && DATE_RANGE_STR != ""
					&& DATE_RANGE_STR.length() > 1) {
				C_START_DATE_SEARCH = DATE_RANGE_STR.indexOf("~") != 0 ? DATE_RANGE_STR
						.substring(0, DATE_RANGE_STR.indexOf("~")).trim()
						: null;
				System.out.println(C_START_DATE_SEARCH);
				if (C_START_DATE_SEARCH != null) {
					if (DATE_RANGE_STR.length() > C_START_DATE_SEARCH.length() + 1) {
						C_END_DATE_SEARCH = DATE_RANGE_STR.substring(
								DATE_RANGE_STR.indexOf("~") + 1,
								DATE_RANGE_STR.length()).trim();
					}
				} else {
					C_END_DATE_SEARCH = DATE_RANGE_STR.substring(
							DATE_RANGE_STR.indexOf("~") + 1,
							DATE_RANGE_STR.length()).trim();
				}
			}
			C_STATUS_SEARCH = ParamUtil.getString(request, "sSearch_6");
			Integer sortColumnIndex = ParamUtil.getInteger(request,
					"iSortCol_0");
			String sortDirection = ParamUtil.getString(request, "sSortDir_0");
			final String[] columnNames = { "c_id", "vacancy", "fullname",
					"email", "contact_number", "date_of_application", "status" };

			final JSONObject jsonResult = new JSONObject();
			int listDisplayAmount = 10;
			int start = 0;
			String pageNo = request.getParameter("iDisplayStart");
			String pageSize = request.getParameter("iDisplayLength");
			if (pageNo != null) {
				start = Integer.parseInt(pageNo);
				if (start < 0) {
					start = 0;
				}
			}
			if (pageSize != null) {
				listDisplayAmount = Integer.parseInt(pageSize);
				if (listDisplayAmount < 10 || listDisplayAmount > 100) {
					listDisplayAmount = 10;
				}
			}
			if (sortColumnIndex != null) {
				if (sortColumnIndex < 0 || sortColumnIndex > 5)
					sortColumnIndex = 0;
			}

			System.out.println("sortColumnIndex: " + sortColumnIndex);
			System.out.println("sortDirection: " + sortDirection);
			final String sortColName = columnNames[sortColumnIndex];
			System.out.println("columnName: " + sortColName);
			C_RECORD_SIZE = listDisplayAmount;
			C_INITIAL = start;

			iTotalDisplayRecords = CandidateLocalServiceUtil
					.getFilterCandidatesSize(C_GLOB_SEARCH, C_NAME_SEARCH,
							C_EMAIL_SEARCH, C_CONTACT_NO_SEARCH,
							C_STATUS_SEARCH, C_VACANCY_SEARCH,
							C_START_DATE_SEARCH, C_END_DATE_SEARCH,
							sortColName, sortDirection);
			iTotalRecords = CandidateLocalServiceUtil.countAll();
			final List<Candidate> filterCandidates = CandidateLocalServiceUtil
					.filterCandidates(C_GLOB_SEARCH, C_NAME_SEARCH,
							C_EMAIL_SEARCH, C_CONTACT_NO_SEARCH,
							C_STATUS_SEARCH, C_VACANCY_SEARCH,
							C_START_DATE_SEARCH, C_END_DATE_SEARCH,
							sortColName, sortDirection, C_INITIAL,
							C_RECORD_SIZE);

			jsonResult.put("iTotalRecords", iTotalRecords);
			jsonResult.put("iTotalDisplayRecords", iTotalDisplayRecords);

			C_START_DATE_SEARCH = StringUtils.EMPTY;
			C_END_DATE_SEARCH = StringUtils.EMPTY;
			C_GLOB_SEARCH = StringUtils.EMPTY;
			C_NAME_SEARCH = StringUtils.EMPTY;
			C_EMAIL_SEARCH = StringUtils.EMPTY;
			C_CONTACT_NO_SEARCH = StringUtils.EMPTY;
			C_STATUS_SEARCH = StringUtils.EMPTY;
			C_VACANCY_SEARCH = StringUtils.EMPTY;

			JSONArray array = new JSONArray();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			for (Candidate c : filterCandidates) {
				JSONObject object = new JSONObject();
				object.put("c_id", c.getC_id());
				/*
				 * VacancyCandidate vc = VacancyCandidateLocalServiceUtil
				 * .findByCandidate_And_VALID_Status(c.getC_id()); if (vc !=
				 * null) { long v_id = vc.getV_id(); object.put("vacancy",
				 * VacancyLocalServiceUtil.getVacancy(v_id).getName());
				 * object.put("vacancyId", v_id); } else { object.put("vacancy",
				 * ""); object.put("vacancyId", -1); }
				 */
				Vacancy v = VacancyLocalServiceUtil
						.getVacancyByCandidate_And_VALID_Status(c.getC_id());
				object.put("vacancy", v != null ? v.getName()
						: StringUtils.EMPTY);
				object.put("vacancyId", v != null ? v.getV_id() : -1);

				object.put(
						"full_name",
						c.getFirst_name() + " " + c.getMiddle_name() + " "
								+ c.getLast_name());
				object.put("email", c.getEmail());
				object.put("contact_number", c.getContact_number());
				object.put("date_of_application", sdf.format(new Date(c
						.getDate_of_application().getTime())));
				object.put("status", c.getCandidate_status());
				if (c.getCandidate_status() != null
						&& !c.getCandidate_status().isEmpty()) {
					CandidateStatus status = CandidateStatus.valueOf(c
							.getCandidate_status());
					JSONArray statuses = new JSONArray();
					for (CandidateStatus s : CandidateStatus
							.getAvailableStatus(status)) {
						statuses.put(s.toString());
					}
					object.put("statusCssClass",
							CandidateStatus.valueOf(c.getCandidate_status())
									.getCssClass());
					object.put("availableStatuses", statuses);
				}
				if (c.getCv_file_id() != -1) {
					ThemeDisplay themeDisplay = (ThemeDisplay) request
							.getAttribute(WebKeys.THEME_DISPLAY);
					DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil
							.getDLFileEntry(c.getCv_file_id());
					FileEntry fEntry = DLAppServiceUtil.getFileEntry(
							dlFileEntry.getGroupId(),
							dlFileEntry.getFolderId(), dlFileEntry.getTitle());
					object.put("fileEntryId", c.getCv_file_id());
					object.put(
							"resume",
							DLUtil.getPreviewURL(fEntry,
									fEntry.getFileVersion(), themeDisplay, ""));
				} else {
					object.put("resume", "");
				}
				array.put(object);
			}
			jsonResult.put("aaData", array);
			response.getWriter().print(jsonResult);
			response.getWriter().close();

		}
		/*
		 * else if (SAVE_CANDIDATE.equalsIgnoreCase(resourceRequestId)) {
		 * 
		 * System.out.println("HEREEEEEEEEEEEEEEEEEEEEEEEEE");
		 * 
		 * JSONObject obj = new JSONObject();
		 * System.out.println(request.getParameterNames()); String firstname =
		 * ParamUtil.getString(request, "first_name"); String middle_name =
		 * ParamUtil.getString(request, "middle_name"); String last_name =
		 * ParamUtil.getString(request, "last_name"); String email =
		 * ParamUtil.getString(request, "inputEmail"); String dateString =
		 * ParamUtil.getString(request, "date_of_application"); String
		 * contact_number = ParamUtil.getString(request, "contact_number");
		 * String vacancy = ParamUtil.getString(request, "vacancySelect");
		 * String comment = ParamUtil.getString(request, "comment");
		 * System.out.println("FirstName: " + firstname);
		 * System.out.println(middle_name); System.out.println(last_name);
		 * ThemeDisplay themeDisplay =
		 * (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		 * 
		 * UploadPortletRequest uploadRequest =
		 * PortalUtil.getUploadPortletRequest(request);
		 * 
		 * //String fileName = uploadRequest.getFileName("addCandidate_resume");
		 * 
		 * File upload = uploadRequest.getFile("addCandidate_resume");
		 * 
		 * 
		 * JSONObject result = new JSONObject(); result.put("result",
		 * "success"); response.getWriter().print(result); }
		 */

		else if (SAVE_CANDIDATE.equalsIgnoreCase(resourceRequestId)) {

			final JsonObject jObject = getPOSTJsonObjectFromRequest(request);
			System.out.println(jObject);
			// final long c_id = jObject.get("c_id").getAsLong();
			final String first_name = jObject.get("first_name").getAsString();
			final String middle_name = jObject.get("middle_name").getAsString();
			final String last_name = jObject.get("last_name").getAsString();
			final String contact_number = jObject.get("contact_number")
					.getAsString();
			final String comment = jObject.get("comment").getAsString();
			final String email = jObject.get("email").getAsString();
			final Boolean isDeleteOrNotAddResume = jObject.get(
					"isDeleteOrChange").getAsBoolean();
			final Long v_id = jObject.get("vacancy").getAsLong() != -1 ? jObject
					.get("vacancy").getAsLong() : null;
			final SimpleDateFormat sdf = new SimpleDateFormat(
					FILTER_DATE_FORMAT);
			final java.util.Date date_of_application = sdf.parse(jObject.get(
					"date_of_application").getAsString());
			final long cv_file_id = jObject.get("cv_file_id") != null ? jObject
					.get("cv_file_id").getAsLong() : -1;
			// verify c_id to check create/update action
			if (jObject.get("c_id").getAsLong() == -1) {
				CandidateLocalServiceUtil.create(serviceContext.getUserId(),
						first_name, middle_name, last_name, email,
						contact_number, comment, 1, new Date(
								date_of_application.getTime()), cv_file_id,
						"zzz", 1, v_id, serviceContext);
			} else {
				CandidateLocalServiceUtil.edit(serviceContext.getUserId(),
						jObject.get("c_id").getAsLong(), first_name,
						middle_name, last_name, email, contact_number, comment,
						1, new Date(date_of_application.getTime()), cv_file_id,
						isDeleteOrNotAddResume, "zzz", 1, v_id, serviceContext);

			}
			JSONServiceUtil.writeJSON(response.getWriter(), map);
		}

		else if (DELETE_CANDIDATES.equalsIgnoreCase(resourceRequestId)) {
			deleteEntityServeResource(request, response.getWriter(), "c_id");
		} else if (GET_CANDIDATE.equalsIgnoreCase(resourceRequestId)) {
			find_ResponseEntityServeResource(request, response.getWriter(),
					"c_id");
		} else if (GET_ALL_CANDIDATE_HISTORIES
				.equalsIgnoreCase(resourceRequestId)) {
			// DLAppServiceUtil
			// DLFileEntryLocalServiceUtil.addFileEntry(userId, groupId,
			// repositoryId, folderId, sourceFileName, mimeType, title,
			// description, changeLog, fileEntryTypeId, fieldsMap, file, is,
			// size, serviceContext);
			System.out.println("INSIDE GET_ALL_CANDIDATE_HISTORIES");
			final JsonObject obj = getPOSTJsonObjectFromRequest(request);
			long c_id = obj.get("c_id").getAsLong();
			// long c_id = ParamUtil.getLong(request, "c_id");
			final List<CandidateHistory> histories = CandidateHistoryLocalServiceUtil
					.findByCandidate(c_id);

			final JSONObject result = new JSONObject();
			final JSONArray historyArr = new JSONArray();
			final SimpleDateFormat sdf = new SimpleDateFormat(
					FILTER_DATE_FORMAT);
			for (CandidateHistory h : histories) {
				final JSONObject object = new JSONObject();
				object.put("candidateHistoryId",
						sdf.format(h.getCandidateHistoryId()));
				object.put("performedDate", h.getPerformedDate());
				object.put("note", h.getNote());
				historyArr.put(object);
			}
			// UploadPortletRequest uploadPortletRequest =
			// PortalUtil.getUploadPortletRequest(request);
			ThemeDisplay themeDisplay = (ThemeDisplay) request
					.getAttribute(WebKeys.THEME_DISPLAY);
			System.out.println("THEME: " + themeDisplay.getThemeId());
			result.put("aaData", historyArr);
			response.getWriter().print(result);
		} else if (HIRE_CANDIDATE_STATUS_CHANGE
				.equalsIgnoreCase(resourceRequestId)) {
			final JsonObject object = getPOSTJsonObjectFromRequest(request);
			long c_id = object.get("c_id").getAsLong();
			long v_id = object.get("v_id").getAsLong();
			final Candidate candidate = CandidateLocalServiceUtil
					.getCandidate(c_id);
			final JSONObject obj = createCandidateJSONObj(request, candidate,
					null);
			obj.put("subUnit",
					SubUnitLocalServiceUtil.getSubUnit(
							VacancyLocalServiceUtil.getVacancy(v_id)
									.getSubUnitId()).getName());
			response.getWriter().print(obj);
		} else if ("candidateStatusChange".equalsIgnoreCase(resourceRequestId)) {
			JsonObject jsonObject = getPOSTJsonObjectFromRequest(request);
			long candidateId = jsonObject.get("c_id").getAsLong();
			long vancancyId = jsonObject.get("v_id").getAsLong();
			final String changedStatus = jsonObject.get("changedStatus")
					.getAsString();
			;
			CandidateLocalServiceUtil.changeCandidateStatus(candidateId,
					vancancyId, serviceContext.getUserId(),
					CandidateStatus.valueOf(changedStatus), serviceContext);
			response.getWriter().print(new JSONObject());
		} else if ("previewCandidateResume".equalsIgnoreCase(resourceRequestId)) {
			DLFileEntry fileEntry = DLFileEntryLocalServiceUtil
					.getDLFileEntry(1234);
			FileEntry fe = DLAppServiceUtil.getFileEntry(fileEntry
					.getFileEntryId());
			FileVersion version = fe.getFileVersion();
			int previewFileCount = PDFProcessorUtil
					.getPreviewFileCount(version);
		}
	}

	private void onVacancyServeResourceAction(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws PortalException, SystemException, IOException {
		final ServiceContext serviceContext = ServiceContextFactory
				.getInstance(Candidate.class.getName(), request);
		// ALL VACANCY RESOURCE ACTIONS
		if (GET_ALL_VACANCIES.equalsIgnoreCase(resourceRequestId)) {
			int iTotalRecords = 0;
			int iTotalDisplayRecords = 0;
			int start = 0;
			int listDisplayAmount = 10;
			final String[] colums = { "v_id", "name", "job_title", "location",
					"vacancy_status" };
			V_GLOB_SEARCH = ParamUtil.getString(request, "sSearch");
			V_NAME_SEARCH = ParamUtil.getString(request, "sSearch_1");
			V_JOB_TITLE_SEARCH = ParamUtil.getString(request, "sSearch_2");
			V_LOCATION_SEARCH = ParamUtil.getString(request, "sSearch_3");
			V_STATUS_SEARCH = ParamUtil.getString(request, "sSearch_4");
			Integer sortColumnIndex = ParamUtil.getInteger(request,
					"iSortCol_0");
			String sortDirection = ParamUtil.getString(request, "sSortDir_0");
			String pageNo = request.getParameter("iDisplayStart");
			String pageSize = request.getParameter("iDisplayLength");
			if (pageNo != null) {
				start = Integer.parseInt(pageNo);
				if (start < 0) {
					start = 0;
				}
			}

			if (pageSize != null) {
				listDisplayAmount = Integer.parseInt(pageSize);
				if (listDisplayAmount < 10 || listDisplayAmount > 100) {
					listDisplayAmount = 10;
				}
			}

			V_INITIAL = start;
			V_RECORD_SIZE = listDisplayAmount;
			final String sortColumnName = colums[sortColumnIndex];

			final List<Vacancy> vacancies = VacancyLocalServiceUtil
					.filterVacancies(V_GLOB_SEARCH, V_NAME_SEARCH,
							V_JOB_TITLE_SEARCH, V_LOCATION_SEARCH,
							V_STATUS_SEARCH, sortColumnName, sortDirection,
							V_INITIAL, V_RECORD_SIZE);

			iTotalRecords = VacancyLocalServiceUtil.countAll();
			iTotalDisplayRecords = VacancyLocalServiceUtil
					.getFilterVacanciesSize(V_GLOB_SEARCH, V_NAME_SEARCH,
							V_JOB_TITLE_SEARCH, V_LOCATION_SEARCH,
							V_STATUS_SEARCH, sortColumnName, sortDirection);

			JSONObject jsonResult = new JSONObject();
			jsonResult.put("iTotalRecords", iTotalRecords);
			jsonResult.put("iTotalDisplayRecords", iTotalDisplayRecords);
			JSONArray array = new JSONArray();
			for (Vacancy v : vacancies) {
				JSONObject object = new JSONObject();
				object.put("v_id", v.getV_id());
				object.put("vacancy_name", v.getName());
				object.put("job_title",
						JTitleLocalServiceUtil.getJTitle(v.getJobtitleId())
								.getTitle());
				object.put("location", LocationLocalServiceUtil
						.getLocationNameById(v.getLocationId()));
				object.put("status", v.getVacancy_status());
				int validApplications = VacancyCandidateLocalServiceUtil
						.findByVacancy_And_VALID_Status(v.getV_id()).size();
				int numberOfPositions = v.getNo_of_positions();
				object.put("validApplicants", validApplications);
				object.put("numberOfPositions", numberOfPositions);
				final JSONArray availableStatuses = new JSONArray();
				for (VacancyStatus vs : VacancyStatus
						.getAvailableStatuses(VacancyStatus.valueOf(v
								.getVacancy_status()))) {
					availableStatuses.put(vs.toString());
				}
				object.put("statusCssClass",
						VacancyStatus.valueOf(v.getVacancy_status())
								.getCssClass());
				object.put("availableStatuses", availableStatuses);
				array.put(object);
			}

			// get list of JTitle names for JTitleSelect
			JSONArray jTitles = new JSONArray();
			for (JTitle j : JTitleLocalServiceUtil.findAll()) {
				jTitles.put(createJTitleJSONObj(j, null));
			}
			jsonResult.put("aaData", array);
			// load all Job Titles for VacancyDialog
			jsonResult.put("jTitles", jTitles);
			response.getWriter().print(jsonResult);

		} else if (SAVE_VACANCY.equalsIgnoreCase(resourceRequestId)) {

			final JsonObject object = getPOSTJsonObjectFromRequest(request);
			final long v_id = object.get("v_id").getAsLong();
			final long jTitleId = object.get("jTitleId").getAsLong();
			final long locationId = object.get("locationId").getAsLong();
			final long subUnitId = object.get("subUnitId").getAsLong();
			final String name = object.get("v_name").getAsString();
			final String description = object.get("description").getAsString();
			final int no_of_pos = object.get("no_of_positions").getAsInt();
			final List<Long> manIds = getSelectedManagerIds(object.get(
					"selectedManagers").getAsJsonArray());
			final long jdId = object.get("jdId") != null ? object.get("jdId")
					.getAsLong() : -1;
			final Boolean isDeleteOrNotAddJD = object.get("isDeleteOrChange")
					.getAsBoolean();
			/*
			 * final String vacancy_status = jObject.get(
			 * "vacancy_status").getAsString();
			 */
			// verify c_id to check create/update action
			boolean isNotifyChanges = false;
			Vacancy modifiedVacancy = null;
			if (v_id == -1) {
				modifiedVacancy = VacancyLocalServiceUtil.create(
						serviceContext.getUserId(), jTitleId, locationId,
						subUnitId, manIds, name, description, no_of_pos,
						VacancyStatus.NEW.toString(), "", jdId, serviceContext);
				isNotifyChanges = modifiedVacancy != null;

			} else {
				final Vacancy oldVacancy = VacancyLocalServiceUtil
						.getVacancy(v_id);

				modifiedVacancy = VacancyLocalServiceUtil
						.edit(v_id, jTitleId, locationId, subUnitId, manIds,
								name, description, no_of_pos, "", jdId,
								isDeleteOrNotAddJD, serviceContext);

				/*
				 * Notify changes when Name or VacancyStatus changed -> to
				 * update Vacancy related parts in Candidate Tab
				 */
				isNotifyChanges = modifiedVacancy != null
						&& (!oldVacancy.getName().equalsIgnoreCase(
								modifiedVacancy.getName()) || !oldVacancy
								.getVacancy_status().equalsIgnoreCase(
										modifiedVacancy.getVacancy_status()));

			}
			/*
			 * if (isNotifyChanges) { final List<Vacancy> vacancies =
			 * VacancyLocalServiceUtil .findAll(); final JSONArray vArr = new
			 * JSONArray(); for (Vacancy v : vacancies) { if
			 * (v.getVacancy_status().equalsIgnoreCase(
			 * VacancyStatus.PUBLISHED.toString())) {
			 * vArr.put(createVacancyJSONObj(v, null)); } }
			 * response.getWriter().print(vArr); } else {
			 * response.getWriter().print(new JSONArray()); }
			 */
			final JSONObject result = isNotifyChanges ? createVacancyJSONObj(
					request, modifiedVacancy, null) : new JSONObject();
			result.put("isNew", true);
			response.getWriter().print(result);

		} else if (DELETE_VACANCIES.equalsIgnoreCase(resourceRequestId)) {
			deleteEntityServeResource(request, response.getWriter(), "v_id");
		} else if (GET_VACANCY.equalsIgnoreCase(resourceRequestId)) {
			find_ResponseEntityServeResource(request, response.getWriter(),
					"v_id");

		} else if ("uploadResume".equalsIgnoreCase(resourceRequestId)) {
			UploadPortletRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			String uploadFileName = uploadRequest
					.getFileName("addCandidate_resume");
		}
	}

	private void onJTitleServeResourceAction(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, PortalException, SystemException {
		// ALL JOB TITLE RESOURCE ACTIONS
		if (GET_ALL_JOB_TITLES.equalsIgnoreCase(resourceRequestId)) {
			List<Vacancy> vacancies = findAllVacancies();
			// map.put("aaData", vacancies);
			// JSONServiceUtil.writeJSON(resourceResponse.getWriter(), map);
			C_GLOB_SEARCH = ParamUtil.getString(request, "sSearch");
			JSONObject jsonResult = new JSONObject();
			JSONArray array = new JSONArray();
			for (Vacancy v : vacancies) {
				JSONObject object = new JSONObject();
				object.put("v_id", v.getV_id());
				object.put("vacancy_name", v.getName());
				object.put("job_title", v.getJobtitleId());
				object.put("location", "on doing");
				object.put("status", "on doing");
				array.put(object);
			}

			jsonResult.put("aaData", array);
			response.getWriter().print(jsonResult);

		} else if (SAVE_JOB_TITLE.equalsIgnoreCase(resourceRequestId)) {
			final JsonObject jObject = getPOSTJsonObjectFromRequest(request);
			final long jTitleId = jObject.get("jTitleId").getAsLong();
			final String title = jObject.get("title").getAsString();
			final String desc = jObject.get("description").getAsString();
			final String note = jObject.get("note").getAsString();

			// verify jTitleId to check create/update action
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					JTitle.class.getName(), request);
			JTitle responseObj = null;
			if (jTitleId == -1) {

				responseObj = JTitleLocalServiceUtil.create(
						serviceContext.getUserId(),
						serviceContext.getScopeGroupId(), title, desc, note,
						false, serviceContext);
			} else {
				responseObj = JTitleLocalServiceUtil.edit(
						serviceContext.getUserId(),
						serviceContext.getScopeGroupId(), jTitleId, title,
						desc, note, false, serviceContext);

			}
			response.getWriter().print(createJTitleJSONObj(responseObj, null));

		} else if (DELETE_JOB_TITLE.equalsIgnoreCase(resourceRequestId)) {
			deleteEntityServeResource(request, response.getWriter(), "j_id");
		} else if (GET_JOB_TITLE.equalsIgnoreCase(resourceRequestId)) {
			find_ResponseEntityServeResource(request, response.getWriter(),
					"j_id");
		} else if ("uploadResume".equalsIgnoreCase(resourceRequestId)) {
			UploadPortletRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(request);
			String uploadFileName = uploadRequest
					.getFileName("addCandidate_resume");
		} else if ("loadDataForFooterFilter"
				.equalsIgnoreCase(resourceRequestId)) {
			// get list of JTitle names for JTitleSelect
			final JSONArray jTitleNamesArr = new JSONArray();
			final JSONArray locationArr = new JSONArray();
			for (JTitle j : JTitleLocalServiceUtil.findAll()) {
				jTitleNamesArr.put(j.getTitle());
			}
			for (Location l : LocationLocalServiceUtil.findAll()) {
				locationArr.put(l.getName());
			}
			final JSONObject result = new JSONObject();
			result.put("jTitles", jTitleNamesArr);
			result.put("locations", locationArr);
			response.getWriter().print(result);
		} else if ("vacancyStatusChange".equalsIgnoreCase(resourceRequestId)) {
			final JsonObject jsonObject = getPOSTJsonObjectFromRequest(request);
			long id = jsonObject.get("v_id").getAsLong();

			final String changedStatus = jsonObject.get("changedStatus")
					.getAsString();
			System.out.println("VACANCY STATUS CHANGE ID: " + id);
			System.out.println("VACANCY STATUS ->: " + changedStatus);
			final Vacancy vacancy = VacancyLocalServiceUtil.getVacancy(id);
			vacancy.setVacancy_status(changedStatus);
			VacancyLocalServiceUtil.updateVacancy(vacancy);
			response.getWriter().print(new JSONObject());
		}
	}

	private void onInterviewServeResourceAction(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws PortalException, SystemException, IOException {
		if (GET_ALL_INTERVIEWS.equalsIgnoreCase(resourceRequestId)) {
			// get list of JTitle names for JTitleSelect
			JSONArray array = new JSONArray();
			for (Interview i : InterviewLocalServiceUtil.findAll()) {
				JSONObject object = new JSONObject();
				object.put("interviewId", i.getInterviewId());
				object.put("interviewName", i.getName());
				array.put(object);
			}
			response.getWriter().print(array);
		} else if (SAVE_INTERVIEW.equalsIgnoreCase(resourceRequestId)) {
			final ServiceContext context = ServiceContextFactory
					.getInstance(request);
			final JsonObject obj = getPOSTJsonObjectFromRequest(request);
			final String name = obj.get("name").getAsString();
			InterviewLocalServiceUtil
					.create(context.getUserId(), name, context);
		}
	}

	private void onLocationServeResourceActions(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, SystemException, PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Location.class.getName(), request);
		if (SAVE_LOCATION.equalsIgnoreCase(resourceRequestId)) {
			final JsonObject obj = getPOSTJsonObjectFromRequest(request);
			final String name = obj.get("name").getAsString();
			final String province = obj.get("province").getAsString();
			final String city = obj.get("city").getAsString();
			final String address = obj.get("address").getAsString();
			final String zip_code = obj.get("zip_code").getAsString();
			final String phone = obj.get("phone").getAsString();
			final String fax = obj.get("fax").getAsString();
			final String note = obj.get("note").getAsString();
			LocationLocalServiceUtil.create(name, province, city, address,
					zip_code, phone, fax, note, serviceContext.getUserId(),
					serviceContext);

			final JSONArray arr = new JSONArray();
			for (Location l : LocationLocalServiceUtil.findAll()) {
				arr.put(createLocationJSONObj(l, null));
			}
			response.getWriter().print(arr);

		}
	}

	private void onInterviewScheduleServeResourceActions(
			ResourceRequest request, ResourceResponse response,
			String resourceRequestId) throws IOException, SystemException,
			PortalException, ParseException, VacancyCandidateNotFoundException,
			InterviewScheduleExistedException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				InterviewSchedule.class.getName(), request);
		long userId = serviceContext.getUserId();
		if (SAVE_INTERVIEW_SCHEDULE.equalsIgnoreCase(resourceRequestId)) {
			final JsonObject object = getPOSTJsonObjectFromRequest(request);
			final SimpleDateFormat sdf = new SimpleDateFormat(
					FILTER_DATE_FORMAT);
			final long interviewId = object.get("interviewId").getAsLong();
			final long candidateId = object.get("candidateId").getAsLong();
			final long vacancyId = object.get("vacancyId").getAsLong();
			final Date interviewDate = new Date(sdf.parse(
					object.get("itvDate").getAsString()).getTime());
			final String itvTimeFrom = object.get("itvTimeFrom").getAsString();
			final String itvTimeTo = object.get("itvTimeTo").getAsString();
			final String interviewTime = itvTimeFrom + "_" + itvTimeTo;
			final List<Long> ids = getSelectedManagerIds(object.get(
					"selectedInterviewers").getAsJsonArray());

			InterviewScheduleLocalServiceUtil.create(interviewId, vacancyId,
					candidateId, ids, interviewDate, interviewTime, userId,
					serviceContext);
			response.getWriter().print(new JSONObject());

		}
	}

	private void onEmployeeServeResourceActions(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, SystemException, PortalException,
			ParseException, VacancyCandidateNotFoundException,
			InterviewScheduleExistedException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Employee.class.getName(), request);
		long userId = serviceContext.getUserId();
		if (SAVE_EMPLOYEE.equalsIgnoreCase(resourceRequestId)) {
			final JsonObject object = getPOSTJsonObjectFromRequest(request);
			long employeeId = object.get("employeeId").getAsLong();
			long candidateId = object.get("candidateId").getAsLong();
			long vacancyId = object.get("vacancyId").getAsLong();
			final SimpleDateFormat sdf = new SimpleDateFormat(
					FILTER_DATE_FORMAT);
			final String firstName = object.get("first_name").getAsString();
			final String middleName = object.get("middle_name").getAsString();
			final String lastName = object.get("last_name").getAsString();
			
			
			final String gender = object.get("gender").getAsString();
			final String emailAddress = object.get("email").getAsString();
			final String company_email = object.get("companyEmail").getAsString();
			final java.util.Date birthday = sdf.parse(object.get("birthday")
					.getAsString());
			final String contact_number = object.get("contact_number")
					.getAsString();
			final long subUnitId = object.get("subUnit").getAsLong();
			final java.util.Date start_date = sdf.parse(object.get("start_date")
					.getAsString());
			
			final long titlesId = object.get("titlesId").getAsLong();
			final long levelId = object.get("levelId").getAsLong();
			final java.util.Date promoted_date = sdf.parse(object.get("promoted_date")
					.getAsString());
			
			final java.util.Date labour_contract_signed_date = sdf.parse(object.get("lc_signed_date")
					.getAsString());
			final java.util.Date labour_contract_expired_date = sdf.parse(object.get("lc_expired_date")
					.getAsString());
			final String labour_contract_type = object.get("lc_type").getAsString();
			
			final String education = object.get("edu").getAsString();
			final String education_specialize = object.get("edu_spec").getAsString();
			final long education_university = object.get("edu_uni").getAsLong();
			
			final String marital_status = object.get("marital_status").getAsString(); 
			
			final String identityCardNo = object.get("identity_no").getAsString(); 
			final java.util.Date issued_date = sdf.parse(object.get("identity_issued_date").getAsString());
			final String issued_place = object.get("identity_issued_place").getAsString(); 
			
			
			final String personal_tax_code = object.get("personal_tax_code").getAsString(); 
			final int number_of_dependents = object.get("no_of_dependents").getAsInt(); 
			final String dependent_names = object.get("dependent_names").getAsString(); 
			
			final String social_insurance_no = object.get("social_ins_code").getAsString(); 
			final String health_insurance_no = object.get("health_ins_code").getAsString(); 
			
			final String bank_account_no = object.get("bank_acc").getAsString(); 
			final String bank_branch_name = object.get("bank_name").getAsString(); 
			
			final double base_wage_rates = object.get("base_wage_rates").getAsDouble(); 
			final double position_wage_rates = object.get("position_wage_rates").getAsDouble(); 
			final double capacity_salary = object.get("capacity_salary").getAsDouble(); 
			final double total_salary = object.get("total_salary").getAsDouble(); 
			final double bonus = object.get("bonus").getAsDouble(); 
			
			final java.util.Date resigned_date = sdf.parse(object.get("e_resigned_date").getAsString()); 
			
			/* USER INFORMATION */
			final String username = object.get("username").getAsString(); 
			final String password1 = object.get("password1").getAsString(); 
			final String password2 = object.get("password2").getAsString(); 
			
			long creatorUserId = serviceContext.getUserId();
			long companyId = serviceContext.getCompanyId();
			boolean autoPassword = false;
			boolean autoScreenName = false;
			Locale locale = LocaleUtil.getDefault();
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(birthday);
			int birthdayMonth = cal.get(Calendar.MONTH);
			int birthdayDay = cal.get(Calendar.DAY_OF_MONTH);
			int birthdayYear = cal.get(Calendar.YEAR);
			
			boolean sendEmail = false;
			String emp_code = "ECO";
			
			
/*			EmployeeLocalServiceUtil.addEmployee(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, 
					username, emailAddress, facebookId, openId, locale, firstName, 
					middleName, lastName, 0, 0, gender.equalsIgnoreCase("male"), birthdayMonth, birthdayDay, 
					birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, 
					sendEmail, emp_code, contact_number, jobtitleId, start_date, subUnitId, 
					titles_id, level_id, promoted_date, labour_contract_signed_date, labour_contract_expired_date, 
					labour_contract_type, gender, place_of_birth, education, education_specialize, universityId, marital_status, 
					identityCardNo, issued_date, issued_place, addressId, company_email, personal_tax_code, number_of_dependents, 
					dependent_names, social_insurance_no, health_insurance_no, bank_account_no, bank_branch_name, base_wage_rates, 
					position_wage_rates, capacity_salary, total_salary, bonus, resigned_date, 0, serviceContext);*/
			
			EmployeeLocalServiceUtil.addEmployee(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, 
					username, emailAddress, 0, "", locale, firstName, 
					middleName, lastName, 0, 0, gender.equalsIgnoreCase("male"), birthdayMonth, birthdayDay, 
					birthdayYear, new long[]{20192}, null, new long[] {20165}, null, 
					sendEmail, emp_code, contact_number, 0, start_date, subUnitId, 
					0, 0, promoted_date, labour_contract_signed_date, labour_contract_expired_date, 
					labour_contract_type, gender, "POB", education, education_specialize, 0, marital_status, 
					identityCardNo, issued_date, issued_place, 0, company_email, personal_tax_code, number_of_dependents, 
					dependent_names, social_insurance_no, health_insurance_no, bank_account_no, bank_branch_name, base_wage_rates, 
					position_wage_rates, capacity_salary, total_salary, bonus, resigned_date, 0, serviceContext);
			
			if (employeeId == -1) {
				long jobTitleId = VacancyLocalServiceUtil.getVacancy(vacancyId)
						.getJobtitleId();
				final Candidate candidate = CandidateLocalServiceUtil
						.getCandidate(candidateId);
				candidate.setCandidate_status(CandidateStatus.HIRE.toString());
				CandidateLocalServiceUtil.updateCandidate(candidate);
			} else {
			}
			
			/*EmployeeLocalServiceUtil.addEmployee(serviceContext.getUserId(), serviceContext.getCompanyId(),
					false, "123", "123", 
					false, "taotran", "a@a.com", 
					0, "", LocaleUtil.getDefault(), 
					"A", "A", "A", 0, 
					0, true, 9, 23, 1988, 
					"TestJTitle", new long[]{20192}, null, new long[] {20166}, 
					null, false, "EMP001", "12345", 
					0, new Date(System.currentTimeMillis()), 0, 0, 0, 
					new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), 
					"TEMPORARY", "Male", "Thai Binh", "12/12", "Computer Science", 0, "Single", 
					"024374362", new Date(System.currentTimeMillis()), "CA TPHCM", 0, "t@t.com", "00001", 1, 
					"dad", "12345", "45678", "9101112", "VCB", 1000, 
					10000, 100000, 200000, 15000, new Date(System.currentTimeMillis()), 0, serviceContext);*/
			
			
			response.getWriter().print(new JSONObject());
		} else if ("filterEmpByName".equalsIgnoreCase(resourceRequestId)) {
			final JsonObject object = getPOSTJsonObjectFromRequest(request);
			System.out.println(object);
		} 
		else if ("getManagerSelectData".equalsIgnoreCase(resourceRequestId)) {
			String term = ParamUtil.getString(request, "q");
			Integer iTotalRecords = 0;
			Integer iTotalDisplayRecords = 0;
			Integer iDisplayStart = ParamUtil.getInteger(request,
					"iDisplayStart");
			Integer iDisplayLength = ParamUtil.getInteger(request,
					"iDisplayLength");
			System.out.println("term: " + term);
			System.out.println("term: " + iDisplayStart);
			System.out.println("term: " + iDisplayLength);
			System.out.println("INSIDE getManagerSelectData");
			iTotalRecords = EmployeeLocalServiceUtil.countAll();
			iTotalDisplayRecords = EmployeeLocalServiceUtil
					.filterEmployeeByTermSize(term);
			JSONArray resultArr = EmployeeLocalServiceUtil
					.filterEmployeeByTerm(term, iDisplayStart, iDisplayLength);
			/*
			 * JSONArray arr = new JSONArray(); for (Employee e:
			 * EmployeeLocalServiceUtil.findAll()) { JSONObject obj = new
			 * JSONObject(); obj.put("id", e.getEmployeeId()); obj.put("text",
			 * e.getFirstname() + " " + e.getMiddle_name() + " " +
			 * e.getLastname()); arr.put(obj); }
			 */
			
			
			JSONObject result = new JSONObject();
			result.put("iTotalRecords", iTotalRecords);
			result.put("iTotalDisplayRecords", iTotalDisplayRecords);
			result.put("aaData", resultArr);
			response.getWriter().print(result);
		} else if ("filterUniversitiesByTerm".equalsIgnoreCase(resourceRequestId)) {
			System.out.println("INSIDE filterUniversitiesByTerm");
			String term = ParamUtil.getString(request, "q");
			Integer iTotalRecords = 0;
			Integer iTotalDisplayRecords = 0;
			Integer iDisplayStart = ParamUtil.getInteger(request,
					"iDisplayStart");
			Integer iDisplayLength = ParamUtil.getInteger(request,
					"iDisplayLength");
			iTotalRecords = UniversityLocalServiceUtil.countAll();
			iTotalDisplayRecords = UniversityLocalServiceUtil
					.filterUniversitiesByTermSize(term);
			JSONArray resultArr = UniversityLocalServiceUtil
					.filterUniversitiesByTerm(term, iDisplayStart, iDisplayLength);
			/*
			 * JSONArray arr = new JSONArray(); for (Employee e:
			 * EmployeeLocalServiceUtil.findAll()) { JSONObject obj = new
			 * JSONObject(); obj.put("id", e.getEmployeeId()); obj.put("text",
			 * e.getFirstname() + " " + e.getMiddle_name() + " " +
			 * e.getLastname()); arr.put(obj); }
			 */

			JSONObject result = new JSONObject();
			result.put("iTotalRecords", iTotalRecords);
			result.put("iTotalDisplayRecords", iTotalDisplayRecords);
			result.put("aaData", resultArr);
			response.getWriter().print(result);
		}
	}

	private void onVacancyReportActions(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException {
		if (GENERATE_VACANCIES_SUCCESSION_REPORT.equals(resourceRequestId)) {

			System.out.println("GENERATE_VACANCIES_SUCCESSION_REPORT");
			final List<Object[]> objects = VacancyLocalServiceUtil
					.getVacancySuccessionReport();
			String[] reportCols = { "job_title", "v_name",
					"vacancy_added_date", "no_of_pos", "no_of_applicants",
					"no_of_shortlist", "no_of_hire" };
			final JSONObject result = new JSONObject();
			final JSONArray reportArr = new JSONArray();
			for (Object[] o : objects) {
				JSONObject reportRowObj = new JSONObject();
				for (int i = 0; i < o.length; i++) {
					System.out.println("Column " + i + "; name["
							+ reportCols[i] + "] - Value: " + o[i]);
					reportRowObj.put(reportCols[i], o[i]);
				}
				reportArr.put(reportRowObj);
			}

			result.put("aaData", reportArr);
			response.getWriter().print(result);
			response.getWriter().close();
		}
	}

	private List<Long> getSelectedManagerIds(JsonArray manArr) {
		System.out.println(manArr);
		final List<Long> ids = new ArrayList<Long>();
		for (JsonElement je : manArr) {
			if (je != null && !je.isJsonNull()) {
				String empIdStr = je.getAsString().substring(3,
						je.getAsString().length());
				ids.add(Long.valueOf(empIdStr));
			}
		}
		return ids;
	}

	/**
	 * Read the InputStream from portlet request & parse to JsonObject
	 * 
	 * @param request
	 * @return JsonObject
	 * @throws IOException
	 */
	private JsonObject getPOSTJsonObjectFromRequest(ResourceRequest request)
			throws IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(
				request.getPortletInputStream()));
		final String json;
		JsonObject object = null;
		if (br != null) {
			json = br.readLine();
			object = (JsonObject) new JsonParser().parse(json);
		}
		return object;
	}

	private void onGetCandidatesFormDataAJX(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, SystemException {

		if ("getCandidatesFormDataAJX".equalsIgnoreCase(resourceRequestId)) {
			List<Vacancy> vacancies = findAllVacancies();
			JSONArray array = new JSONArray();
			for (Vacancy v : vacancies) {
				if (v.getVacancy_status().equalsIgnoreCase(
						VacancyStatus.PUBLISHED.toString())) {
					JSONObject object = new JSONObject();
					object.put("v_id", v.getV_id());
					object.put("vacancy_name", v.getName());
					array.put(object);
				}
			}
			response.getWriter().print(array);
		}
	}

	private void onGetVacanciesFormDataAJX(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, SystemException {

		if ("getVacanciesFormDataAJX".equalsIgnoreCase(resourceRequestId)) {
			JSONObject result = new JSONObject();
			JSONArray jArray = new JSONArray();
			JSONArray lArray = new JSONArray();
			JSONArray eArray = new JSONArray();
			JSONArray sArray = new JSONArray();
			for (Location l : LocationLocalServiceUtil.findAll()) {
				JSONObject object = new JSONObject();
				object.put("locationId", l.getLocationId());
				object.put("name", l.getName());
				lArray.put(object);
			}

			for (JTitle j : JTitleLocalServiceUtil.findAll()) {
				JSONObject object = new JSONObject();
				object.put("jTitleId", j.getJobtitleId());
				object.put("title", j.getTitle());
				jArray.put(object);
			}

			for (Employee e : EmployeeLocalServiceUtil.findAll()) {
				final JSONObject object = new JSONObject();
//				final String fullName = e.getFirstname() + " "
//						+ e.getMiddle_name() + " " + e.getLastname();
				object.put("employeeId", e.getEmployeeId());
//				object.put("name", fullName);
				eArray.put(object);
			}

			for (SubUnit s : SubUnitLocalServiceUtil.findAll()) {
				final JSONObject object = new JSONObject();
				object.put("subUnitId", s.getSubUnitId());
				object.put("name", s.getName());
				sArray.put(object);
			}

			result.put("locations", lArray);
			result.put("jTitles", jArray);
			result.put("emps", eArray);
			result.put("subUnits", sArray);
			response.getWriter().print(result);
		}
	}

	private void onGetInterviewScheduleFormDataAJX(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, SystemException, JSONException {
		if ("getInterviewScheduleFormDataAJX"
				.equalsIgnoreCase(resourceRequestId)) {
			final JSONObject result = new JSONObject();
			// get list of JTitle names for JTitleSelect
			JSONArray iArray = new JSONArray();
			for (Interview i : InterviewLocalServiceUtil.findAll()) {
				JSONObject object = new JSONObject();
				object.put("interviewId", i.getInterviewId());
				object.put("interviewName", i.getName());
				iArray.put(object);
			}

			JSONArray eArray = new JSONArray();
			for (Employee e : EmployeeLocalServiceUtil.findAll()) {
				JSONObject object = new JSONObject();
				object.put("employeeId", e.getEmployeeId());
//				object.put("employeeName",
//						e.getFirstname() + e.getMiddle_name() + e.getLastname());
				eArray.put(object);
			}
			result.put("interviews", iArray);
			result.put("employees", eArray);
			response.getWriter().print(result);
		}
	}

	private void onExportResult(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, SystemException, PortalException {
		if (EXPORT_RESULT.equalsIgnoreCase(resourceRequestId)) {

			HSSFWorkbook workbook = new HSSFWorkbook();
			final HSSFSheet sheet = workbook.createSheet("candidate");
			StopWatch sw = new StopWatch();
			sw.start();
			final Map<String, Object[]> data = new TreeMap<String, Object[]>();
			data.put("1", new Object[] { "ID", "VACANCY", "FULLNAME", "EMAIL",
					"PHONE", "STATUS", "APPLICATION_DATE" });
			final JsonObject jObj = getPOSTJsonObjectFromRequest(request);
			System.out.println(jObj);
			List<Candidate> filteredCandidates = CandidateLocalServiceUtil
					.filterCandidateForExport(jObj.get("conditions")
							.getAsJsonArray());
			JSONObject result = null;
			if (!CollectionUtils.isEmpty(filteredCandidates)) {
				for (Candidate candidate : filteredCandidates) {
					data.put(
							String.valueOf(candidate.getC_id()),
							new Object[] {
									String.valueOf(candidate.getC_id()),
									VacancyLocalServiceUtil
											.getVacancyNameByCandidate_And_VALID_Status(candidate
													.getC_id()),
									candidate.getFirst_name() + " "
											+ candidate.getMiddle_name() + " "
											+ candidate.getLast_name(),
									candidate.getEmail(),
									candidate.getContact_number(),
									candidate.getCandidate_status(),
									String.valueOf(candidate
											.getDate_of_application()) });
				}
				Set<String> keySet = data.keySet();
				int rowNum = 0;
				for (String key : keySet) {
					Row row = sheet.createRow(rowNum++);
					Object[] objArr = data.get(key);
					int cellNum = 0;
					for (Object obj : objArr) {
						Cell cell = row.createCell(cellNum++);
						if (obj instanceof String) {
							cell.setCellValue((String) obj);
						} else if (obj instanceof Integer) {
							cell.setCellValue((Integer) obj);
						}
					}
				}
				/*
				 * try { final ByteArrayOutputStream outByteStream = new
				 * ByteArrayOutputStream(); workbook.write(outByteStream);
				 * byte[] outArray = outByteStream.toByteArray(); final
				 * HttpServletRequest httpRequest = PortalUtil
				 * .getHttpServletRequest(request); final HttpServletResponse
				 * httpResponse = PortalUtil .getHttpServletResponse(response);
				 * ServletResponseUtil .sendFile(httpRequest, httpResponse,
				 * "candidateExport.xls", outArray, "application/download"); }
				 * catch (IOException e) { e.printStackTrace(); }
				 */

				final ByteArrayOutputStream outByteStream = new ByteArrayOutputStream();
				workbook.write(outByteStream);
				byte[] outArray = outByteStream.toByteArray();

				File file = FileUtil.createTempFile(outArray);
				File newFile = new File(file.getParent(), "exportCandidates-"
						+ System.currentTimeMillis() + ".xls");
				Files.move(file.toPath(), newFile.toPath());

				System.out.println(file.getPath());
				// PortletResponseUtil.sendFile(request, response,
				// "Export_File.xls", outArray, "application/download");

				final DLFileEntry dlFileEntry = HRMUtil.uploadFile(request,
						newFile, "candidateExport", "", "", 51001);
				newFile.delete();
				final FileEntry fe = HRMUtil.getUploadFileEntry(dlFileEntry);
				result = HRMUtil.getFilePreviewInfo(request,
						fe.getFileEntryId());
			}
			
			if (result == null) {
				result = new JSONObject();
				result.put("fail", "No results were found with these conditions!");
			}
			
			JSONServiceUtil.writeJSON(response.getWriter(), result);
		}
	}

	private List<Vacancy> findAllVacancies() throws SystemException {
		return VacancyLocalServiceUtil.findAll();
	}

	private void deleteEntityServeResource(ResourceRequest resourceRequest,
			PrintWriter writer, String entityId) throws PortalException,
			SystemException {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(
					resourceRequest.getPortletInputStream()));

			if (br != null) {
				String json = br.readLine();
				final JsonArray jsonArr = (JsonArray) new JsonParser()
						.parse(json);
				JSONObject result = new JSONObject();
				for (int i = 0; i < jsonArr.size(); i++) {
					JsonObject jsonObject = (JsonObject) jsonArr.get(i);
					long id = jsonObject.get(entityId).getAsLong();
					// Bad!!!
					// TODO: find a way to generic doing this
					if (entityId.equalsIgnoreCase("c_id")) {
						CandidateLocalServiceUtil.delele(id);
					} else if (entityId.equalsIgnoreCase("v_id")) {
						final List<VacancyCandidate> vacancyCandidatesByVacancy = VacancyCandidateLocalServiceUtil
								.findByVacancy(id);
						// notify to refresh candidate table if there is any
						// candidate linked to vacancy
						if (vacancyCandidatesByVacancy != null) {
							result.put("isNotified", true);
							// remove CandidateStatus if there is no linked
							// Vacancy
							for (VacancyCandidate vc : vacancyCandidatesByVacancy) {
								Candidate c = CandidateLocalServiceUtil
										.getCandidate(vc.getC_id());
								c.setCandidate_status(null);
								CandidateLocalServiceUtil.updateCandidate(c);
							}
						}
						VacancyLocalServiceUtil.delete(id);
						result.put("isNotified", true);
					} else if (entityId.equalsIgnoreCase("j_id")) {
						JTitleLocalServiceUtil.delete(id);
					}
				}
				writer.print(result);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void find_ResponseEntityServeResource(
			ResourceRequest resourceRequest, PrintWriter writer, String entityId)
			throws IOException, PortalException, SystemException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(
				resourceRequest.getPortletInputStream()));
		if (br != null) {
			String json = br.readLine();
			JsonObject jsonObject = (JsonObject) new JsonParser().parse(json);
			long id = jsonObject.get(entityId).getAsLong();
			JSONObject result = new JSONObject();
			// Bad!!!
			// TODO: find a way to generic do this
			if (entityId.equalsIgnoreCase("c_id")) {
				result = createCandidateJSONObj(resourceRequest, null, id);
			} else if (entityId.equalsIgnoreCase("v_id")) {
				result = createVacancyJSONObj(resourceRequest, null, id);
			} else if (entityId.equalsIgnoreCase("j_id")) {
				result = createJTitleJSONObj(null, id);
			}
			writer.print(result);
			writer.flush();
		}
	}

	private JSONObject createCandidateJSONObj(ResourceRequest request,
			Candidate candidate, Long id) throws PortalException,
			SystemException {
		final Candidate c = candidate != null ? candidate
				: CandidateLocalServiceUtil.getCandidate(id);
		final JSONObject object = new JSONObject();
		object.put("c_id", c.getC_id());
		object.put("email", c.getEmail());
		object.put("first_name", c.getFirst_name());
		object.put("middle_name", c.getMiddle_name());
		object.put("last_name", c.getLast_name());
		object.put("contact_number", c.getContact_number());
		final SimpleDateFormat sdf = new SimpleDateFormat(FILTER_DATE_FORMAT);
		object.put("date_of_application",
				sdf.format(c.getDate_of_application()));
		if (c.getCv_file_id() != -1) {
			ThemeDisplay themeDisplay = (ThemeDisplay) request
					.getAttribute(WebKeys.THEME_DISPLAY);
			DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil
					.getDLFileEntry(c.getCv_file_id());

			FileEntry fEntry = DLAppServiceUtil.getFileEntry(
					dlFileEntry.getGroupId(), dlFileEntry.getFolderId(),
					dlFileEntry.getTitle());

			object.put("resume", DLUtil.getPreviewURL(fEntry,
					fEntry.getFileVersion(), themeDisplay, ""));
			object.put("resumeFileName", fEntry.getTitle());
			System.out.println("ENTRY ID: " + fEntry.getFileEntryId());
			object.put("resumeId", fEntry.getFileEntryId());
		} else {
			object.put("resume", "-1");
		}
		final VacancyCandidate vc = VacancyCandidateLocalServiceUtil
				.findByCandidate_And_VALID_Status(c.getC_id());
		if (vc != null) {
			long v_id = vc.getV_id();
			object.put("v_id", v_id);
			object.put("vacancy", VacancyLocalServiceUtil.getVacancy(v_id)
					.getName());
			if (!VacancyLocalServiceUtil.getVacancy(v_id).getVacancy_status()
					.equalsIgnoreCase(VacancyStatus.PUBLISHED.toString())) {
				object.put("vacancyStateUnpublished", true);
			} else {
				object.put("vacancyStateUnpublished", false);
			}
		} else {
			object.put("v_id", -1);
			object.put("vacancy", "");
		}
		System.out.println(object);
		return object;
	}

	private JSONObject createVacancyJSONObj(ResourceRequest request,
			Vacancy vacancy, Long id) throws PortalException, SystemException {
		final Vacancy v = vacancy != null ? vacancy : VacancyLocalServiceUtil
				.getVacancy(id);
		final JSONObject object = new JSONObject();
		object.put("v_id", v.getV_id());
		object.put("v_name", v.getName());
		object.put("no_of_pos", v.getNo_of_positions());
		object.put("vacancy_status", v.getVacancy_status());
		object.put("jTitleId", v.getJobtitleId());
		object.put("jTitleName", JTitleLocalServiceUtil.getJTitle(v.getJobtitleId()).getTitle());
		object.put("subUnitId", v.getSubUnitId());
		if (v.getFileEntryId() != -1) {
			ThemeDisplay themeDisplay = (ThemeDisplay) request
					.getAttribute(WebKeys.THEME_DISPLAY);
			DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil
					.getDLFileEntry(v.getFileEntryId());

			FileEntry fEntry = DLAppServiceUtil.getFileEntry(
					dlFileEntry.getGroupId(), dlFileEntry.getFolderId(),
					dlFileEntry.getTitle());

			object.put("jd", DLUtil.getPreviewURL(fEntry,
					fEntry.getFileVersion(), themeDisplay, ""));
			object.put("jdFileName", fEntry.getTitle());
			object.put("jdId", fEntry.getFileEntryId());
		} else {
			object.put("jd", "-1");
		}
		final JSONArray empArr = new JSONArray();
		for (EmployeeVacancy employeeVacancy : EmployeeVacancyLocalServiceUtil
				.findByVacancy(v.getV_id())) {
			final Employee employee = EmployeeLocalServiceUtil
					.getEmployee(employeeVacancy.getEmployeeId());
			final JSONObject empObj = new JSONObject();
//			final String fullName = employee.getFirstname() + " "
//					+ employee.getMiddle_name() + " " + employee.getLastname();
			empObj.put("employeeId", employee.getEmployeeId());
//			empObj.put("name", fullName);
			empArr.put(empObj);
		}
		object.put("employees", empArr);
		return object;
	}

	private JSONObject createJTitleJSONObj(JTitle jTitle, Long id)
			throws PortalException, SystemException {
		final JTitle j = jTitle != null ? jTitle : JTitleLocalServiceUtil
				.getJTitle(id);
		final JSONObject object = new JSONObject();
		object.put("jTitleId", j.getJobtitleId());
		object.put("title", j.getTitle());
		object.put("description", j.getDescription());
		object.put("note", j.getNote());
		return object;
	}

	private JSONObject createLocationJSONObj(Location l, Long id)
			throws PortalException, SystemException {

		final Location location = l != null ? l : LocationLocalServiceUtil
				.getLocation(id);

		final JSONObject object = new JSONObject();

		object.put("locationId", location.getLocationId());
		object.put("name", location.getName());
		object.put("province", location.getCity());
		object.put("city", location.getCity());
		object.put("address", location.getAddress());
		object.put("zip_code", location.getZip_code());
		object.put("phone", location.getPhone());
		object.put("fax", location.getFax());
		object.put("note", location.getNote());
		return object;
	}

}
