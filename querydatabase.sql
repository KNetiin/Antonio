-- DROP SCHEMA landix;
-- CREATE DATABASE landix DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;

-- CREATE USER 'java'@'localhost' IDENTIFIED WITH mysql_native_password BY 'toor';
-- GRANT ALL ON javabase.* TO 'java'@'localhost';

USE landix;

CREATE TABLE IF NOT EXISTS VENDEDORES (
	CDVEND	VARCHAR(36)					NOT NULL, -- Código do vendedor
	DSNOME	VARCHAR(50)					NOT NULL, -- Nome do vendedor
	CDTAB	INTEGER						NOT NULL, -- Código da tabela de preços padrão
	DTNASC	DATE 								, -- Data de nascimento
	PRIMARY KEY (CDVEND)						  -- Utilizar GUID
);

CREATE TABLE IF NOT EXISTS CLIENTES (
	CDCL	VARCHAR(36)					NOT NULL, -- Código do cliente
    DSNOME	VARCHAR(50) DEFAULT 'PF'	NOT NULL, -- Nome do cliente
    IDTIPO	CHAR(2)						NOT NULL, -- Tipo de pessoa, ’PF’ - Pessoa física; ’PJ’ - Pessoa jurídica.
    CDVEND	VARCHAR(36)							, -- Código do vendedor
    DSLIM	DECIMAL(15,2)				NOT NULL, -- Limite de crédito
    PRIMARY KEY (CDCL)							, -- Utilizar GUID
    FOREIGN KEY (CDVEND) REFERENCES VENDEDORES (CDVEND)
		ON DELETE RESTRICT
		ON UPDATE CASCADE
);

-- select * from VENDEDORES;
-- select * from CLIENTES;
-- select * from VENDEDORES V, CLIENTES C where C.CDVEND = V.CDVEND;
-- INSERT INTO VENDEDORES VALUES ('firs3t2','Antoni2o',3,'2010-12-20');
-- INSERT INTO CLIENTES VALUES ('tl','PF','1','firs3t2',133.00);	
