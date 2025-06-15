package com.apideconsultadecreditos.api_de_consulta_.de_creditos.service;

import com.apideconsultadecreditos.api_de_consulta_.de_creditos.model.EntidadeCredito;
import com.apideconsultadecreditos.api_de_consulta_.de_creditos.repository.EntidadeCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntidadeCreditoService {

    @Autowired
    private EntidadeCreditoRepository entidadeCreditoRepository;

    public Optional<EntidadeCredito> getNumeroNfse(String NumeroNfse){

        return entidadeCreditoRepository.findByNumeroNfse(NumeroNfse);
    }

    public Optional<EntidadeCredito> getNumeroCredito(String numeroCredito){

        return entidadeCreditoRepository.findByNumeroCredito(numeroCredito);
    }
}
