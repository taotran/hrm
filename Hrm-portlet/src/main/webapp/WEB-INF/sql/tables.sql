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
	candidate_status VARCHAR(75) null,
	user_id LONG,
	group_id LONG,
	interviewId LONG
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

create table HRM_Recruitment_JTitle (
	jobtitleId LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	note VARCHAR(75) null,
	isDeleted BOOLEAN,
	user_id LONG,
	group_id LONG
);

create table HRM_Recruitment_Vacancies_Candidates (
	c_id LONG not null,
	v_id LONG not null,
	primary key (c_id, v_id)
);

create table HRM_Recruitment_Vacancy (
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