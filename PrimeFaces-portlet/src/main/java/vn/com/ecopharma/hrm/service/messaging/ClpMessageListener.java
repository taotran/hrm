package vn.com.ecopharma.hrm.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.CandidateServiceUtil;
import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.DistrictLocalServiceUtil;
import vn.com.ecopharma.hrm.service.DistrictServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeServiceUtil;
import vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalServiceUtil;
import vn.com.ecopharma.hrm.service.Employee_Titles_HistoryServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleServiceUtil;
import vn.com.ecopharma.hrm.service.LevelLocalServiceUtil;
import vn.com.ecopharma.hrm.service.LevelServiceUtil;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;
import vn.com.ecopharma.hrm.service.SubUnitServiceUtil;
import vn.com.ecopharma.hrm.service.TitlesLocalServiceUtil;
import vn.com.ecopharma.hrm.service.TitlesServiceUtil;
import vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil;
import vn.com.ecopharma.hrm.service.UniversityServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            CandidateLocalServiceUtil.clearService();

            CandidateServiceUtil.clearService();
            DistrictLocalServiceUtil.clearService();

            DistrictServiceUtil.clearService();
            EmployeeLocalServiceUtil.clearService();

            EmployeeServiceUtil.clearService();
            Employee_Titles_HistoryLocalServiceUtil.clearService();

            Employee_Titles_HistoryServiceUtil.clearService();
            JTitleLocalServiceUtil.clearService();

            JTitleServiceUtil.clearService();
            LevelLocalServiceUtil.clearService();

            LevelServiceUtil.clearService();
            SubUnitLocalServiceUtil.clearService();

            SubUnitServiceUtil.clearService();
            TitlesLocalServiceUtil.clearService();

            TitlesServiceUtil.clearService();
            UniversityLocalServiceUtil.clearService();

            UniversityServiceUtil.clearService();
        }
    }
}
