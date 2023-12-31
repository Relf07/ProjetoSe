package com.example.projetose.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="posto_especialidade")

@NamedQuery(name = "PostoEspecialiade.getPostosporEspecialidade", query ="SELECT pe FROM posto_especialidade pe WHERE pe.especialidade.id=:idEspecialidade")

public class PostoEspecialidade{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToAny
    @JoinColumn(name = "medico_id")
    private PostoSaude posto;

    @ManyToAny
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;


    

}
