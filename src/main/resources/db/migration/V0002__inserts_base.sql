insert into marca (nome) values ('Eurofarma');
insert into marca (nome) values ('Novafarma');

insert into medicamento (nome, codigo_marca, tipo_apresentacao, valor_apresentacao, tipo_via_administracao, tipo_unidade) values ('Vancomicina', 1, 'FRASCO', 400,'INTRAMUSCULAR', 'MILIGRAMA');
insert into medicamento (nome, codigo_marca, tipo_apresentacao, valor_apresentacao, tipo_via_administracao, tipo_unidade) values ('Teicoplanina', 2, 'AMPOLA', 500, 'INTRAMUSCULAR', 'MILIGRAMA');

insert into configuracao (nome, codigo_medicamento, tipo_diluicao) values ('PIPERACILINA + TAZOBACTAM', 1, 'INFUSAO');
