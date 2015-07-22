package vn.com.taotv.primefaces.modelView;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean(name = "jTitleBean")
@RequestScoped
public class JobTitleBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private JTitle jTitle;
	
	@PostConstruct
	public void init() {
		try {
			jTitle = JTitleLocalServiceUtil.createJTitle(CounterLocalServiceUtil.increment());
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	
	public void save() {
		try {
			JTitleLocalServiceUtil.addJTitle(jTitle);
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Create Job Title successfully", "Job Title "
							+ jTitle.getTitle() + " has been created");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	public void onCloseOrSave() {
		RequestContext context = RequestContext.getCurrentInstance();
		context.reset(":jTitleForm");
	}
	
	public JTitle getjTitle() {
		return jTitle;
	}

	public void setjTitle(JTitle jTitle) {
		this.jTitle = jTitle;
	}
}
