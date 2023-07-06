package com.br.joel.pagamentos.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pagamentos")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive
    private BigDecimal valor;
    @NotNull
    @NotEmpty(message = "Nome não pode ser vazio")
    @Size(max = 100)
    private String nome;
    @NotBlank
    @Size(max = 19)
    private String numero;
    @Size(max = 7)
    private String expiracao;
    @NotBlank
    @Size(max= 3 , min = 3)
    private String codigo;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull
    private Long pedidoId;
    
    private Long formaDePagamentoId;
    
}
