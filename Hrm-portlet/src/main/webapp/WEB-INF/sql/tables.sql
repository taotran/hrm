create table HRM_Candidate (
	c_id LONG not null primary key,
	first_name VARCHAR(75) null,
	middle_name VARCHAR(75) null,
	last_name VARCHAR(75) null,
	email VARCHAR(75) null,
	contact_number VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	mode_of_application INTEGER,
	date_of_application DATE null,
	cv_file_id LONG,
	cv_text_version VARCHAR(75) null,
	keywords VARCHAR(75) null,
	added_person INTEGER,
	user_id LONG,
	group_id LONG,
	interviewId LONG
);

create table HRM_FileAttachment (
	f_id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	c_id LONG,
	name VARCHAR(75) null,
	file_type VARCHAR(75) null,
	size_ LONG,
	content VARCHAR(75) null,
	attachment_type VARCHAR(75) null
);

create table HRM_Interview (
	interviewId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null
);

create table HRM_JTitle (
	jobtitleId LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	note VARCHAR(75) null,
	isDeleted BOOLEAN,
	user_id LONG,
	group_id LONG
);

create table HRM_Recruitment_Candidate (
	c_id LONG not null primary key,
	first_name VARCHAR(200) null,
	middle_name VARCHAR(75) null,
	last_name VARCHAR(75) null,
	email VARCHAR(75) null,
	contact_number VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	mode_of_application INTEGER,
	date_of_application DATE null,
	cv_file_id LONG,
	cv_text_version VARCHAR(75) null,
	keywords VARCHAR(75) null,
	added_person INTEGER,
	candidate_status VARCHAR(75) null,
	user_id LONG,
	group_id LONG
);

create table HRM_Recruitment_CandidateHistory (
	candidateHistoryId LONG not null primary key,
	c_id LONG,
	v_id LONG,
	interviewId LONG,
	performed_by LONG,
	performedDate DATE null,
	note VARCHAR(75) null,
	interviewers VARCHAR(75) null,
	action VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null
);

create table HRM_Recruitment_Employee (
	employeeId LONG not null primary key,
	emp_code VARCHAR(75) null,
	contact_number VARCHAR(75) null,
	birthday DATE null,
	jobtitleId LONG,
	joined_date DATE null,
	subUnitId LONG,
	titles_id LONG,
	level_id LONG,
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
	isDeleted BOOLEAN
);

create table HRM_Recruitment_EmployeeInterviewSchedule (
	employeeInterviewScheduleId LONG not null primary key,
	employeeId LONG,
	interviewScheduleId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	note VARCHAR(75) null
);

create table HRM_Recruitment_EmployeeVacancy (
	employeeVacancyId LONG not null primary key,
	employeeId LONG,
	v_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table HRM_Recruitment_FileAttachment (
	f_id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	c_id LONG,
	name VARCHAR(75) null,
	file_type VARCHAR(75) null,
	size_ LONG,
	content VARCHAR(75) null,
	attachment_type VARCHAR(75) null
);

create table HRM_Recruitment_Interview (
	interviewId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	interview_date DATE null,
	interview_time VARCHAR(75) null
);

create table HRM_Recruitment_InterviewSchedule (
	interviewScheduleId LONG not null primary key,
	vacancyCandidateId LONG,
	interviewId LONG,
	interviewDate DATE null,
	interviewTime VARCHAR(75) null,
	note VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table HRM_Recruitment_JTitle (
	jobtitleId LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	note VARCHAR(75) null,
	isDeleted BOOLEAN,
	user_id LONG,
	group_id LONG
);

create table HRM_Recruitment_Location (
	locationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	type_ VARCHAR(75) null,
	name VARCHAR(75) null,
	country_code VARCHAR(75) null,
	province VARCHAR(75) null,
	city VARCHAR(75) null,
	address VARCHAR(75) null,
	zip_code VARCHAR(75) null,
	phone VARCHAR(75) null,
	fax VARCHAR(75) null,
	note VARCHAR(75) null
);

create table HRM_Recruitment_SubUnit (
	subUnitId LONG not null primary key,
	name VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table HRM_Recruitment_University (
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

create table HRM_Recruitment_Vacancies_Candidates (
	c_id LONG not null,
	v_id LONG not null,
	primary key (c_id, v_id)
);

create table HRM_Recruitment_Vacancy (
	v_id LONG not null primary key,
	jobtitleId LONG,
	name VARCHAR(75) null,
	locationId LONG,
	description VARCHAR(75) null,
	no_of_positions INTEGER,
	vacancy_status VARCHAR(75) null,
	insert_date DATE null,
	update_date DATE null,
	user_id LONG,
	group_id LONG,
	subUnitId LONG,
	fileEntryId LONG
);

create table HRM_Recruitment_VacancyCandidate (
	vacancyCandidateId LONG not null primary key,
	c_id LONG,
	v_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	vc_status VARCHAR(75) null
);

create table HRM_Vacancies_Candidates (
	c_id LONG not null,
	v_id LONG not null,
	primary key (c_id, v_id)
);

create table HRM_Vacancy (
	v_id LONG not null primary key,
	jobtitleId LONG,
	hiring_manager_id LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	no_of_positions INTEGER,
	published_in_feed BOOLEAN,
	insert_date DATE null,
	update_date DATE null,
	user_id LONG,
	group_id LONG
);

create table HRM_jtittle_id (
	id_ LONG not null,
	id_ LONG not null,
	primary key (id_, id_)
);