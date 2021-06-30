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
);