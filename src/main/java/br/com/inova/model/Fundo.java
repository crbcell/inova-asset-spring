package br.com.inova.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Fundo {
    @Id
    private int ID;
    private String NOME_FUNDO;
    private String CNPJ_FUNDO;
    private LocalDate DATA_ABERTURA_FUNDO;
    private LocalDate DATA_ENCERRAMENTO_FUNDO;
    private String RISCO_FUNDO;

    public Fundo() {
    }

    public Fundo(int ID, String NOME_FUNDO, String CNPJ_FUNDO, LocalDate DATA_ABERTURA_FUNDO, LocalDate DATA_ENCERRAMENTO_FUNDO, String RISCO_FUNDO) {
        this.ID = ID;
        this.NOME_FUNDO = NOME_FUNDO;
        this.CNPJ_FUNDO = CNPJ_FUNDO;
        this.DATA_ABERTURA_FUNDO = DATA_ABERTURA_FUNDO;
        this.DATA_ENCERRAMENTO_FUNDO = DATA_ENCERRAMENTO_FUNDO;
        this.RISCO_FUNDO = RISCO_FUNDO;
    }

    public int getID() {
        return ID;
    }

    public String getCNPJ_FUNDO() {
        return CNPJ_FUNDO;
    }
    public String getNOME_FUNDO() {
        return NOME_FUNDO;
    }

    public LocalDate getDATA_ABERTURA_FUNDO() {
        return DATA_ABERTURA_FUNDO;
    }

    public LocalDate getDATA_ENCERRAMENTO_FUNDO() {
        return DATA_ENCERRAMENTO_FUNDO;
    }

    public String getRISCO_FUNDO() {
        return RISCO_FUNDO;
    }
}
