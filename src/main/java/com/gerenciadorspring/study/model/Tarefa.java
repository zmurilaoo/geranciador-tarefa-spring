package com.gerenciadorspring.study.model;


import jakarta.persistence.*;

@Entity

@Table(name = "tarefas")

public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String conteudo;
    private String descricao;

    public Tarefa(Long id, String nome, String conteudo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.conteudo = conteudo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ID: " + getId()  + ", NOME: " + getNome()  +
                ", CONTEÚDO: " +getConteudo() +
                ", DESCRIÇÃO" + getDescricao();
    }
}
