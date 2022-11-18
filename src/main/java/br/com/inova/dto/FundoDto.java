package br.com.inova.dto;

import br.com.inova.model.Fundo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FundoDto {
    private int ID;
    private String NOME_FUNDO;
    private String CNPJ_FUNDO;
    private LocalDate DATA_ABERTURA_FUNDO;
    private LocalDate DATA_ENCERRAMENTO_FUNDO;
    private String RISCO_FUNDO;


    public FundoDto(Fundo fundo) {
        this.ID = fundo.getID();
        this.NOME_FUNDO = fundo.getNOME_FUNDO();
        this.CNPJ_FUNDO = fundo.getCNPJ_FUNDO();
        this.DATA_ABERTURA_FUNDO = fundo.getDATA_ABERTURA_FUNDO();
        this.DATA_ENCERRAMENTO_FUNDO = fundo.getDATA_ENCERRAMENTO_FUNDO();
        this.RISCO_FUNDO = fundo.getRISCO_FUNDO();
    }

    public int getID() {
        return ID;
    }

    public String getNOME_FUNDO() {
        return NOME_FUNDO;
    }

    public String getCNPJ_FUNDO() {
        return CNPJ_FUNDO;
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

    public static List<FundoDto> listaFundo(List<Fundo> fundos){
        return fundos.stream().map(FundoDto::new).collect(Collectors.toList());
    }
    public static List<FundoDto> listaFundosAtivos(List<Fundo> fundos){
        return fundos.stream().map(FundoDto::new).collect(Collectors.toList());
    }
}
