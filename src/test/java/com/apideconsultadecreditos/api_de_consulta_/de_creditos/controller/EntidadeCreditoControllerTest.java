//package com.apideconsultadecreditos.api_de_consulta_.de_creditos.controller;
//
//import com.apideconsultadecreditos.api_de_consulta_.de_creditos.model.EntidadeCredito;
//import com.apideconsultadecreditos.api_de_consulta_.de_creditos.repository.EntidadeCreditoRepository;
//import com.apideconsultadecreditos.api_de_consulta_.de_creditos.service.EntidadeCreditoService;
//import io.restassured.http.ContentType;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import org.mockito.InjectMocks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.Optional;
//
//import static org.mockito.Mockito.when;
//import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
//
//@WebMvcTest(EntidadeCreditoController.class)
//public class EntidadeCreditoControllerTest {
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @InjectMocks
//    private EntidadeCreditoService entidadeCreditoService;
//
//    @MockitoBean
//    private EntidadeCreditoRepository entidadeCreditoRepository;
//
//    @Test
//    @DisplayName("Deve retornar sucesso, quando buscar o número de credito do cliente na plataforma.")
//    public  void deveRetornarSucesso_QuandoBuscarNumeroCredito() throws Exception{
//
//        when(this.entidadeCreditoService.getNumeroCredito("123456"))
//                .thenReturn(Optional.of(new EntidadeCredito()));
//
//        given()
//            .accept(ContentType.JSON)
//        .when()
//            .get("/api/creditos/{numeroCredito}", "123456")
//        .then()
//                .statusCode(HttpStatus.OK.value());
//    }
//
//    @Test
//    @DisplayName("Deve retornar número de crédito status code NOT_FOUND, quando não encontrar o registro do número do crédito.")
//    public void deveRetornarNaoEncontrado_QuandoBuscarNumeroCredito(){
//        when(this.entidadeCreditoService.getNumeroCredito("999999"))
//            .thenReturn(null);
//        given()
//            .accept(ContentType.JSON)
//        .when()
//            .get("/api/creditos/{numeroCredito}", "999999")
//        .then()
//                .statusCode(HttpStatus.NOT_FOUND.value());
//    }
//
//    @Test
//    @DisplayName("Deve retornar sucesso, quando buscar o número da Nfse do cliente na plataforma.")
//    public  void deveRetornarSucesso_QuandoBuscarNumeroNfse(){
//
//        when(this.entidadeCreditoService.getNumeroNfse("123456"))
//                .thenReturn(Optional.of(new EntidadeCredito()));
//
//        given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("/api/creditos/{numeroNfse}", "123456")
//                .then()
//                .statusCode(HttpStatus.OK.value());
//    }
//
//    @Test
//    @DisplayName("Deve retornar número da Nfse status code NOT_FOUND, quando não encontrar o registro do número da Nfse.")
//    public void deveRetornarNaoEncontrado_QuandoBuscarNumeroNfse(){
//        when(this.entidadeCreditoService.getNumeroNfse("999999"))
//                .thenReturn(null);
//        given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("/api/creditos/{numeroNfse}", "999999")
//                .then()
//                .statusCode(HttpStatus.NOT_FOUND.value());
//    }
//}
