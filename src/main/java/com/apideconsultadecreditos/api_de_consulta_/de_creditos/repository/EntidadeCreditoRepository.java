package com.apideconsultadecreditos.api_de_consulta_.de_creditos.repository;

import com.apideconsultadecreditos.api_de_consulta_.de_creditos.model.EntidadeCredito;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntidadeCreditoRepository extends JpaRepository<EntidadeCredito, Id> {
    Optional<EntidadeCredito> findByNumeroNfse(String numeroNfse);

    Optional<EntidadeCredito> findByNumeroCredito(String numeroCredito);
}
