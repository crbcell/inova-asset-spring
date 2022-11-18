package br.com.inova.controller;

import br.com.inova.dto.CotaDto;

import br.com.inova.model.Cota;

import br.com.inova.repository.CotaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CotaController {

    @Autowired
    private CotaRepository cotaRepository;

    @GetMapping(value = "/cotas", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CotaDto> listaCota() {
        List<Cota> cta = this.cotaRepository.findAll();
        return CotaDto.listaCota(cta);
    }

    @GetMapping(value = "/cotas/{cod}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CotaDto> listaCota(@PathVariable("cod") int cod) {
        List<Cota> cta = this.cotaRepository.findQuotaByCodFund(cod);
        return CotaDto.listaCota(cta);
    }

}