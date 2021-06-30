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
    --
    primary key nonclustered (ID)
);