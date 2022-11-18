package br.com.inova.dto;

import br.com.inova.model.Cota;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class CotaDto {

    private int ID;
    private LocalDate DT_MOVIMENTO;
    private int COD_FUNDO;
    private double COTA_FUNDO;
    private String fundo;

    public CotaDto(Cota cota) {
        this.ID = cota.getID();
        this.DT_MOVIMENTO = cota.getDT_MOVIMENTO();
        this.COD_FUNDO = cota.getCOD_FUNDO();
        this.COTA_FUNDO = cota.getCOTA_FUNDO();
        this.fundo = cota.getFundo().getNOME_FUNDO();
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

    public String getFundo() {
        return fundo;
    }

    public static List<CotaDto> listaCota(List<Cota> cotas){
        return cotas.stream().map(CotaDto::new).collect(Collectors.toList());
    }
}
