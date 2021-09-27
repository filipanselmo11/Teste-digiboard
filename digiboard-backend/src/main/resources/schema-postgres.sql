DROP TABLE IF EXISTS usuario;
CREATE TABLE usuarios
(
  	idusuario integer NOT NULL serial,

    nomeusuario character varying(80) NOT NULL,

    loginusuario character varying(12) NOT NULL,

    senhausuario character varying(9) NOT NULL,

    ativo boolean NOT NULL DEFAULT true,

    tmdataultimoacesso timestamp without time zone,

    CONSTRAINT tbusuario_pk PRIMARY KEY (idusuario),

    CONSTRAINT tbusuario_nmloginusuario_key UNIQUE (loginusuario),      
);