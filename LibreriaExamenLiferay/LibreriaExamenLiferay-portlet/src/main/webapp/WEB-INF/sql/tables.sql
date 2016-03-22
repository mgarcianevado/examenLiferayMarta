create table LibreriaExamenLiferay_Usuario (
	groupId LONG,
	companyId LONG,
	userId LONG not null primary key,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);