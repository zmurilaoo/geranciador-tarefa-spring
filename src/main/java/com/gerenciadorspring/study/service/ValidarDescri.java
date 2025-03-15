package com.gerenciadorspring.study.service;

import com.gerenciadorspring.study.model.GerenciaEntidade;
import com.gerenciadorspring.study.repository.GerenciaRespository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidarDescri {

    @Autowired
    private GerenciaRespository respository;


    public void validarDescri(GerenciaEntidade tarefa){
        if (existeDescricao(tarefa.getDescricao())) {
            throw  new IllegalArgumentException("Já existe uma descrição como essa!");
        }

    }

    private   boolean existeDescricao(String descricao) {
        return respository.findByDescricao(descricao);
    }


}
