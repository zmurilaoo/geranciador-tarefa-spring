package com.gerenciadorspring.study.service;


import com.gerenciadorspring.study.model.GerenciaEntidade;
import com.gerenciadorspring.study.repository.GerenciaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service

public class GerenciaServico {


    private GerenciaRespository respository;


    private ValidarDescri validar;


    public GerenciaServico(GerenciaRespository respository, ValidarDescri validar) {
        this.respository = respository;
        this.validar = validar;
    }

    public GerenciaEntidade criarTarefa(GerenciaEntidade tarefa) {
        validar.validarDescri(tarefa);
        respository.save(tarefa);
        return tarefa;
    }



}
