-- begin TIMESHEETWITHCUBA_DATASHEET
create table TIMESHEETWITHCUBA_DATASHEET (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    HOUR_ integer,
    USER_ID uniqueidentifier,
    TYPE_ varchar(50),
    DATE_ datetime2,
    --
    primary key nonclustered (ID)
)^
-- end TIMESHEETWITHCUBA_DATASHEET
-- begin TIMESHEETWITHCUBA_ORGANIZATION
create table TIMESHEETWITHCUBA_ORGANIZATION (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    OKUD varchar(255),
    OKPO varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end TIMESHEETWITHCUBA_ORGANIZATION
-- begin TIMESHEETWITHCUBA_POSITION
create table TIMESHEETWITHCUBA_POSITION (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end TIMESHEETWITHCUBA_POSITION
-- begin TIMESHEETWITHCUBA_DEPARTMENT
create table TIMESHEETWITHCUBA_DEPARTMENT (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    ORGANIZATION_ID uniqueidentifier,
    BOSS_ID uniqueidentifier,
    PERFORMER_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
)^
-- end TIMESHEETWITHCUBA_DEPARTMENT
-- begin TIMESHEETWITHCUBA_USER
create table TIMESHEETWITHCUBA_USER (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    NUMBER_TIMESHEET integer,
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    PATRONYMIC varchar(255),
    POSITION_ID uniqueidentifier,
    DEPARTMENT_ID uniqueidentifier,
    --
    primary key nonclustered (ID)
)^
-- end TIMESHEETWITHCUBA_USER
-- begin TIMESHEETWITHCUBA_HOLY_DAY
create table TIMESHEETWITHCUBA_HOLY_DAY (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    DATE_DAY datetime2,
    NAME varchar(255),
    --
    primary key nonclustered (ID)
)^
-- end TIMESHEETWITHCUBA_HOLY_DAY
