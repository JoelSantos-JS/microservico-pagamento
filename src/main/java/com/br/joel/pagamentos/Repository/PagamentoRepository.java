package com.br.joel.pagamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.joel.pagamentos.model.Pagamento;
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    
}
