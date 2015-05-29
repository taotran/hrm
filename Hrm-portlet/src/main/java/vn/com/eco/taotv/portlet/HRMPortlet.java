package vn.com.eco.taotv.portlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import vn.com.ecopharma.hrm.constant.CandidateStatus;
import vn.com.ecopharma.hrm.constant.VacancyStatus;
import vn.com.ecopharma.hrm.exceptions.VacancyCandidateNotFoundException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.Interview;
import vn.com.ecopharma.hrm.model.InterviewSchedule;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Location;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewScheduleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.LocationLocalServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;
import vn.com.ecopharma.hrm.util.JSONServiceUtil;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class HRMPortlet
 */
public class HRMPortlet extends MVCPortlet {

	private static final String FILTER_DATE_FORMAT = "dd/MM/yyyy";
	private static final String SOURCE_DATE_FORMAT = "MM/dd/yyyy";

	private static final String GET_ALL_CANDIDATES = "get_all_candidates";
	private static final String SAVE_CANDIDATE = "saveCandidate";
	private static final String GET_CANDIDATE = "getCandidate";
	private static final String DELETE_CANDIDATES = "deleteCandidates";

	private static final String GET_ALL_VACANCIES = "get_all_vacancies";
	private static final String SAVE_VACANCY = "saveVacancy";
	private static final String GET_VACANCY = "getVacancy";
	private static final String DELETE_VACANCIES = "deleteVacancies";

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

	private String COLUMN_NAME;
	private String DIRECTION;
	private int C_INITIAL, V_INITIAL;
	private int C_RECORD_SIZE, V_RECORD_SIZE;
	private String ID_SEARCH, C_GLOB_SEARCH, VACANCY_SEARCH, FIRST_NAME_SEARCH,
			C_NAME_SEARCH, LAST_NAME_SEARCH, EMAIL_SEARCH, CONTACT_NO_SEARCH,
			C_STATUS;

	private String V_GLOB_SEARCH, NAME_SEARCH, JOB_TITLE_SEARCH,
			VACANCY_MAN_SEARCH, LOCATION_SEARCH, STATUS_SEARCH;

	@Override
	public void render(javax.portlet.RenderRequest request,
			javax.portlet.RenderResponse response) throws PortletException,
			IOException {
		// List<Vacancy> allVacancies = null;
		// List<JTitle> allJTitles = null;
		// try {
		// allVacancies = VacancyLocalServiceUtil.findAll();
		// allJTitles = JTitleLocalServiceUtil.findAll();
		// } catch (SystemException e) {
		// e.printStackTrace();
		// }
		// request.setAttribute("allVacancies",
		// allVacancies != null ? allVacancies : new ArrayList<Vacancy>());
		// request.setAttribute("allJTitles", allJTitles != null ? allJTitles
		// : new ArrayList<JTitle>());
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

			onGetCandidatesFormDataAJX(request, response, resourceRequestId);

			onGetVacanciesFormDataAJX(request, response, resourceRequestId);
			
			onGetInterviewScheduleFormDataAJX(request, response, resourceRequestId);

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
		if (GET_ALL_CANDIDATES.equals(resourceRequestId)) {
			int iTotalRecords; // total number of records (unfiltered)
			int iTotalDisplayRecords;// value will be set when code filters
										// companies by keyword

			C_GLOB_SEARCH = ParamUtil.getString(request, "sSearch");
			System.out.println("GLOB_SEARCH " + C_GLOB_SEARCH);
			VACANCY_SEARCH = ParamUtil.getString(request, "sSearch_1");
			C_NAME_SEARCH = ParamUtil.getString(request, "sSearch_2");
			EMAIL_SEARCH = ParamUtil.getString(request, "sSearch_3");
			CONTACT_NO_SEARCH = ParamUtil.getString(request, "sSearch_4");
			String START_DATE = ParamUtil.getString(request, "sSearch_5");
			String END_DATE = ParamUtil.getString(request, "sSearch_6");
			String C_STATUS = ParamUtil.getString(request, "sSearch_7");
			System.out.println("C_STATUS  " + C_STATUS);

			System.out.println("VACANCY_SEARCH  " + VACANCY_SEARCH);
			final int sortColumnIndex = ParamUtil.getInteger(request,
					"iSortColumnIndex");
			final int sortDirection = ParamUtil.getString(request,
					"sSortDirection").equals("asc") ? -1 : 1;
			String[] columnNames = { "_c_id", "_first_name", "_middle_name",
					"_last_name" };

			JSONObject jsonResult = new JSONObject();
			int listDisplayAmount = 10;
			int start = 0;
			int column = 0;
			String dir = "asc";
			String pageNo = request.getParameter("iDisplayStart");
			String pageSize = request.getParameter("iDisplayLength");
			String colIndex = request.getParameter("iSortCol_0");
			// String sortDirection =
			// resourceRequest.getParameter("sSortDir_0");

			if (pageNo != null) {
				start = Integer.parseInt(pageNo);
				if (start < 0) {
					start = 0;
				}
			}
			if (pageSize != null) {
				listDisplayAmount = Integer.parseInt(pageSize);
				if (listDisplayAmount < 10 || listDisplayAmount > 50) {
					listDisplayAmount = 10;
				}
			}
			if (colIndex != null) {
				column = Integer.parseInt(colIndex);
				if (column < 0 || column > 5)
					column = 0;
			}
			/*
			 * if (sortDirection != null) { if (!sortDirection.equals("asc"))
			 * dir = "desc"; }
			 */

			String colName = columnNames[column];

			iTotalRecords = CandidateLocalServiceUtil.findAll().size();
			List<Candidate> filteredCandidates = new ArrayList<Candidate>();
			for (Candidate c : CandidateLocalServiceUtil.findAll()) {
				String fullName = c.getFullName();
				VacancyCandidate vc = VacancyCandidateLocalServiceUtil
						.findByCandidate(c.getC_id());
				String v_name = "";
				if (vc != null) {
					long v_id = VacancyCandidateLocalServiceUtil
							.findByCandidate(c.getC_id()).getV_id();
					v_name = VacancyLocalServiceUtil.getVacancy(v_id).getName();
				}
				if (fullName.toLowerCase()
						.contains(C_GLOB_SEARCH.toLowerCase())
						|| c.getEmail().toLowerCase()
								.contains(C_GLOB_SEARCH.toLowerCase())
						|| c.getContact_number().toLowerCase()
								.contains(C_GLOB_SEARCH.toLowerCase())
						|| v_name.toLowerCase().contains(C_GLOB_SEARCH)) {
					if (v_name.toLowerCase().contains(
							VACANCY_SEARCH.toLowerCase())) {
						if (fullName.toLowerCase().contains(
								C_NAME_SEARCH.toLowerCase())) {
							if (c.getEmail().toLowerCase()
									.contains(EMAIL_SEARCH.toLowerCase())) {
								if (c.getContact_number()
										.toLowerCase()
										.contains(
												CONTACT_NO_SEARCH.toLowerCase())) {
									/*
									 * final SimpleDateFormat sdf = new
									 * SimpleDateFormat( FILTER_DATE_FORMAT);
									 * SimpleDateFormat sourceSdf = new
									 * SimpleDateFormat(SOURCE_DATE_FORMAT);
									 * 
									 * String convertedDate = sdf.format(c
									 * .getDate_of_application());
									 * java.util.Date cDate = sdf
									 * .parse(convertedDate); if (START_DATE !=
									 * null && !START_DATE.equalsIgnoreCase("")
									 * && !START_DATE.equalsIgnoreCase("~")) {
									 * StringBuilder sb = new
									 * StringBuilder(START_DATE);
									 * sb.deleteCharAt(START_DATE.length()-1);
									 * START_DATE = sb.toString();
									 * System.out.println(START_DATE); //String
									 * s = sourceSdf.format(START_DATE);
									 * java.util.Date fDate = sdf
									 * .parse(sdf.format
									 * (sourceSdf.parse(START_DATE)));
									 * System.out.println("DATE RANGE FILTER : "
									 * + fDate + "    " + cDate); if (END_DATE
									 * != null &&
									 * !END_DATE.equalsIgnoreCase("")) {
									 * java.util.Date tDate = sdf
									 * .parse(sdf.format
									 * (sourceSdf.parse(END_DATE))); if
									 * (cDate.after(fDate) &&
									 * cDate.before(tDate)) {
									 * filteredCandidates.add(c); } } else { if
									 * (cDate.after(fDate)) {
									 * filteredCandidates.add(c); } }
									 * 
									 * } else { if (END_DATE != null &&
									 * !END_DATE.equalsIgnoreCase("")) {
									 * java.util.Date tDate = sdf
									 * .parse(END_DATE); if
									 * (cDate.before(tDate)) {
									 * filteredCandidates.add(c); } } else {
									 * filteredCandidates.add(c); } }
									 */
									if (c.getCandidate_status().toLowerCase()
											.contains(C_STATUS)) {
										filteredCandidates.add(c);
									}

								}

							}
						}
					}

				}

			}

			/*
			 * Collections.sort(filteredCandidates, new Comparator<Candidate>()
			 * {
			 * 
			 * @Override public int compare(Candidate c1, Candidate c2) { switch
			 * (sortColumnIndex) { case 2: return c1.getFirst_name().compareTo(
			 * c2.getFirst_name()) sortDirection; case 3: return
			 * c1.getEmail().compareTo( c2.getEmail()) sortDirection; case 4:
			 * return c1.getContact_number() .compareTo( c2.getContact_number())
			 * sortDirection; } return 0; } });
			 */

			iTotalDisplayRecords = filteredCandidates.size();

			if (filteredCandidates.size() < start + listDisplayAmount) {
				filteredCandidates = filteredCandidates.subList(start,
						filteredCandidates.size());
			} else {
				filteredCandidates = filteredCandidates.subList(start, start
						+ listDisplayAmount);
			}

			jsonResult.put("iTotalRecords", iTotalRecords);
			jsonResult.put("iTotalDisplayRecords", iTotalDisplayRecords);
			JSONArray array = new JSONArray();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			for (Candidate c : filteredCandidates) {
				JSONObject object = new JSONObject();
				object.put("c_id", c.getC_id());
				VacancyCandidate vc = VacancyCandidateLocalServiceUtil
						.findByCandidate(c.getC_id());
				if (vc != null) {
					long v_id = VacancyCandidateLocalServiceUtil
							.findByCandidate(c.getC_id()).getV_id();
					object.put("vacancy",
							VacancyLocalServiceUtil.getVacancy(v_id).getName());
					object.put("vacancyId", v_id);
				} else {
					object.put("vacancy", "");
					object.put("vacancyId", -1);
				}

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

					object.put("availableStatuses", statuses);
				}
				object.put("resume", "on doing");
				array.put(object);
			}

			jsonResult.put("aaData", array);
			// Thread.sleep(1000);

			response.getWriter().print(jsonResult);

		} else if (SAVE_CANDIDATE.equalsIgnoreCase(resourceRequestId)) {

			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			if (br != null) {
				String json = br.readLine();
				final JsonObject jObject = (JsonObject) new JsonParser()
						.parse(json);
				// final long c_id = jObject.get("c_id").getAsLong();
				final String first_name = jObject.get("first_name")
						.getAsString();
				final String middle_name = jObject.get("middle_name")
						.getAsString();
				final String last_name = jObject.get("last_name").getAsString();
				final String contact_number = jObject.get("contact_number")
						.getAsString();
				final String comment = jObject.get("comment").getAsString();
				final String email = jObject.get("email").getAsString();

				final Long v_id = jObject.get("vacancy").getAsLong() != -1 ? jObject
						.get("vacancy").getAsLong() : null;
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				final java.util.Date date_of_application = sdf.parse(jObject
						.get("date_of_application").getAsString());
				// verify c_id to check create/update action
				ServiceContext serviceContext = ServiceContextFactory
						.getInstance(Candidate.class.getName(), request);
				if (jObject.get("c_id").getAsLong() == -1) {
					CandidateLocalServiceUtil.create(
							serviceContext.getUserId(), first_name,
							middle_name, last_name, email, contact_number,
							comment, 1,
							new Date(date_of_application.getTime()), 1, "zzz",
							1, v_id, serviceContext);
				} else {
					CandidateLocalServiceUtil.edit(serviceContext.getUserId(),
							jObject.get("c_id").getAsLong(), first_name,
							middle_name, last_name, email, contact_number,
							comment, 1,
							new Date(date_of_application.getTime()), 1, "zzz",
							1, v_id, serviceContext);

				}
				JSONServiceUtil.writeJSON(response.getWriter(), map);
			}
		} else if (DELETE_CANDIDATES.equalsIgnoreCase(resourceRequestId)) {
			deleteEntityServeResource(request, response.getWriter(), "c_id");
		} else if (GET_CANDIDATE.equalsIgnoreCase(resourceRequestId)) {
			find_ResponseEntityServeResource(request, response.getWriter(),
					"c_id");
		}
	}

	private void onVacancyServeResourceAction(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws PortalException, SystemException, IOException {
		// ALL VACANCY RESOURCE ACTIONS
		if (GET_ALL_VACANCIES.equalsIgnoreCase(resourceRequestId)) {
			int iTotalRecords = 0;
			int iTotalDisplayRecords = 0;
			int start = 0;
			int listDisplayAmount = 10;

			List<Vacancy> filteredVacancies = new ArrayList<Vacancy>();
			System.out.println("INSIDE GET_ALL_VACANCIES");
			List<Vacancy> vacancies = findAllVacancies();
			iTotalRecords = vacancies.size();

			V_GLOB_SEARCH = ParamUtil.getString(request, "sSearch");
			NAME_SEARCH = ParamUtil.getString(request, "sSearch_1");
			JOB_TITLE_SEARCH = ParamUtil.getString(request, "sSearch_2");
			LOCATION_SEARCH = ParamUtil.getString(request, "sSearch_4");
			STATUS_SEARCH = ParamUtil.getString(request, "sSearch_5");
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
				if (listDisplayAmount < 10 || listDisplayAmount > 50) {
					listDisplayAmount = 10;
				}
			}

			// filter
			for (Vacancy v : vacancies) {
				final String jTitle = JTitleLocalServiceUtil.getJTitle(
						v.getJobtitleId()).getTitle();
				if (v.getName().toLowerCase().contains(V_GLOB_SEARCH)
						|| jTitle.toLowerCase().contains(V_GLOB_SEARCH)) {
					if (v.getName().toLowerCase()
							.contains(NAME_SEARCH.toLowerCase())) {
						if (JOB_TITLE_SEARCH != null
								&& jTitle.toLowerCase().contains(
										JOB_TITLE_SEARCH.toLowerCase())) {
							filteredVacancies.add(v);
						}
					}
				}
			}
			iTotalDisplayRecords = filteredVacancies.size();

			// paging

			if (filteredVacancies.size() < start + listDisplayAmount) {
				filteredVacancies = filteredVacancies.subList(start,
						filteredVacancies.size());
			} else {
				filteredVacancies = filteredVacancies.subList(start, start
						+ listDisplayAmount);
			}

			JSONObject jsonResult = new JSONObject();
			jsonResult.put("iTotalRecords", iTotalRecords);
			jsonResult.put("iTotalDisplayRecords", iTotalDisplayRecords);
			JSONArray array = new JSONArray();
			for (Vacancy v : filteredVacancies) {
				JSONObject object = new JSONObject();
				object.put("v_id", v.getV_id());
				object.put("vacancy_name", v.getName());
				object.put("job_title",
						JTitleLocalServiceUtil.getJTitle(v.getJobtitleId())
								.getTitle());
				object.put("hiring_manager", v.getHiring_manager_id());
				object.put("location", LocationLocalServiceUtil
						.getLocationNameById(v.getLocationId()));
				object.put("status", v.getVacancy_status());
				final JSONArray availableStatuses = new JSONArray();
				for (VacancyStatus vs : VacancyStatus
						.getAvailableStatuses(VacancyStatus.valueOf(v
								.getVacancy_status()))) {
					availableStatuses.put(vs.toString());
				}

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

			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			if (br != null) {
				String json = br.readLine();
				System.out.println("PARSED OBJ" + json);
				final JsonObject jObject = (JsonObject) new JsonParser()
						.parse(json);
				final long v_id = jObject.get("v_id").getAsLong();
				final long jTitleId = jObject.get("jTitleId").getAsLong();
				final long hiring_manager_id = jObject.get("hiring_manager_id")
						.getAsLong();
				final String name = jObject.get("v_name").getAsString();
				final String description = jObject.get("description")
						.getAsString();
				final int no_of_pos = jObject.get("no_of_positions").getAsInt();
				/*
				 * final String vacancy_status = jObject.get(
				 * "vacancy_status").getAsString();
				 */
				final String job_posting = jObject.get("job_posting")
						.getAsString();
				// verify c_id to check create/update action
				if (v_id == -1) {
					ServiceContext serviceContext = ServiceContextFactory
							.getInstance(Candidate.class.getName(), request);
					VacancyLocalServiceUtil.create(serviceContext.getUserId(),
							jTitleId, hiring_manager_id, name, description,
							no_of_pos, VacancyStatus.NEW.toString(),
							serviceContext);

				} else {
					VacancyLocalServiceUtil.edit(v_id, jTitleId,
							hiring_manager_id, name, description, no_of_pos);

				}
				List<Vacancy> vacancies = VacancyLocalServiceUtil.findAll();
				JSONArray vArr = new JSONArray();
				for (Vacancy v : vacancies) {
					vArr.put(createVacancyJSONObj(v, null));
				}
				response.getWriter().print(vArr);
			}

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
			System.out.println(uploadFileName);
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
			System.out.println("GLOB_SEARCH :" + C_GLOB_SEARCH);
			JSONObject jsonResult = new JSONObject();
			JSONArray array = new JSONArray();
			for (Vacancy v : vacancies) {
				JSONObject object = new JSONObject();
				object.put("v_id", v.getV_id());
				object.put("vacancy_name", v.getName());
				object.put("job_title", v.getJobtitleId());
				object.put("hiring_manager", v.getHiring_manager_id());
				object.put("location", "on doing");
				object.put("status", "on doing");
				array.put(object);
			}

			jsonResult.put("aaData", array);
			response.getWriter().print(jsonResult);

		} else if (SAVE_JOB_TITLE.equalsIgnoreCase(resourceRequestId)) {
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			if (br != null) {
				String json = br.readLine();
				final JsonObject jObject = (JsonObject) new JsonParser()
						.parse(json);
				final long jTitleId = jObject.get("jTitleId").getAsLong();
				final String title = jObject.get("title").getAsString();
				final String desc = jObject.get("description").getAsString();
				final String note = jObject.get("note").getAsString();

				try {
					// verify jTitleId to check create/update action
					ServiceContext serviceContext = ServiceContextFactory
							.getInstance(JTitle.class.getName(), request);
					if (jTitleId == -1) {

						JTitleLocalServiceUtil.create(
								serviceContext.getUserId(),
								serviceContext.getScopeGroupId(), title, desc,
								note, false, serviceContext);
					} else {
						JTitleLocalServiceUtil.edit(serviceContext.getUserId(),
								serviceContext.getScopeGroupId(), jTitleId,
								title, desc, note, false, serviceContext);

					}
					JSONArray jTitleArr = new JSONArray();
					for (JTitle j : JTitleLocalServiceUtil.findAll()) {
						jTitleArr.put(createJTitleJSONObj(j, null));
					}
					System.out.println(jTitleArr);
					response.getWriter().print(jTitleArr);

				} catch (PortalException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}

			}
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
			System.out.println(uploadFileName);
		} else if ("loadJTitles".equalsIgnoreCase(resourceRequestId)) {
			// get list of JTitle names for JTitleSelect
			JSONArray jTitleNamesArr = new JSONArray();
			for (JTitle j : JTitleLocalServiceUtil.findAll()) {
				jTitleNamesArr.put(j.getTitle());
			}
			System.out.println(jTitleNamesArr);
			response.getWriter().print(jTitleNamesArr);
		} else if ("candidateStatusChange".equalsIgnoreCase(resourceRequestId)) {
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			if (br != null) {
				String json = br.readLine();
				JsonObject jsonObject = (JsonObject) new JsonParser()
						.parse(json);
				long id = jsonObject.get("c_id").getAsLong();
				String changedStatus = jsonObject.get("changedStatus")
						.getAsString();
				Candidate candidate = CandidateLocalServiceUtil
						.getCandidate(id);
				candidate.setCandidate_status(changedStatus);
				CandidateLocalServiceUtil.updateCandidate(candidate);
				response.getWriter().print("");
				response.getWriter().flush();
			}

		} else if ("vacancyStatusChange".equalsIgnoreCase(resourceRequestId)) {
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			if (br != null) {
				String json = br.readLine();
				JsonObject jsonObject = (JsonObject) new JsonParser()
						.parse(json);
				long id = jsonObject.get("v_id").getAsLong();
				String changedStatus = jsonObject.get("changedStatus")
						.getAsString();
				Vacancy vacancy = VacancyLocalServiceUtil.getVacancy(id);
				vacancy.setVacancy_status(changedStatus);
				VacancyLocalServiceUtil.updateVacancy(vacancy);
				response.getWriter().print("");
				response.getWriter().flush();
			}
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
			System.out.println(array);
			response.getWriter().print(array);
		} else if (SAVE_INTERVIEW.equalsIgnoreCase(resourceRequestId)) {
			System.out.println("SAVE_INTERVIEW");
			final ServiceContext context = ServiceContextFactory
					.getInstance(request);
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			if (br != null) {
				String json = br.readLine();
				final JsonObject jObject = (JsonObject) new JsonParser()
						.parse(json);
				final String name = jObject.get("name").getAsString();
				InterviewLocalServiceUtil.create(context.getUserId(), name,
						context);
			}
		}
	}

	private void onLocationServeResourceActions(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException, SystemException, PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Location.class.getName(), request);
		if (SAVE_LOCATION.equalsIgnoreCase(resourceRequestId)) {
			System.out.println("inside " + resourceRequestId);
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			final String json;
			if (br != null) {
				json = br.readLine();
				final JsonObject obj = (JsonObject) new JsonParser()
						.parse(json);

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
	}

	private void onInterviewScheduleServeResourceActions(
			ResourceRequest request, ResourceResponse response,
			String resourceRequestId) throws IOException, SystemException,
			PortalException, ParseException, VacancyCandidateNotFoundException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				InterviewSchedule.class.getName(), request);
		long userId = serviceContext.getUserId();
		if (SAVE_INTERVIEW_SCHEDULE.equalsIgnoreCase(resourceRequestId)) {
			System.out.println("inside " + resourceRequestId);
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					request.getPortletInputStream()));
			final String json;
			if (br != null) {
				json = br.readLine();
				final JsonObject object = (JsonObject) new JsonParser()
						.parse(json);
				final SimpleDateFormat sdf = new SimpleDateFormat(
						FILTER_DATE_FORMAT);
				final long interviewId = object.get("interviewId").getAsLong();
				final long candidateId = object.get("candidateId").getAsLong();
				final long vacancyId = object.get("vacancyId").getAsLong();
				final Date interviewDate = new Date(sdf.parse(
						object.get("itvDate").getAsString()).getTime());
				final String itvTimeFrom = object.get("itvTimeFrom")
						.getAsString();
				final String itvTimeTo = object.get("itvTimeTo").getAsString();
				final String interviewTime = itvTimeFrom + "_" + itvTimeTo;
				final List<Long> emps = new ArrayList<Long>();
				InterviewScheduleLocalServiceUtil.create(interviewId,
						vacancyId, candidateId, emps, interviewDate,
						interviewTime, userId, serviceContext);
				response.getWriter().print(new JSONObject());
			}
		}
	}

	private void onGetCandidatesFormDataAJX(ResourceRequest request,
			ResourceResponse response, String resourceRequestId)
			throws IOException {

		if ("getCandidatesFormDataAJX".equalsIgnoreCase(resourceRequestId)) {
			System.out.println("getCandidatesFormDataAJX....");
			List<Vacancy> vacancies = findAllVacancies();
			JSONArray array = new JSONArray();
			for (Vacancy v : vacancies) {
				JSONObject object = new JSONObject();
				object.put("v_id", v.getV_id());
				object.put("vacancy_name", v.getName());
				array.put(object);
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
			result.put("locations", lArray);
			result.put("jTitles", jArray);
			System.out.println(result);
			response.getWriter().print(result);
		}
	}

	private void onGetInterviewScheduleFormDataAJX(ResourceRequest request,
			ResourceResponse response, String resourceRequestId) throws IOException, SystemException, JSONException {
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
				object.put("employeeName", e.getFirstname() + e.getMiddle_name() + e.getLastname());
				eArray.put(object);
			}
			result.put("interviews", iArray);
			result.put("employees", eArray);
			response.getWriter().print(result);
		}
	}

	private List<Vacancy> findAllVacancies() {
		try {
			return VacancyLocalServiceUtil.findAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
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
						List<VacancyCandidate> vacancyCandidatesByVacancy = VacancyCandidateLocalServiceUtil
								.findByVacancy(id);
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
				result = createCandidateJSONObj(null, id);
			} else if (entityId.equalsIgnoreCase("v_id")) {
				result = createVacancyJSONObj(null, id);
			} else if (entityId.equalsIgnoreCase("j_id")) {
				result = createJTitleJSONObj(null, id);
			}
			writer.print(result);
			writer.flush();
		}
	}

	private JSONObject createCandidateJSONObj(Candidate candidate, Long id)
			throws PortalException, SystemException {
		final Candidate c = candidate != null ? candidate
				: CandidateLocalServiceUtil.getCandidate(id);
		JSONObject object = new JSONObject();
		object.put("c_id", c.getC_id());
		object.put("email", c.getEmail());
		object.put("first_name", c.getFirst_name());
		object.put("middle_name", c.getMiddle_name());
		object.put("last_name", c.getLast_name());
		object.put("contact_number", c.getContact_number());
		SimpleDateFormat sdf = new SimpleDateFormat(FILTER_DATE_FORMAT);
		object.put("date_of_application",
				sdf.format(c.getDate_of_application()));
		VacancyCandidate vc = VacancyCandidateLocalServiceUtil
				.findByCandidate(c.getC_id());
		if (vc != null) {
			long v_id = VacancyCandidateLocalServiceUtil.findByCandidate(
					c.getC_id()).getV_id();
			object.put("v_id", v_id);
			object.put("vacancy", VacancyLocalServiceUtil.getVacancy(v_id)
					.getName());
		} else {
			object.put("v_id", -1);
			object.put("vacancy", "");
		}
		return object;
	}

	private JSONObject createVacancyJSONObj(Vacancy vacancy, Long id)
			throws PortalException, SystemException {
		final Vacancy v = vacancy != null ? vacancy : VacancyLocalServiceUtil
				.getVacancy(id);
		JSONObject object = new JSONObject();
		object.put("v_id", v.getV_id());
		object.put("v_name", v.getName());
		object.put("hiring_managers", v.getHiring_manager_id());
		object.put("no_of_pos", v.getNo_of_positions());
		object.put("vacancy_status", v.getVacancy_status());
		object.put("jTitleId", v.getJobtitleId());
		object.put("job_posting", "JOB POSTING....");
		return object;
	}

	private JSONObject createJTitleJSONObj(JTitle jTitle, Long id)
			throws PortalException, SystemException {
		final JTitle j = jTitle != null ? jTitle : JTitleLocalServiceUtil
				.getJTitle(id);
		JSONObject object = new JSONObject();
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

		JSONObject object = new JSONObject();

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
