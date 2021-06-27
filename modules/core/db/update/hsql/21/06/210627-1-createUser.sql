create table TIMESHEETWITHCUBA_USER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_TIMESHEET integer,
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    PATRONYMIC varchar(255),
    --
    primary key (ID)
);