package vn.com.taotv.primefaces.modelView.item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.Country;
import com.liferay.portal.model.Region;
import com.liferay.portal.service.RegionServiceUtil;

/**
 * @author TaoTran
 *
 */
public class AddressObjectItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private long addressId;
	private String street1;
	private String street2;
	private String street3;
	private String city;
	private Region selectedRegion;
	private Region region;
	private List<Region> regions;
	private Country country;
	private boolean isNew;
	private boolean UIDeleted;

	public AddressObjectItem() {
		this.addressId = 0;
		this.street1 = "";
		this.street2 = "";
		this.street3 = "";
		this.city = null;
		this.region = null;
		this.country = null;
		this.UIDeleted = false;
		this.regions = new ArrayList<Region>();
		isNew = true;
	}

	public AddressObjectItem(Address address) {
		this.addressId = address.getAddressId();
		this.street1 = address.getStreet1();
		this.street2 = address.getStreet2();
		this.street3 = address.getStreet3();
		this.city = address.getCity();
		this.region = address.getRegion();
		this.country = address.getCountry();
		this.UIDeleted = false;
		try {
			this.regions = RegionServiceUtil.getRegions(country.getCountryId());
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getStreet3() {
		return street3;
	}

	public void setStreet3(String street3) {
		this.street3 = street3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Region getSelectedRegion() {
		return selectedRegion;
	}

	public void setSelectedRegion(Region selectedRegion) {
		this.selectedRegion = selectedRegion;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public boolean isUIDeleted() {
		return UIDeleted;
	}

	public void setUIDeleted(boolean uIDeleted) {
		UIDeleted = uIDeleted;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
}
