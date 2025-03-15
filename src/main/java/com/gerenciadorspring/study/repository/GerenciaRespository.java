package com.gerenciadorspring.study.repository;

import com.gerenciadorspring.study.model.GerenciaEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.Inet4Address;

public interface GerenciaRespository extends JpaRepository<Integer, GerenciaEntidade> {

    public boolean findByDescricao(String msg);

    GerenciaEntidade save(GerenciaEntidade tarefa);
}
