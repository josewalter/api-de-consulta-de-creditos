package com.apideconsultadecreditos.api_de_consulta_.de_creditos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_credito")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EntidadeCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_credito", length = 50, nullable = false)
    private String numeroCredito;

    @Column(name = "numero_nfse", length = 50, nullable = false)
    private String numeroNfse;

    @Column(name = "data_construcao", length = 10, nullable = false)
    private LocalDate dataConstituicao;

    @Column(name = "valor_issgn", precision = 10, scale = 2, nullable = false)
    private BigDecimal valorIssqn;

    @Column(name = "tipo_credito", length = 50, nullable = false)
    private String tipoCredito;

    @Column(name = "simples_nacional", length = 5, nullable = false)
    private boolean simplesNacional;

    @Column(name = "aliquota", length = 3, nullable = false)
    private BigDecimal aliquota;

    @Column(name = "valor_faturado", precision = 10, scale = 2, nullable = false)
    private BigDecimal valorFaturado;

    @Column(name = "valor_deducao", precision = 10, scale = 2, nullable = false)
    private BigDecimal valorDeducao;

    @Column(name = "base_calculo", precision = 10, scale = 2, nullable = false)
    private BigDecimal baseCalculo;
}
