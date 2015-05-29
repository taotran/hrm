package vn.com.ecopharma.hrm.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.CandidateServiceUtil;
import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.EmployeeServiceUtil;
import vn.com.ecopharma.hrm.service.FileAttachmentLocalServiceUtil;
import vn.com.ecopharma.hrm.service.FileAttachmentServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewScheduleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewScheduleServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleServiceUtil;
import vn.com.ecopharma.hrm.service.LocationLocalServiceUtil;
import vn.com.ecopharma.hrm.service.LocationServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyCandidateServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;
import vn.com.ecopharma.hrm.service.VacancyServiceUtil;


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
            EmployeeLocalServiceUtil.clearService();

            EmployeeServiceUtil.clearService();
            EmployeeInterviewScheduleLocalServiceUtil.clearService();

            EmployeeInterviewScheduleServiceUtil.clearService();
            FileAttachmentLocalServiceUtil.clearService();

            FileAttachmentServiceUtil.clearService();
            InterviewLocalServiceUtil.clearService();

            InterviewServiceUtil.clearService();
            InterviewScheduleLocalServiceUtil.clearService();

            InterviewScheduleServiceUtil.clearService();
            JTitleLocalServiceUtil.clearService();

            JTitleServiceUtil.clearService();
            LocationLocalServiceUtil.clearService();

            LocationServiceUtil.clearService();
            VacancyLocalServiceUtil.clearService();

            VacancyServiceUtil.clearService();
            VacancyCandidateLocalServiceUtil.clearService();

            VacancyCandidateServiceUtil.clearService();
        }
    }
}
