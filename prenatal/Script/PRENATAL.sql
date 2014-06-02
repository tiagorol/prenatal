--ESTADO
CREATE TABLE estado
(
  id bigint NOT NULL,
  nome character varying(80) NOT NULL,
  sigla character varying(2) NOT NULL,
 CONSTRAINT estado_pkey PRIMARY KEY(id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE estado
  OWNER TO root;
  
  CREATE SEQUENCE estado_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE estado_id_seq
  OWNER TO root;
  
--CIDADE
CREATE TABLE cidade
(
  id bigint NOT NULL,
  nome character varying(255) NOT NULL,
  estado_id bigint NOT NULL REFERENCES estado(id),
  CONSTRAINT cidade_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE cidade
  OWNER TO root;

CREATE SEQUENCE cidade_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE cidade_id_seq
  OWNER TO root; 
  
--USUARIO
CREATE TABLE usuario
(
  id bigint NOT NULL,
  ativo boolean NOT NULL,
  email character varying(255) NOT NULL,
  root boolean NOT NULL,
  senha character varying(40) NOT NULL,
  CONSTRAINT usuario_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE usuario
  OWNER TO root;

  CREATE SEQUENCE usuario_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE usuario_id_seq
  OWNER TO root;  

  --GESTANTE 
 CREATE TABLE gestante
(
  id bigint NOT NULL,
  nome character varying(80) NOT NULL,
  estado_civil integer NOT NULL,
  escolaridade integer NOT NULL,
  profissao varchar (255),
  bairro character varying(255) NOT NULL,
  logradouro character varying(255) NOT NULL,
  cpf Varchar(15) NOT NULL,
  rg Varchar(20) NOT NULL,
  data_nascimento date NOT NULL,
  data_ultima_mestruacao date NOT NULL,
  estado_id bigint NOT NULL REFERENCES estado(id),
  cidade_id bigint NOT NULL REFERENCES cidade(id),
  usuario_id bigint NOT NULL REFERENCES usuario(id),
  CONSTRAINT gestante_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE gestante
  OWNER TO root;

CREATE SEQUENCE gestante_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE gestante_id_seq
OWNER TO root;

--InformaçãoTempoVida
CREATE TABLE informacao_tempo_vida(
  id bigint NOT NULL,
  quantidade_semanas integer NOT NULL,
  conteudo text NOT NULL,
  CONSTRAINT informacao_tempo_vida_pkey PRIMARY KEY (id)
)

CREATE SEQUENCE informacao_tempo_vida_id_seq
 
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE informacao_tempo_vida_id_seq
OWNER TO root;

--pendencias
CREATE TABLE pendencias(
  id bigint NOT NULL,
  titulo varchar(250) NOT NULL,
  semana integer NOT NULL,
  CONSTRAINT pendencias_pkey PRIMARY KEY (id)
)

CREATE SEQUENCE pendencias_id_seq
 
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE pendencias_id_seq
OWNER TO root;

--INFORMACOES PARA VOCE

CREATE TABLE informacao_para_voce
(
  id bigint NOT NULL,
  descricao text NOT NULL,
  conteudo text NOT NULL,
  semana integer NOT NULL,
  CONSTRAINT informacao_para_voce_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE informacao_para_voce
  OWNER TO postgres;

CREATE SEQUENCE informacao_para_voce_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 5
  CACHE 1;
ALTER TABLE informacao_para_voce_id_seq
  OWNER TO root;
  
  --TIPO ACAO
  CREATE TABLE tipo_acao
(
  id bigint NOT NULL,
  descricao character NOT NULL,
  CONSTRAINT tipo_acao_pkey PRIMARY KEY (id)
)

CREATE SEQUENCE tipo_acao_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE tipo_acao_id_seq
  OWNER TO root;

  --ACAO
    
CREATE TABLE acao 
(
  id bigint NOT NULL,
  id_tipo bigint NOT NULL,
  semana INTEGER NOT NULL,
  descricao character NOT NULL,
  realizado BOOLEAN NOT NULL,
  id_usuario bigint NOT NULL,
  CONSTRAINT id_tipo_key PRIMARY KEY (id),
  CONSTRAINT id_tipo_acao_fk FOREIGN KEY (id_tipo) REFERENCES tipo_acao (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT id_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
) WITH (
  OIDS=FALSE
);
ALTER TABLE acao
  OWNER TO postgres;
  
CREATE SEQUENCE acao_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
ALTER TABLE acao_id_seq
  OWNER TO root;