alter table TIMESHEETWITHCUBA_USER add constraint FK_TIMESHEETWITHCUBA_USER_ON_POSITION foreign key (POSITION_ID) references TIMESHEETWITHCUBA_POSITION(ID);
alter table TIMESHEETWITHCUBA_USER add constraint FK_TIMESHEETWITHCUBA_USER_ON_DEPARTMENT foreign key (DEPARTMENT_ID) references TIMESHEETWITHCUBA_DEPARTMENT(ID);
create unique index IDX_TIMESHEETWITHCUBA_USER_UNIQ_NUMBER_TIMESHEET on TIMESHEETWITHCUBA_USER (NUMBER_TIMESHEET, DELETE_TS) ;
create index IDX_TIMESHEETWITHCUBA_USER_ON_POSITION on TIMESHEETWITHCUBA_USER (POSITION_ID);
create index IDX_TIMESHEETWITHCUBA_USER_ON_DEPARTMENT on TIMESHEETWITHCUBA_USER (DEPARTMENT_ID);
