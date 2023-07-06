package com.br.joel.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.joel.pagamentos.DTO.PagamentoDTO;
import com.br.joel.pagamentos.services.PagamentoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoContoller {


    @Autowired
    private  PagamentoService pagamentoService;


    @GetMapping
    public ResponseEntity<Page<PagamentoDTO>> getAll(Pageable pageable) {


        return ResponseEntity.ok(pagamentoService.findAll(pageable));

    
    }

    @GetMapping("/{id}")
    public ResponseEntity<PagamentoDTO> getById( @Valid @PathVariable Long id) {
        return ResponseEntity.ok(pagamentoService.findById(id));
    }   

    @PostMapping
    public ResponseEntity<PagamentoDTO> create( @Valid @RequestBody PagamentoDTO pagamentoDTO) {
        return ResponseEntity.ok(pagamentoService.save(pagamentoDTO));
    
    }

    @PutMapping("/{id}")
    public ResponseEntity<PagamentoDTO> update(@Valid @PathVariable Long id, @RequestBody PagamentoDTO pagamentoDTO) {
        return ResponseEntity.ok(pagamentoService.update(id, pagamentoDTO));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        pagamentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
