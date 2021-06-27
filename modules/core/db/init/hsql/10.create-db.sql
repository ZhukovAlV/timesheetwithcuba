-- begin TIMESHEETWITHCUBA_DATASHEET
create table TIMESHEETWITHCUBA_DATASHEET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HOUR_ integer,
    USER_ID varchar(36),
    TYPE_ varchar(50),
    DATE_ date,
    --
    primary key (ID)
)^
-- end TIMESHEETWITHCUBA_DATASHEET
-- begin TIMESHEETWITHCUBA_ORGANIZATION
create table TIMESHEETWITHCUBA_ORGANIZATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TIMESHEETWITHCUBA_ORGANIZATION
-- begin TIMESHEETWITHCUBA_POSITION
create table TIMESHEETWITHCUBA_POSITION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TIMESHEETWITHCUBA_POSITION
-- begin TIMESHEETWITHCUBA_DEPARTMENT
create table TIMESHEETWITHCUBA_DEPARTMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    ORGANIZATION_ID varchar(36),
    --
    primary key (ID)
)^
-- end TIMESHEETWITHCUBA_DEPARTMENT
-- begin TIMESHEETWITHCUBA_USER
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
    POSITION_ID varchar(36),
    --
    primary key (ID)
)^
-- end TIMESHEETWITHCUBA_USER
