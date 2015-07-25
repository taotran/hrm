package vn.com.taotv.primefaces.modelView.item;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import vn.com.ecopharma.hrm.search.EmployeeField;

import com.liferay.portal.kernel.search.Document;

public class EmployeeIndexedItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String DATETIME_FORMAT = "yyyyMMddhhmmss";

	private Document employeeDocument;

	public EmployeeIndexedItem(Document employeeDocument) {
		this.employeeDocument = employeeDocument;
	}

	public Document getEmployeeDocument() {
		return employeeDocument;
	}

	public void setEmployeeDocument(Document employeeDocument) {
		this.employeeDocument = employeeDocument;
	}

	public Date getJoined_date() {
		final SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
		try {
			return sdf.parse(employeeDocument.getField(
					EmployeeField.JOINED_DATE).getValue());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Date getBirthday() {
		final SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
		try {
			return sdf.parse(employeeDocument.getField(
					EmployeeField.BIRTHDAY).getValue());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
