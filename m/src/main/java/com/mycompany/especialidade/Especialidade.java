/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especialidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
/**
 *
 * @author aluno
 */
@Entity
@Table(name="Especialidade")
public class Especialidade {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="esp_descricao", length = 45, nullable=false)
    private String descricao;
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Especialidade) {
            Especialidade aux = (Especialidade)obj;
            
            if((aux.getId().equals(this.getId())) && (aux.getDescricao().equals(this.getDescricao()))) {
            
        }else {
            return false;
        }
    }
        return false;
    }
 @Override
 public int hashCode() {
    return getClass().hashCode();
    }

}

