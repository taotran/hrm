package vn.com.eco.taotv.portlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.CandidateServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;
import vn.com.ecopharma.hrm.util.JSONServiceUtil;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
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
		if (GET_ALL_CANDIDATES.equals(resourceRequestId)) {
			// map.put("aaData", findAllCandidates());
			// JSONServiceUtil.writeJSON(resourceResponse.getWriter(), map);
//			while (resourceRequest.getParameterNames().hasMoreElements()) {
//				String param = (String) resourceRequest.getAttributeNames().nextElement();
//				System.out.println(param);
//			}
			String[] columnNames = { "id", "first_name", "middle_name",
					"last_name" };
			JSONObject result = new JSONObject();
			JSONArray array = new JSONArray();

			int listDisplayAmount = 10;
			int start = 0;
			int column = 0;
			String direction = "asc";
			System.out.println(resourceRequest.getParameter("iDisplayStart"));
			int pageNo = ParamUtil.getInteger(resourceRequest, "iDisplayStart");
			int pageSize = ParamUtil.getInteger(resourceRequest,
					"iDisplayLength");
			int colIndex = ParamUtil.getInteger(resourceRequest, "iSortCol_0");
			String sortDirection = ParamUtil.getString(resourceRequest,
					"sSortDir_0");

			start = pageNo;
			if (start < 0) {
				start = 0;
			}

			listDisplayAmount = pageSize;
			if (listDisplayAmount < 10 || listDisplayAmount > 50) {
				listDisplayAmount = 10;
			}

			column = colIndex;
			if (column < 0 || column > 5)
				column = 0;
			
			if (sortDirection != null) {
				if (!sortDirection.equals("asc"))
					direction = "desc";
			}

			String colName = columnNames[column];
			int totalRecords = -1;
			totalRecords = CandidateLocalServiceUtil.countAll();
			int totalRecordsAfterSearch = totalRecords;
			List<Candidate> pagingCandidates;
			try {
				pagingCandidates = CandidateLocalServiceUtil.findCandidates(
						INITIAL, RECORD_SIZE);
				COLUMN_NAME = colName;
				DIRECTION = direction;
				INITIAL = start;
				RECORD_SIZE = listDisplayAmount;

				for (Candidate c : pagingCandidates) {
					JSONArray ja = new JSONArray();
					ja.put(c.getC_id());
					ja.put(c.getFirst_name());
					ja.put(c.getMiddle_name());
					ja.put(c.getLast_name());
					array.put(ja);
				}
				totalRecordsAfterSearch = pagingCandidates.size();
				result.put("iTotalRecords", totalRecords);
				result.put("iTotalDisplayRecords", totalRecordsAfterSearch);
				result.put("aaData", array);

				resourceResponse.getWriter().print(result);
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
				// verify c_id to check create/update action
				if (c_id == -1) {
					try {
						CandidateLocalServiceUtil.createCandidate(first_name,
								middle_name, last_name, email, contact_number,
								comment, 1,
								new Date(System.currentTimeMillis()), 1, "zzz",
								1, VacancyLocalServiceUtil.findAll());
					} catch (NoSuchVacancyException e) {
						e.printStackTrace();
					} catch (SystemException e) {
						e.printStackTrace();
					}
				} else {
					try {
						CandidateLocalServiceUtil.editCandidate(c_id,
								first_name, middle_name, last_name, email,
								contact_number, comment, 1,
								new Date(System.currentTimeMillis()), 1, "zzz",
								1, VacancyLocalServiceUtil.findAll());

					} catch (NoSuchVacancyException e) {
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
					final Candidate candidate = CandidateLocalServiceUtil
							.getCandidate(c_id);
					map.put("candidate", candidate);

					JSONServiceUtil
							.writeJSON(resourceResponse.getWriter(), map);

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

		}
		super.serveResource(resourceRequest, resourceResponse);
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
