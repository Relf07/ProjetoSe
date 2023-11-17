package com.example.projetose.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Medico;
import com.example.projetose.entities.Especialidade;


public interface MedicoRepository extends JpaRepository<Medico, Long> {
    List<Medico> findByEspecialidades(List<Especialidade> especialidades);
}