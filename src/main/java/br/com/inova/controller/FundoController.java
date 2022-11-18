package br.com.inova.controller;

import br.com.inova.repository.FundoRepository;
import br.com.inova.dto.FundoDto;
import br.com.inova.model.Fundo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FundoController {

    @Autowired
    private FundoRepository fundoRepository;

    @GetMapping(value = "/fundos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FundoDto> listaFundo() {
        List<Fundo> fnd = this.fundoRepository.findAll();
        return FundoDto.listaFundo(fnd);
    }

    @GetMapping(value = "/fundos/ativos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FundoDto> listaFundosAtivos() {
        List<Fundo> fndAtv = this.fundoRepository.findFundosAtivos();
        return FundoDto.listaFundosAtivos(fndAtv);
    }

    @GetMapping(value = "/fundos/{risco}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FundoDto> listaFundo(@PathVariable("risco") String risco) {
        List<Fundo> rsc = this.fundoRepository.findFundoByRisco(risco);
        return FundoDto.listaFundo(rsc);
    }

}