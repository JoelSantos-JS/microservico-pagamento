package com.br.joel.pagamentos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    
}
