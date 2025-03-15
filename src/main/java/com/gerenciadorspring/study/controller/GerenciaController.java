package com.gerenciadorspring.study.controller;


import com.gerenciadorspring.study.model.GerenciaEntidade;
import com.gerenciadorspring.study.service.GerenciaServico;
import org.hibernate.generator.internal.GeneratedGeneration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;

@RestController
@RequestMapping("/gerencia")
public class GerenciaController {

    private GerenciaServico servico;

    @PostMapping
    public GerenciaEntidade receberJson(GerenciaEntidade tarefa) {
        try {
            return this.servico.criarTarefa(tarefa);
        }catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());

        }


    }



}
