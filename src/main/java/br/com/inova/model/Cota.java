package br.com.inova.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cota {

    @Id
    private int ID;
    private LocalDate DT_MOVIMENTO;
    private int COD_FUNDO;
    private double COTA_FUNDO;
    @ManyToOne(fetch= FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="COD_FUNDO", referencedColumnName = "ID", nullable=false, insertable=false, updatable=false)
    private Fundo fundo;

    public Cota() {
    }

    public Cota(int ID, LocalDate DT_MOVIMENTO, int COD_FUNDO, double COTA_FUNDO, Fundo fundo) {
        this.ID = ID;
        this.DT_MOVIMENTO = DT_MOVIMENTO;
        this.COD_FUNDO = COD_FUNDO;
        this.COTA_FUNDO = COTA_FUNDO;
        this.fundo = fundo;
    }

    public Fundo getFundo() {
        return fundo;
    }

    public int getID() {
        return ID;
    }

    public LocalDate getDT_MOVIMENTO() {
        return DT_MOVIMENTO;
    }

    public int getCOD_FUNDO() {
        return COD_FUNDO;
    }

    public double getCOTA_FUNDO() {
        return COTA_FUNDO;
    }
}
