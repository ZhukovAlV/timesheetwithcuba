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
);