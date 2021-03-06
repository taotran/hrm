package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;

/**
 * The extended model base implementation for the Vacancy service. Represents a row in the &quot;HRM_Recruitment_Vacancy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VacancyImpl}.
 * </p>
 *
 * @author tvt
 * @see VacancyImpl
 * @see vn.com.ecopharma.hrm.model.Vacancy
 * @generated
 */
public abstract class VacancyBaseImpl extends VacancyModelImpl
    implements Vacancy {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a vacancy model instance should use the {@link Vacancy} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            VacancyLocalServiceUtil.addVacancy(this);
        } else {
            VacancyLocalServiceUtil.updateVacancy(this);
        }
    }
}
