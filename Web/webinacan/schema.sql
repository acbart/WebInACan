
drop table if exists services;
create table services (
    id int primary key,
    name char(50) primary key,
    wsdl_path char(255),
    suggester char(255),
);

drop table if exists snapshots;
create table snapshots (
    service_id int,
    submitter char(255),
    url char(255),
    added timestamp
);

drop table if exists users;
create table users (
    email char(255) primary key,
    password char(255) not null,
    institution 
);