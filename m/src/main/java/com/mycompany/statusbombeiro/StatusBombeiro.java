package com.mycompany.statusbombeiro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "StatusBombeiro")
public class StatusBombeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stb_id")
    private Integer id;

    @Column(name = "stb_descricao", length = 45)
    private String descricao;

    @Column(name = "stb_sigla", length = 5)
    private String sigla;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StatusBombeiro aux = (StatusBombeiro) obj;
        return Objects.equals(id, aux.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}