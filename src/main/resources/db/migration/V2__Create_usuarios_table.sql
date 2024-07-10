-- V2__Create_usuarios_table.sql
CREATE TABLE usuarios(

    id bigint not null auto_increment,
    login varchar(100) not null,
    senha varchar(255) not null,

    primary key(id)

);
