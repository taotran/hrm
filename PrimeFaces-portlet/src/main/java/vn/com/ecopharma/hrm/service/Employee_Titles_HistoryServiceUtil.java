package vn.com.ecopharma.hrm.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Employee_Titles_History. This utility wraps
 * {@link vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author tvt
 * @see Employee_Titles_HistoryService
 * @see vn.com.ecopharma.hrm.service.base.Employee_Titles_HistoryServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryServiceImpl
 * @generated
 */
public class Employee_Titles_HistoryServiceUtil {
    private static Employee_Titles_HistoryService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static Employee_Titles_HistoryService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Employee_Titles_HistoryService.class.getName());

            if (invokableService instanceof Employee_Titles_HistoryService) {
                _service = (Employee_Titles_HistoryService) invokableService;
            } else {
                _service = new Employee_Titles_HistoryServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Employee_Titles_HistoryServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Employee_Titles_HistoryService service) {
    }
}
