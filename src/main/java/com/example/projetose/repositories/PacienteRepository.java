package com.example.projetose.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetose.entities.Paciente;
import com.example.projetose.entities.Consulta;


public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    
}
