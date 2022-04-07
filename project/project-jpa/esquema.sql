CREATE TABLE CLIENTE (IDENTIFICADOR INTEGER NOT NULL, DTYPE VARCHAR(31), ACTIVO VARCHAR NOT NULL, CORREO VARCHAR UNIQUE, FECHA_APERTURA DATE, FECHA_CIERRE DATE, TELEFONO INTEGER UNIQUE, ADMINISTRADOR BOOLEAN NOT NULL, CONTRASENA INTEGER NOT NULL, DIRECCION_CODIGO_POSTAL INTEGER, NIF VARCHAR UNIQUE, NOMBRE VARCHAR UNIQUE, PAGINA_WEB VARCHAR UNIQUE, RAZON_SOCIAL VARCHAR NOT NULL, APELLIDOS VARCHAR NOT NULL, DNI VARCHAR UNIQUE, FECHA_NACIMIENTO TIMESTAMP, OCUPACION VARCHAR, PRIMARY KEY (IDENTIFICADOR))
CREATE TABLE CUENTA_REFERENCIA (IBAN VARCHAR NOT NULL, BANCO_NOMBRE_BANCO VARCHAR, C_ACCOUNT_N_CUENTA INTEGER, PRIMARY KEY (IBAN))
CREATE TABLE CUENTA_EBURY (N_CUENTA INTEGER NOT NULL, DTYPE VARCHAR(31), FECHA_ALTA DATE NOT NULL, FECHA_BAJA DATE, CLIENTE_IDENTIFICADOR INTEGER, C_REF_IBAN VARCHAR, PRIMARY KEY (N_CUENTA))
CREATE TABLE DATOS (TIPO_AUTORIZACION VARCHAR NOT NULL, IDENTIFICADOR INTEGER NOT NULL, DNI VARCHAR NOT NULL, PRIMARY KEY (TIPO_AUTORIZACION, IDENTIFICADOR, DNI))
CREATE TABLE Cuenta_Externa (IBAN VARCHAR NOT NULL, SWIFT VARCHAR, BENEFICIARIO VARCHAR, PRIMARY KEY (IBAN))
CREATE TABLE transaccion (Numero_Transaccion INTEGER NOT NULL, DTYPE VARCHAR(31), CANTIDAD_ENVIADA INTEGER, CANTIDAD_RECIBIDA INTEGER, fecha_ejecucion DATE NOT NULL, fecha_realizacion DATE NOT NULL, CUENTA_N_CUENTA INTEGER, Comision DOUBLE NOT NULL, C_EXT_IBAN VARCHAR, PRIMARY KEY (Numero_Transaccion))
CREATE TABLE divisa (nombre_divisa VARCHAR NOT NULL, abreviatura VARCHAR NOT NULL UNIQUE, simbolo VARCHAR NOT NULL UNIQUE, TIPO_CAMBIO_DOLAR DOUBLE NOT NULL, PRIMARY KEY (nombre_divisa))
CREATE TABLE DIRECCION (CODIGO_POSTAL INTEGER NOT NULL, CALLE VARCHAR NOT NULL, NUMERO INTEGER NOT NULL, PRIMARY KEY (CODIGO_POSTAL))
CREATE TABLE BANCO (NOMBRE_BANCO VARCHAR NOT NULL, TIPO_BANCO VARCHAR, PAIS_ABREVIATURA VARCHAR, direccion_id INTEGER, PRIMARY KEY (NOMBRE_BANCO))
CREATE TABLE PAIS (ABREVIATURA VARCHAR NOT NULL, NOMBRE_PAIS VARCHAR NOT NULL, PRIMARY KEY (ABREVIATURA))
CREATE TABLE PERSONA_AUTORIZADA (DNI VARCHAR NOT NULL, APELLIDOS VARCHAR, NOMBRE VARCHAR, DIRECCION_CODIGO_POSTAL INTEGER, PRIMARY KEY (DNI))
CREATE TABLE SALDO (NOMBRE_DIVISA VARCHAR NOT NULL, N_CUENTA INTEGER NOT NULL, CANTIDAD INTEGER NOT NULL, PRIMARY KEY (NOMBRE_DIVISA, N_CUENTA))
CREATE TABLE pooled_referencia (c_ref_iban VARCHAR NOT NULL, c_ebury_n_cuenta INTEGER NOT NULL, PRIMARY KEY (c_ref_iban, c_ebury_n_cuenta))
CREATE TABLE referencia_segregated (c_ref_iban VARCHAR NOT NULL, c_ebury_n_ref INTEGER NOT NULL, PRIMARY KEY (c_ref_iban, c_ebury_n_ref))
CREATE TABLE CUENTA_EBURY_transaccion (Cuenta_eBury_N_CUENTA INTEGER NOT NULL, internas_Numero_Transaccion INTEGER NOT NULL, PRIMARY KEY (Cuenta_eBury_N_CUENTA, internas_Numero_Transaccion))
CREATE TABLE divisa_transaccion (transaccion_id INTEGER NOT NULL, divisa_id VARCHAR NOT NULL, PRIMARY KEY (transaccion_id, divisa_id))
CREATE TABLE divisa_pais (divisa_id VARCHAR NOT NULL, pais_id VARCHAR NOT NULL, PRIMARY KEY (divisa_id, pais_id))
ALTER TABLE CLIENTE ADD CONSTRAINT FK_CLIENTE_DIRECCION_CODIGO_POSTAL FOREIGN KEY (DIRECCION_CODIGO_POSTAL) REFERENCES DIRECCION (CODIGO_POSTAL)
ALTER TABLE CUENTA_REFERENCIA ADD CONSTRAINT FK_CUENTA_REFERENCIA_C_ACCOUNT_N_CUENTA FOREIGN KEY (C_ACCOUNT_N_CUENTA) REFERENCES CUENTA_EBURY (N_CUENTA)
ALTER TABLE CUENTA_REFERENCIA ADD CONSTRAINT FK_CUENTA_REFERENCIA_BANCO_NOMBRE_BANCO FOREIGN KEY (BANCO_NOMBRE_BANCO) REFERENCES BANCO (NOMBRE_BANCO)
ALTER TABLE CUENTA_EBURY ADD CONSTRAINT FK_CUENTA_EBURY_C_REF_IBAN FOREIGN KEY (C_REF_IBAN) REFERENCES CUENTA_REFERENCIA (IBAN)
ALTER TABLE CUENTA_EBURY ADD CONSTRAINT FK_CUENTA_EBURY_CLIENTE_IDENTIFICADOR FOREIGN KEY (CLIENTE_IDENTIFICADOR) REFERENCES CLIENTE (IDENTIFICADOR)
ALTER TABLE transaccion ADD CONSTRAINT FK_transaccion_C_EXT_IBAN FOREIGN KEY (C_EXT_IBAN) REFERENCES Cuenta_Externa (IBAN)
ALTER TABLE transaccion ADD CONSTRAINT FK_transaccion_CUENTA_N_CUENTA FOREIGN KEY (CUENTA_N_CUENTA) REFERENCES CUENTA_EBURY (N_CUENTA)
ALTER TABLE BANCO ADD CONSTRAINT FK_BANCO_direccion_id FOREIGN KEY (direccion_id) REFERENCES DIRECCION (CODIGO_POSTAL)
ALTER TABLE BANCO ADD CONSTRAINT FK_BANCO_PAIS_ABREVIATURA FOREIGN KEY (PAIS_ABREVIATURA) REFERENCES PAIS (ABREVIATURA)
ALTER TABLE PERSONA_AUTORIZADA ADD CONSTRAINT FK_PERSONA_AUTORIZADA_DIRECCION_CODIGO_POSTAL FOREIGN KEY (DIRECCION_CODIGO_POSTAL) REFERENCES DIRECCION (CODIGO_POSTAL)
ALTER TABLE pooled_referencia ADD CONSTRAINT FK_pooled_referencia_c_ebury_n_cuenta FOREIGN KEY (c_ebury_n_cuenta) REFERENCES CUENTA_EBURY (N_CUENTA)
ALTER TABLE pooled_referencia ADD CONSTRAINT FK_pooled_referencia_c_ref_iban FOREIGN KEY (c_ref_iban) REFERENCES CUENTA_REFERENCIA (IBAN)
ALTER TABLE referencia_segregated ADD CONSTRAINT FK_referencia_segregated_c_ebury_n_ref FOREIGN KEY (c_ebury_n_ref) REFERENCES CUENTA_EBURY (N_CUENTA)
ALTER TABLE referencia_segregated ADD CONSTRAINT FK_referencia_segregated_c_ref_iban FOREIGN KEY (c_ref_iban) REFERENCES CUENTA_REFERENCIA (IBAN)
ALTER TABLE CUENTA_EBURY_transaccion ADD CONSTRAINT FK_CUENTA_EBURY_transaccion_Cuenta_eBury_N_CUENTA FOREIGN KEY (Cuenta_eBury_N_CUENTA) REFERENCES CUENTA_EBURY (N_CUENTA)
ALTER TABLE CUENTA_EBURY_transaccion ADD CONSTRAINT CUENTAEBURY_transaccioninternas_Numero_Transaccion FOREIGN KEY (internas_Numero_Transaccion) REFERENCES transaccion (Numero_Transaccion)
ALTER TABLE divisa_transaccion ADD CONSTRAINT FK_divisa_transaccion_transaccion_id FOREIGN KEY (transaccion_id) REFERENCES transaccion (Numero_Transaccion)
ALTER TABLE divisa_transaccion ADD CONSTRAINT FK_divisa_transaccion_divisa_id FOREIGN KEY (divisa_id) REFERENCES divisa (nombre_divisa)
ALTER TABLE divisa_pais ADD CONSTRAINT FK_divisa_pais_pais_id FOREIGN KEY (pais_id) REFERENCES PAIS (ABREVIATURA)
ALTER TABLE divisa_pais ADD CONSTRAINT FK_divisa_pais_divisa_id FOREIGN KEY (divisa_id) REFERENCES divisa (nombre_divisa)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT NUMERIC(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
