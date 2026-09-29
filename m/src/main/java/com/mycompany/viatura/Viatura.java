/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viatura;

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
@Table(name="Viatura")
public class Viatura {
    
    @Column(name="via_placa", length = 45, nullable=true, unique=true)
    private String placa;
    @Column(name="via_combusivel", length = 45, nullable=false, unique= true)
    private String combustivel;
    @Column(name="via_ultima_revisao", nullable=false, unique=false)
    private LocalDate ultimaRevisao;

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="via_km")
    private Integer km;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="via_id")
    private Integer id;  
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the ultimaRevisao
     */
    public LocalDate getUltimaRevisao() {
        return ultimaRevisao;
    }

    /**
     * @param ultimaRevisao the ultimaRevisao to set
     */
    public void setUltimaRevisao(LocalDate ultimaRevisao) {
        this.ultimaRevisao = ultimaRevisao;
    }

    /**
     * @return the km
     */
    public Integer getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(Integer km) {
        this.km = km;
    }

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

//    via km int
//    stv id int

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura)obj;
            
            if((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {    
        }else {
            return false;
            }
        }else {
            return false;
        }
        return false;
    }
    @Override
    public int hashCode() {
    return getClass().hashCode();
    }
}

