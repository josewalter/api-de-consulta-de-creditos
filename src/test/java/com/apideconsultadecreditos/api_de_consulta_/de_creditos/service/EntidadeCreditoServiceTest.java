package com.apideconsultadecreditos.api_de_consulta_.de_creditos.service;

import com.apideconsultadecreditos.api_de_consulta_.de_creditos.repository.EntidadeCreditoRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EntidadeCreditoServiceTest {

    @Mock
    EntidadeCreditoRepository entidadeCreditoRepository;

    @InjectMocks
    EntidadeCreditoService entidadeCreditoService;

    @BeforeAll
    public static void init(){
        System.out.println("BeforeAll");
    }

    @BeforeEach
    public  void initEachTest(){
        System.out.println("BeforeEach");
    }

    @Test
    public  void meuPrimeiroTest(){
        System.out.println("Meu primeiro test");
    }
}
