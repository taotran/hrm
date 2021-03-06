package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.EmployeeVacancy;
import vn.com.ecopharma.hrm.service.EmployeeVacancyLocalServiceUtil;

/**
 * The extended model base implementation for the EmployeeVacancy service. Represents a row in the &quot;HRM_Recruitment_EmployeeVacancy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeVacancyImpl}.
 * </p>
 *
 * @author tvt
 * @see EmployeeVacancyImpl
 * @see vn.com.ecopharma.hrm.model.EmployeeVacancy
 * @generated
 */
public abstract class EmployeeVacancyBaseImpl extends EmployeeVacancyModelImpl
    implements EmployeeVacancy {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a employee vacancy model instance should use the {@link EmployeeVacancy} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeVacancyLocalServiceUtil.addEmployeeVacancy(this);
        } else {
            EmployeeVacancyLocalServiceUtil.updateEmployeeVacancy(this);
        }
    }
}
