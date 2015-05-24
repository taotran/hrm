package vn.com.ecopharma.hrm.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.CandidateServiceUtil;
import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.FileAttachmentLocalServiceUtil;
import vn.com.ecopharma.hrm.service.FileAttachmentServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleServiceUtil;
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
            FileAttachmentLocalServiceUtil.clearService();

            FileAttachmentServiceUtil.clearService();
            InterviewLocalServiceUtil.clearService();

            InterviewServiceUtil.clearService();
            JTitleLocalServiceUtil.clearService();

            JTitleServiceUtil.clearService();
            VacancyLocalServiceUtil.clearService();

            VacancyServiceUtil.clearService();
        }
    }
}
