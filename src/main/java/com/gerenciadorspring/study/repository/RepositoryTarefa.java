package com.gerenciadorspring.study.repository;

import com.gerenciadorspring.study.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTarefa extends JpaRepository<Tarefa, Long> {
}
