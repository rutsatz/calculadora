insert into marca (nome) values ('Eurofarma');
insert into marca (nome) values ('Novafarma');

insert into medicamento (nome, codigo_marca, tipo_apresentacao, valor_apresentacao, tipo_via_administracao, tipo_unidade) values ('Vancomicina', 1, 'FRASCO', 500,'INTRAVENOSO', 'MILIGRAMA');
insert into medicamento (nome, codigo_marca, tipo_apresentacao, valor_apresentacao, tipo_via_administracao, tipo_unidade) values ('Teicoplanina', 2, 'AMPOLA', 500, 'INTRAMUSCULAR', 'MILIGRAMA');

insert into configuracao (nome, codigo_medicamento, tipo_diluicao, valor_diluicao) values ('Vancomicina Frasco 500 mg IV', 1, 'INFUSAO', 10);
