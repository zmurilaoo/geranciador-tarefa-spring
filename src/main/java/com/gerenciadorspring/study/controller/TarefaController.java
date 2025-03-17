package com.gerenciadorspring.study.controller;


import com.gerenciadorspring.study.model.Tarefa;
import com.gerenciadorspring.study.service.ServiceTarefa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    private ServiceTarefa service;

    public TarefaController(ServiceTarefa service) {
        this.service = service;
    }

    @PostMapping
    public Tarefa receberTarefa(@RequestBody  Tarefa tarefa) {
            return service.salvar(tarefa);
    }

    @GetMapping("{id}")
    public Tarefa buscarPorId(@PathVariable("id") Long id) {
       return service.buscarPorId(id);

    }




}
