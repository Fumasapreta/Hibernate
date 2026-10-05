    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.bombeiro;

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
    @Table(name="Bombeiro")
    public class Bombeiro {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;
        @Column(name="bom cpf", length = 11, nullable=true)
        private String cpf;
        @Column(name="bom_data_nascimento", nullable=false)
        private LocalDate dataNascimento;
        @Column(name="bom_nome_completo", length = 45, nullable=false)
        private String nomeCompleto;
        @Column(name="bom_nome_guerra", length = 45, nullable=false)
        private String guerra;

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
         * @return the cpf
         */
        public String getCpf() {
            return cpf;
        }

        /**
         * @param cpf the cpf to set
         */
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        /**
         * @return the dataNascimento
         */
        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        /**
         * @param dataNascimento the dataNascimento to set
         */
        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        /**
         * @return the nomeCompleto
         */
        public String getNomeCompleto() {
            return nomeCompleto;
        }

        /**
         * @param nomeCompleto the nomeCompleto to set
         */
        public void setNomeCompleto(String nomeCompleto) {
            this.nomeCompleto = nomeCompleto;
        }

        /**
         * @return the guerra
         */
        public String getGuerra() {
            return guerra;
        }

        /**
         * @param guerra the guerra to set
         */
        public void setGuerra(String guerra) {
            this.guerra = guerra;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Bombeiro) {
                Bombeiro aux = (Bombeiro)obj;

                if((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {

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

