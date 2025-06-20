package com.apideconsultadecreditos.api_de_consulta_.de_creditos.service;

import com.apideconsultadecreditos.api_de_consulta_.de_creditos.model.EntidadeCredito;
import com.apideconsultadecreditos.api_de_consulta_.de_creditos.repository.EntidadeCreditoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EntidadeCreditoServiceTest {

    @Mock
    EntidadeCreditoRepository entidadeCreditoRepository;

    @InjectMocks
    EntidadeCreditoService entidadeCreditoService;

    @BeforeEach
    public  void setUp(){
//          EntidadeCredito entidadeCredito = new EntidadeCredito(1, "123456", "7891011", "2024-02-25", 1500.75,
//                                                               "ISSQN", "Sim", 5.0, 30000.00, 5000.00,
//                                                               25000.00);
//        lenient().when(entidadeCreditoRepository.findByNumeroCredito("123456")).thenReturn(Optional.of(entidadeCredito));
//        lenient().when(entidadeCreditoRepository.findByNumeroNfse("123456")).thenReturn(Optional.of(entidadeCredito));

    }

    @Test
    @DisplayName("Deve retornar o número do crédito que o cliente tem no sistema.")
    public  void deveRetornarNumeroCreditoSucess(String numeroCredito){

        EntidadeCredito entidadeCredito = new EntidadeCredito();
        entidadeCredito.setNumeroCredito("123456");
        entidadeCredito.setNumeroNfse("7891011");
        entidadeCredito.setDataConstituicao(LocalDate.parse("2024-02-25"));
        entidadeCredito.setValorIssqn(BigDecimal.valueOf(1500.75));
        entidadeCredito.setTipoCredito("ISSQN");
        entidadeCredito.setSimplesNacional(true);
        entidadeCredito.setAliquota(BigDecimal.valueOf(5.0));
        entidadeCredito.setValorFaturado(BigDecimal.valueOf(30000.00));
        entidadeCredito.setValorDeducao(BigDecimal.valueOf(5000.00));
        entidadeCredito.setBaseCalculo(BigDecimal.valueOf(25000.00));

        when(entidadeCreditoRepository.findByNumeroCredito(String.valueOf(anyLong()))).thenReturn(Optional.of(entidadeCredito));

        Optional<EntidadeCredito> exiteEntidade = entidadeCreditoService.getNumeroCredito("123456");

        Assertions.assertNotNull(exiteEntidade);
        Assertions.assertEquals("123456", exiteEntidade.isPresent());

    }

    @Test
    @DisplayName("Deve lançar uma exceção para numeroCredito.")
    public  void deveLancarExceptionNumeroCredito(){

        EntidadeCredito entidadeCredito = new EntidadeCredito();
        entidadeCredito.setNumeroCredito("123456");
        entidadeCredito.setNumeroNfse("7891011");
        entidadeCredito.setDataConstituicao(LocalDate.parse("2024-02-25"));
        entidadeCredito.setValorIssqn(BigDecimal.valueOf(1500.75));
        entidadeCredito.setTipoCredito("ISSQN");
        entidadeCredito.setSimplesNacional(true);
        entidadeCredito.setAliquota(BigDecimal.valueOf(5.0));
        entidadeCredito.setValorFaturado(BigDecimal.valueOf(30000.00));
        entidadeCredito.setValorDeducao(BigDecimal.valueOf(5000.00));
        entidadeCredito.setBaseCalculo(BigDecimal.valueOf(25000.00));

        when(entidadeCreditoRepository.findByNumeroCredito(String.valueOf(anyLong()))).thenReturn(Optional.of(entidadeCredito));

        Assertions.assertThrows(RuntimeException.class, this::deveLancarExceptionNumeroCredito);
        entidadeCreditoService.getNumeroCredito("999999");
    }

    @Test
    @DisplayName("Deve retornar o número da nfse que o cliente tem no sistema.")
    public  void deveRetornarNumeroNfseSucess(String numeroNfse){

        EntidadeCredito entidadeCredito = new EntidadeCredito();
        entidadeCredito.setNumeroCredito("123456");
        entidadeCredito.setNumeroNfse("7891011");
        entidadeCredito.setDataConstituicao(LocalDate.parse("2024-02-25"));
        entidadeCredito.setValorIssqn(BigDecimal.valueOf(1500.75));
        entidadeCredito.setTipoCredito("ISSQN");
        entidadeCredito.setSimplesNacional(true);
        entidadeCredito.setAliquota(BigDecimal.valueOf(5.0));
        entidadeCredito.setValorFaturado(BigDecimal.valueOf(30000.00));
        entidadeCredito.setValorDeducao(BigDecimal.valueOf(5000.00));
        entidadeCredito.setBaseCalculo(BigDecimal.valueOf(25000.00));

        when(entidadeCreditoRepository.findByNumeroNfse(String.valueOf(anyLong()))).thenReturn(Optional.of(entidadeCredito));

        Optional<EntidadeCredito> exiteEntidade = entidadeCreditoService.getNumeroNfse("7891011");

        Assertions.assertNotNull(exiteEntidade);
        Assertions.assertEquals("7891011", exiteEntidade.isPresent());

    }

    @Test
    @DisplayName("Deve lançar uma exceção para NumeroNfse.")
    public  void deveLancarExceptionNumeroNfse(){

        EntidadeCredito entidadeCredito = new EntidadeCredito();
        entidadeCredito.setNumeroCredito("123456");
        entidadeCredito.setNumeroNfse("7891011");
        entidadeCredito.setDataConstituicao(LocalDate.parse("2024-02-25"));
        entidadeCredito.setValorIssqn(BigDecimal.valueOf(1500.75));
        entidadeCredito.setTipoCredito("ISSQN");
        entidadeCredito.setSimplesNacional(true);
        entidadeCredito.setAliquota(BigDecimal.valueOf(5.0));
        entidadeCredito.setValorFaturado(BigDecimal.valueOf(30000.00));
        entidadeCredito.setValorDeducao(BigDecimal.valueOf(5000.00));
        entidadeCredito.setBaseCalculo(BigDecimal.valueOf(25000.00));

        when(entidadeCreditoRepository.findByNumeroNfse(String.valueOf(anyLong()))).thenReturn(Optional.of(entidadeCredito));

        Assertions.assertThrows(RuntimeException.class, this::deveLancarExceptionNumeroNfse);
        entidadeCreditoService.getNumeroNfse("999999");
    }
}
