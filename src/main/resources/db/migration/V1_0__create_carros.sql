CREATE TABLE carros (
  id_carro BIGINT(20) NOT NULL AUTO_INCREMENT,
  tx_marca VARCHAR(100) NULL,
  tx_modelo VARCHAR(45) NULL,
  date_ano YEAR NULL,
  PRIMARY KEY (`id_carro`)
);