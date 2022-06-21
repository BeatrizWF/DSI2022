package br.univille.petservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private long peso;
    private String sexo;
    private String especie;
    private String raca;
    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public long getPeso() {
        return peso;
    }
    public void setPeso(long peso) {
        this.peso = peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }




    
}
