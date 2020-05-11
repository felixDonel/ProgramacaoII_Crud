	
CREATE DATABASE TelaCadastro;
USE TelaCadastro;
create table Aluno(
ID int(4) auto_increment primary key,
Nome varchar(99) not null,
Contrato varchar(99) not null unique,
Ano int not null,
Turno varchar(20) not null,
DataNasciemnto varchar(20) not null,
DataMatricula varchar(20) not null,
DataValidade varchar(20),
RG varchar(20)not null,
CPF varchar (20)not null,
Curso varchar (20)not null,	
Obs varchar (999),
Genero char(19) not null,
Foto varchar (99)
);