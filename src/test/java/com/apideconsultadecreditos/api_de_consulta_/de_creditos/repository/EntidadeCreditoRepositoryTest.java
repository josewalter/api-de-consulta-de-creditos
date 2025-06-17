package com.apideconsultadecreditos.api_de_consulta_.de_creditos.repository;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
public class EntidadeCreditoRepositoryTest {

    @Autowired
    EntidadeCreditoRepository entidadeCreditoRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("Caso de sucesso da busca do NumeroNfse")
    public void findByNumeroNfseTestSucess(){
        System.out.println("findByNumeroNfseTestSucess");
    }
}
