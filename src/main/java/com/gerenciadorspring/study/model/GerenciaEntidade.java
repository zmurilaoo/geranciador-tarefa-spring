package com.gerenciadorspring.study.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "GerenciadorTarefas")
public class GerenciaEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeTarefa;

    private String descricao;

    private boolean conteudo;

    private LocalDateTime registroTarefa;

    private LocalDateTime conclusaoTarefa;

    public GerenciaEntidade(Integer id, String nomeTarefa, String descricao, boolean conteudo, LocalDateTime registroTarefa, LocalDateTime conclusaoTarefa) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
        this.descricao = descricao;
        this.conteudo = conteudo;
        this.registroTarefa = registroTarefa;
        this.conclusaoTarefa = conclusaoTarefa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConteudo() {
        return conteudo;
    }

    public void setConteudo(boolean conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getRegistroTarefa() {
        return registroTarefa;
    }

    public void setRegistroTarefa(LocalDateTime registroTarefa) {
        this.registroTarefa = registroTarefa;
    }

    public LocalDateTime getConclusaoTarefa() {
        return conclusaoTarefa;
    }

    public void setConclusaoTarefa(LocalDateTime conclusaoTarefa) {
        this.conclusaoTarefa = conclusaoTarefa;
    }



    @Override
    public String toString() {
        return "ID: " + getId() + ", Nome da Tarefa: " + getNomeTarefa()
                + ", Descrição: " + getDescricao() + ", Tarefa Concluida?: "
                +  getConclusaoTarefa() + ",  Hora de inicío da Tarefa: "
                + getRegistroTarefa() + ", Conclusão Tarefa: " + getConclusaoTarefa();
    }
}
