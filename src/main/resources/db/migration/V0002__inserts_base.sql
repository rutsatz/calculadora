insert into marca (nome) values ('Eurofarma');
insert into marca (nome) values ('Novafarma');

insert into medicamento (nome, codigo_marca, tipo_apresentacao, valor_apresentacao, tipo_via_administracao, tipo_unidade) values ('Vancomicina', 1, 'FRASCO', 500,'INTRAVENOSO', 'MILIGRAMA');
insert into medicamento (nome, codigo_marca, tipo_apresentacao, valor_apresentacao, tipo_via_administracao, tipo_unidade) values ('Teicoplanina', 2, 'AMPOLA', 500, 'INTRAMUSCULAR', 'MILIGRAMA');
insert into medicamento (nome, codigo_marca, tipo_apresentacao, valor_apresentacao, tipo_via_administracao, tipo_unidade)
values ('PIPERACILINA+TAZOBACTAN', 2, 'AMPOLA', 4000, 'INTRAVENOSO', 'MILIGRAMA');
--pensar talvez em uma tabela intermediaria entre o medicamento e a configuração, nela pode ter os tipo de aplicação , unidade entre outros
insert into configuracao (nome, codigo_medicamento, tipo_diluicao, valor_diluicao) values ('Vancomicina Frasco 500 mg IV', 1, 'INFUSAO', 10);

insert into configuracao (nome, codigo_medicamento, tipo_diluicao, valor_diluicao,valor_final_pos_diluicao
,concentracao_maxima_adm) values ('PIPERACILINA+TAZOBACTAN 4000 mg IV', 3,
'INFUSAO', 20,23,80);
