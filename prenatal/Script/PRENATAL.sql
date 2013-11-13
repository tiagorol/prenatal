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