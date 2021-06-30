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
);