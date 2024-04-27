package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pessoa;
import com.example.demo.service.PessoaService;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }
}
