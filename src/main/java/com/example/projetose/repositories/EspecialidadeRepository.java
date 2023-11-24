package com.example.projetose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Especialidade;
import java.util.List;


public interface EspecialidadeRepository extends JpaRepository<Especialidade, Integer>{
}