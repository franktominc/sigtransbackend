package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SinaisPneus extends GumgaModelUUID {
    @Column(name = "nome_sinais_pneus")
    private String nome;

    public SinaisPneus() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
