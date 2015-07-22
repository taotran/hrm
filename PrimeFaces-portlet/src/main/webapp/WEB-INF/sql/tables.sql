create table pf_Candidate (
	c_id LONG not null primary key,
	first_name VARCHAR(75) null,
	middle_name VARCHAR(75) null,
	last_name VARCHAR(75) null,
	email VARCHAR(75) null,
	contact_number VARCHAR(75) null,
	comment_ VARCHAR(75) null
);

create table pf_District (
	districtId LONG not null primary key,
	name VARCHAR(75) null,
	regionId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table pf_Employee (
	employeeId LONG not null primary key,
	emp_code VARCHAR(75) null,
	contact_number VARCHAR(75) null,
	birthday DATE null,
	jobtitleId LONG,
	joined_date DATE null,
	subUnitId LONG,
	titlesId LONG,
	levelId LONG,
	promoted_date DATE null,
	labour_contract_signed_date DATE null,
	labour_contract_expired_date DATE null,
	labour_contract_type VARCHAR(75) null,
	gender VARCHAR(75) null,
	place_of_birth VARCHAR(75) null,
	education VARCHAR(75) null,
	education_specialize VARCHAR(75) null,
	universityId LONG,
	marital_status VARCHAR(75) null,
	identityCardNo VARCHAR(75) null,
	issued_date DATE null,
	issued_place VARCHAR(75) null,
	addressId LONG,
	company_email VARCHAR(75) null,
	personal_tax_code VARCHAR(75) null,
	number_of_dependents INTEGER,
	dependent_names VARCHAR(75) null,
	social_insurance_no VARCHAR(75) null,
	health_insurance_no VARCHAR(75) null,
	bank_account_no VARCHAR(75) null,
	bank_branch_name VARCHAR(75) null,
	base_wage_rates DOUBLE,
	position_wage_rates DOUBLE,
	capacity_salary DOUBLE,
	total_salary DOUBLE,
	bonus DOUBLE,
	resigned_date DATE null,
	employee_userId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	isDeleted BOOLEAN,
	companyEmailAddress VARCHAR(75) null
);

create table pf_Employee_Titles (
	employee_TitlesId LONG not null primary key,
	employeeId LONG,
	titlesId LONG,
	set_date DATE null,
	note VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table pf_Employee_Titles_History (
	employee_Titles_HistoryId LONG not null primary key,
	employeeId LONG,
	titlesId LONG,
	set_date DATE null,
	note VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table pf_JTitle (
	jobtitleId LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	note VARCHAR(75) null,
	isDeleted BOOLEAN,
	userId LONG,
	groupId LONG
);

create table pf_Level (
	levelId LONG not null primary key,
	name VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table pf_SubUnit (
	subUnitId LONG not null primary key,
	name VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table pf_Titles (
	titlesId LONG not null primary key,
	name VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table pf_University (
	universityId LONG not null primary key,
	name VARCHAR(75) null,
	code_ VARCHAR(75) null,
	tel_fax VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);