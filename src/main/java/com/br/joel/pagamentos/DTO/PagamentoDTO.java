package com.br.joel.pagamentos.DTO;

import java.math.BigDecimal;

import com.br.joel.pagamentos.model.Pagamento;
import com.br.joel.pagamentos.model.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagamentoDTO {

    private Long id;
    private BigDecimal valor;
    private Status status;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;

    private Long pedidoId;
    
    private Long formaDePagamentoId;


    public PagamentoDTO(Pagamento pagamento) {
        this.id = pagamento.getId();
        this.valor = pagamento.getValor();
        this.status = pagamento.getStatus();
        this.nome = pagamento.getNome();
        this.numero = pagamento.getNumero();
        this.expiracao = pagamento.getExpiracao();
        this.codigo = pagamento.getCodigo();
        this.codigo = pagamento.getCodigo();
        this.pedidoId = pagamento.getPedidoId();
        this.formaDePagamentoId = pagamento.getFormaDePagamentoId();
    
    }



}
   
    


