create index IX_556E3D98 on HRM_Candidate (c_id);
create index IX_A79E4F27 on HRM_Candidate (c_id, first_name, middle_name, last_name, email);
create index IX_2B1D0D21 on HRM_Candidate (candidateId);
create index IX_579DDAF2 on HRM_Candidate (first_name, middle_name, last_name, email);
create index IX_55ACC947 on HRM_Candidate (id_);

create index IX_E2F3EF95 on HRM_Recruitment_Candidate (c_id);
create index IX_96279315 on HRM_Recruitment_Candidate (first_name, middle_name, last_name, email);

create index IX_3E546041 on HRM_Recruitment_CandidateHistory (c_id);

create index IX_DB094E22 on HRM_Recruitment_Employee (firstname, middle_name, lastname);

create index IX_35E32E6E on HRM_Recruitment_EmployeeInterviewSchedule (employeeId);
create index IX_8C6B2932 on HRM_Recruitment_EmployeeInterviewSchedule (interviewScheduleId);

create index IX_120F5E31 on HRM_Recruitment_EmployeeVacancy (employeeId);
create index IX_F454F50C on HRM_Recruitment_EmployeeVacancy (v_id);
create index IX_C06FFBA9 on HRM_Recruitment_EmployeeVacancy (v_id, employeeId);

create index IX_51DD102D on HRM_Recruitment_InterviewSchedule (interviewId);
create index IX_74C99DE4 on HRM_Recruitment_InterviewSchedule (interviewId, vacancyCandidateId);
create index IX_47DAC296 on HRM_Recruitment_InterviewSchedule (vacancyCandidateId);

create index IX_42728746 on HRM_Recruitment_Vacancies_Candidates (c_id);
create index IX_62DE9B13 on HRM_Recruitment_Vacancies_Candidates (v_id);

create index IX_8405CEF8 on HRM_Recruitment_VacancyCandidate (c_id);
create index IX_A471E2C5 on HRM_Recruitment_VacancyCandidate (v_id);
create index IX_12E2F7B0 on HRM_Recruitment_VacancyCandidate (v_id, c_id);

create index IX_97306963 on HRM_Vacancies_Candidates (c_id);
create index IX_FD3316F6 on HRM_Vacancies_Candidates (candidateId);
create index IX_AA60781C on HRM_Vacancies_Candidates (id_);
create index IX_B79C7D30 on HRM_Vacancies_Candidates (v_id);
create index IX_E029B6E on HRM_Vacancies_Candidates (vacancyId);

create index IX_5DFD76F0 on HRM_jtittle_id (id_);