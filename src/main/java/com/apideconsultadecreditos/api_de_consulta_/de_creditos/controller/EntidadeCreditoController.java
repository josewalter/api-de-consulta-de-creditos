package com.apideconsultadecreditos.api_de_consulta_.de_creditos.controller;

import com.apideconsultadecreditos.api_de_consulta_.de_creditos.model.EntidadeCredito;
import com.apideconsultadecreditos.api_de_consulta_.de_creditos.service.EntidadeCreditoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
@CrossOrigin(origins = "4200")
public class EntidadeCreditoController {

    @Autowired
    private EntidadeCreditoService entidadeCreditoService;

    @GetMapping("/api/creditos/{numeroNfse}")
    public ResponseEntity<Object> getNumeroNfseController(@PathVariable(value = "numeroNfse") String numeroNfse ) {
        Optional<EntidadeCredito> entidadeCreditoOptional = entidadeCreditoService.getNumeroNfse(numeroNfse);
        if(entidadeCreditoOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("numeroNfse não encontrada, verifique os dados e tente novamente!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

    @GetMapping("/api/creditos/credito/{numeroCredito}")
    public ResponseEntity<Object> getNumeroCreditoController(@PathVariable(value = "numeroCredito") String numeroCredito ) {
        Optional<EntidadeCredito> entidadeCreditoOptional = entidadeCreditoService.getNumeroCredito(numeroCredito);
        if(entidadeCreditoOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("numeroCredito não encontrada, verifique os dados e tente novamente!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
}
