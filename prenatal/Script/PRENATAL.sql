--ESTADO
CREATE TABLE estado
(
  id bigint NOT NULL,
  nome character varying(80) NOT NULL,
  sigla character varying(2),
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

  --GESTANTE 
  CREATE TABLE gestante
(
  id bigint NOT NULL,
  nome character varying(80) NOT NULL,
  email character varying(255) NOT NULL,
  estado_civil integer NOT NULL,
  escolaridade integer NOT NULL,
  profissao varchar (255),
  bairro character varying(255) NOT NULL,
  logradouro character varying(255) NOT NULL,
  cpf Varchar(15) NOT NULL,
  rg Varchar(20) NOT NULL,
  data_nascimento date NOT NULL,
  estado_id bigint NOT NULL REFERENCES estado(id),
  cidade_id bigint NOT NULL REFERENCES cidade(id),
  CONSTRAINT usuario_pkey PRIMARY KEY (id)
 
  
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
