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
public class Viatura {
    @Column(name="via_placa", length = 45, nullable=true)
    private String placa;
    @Column(name="via_combusivel", length = 45, nullable=false)
    private LocalDate combustivel;
    @Column(name="via_ultima_revisao", nullable=false)
    private String ultimaRevisao;
    private Integer km;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;    
//    via km int
//    stv id int
}

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Bombeiro) {
//            Bombeiro aux = (Bombeiro)obj;
//            
//            if((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {
//            
//        }else {
//            return false;
//        }
//    }
//        return false;
//    }
// @Override
// public int hashCode() {
//    return getClass().hashCode();
//    }
//
//}
