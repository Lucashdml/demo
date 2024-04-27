package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pessoa;
import com.example.demo.repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
