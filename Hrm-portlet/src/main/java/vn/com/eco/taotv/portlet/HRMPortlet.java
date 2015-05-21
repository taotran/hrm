package vn.com.eco.taotv.portlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.CandidateServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;
import vn.com.ecopharma.hrm.service.persistence.CandidateUtil;
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

	private static final String GET_ALL_CANDIDATES = "get_all_candidates";
	private static final String SAVE_CANDIDATE = "saveCandidate";
	private static final String GET_CANDIDATE = "getCandidate";
	private static final String DELETE_CANDIDATES = "deleteCandidates";

	private static final String GET_ALL_VACANCIES = "get_all_vacancies";
	private static final String SAVE_VACANCY = "saveCandidate";
	private static final String GET_VACANCY = "getCandidate";
	private static final String DELETE_VACANCIES = "deleteCandidates";

	private String COLUMN_NAME;
	private String DIRECTION;
	private int INITIAL;
	private int RECORD_SIZE;
	private String ID_SEARCH, GLOB_SEARCH, VACANCY_SEARCH, FIRST_NAME_SEARCH,
			MIDDLE_NAME_SEARCH, LAST_NAME_SEARCH, EMAIL_SEARCH;

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		List<Vacancy> allVacancies = null;
		try {
			allVacancies = VacancyLocalServiceUtil.findAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		request.setAttribute("allVacancies",
				allVacancies != null ? allVacancies : new ArrayList<Vacancy>());
		super.render(request, response);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		final String resourceRequestId = resourceRequest.getResourceID();
		final Map<String, Object> map = new HashMap<String, Object>();
		String json = "";
		// All candidate resource actions
		/*
		 * if (GET_ALL_CANDIDATES.equals(resourceRequestId)) { //
		 * map.put("aaData", findAllCandidates()); //
		 * JSONServiceUtil.writeJSON(resourceResponse.getWriter(), map); //
		 * while (resourceRequest.getParameterNames().hasMoreElements()) { //
		 * String param = (String)
		 * resourceRequest.getAttributeNames().nextElement(); //
		 * System.out.println(param); // } String[] columnNames = { "id",
		 * "first_name", "middle_name", "last_name" }; JSONObject result = new
		 * JSONObject(); JSONArray array = new JSONArray();
		 * 
		 * int listDisplayAmount = 10; int start = 0; int column = 0; String
		 * direction = "asc"; int pageNo = ParamUtil.getInteger(resourceRequest,
		 * "iDisplayStart"); int pageSize =
		 * ParamUtil.getInteger(resourceRequest, "iDisplayLength"); int colIndex
		 * = ParamUtil.getInteger(resourceRequest, "iSortCol_0"); String
		 * sortDirection = ParamUtil.getString(resourceRequest, "sSortDir_0");
		 * 
		 * start = pageNo; if (start < 0) { start = 0; }
		 * 
		 * listDisplayAmount = pageSize; if (listDisplayAmount < 10 ||
		 * listDisplayAmount > 50) { listDisplayAmount = 10; }
		 * 
		 * column = colIndex; if (column < 0 || column > 5) column = 0;
		 * 
		 * if (sortDirection != null) { if (!sortDirection.equals("asc"))
		 * direction = "desc"; }
		 * 
		 * String colName = columnNames[column]; int totalRecords = -1;
		 * totalRecords = CandidateLocalServiceUtil.countAll();
		 * System.out.println("TOTAL RECORDS: " + totalRecords); int
		 * totalRecordsAfterSearch = totalRecords;
		 * 
		 * INITIAL = start; RECORD_SIZE = listDisplayAmount; List<Candidate>
		 * pagingCandidates; try { pagingCandidates =
		 * CandidateLocalServiceUtil.findCandidates( INITIAL, RECORD_SIZE);
		 * COLUMN_NAME = colName; DIRECTION = direction; INITIAL = start;
		 * RECORD_SIZE = listDisplayAmount; /* for (Candidate c :
		 * pagingCandidates) { JSONArray ja = new JSONArray();
		 * ja.put(c.getC_id()); //
		 * ja.put(VacancyLocalServiceUtil.getCandidateVacancies
		 * (c.getC_id()).get(0).getName()); ja.put(c.getFirst_name());
		 * ja.put(c.getMiddle_name()); ja.put(c.getLast_name()); array.put(ja);
		 * } totalRecordsAfterSearch = pagingCandidates.size();
		 * result.put("iTotalRecords", totalRecords);
		 * result.put("iTotalDisplayRecords", totalRecordsAfterSearch);
		 * result.put("aaData", array);
		 * 
		 * resourceResponse.getWriter().print(getCandidates(totalRecords,
		 * resourceRequest)); } catch (SystemException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		if (GET_ALL_CANDIDATES.equals(resourceRequestId)) {
			// map.put("aaData", findAllCandidates()); //
			// JSONServiceUtil.writeJSON(resourceResponse.getWriter(), map);
			System.out.println("INSIDE GET_ALL_CANDIDATES");
			int iTotalRecords; // total number of records (unfiltered)
			int iTotalDisplayRecords;// value will be set when code filters
										// companies by keyword
			JSONArray data = new JSONArray(); // data that will be shown in the
												// table

			GLOB_SEARCH = ParamUtil.getString(resourceRequest, "sSearch");
			FIRST_NAME_SEARCH = ParamUtil
					.getString(resourceRequest, "sSearch0");
			MIDDLE_NAME_SEARCH = ParamUtil.getString(resourceRequest,
					"sSearch_1");
			LAST_NAME_SEARCH = ParamUtil
					.getString(resourceRequest, "sSearch_2");
			EMAIL_SEARCH = ParamUtil.getString(resourceRequest, "sSearch_3");
			final int sortColumnIndex = ParamUtil.getInteger(resourceRequest,
					"iSortColumnIndex");
			final int sortDirection = ParamUtil.getString(resourceRequest,
					"sSortDirection").equals("asc") ? -1 : 1;
			String[] columnNames = { "_c_id", "_first_name", "_middle_name",
					"_last_name" };

			JSONObject jsonResult = new JSONObject();
			int listDisplayAmount = 10;
			int start = 0;
			int column = 0;
			String dir = "asc";
			String pageNo = resourceRequest.getParameter("iDisplayStart");
			String pageSize = resourceRequest.getParameter("iDisplayLength");
			String colIndex = resourceRequest.getParameter("iSortCol_0");
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
			int totalRecords = -1;

			try {
				totalRecords = CandidateLocalServiceUtil.findAll().size();
				List<Candidate> candidates = new ArrayList<Candidate>();
				for (Candidate c : CandidateLocalServiceUtil.findAll()) {

					if (c.getFirst_name().toLowerCase()
							.contains(GLOB_SEARCH.toLowerCase())
							|| c.getMiddle_name().toLowerCase()
									.contains(GLOB_SEARCH.toLowerCase())
							|| c.getLast_name().toLowerCase()
									.contains(GLOB_SEARCH.toLowerCase())) {
						candidates.add(c);
					}

				}

				/*
				 * Collections.sort(candidates, new Comparator<Candidate>() {
				 * 
				 * @Override public int compare(Candidate c1, Candidate c2) {
				 * switch (sortColumnIndex) { case 1: return
				 * c1.getFirst_name().compareTo( c2.getFirst_name())
				 * sortDirection; case 2: return c1.getMiddle_name().compareTo(
				 * c2.getMiddle_name()) sortDirection; case 3: return
				 * c1.getLast_name().compareTo( c2.getLast_name())
				 * sortDirection; } return 0; } });
				 */

				iTotalDisplayRecords = candidates.size();

				/*
				 * System.out.println("FILTER RESULT SIZE: " +
				 * CandidateLocalServiceUtil
				 * .filterCandidates(GLOB_SEARCH).size());
				 */

				// System.out.println(CandidateLocalServiceUtil.searchCandidates(0,"",
				// "", "", "",0, 2, null).size());

				if (candidates.size() < start + listDisplayAmount) {
					candidates = candidates.subList(start, candidates.size());
				} else {
					candidates = candidates.subList(start, start
							+ listDisplayAmount);
				}

				jsonResult.put("iTotalRecords", totalRecords);
				jsonResult.put("iTotalDisplayRecords", iTotalDisplayRecords);
				JSONArray array = new JSONArray();
				try {
					for (Candidate c : candidates) {
						JSONObject object = new JSONObject();
						object.put("c_id", c.getC_id());
						long v_id = CandidateLocalServiceUtil
								.findVacancyByCandidate(
										c.getC_id());
					
							object.put("vacancy", VacancyLocalServiceUtil.getVacancy(v_id).getName());
						
						// object.put("vacancy", "Tester");
						object.put("first_name", c.getFirst_name());
						object.put("middle_name", c.getMiddle_name());
						object.put("last_name", c.getLast_name());
						object.put("email", c.getLast_name());
						object.put("contact_number", c.getContact_number());
						object.put("date_of_application",
								c.getDate_of_application());
						object.put("status", "on doing");
						object.put("resume", "on doing");
						array.put(object);
					}
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				jsonResult.put("aaData", array);
				resourceResponse.getWriter().print(jsonResult);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (SAVE_CANDIDATE.equalsIgnoreCase(resourceRequestId)) {

			final BufferedReader br = new BufferedReader(new InputStreamReader(
					resourceRequest.getPortletInputStream()));
			if (br != null) {
				json = br.readLine();
				final JsonObject jObject = (JsonObject) new JsonParser()
						.parse(json);
				final long c_id = jObject.get("c_id").getAsLong();
				final String first_name = jObject.get("first_name")
						.getAsString();
				final String middle_name = jObject.get("middle_name")
						.getAsString();
				final String last_name = jObject.get("last_name").getAsString();
				final String contact_number = jObject.get("contact_number")
						.getAsString();
				final String comment = jObject.get("comment").getAsString();
				final String email = jObject.get("email").getAsString();
				final long v_id = jObject.get("vacancy").getAsLong();
				// verify c_id to check create/update action
				if (c_id == -1) {
					try {
						ServiceContext serviceContext = ServiceContextFactory
								.getInstance(Candidate.class.getName(),
										resourceRequest);
						CandidateLocalServiceUtil.createCandidate(
								serviceContext.getUserId(), first_name,
								middle_name, last_name, email, contact_number,
								comment, 1,
								new Date(System.currentTimeMillis()), 1, "zzz",
								1, Arrays.asList(VacancyLocalServiceUtil
										.getVacancy(v_id)), serviceContext);
					} catch (PortalException e) {

					} catch (SystemException e) {
						e.printStackTrace();
					}
				} else {
					try {
						CandidateLocalServiceUtil.editCandidate(c_id,
								first_name, middle_name, last_name, email,
								contact_number, comment, 1,
								new Date(System.currentTimeMillis()), 1, "zzz",
								1, Arrays.asList(VacancyLocalServiceUtil
										.getVacancy(v_id)));

					} catch (PortalException e) {
						e.printStackTrace();
					} catch (SystemException e) {
						e.printStackTrace();
					}
				}
				JSONServiceUtil.writeJSON(resourceResponse.getWriter(), map);
			}
		} else if (DELETE_CANDIDATES.equalsIgnoreCase(resourceRequestId)) {
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					resourceRequest.getPortletInputStream()));
			if (br != null) {
				json = br.readLine();
				final JsonArray jsonArr = (JsonArray) new JsonParser()
						.parse(json);

				for (int i = 0; i < jsonArr.size(); i++) {
					JsonObject jsonObject = (JsonObject) jsonArr.get(i);
					long id = jsonObject.get("c_id").getAsLong();
					CandidateLocalServiceUtil.delele(id);
				}
			}
			JSONServiceUtil.writeJSON(resourceResponse.getWriter(), map);
		} else if (GET_CANDIDATE.equalsIgnoreCase(resourceRequestId)) {
			final BufferedReader br = new BufferedReader(new InputStreamReader(
					resourceRequest.getPortletInputStream()));
			if (br != null) {
				json = br.readLine();
				JsonObject jsonObject = (JsonObject) new JsonParser()
						.parse(json);
				long c_id = jsonObject.get("c_id").getAsLong();
				try {
					final Candidate c = CandidateLocalServiceUtil
							.getCandidate(c_id);
					JSONObject object = new JSONObject();
					object.put("c_id", c.getC_id());
					object.put("first_name", c.getFirst_name());
					object.put("middle_name", c.getMiddle_name());
					object.put("last_name", c.getLast_name());
					// map.put("candidate", candidate);

					resourceResponse.getWriter().print(object);

				} catch (PortalException e) {
					e.printStackTrace();
				} catch (SystemException e) {
					e.printStackTrace();
				}
			}

		}

		// All vacancy resource actions
		if (GET_ALL_VACANCIES.equalsIgnoreCase(resourceRequestId)) {
			map.put("aaData", findAllVacancies());
			JSONServiceUtil.writeJSON(resourceResponse.getWriter(), map);
		} else if (SAVE_VACANCY.equalsIgnoreCase(resourceRequestId)) {

		} else if (DELETE_VACANCIES.equalsIgnoreCase(resourceRequestId)) {

		} else if (GET_VACANCY.equalsIgnoreCase(resourceRequestId)) {

		} else if ("uploadResume".equalsIgnoreCase(resourceRequestId)) {
			System.out.println("###INSIDE UPLOAD FILE");

			UploadPortletRequest uploadRequest = PortalUtil
					.getUploadPortletRequest(resourceRequest);
			String uploadFileName = uploadRequest
					.getFileName("addCandidate_resume");
			System.out.println(uploadFileName);
		}
		super.serveResource(resourceRequest, resourceResponse);
	}

	private JSONObject getCandidates(int totalRecords,
			ResourceRequest resourceRequest) {
		int totalAfterSearch = totalRecords;
		JSONObject result = new JSONObject();
		JSONArray array = new JSONArray();

		// ID_SEARCH = ParamUtil.getString(resourceRequest, "sSearch_0");
		GLOB_SEARCH = ParamUtil.getString(resourceRequest, "sSearch");
		FIRST_NAME_SEARCH = ParamUtil.getString(resourceRequest, "sSearch0");
		MIDDLE_NAME_SEARCH = ParamUtil.getString(resourceRequest, "sSearch_1");
		LAST_NAME_SEARCH = ParamUtil.getString(resourceRequest, "sSearch_2");
		EMAIL_SEARCH = ParamUtil.getString(resourceRequest, "sSearch_3");

		List<Candidate> foundCandidates = CandidateLocalServiceUtil
				.findCandidates(FIRST_NAME_SEARCH, MIDDLE_NAME_SEARCH,
						LAST_NAME_SEARCH, EMAIL_SEARCH, INITIAL, RECORD_SIZE);

		for (Candidate c : foundCandidates) {
			JSONArray ja = new JSONArray();
			ja.put(c.getC_id());
			// ja.put(VacancyLocalServiceUtil.getCandidateVacancies(c.getC_id()).get(0).getName());
			ja.put(c.getFirst_name());
			ja.put(c.getMiddle_name());
			ja.put(c.getLast_name());
			array.put(ja);
		}
		totalAfterSearch = foundCandidates.size();
		result.put("iTotalRecords", totalRecords);
		result.put("iTotalDisplayRecords", totalAfterSearch);
		result.put("aaData", array);

		return result;
	}

	private List<Candidate> findAllCandidates() {
		try {
			return CandidateServiceUtil.findAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	private List<Vacancy> findAllVacancies() {
		try {
			return VacancyLocalServiceUtil.findAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
}
