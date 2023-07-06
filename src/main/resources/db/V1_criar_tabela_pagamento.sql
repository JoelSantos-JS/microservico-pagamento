

CREATE TABLE pagamentos (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  valor DECIMAL(10, 2) NOT NULL,
  nome VARCHAR(100) NOT NULL,
  numero VARCHAR(19) NOT NULL,
  expiracao VARCHAR(7),
  codigo CHAR(3) NOT NULL,
  status VARCHAR(20) NOT NULL,
  pedido_id BIGINT NOT NULL,
  forma_de_pagamento_id BIGINT NOT NULL,
  PRIMARY KEY (id)

);
