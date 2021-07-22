create table marca (
	codigo bigserial not null primary key,
	nome varchar(100) not null
);

create table medicamento (
	codigo bigserial not null primary key,
	nome varchar(100) not null,
    codigo_marca int8 not null,
    tipo_apresentacao varchar(60) not null,
    valor_apresentacao numeric(19, 2),
    tipo_via_administracao varchar(60) not null,
    tipo_unidade varchar(60) not null,
    foreign key (codigo_marca) references marca
);

create table configuracao (
     codigo bigserial not null primary key,
     nome varchar(100) not null,
     codigo_medicamento int8 not null,
     tipo_diluicao varchar(60) not null,
     valor_diluicao numeric(19, 2),
     foreign key (codigo_medicamento) references medicamento
);
