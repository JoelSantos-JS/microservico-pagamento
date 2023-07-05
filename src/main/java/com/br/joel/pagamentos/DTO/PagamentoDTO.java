package com.br.joel.pagamentos.DTO;

import java.math.BigDecimal;

import com.br.joel.pagamentos.model.Pagamento;
import com.br.joel.pagamentos.model.Status;



public class PagamentoDTO {

    private Long id;
    private BigDecimal valor;
    private Status status;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private String tipo;
    private Long formaPagamentoId;
    private Long pedidoId;

    public PagamentoDTO(Pagamento pagamento) {
        this.id = pagamento.getId();
        this.valor = pagamento.getValor();
        this.status = pagamento.getStatus();
        this.nome = pagamento.getNome();
        this.numero = pagamento.getNumero();
        this.expiracao = pagamento.getExpiracao();
        this.codigo = pagamento.getCodigo();
     
        this.formaPagamentoId = pagamento.getFormaDePagamentoId();
        this.pedidoId = pagamento.getPedidoId();
    }

    public Long getId() {
        return id;
    

  
    
}

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(String expiracao) {
        this.expiracao = expiracao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getFormaPagamentoId() {
        return formaPagamentoId;
    }

    public void setFormaPagamentoId(Long formaPagamentoId) {
        this.formaPagamentoId = formaPagamentoId;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    

}
