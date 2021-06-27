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
    TYPE_ varchar(50),
    DATE_ date,
    --
    primary key (ID)
);