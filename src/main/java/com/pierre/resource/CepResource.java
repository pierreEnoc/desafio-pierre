package com.pierre.resource;

import com.pierre.entities.Endereco;
import com.pierre.sercice.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepResource {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> getCep(@PathVariable String cep) {
        Endereco endereco = cepService.buscaEnderecoPorCep(cep);
        return endereco !=null ? ResponseEntity.ok().body(endereco) :
                ResponseEntity.notFound().<Endereco>build();
    }
}
