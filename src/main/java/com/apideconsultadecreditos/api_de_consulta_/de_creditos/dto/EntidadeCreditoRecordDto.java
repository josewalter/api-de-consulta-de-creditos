package com.apideconsultadecreditos.api_de_consulta_.de_creditos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EntidadeCreditoRecordDto(@NotNull String numeroCredito, @NotNull String numeroNfse,
                                       @NotBlank LocalDate dataConstituicao, @NotNull BigDecimal valorIssqn,
                                       @NotBlank String tipoCredito, @NotBlank boolean simplesNacional,
                                       @NotNull BigDecimal aliquota, @NotNull BigDecimal valorFaturado,
                                       @NotNull BigDecimal valorDeducao, @NotNull BigDecimal baseCalculo) {
}
