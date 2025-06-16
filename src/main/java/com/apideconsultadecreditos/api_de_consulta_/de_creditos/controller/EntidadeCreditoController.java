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

    @PostMapping("/api/creditos/")
    @ResponseBody
    public ResponseEntity<EntidadeCredito> salvarEntidadeCreditoController(@RequestBody @Valid EntidadeCredito entidadeCredito) {
        var salvarEntidadeCredito = new EntidadeCredito();
        BeanUtils.copyProperties(entidadeCredito, salvarEntidadeCredito);
        return ResponseEntity.status(HttpStatus.CREATED).body(entidadeCreditoService.salvarEntidadeCredito(salvarEntidadeCredito));
    }

    @GetMapping("/api/creditos/{numeroNfse}")
    public ResponseEntity<Object> getNumeroNfseController(@PathVariable(value = "numeroNfse") String numeroNfse ) {
        Optional<EntidadeCredito> entidadeCreditoOptional = entidadeCreditoService.getNumeroNfse(numeroNfse);
        if(entidadeCreditoOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("numeroNfse não encontrada, verifique os dados e tente novamente!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(entidadeCreditoOptional.get());
    }

    @GetMapping("/api/creditos/credito/{numeroCredito}")
    public ResponseEntity<Object> getNumeroCreditoController(@PathVariable(value = "numeroCredito") String numeroCredito ) {
        Optional<EntidadeCredito> entidadeCreditoOptional = entidadeCreditoService.getNumeroCredito(numeroCredito);
        if(entidadeCreditoOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("numeroCredito não encontrada, verifique os dados e tente novamente!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(entidadeCreditoOptional.get());
    }
}
