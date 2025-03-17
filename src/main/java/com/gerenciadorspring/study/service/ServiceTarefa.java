package com.gerenciadorspring.study.service;

import com.gerenciadorspring.study.model.Tarefa;
import com.gerenciadorspring.study.repository.RepositoryTarefa;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTarefa {

    private RepositoryTarefa repository;

    public ServiceTarefa(RepositoryTarefa repository) {
        this.repository = repository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        repository.save(tarefa);

        return tarefa;

    }


    public Tarefa buscarPorId(Long id) {
        Optional<Tarefa> tarefa = repository.findById(id);

        if (tarefa.isPresent()) {
            tarefa.get();
        }
        return null;

    }
}
