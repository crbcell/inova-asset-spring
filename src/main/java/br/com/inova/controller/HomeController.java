package br.com.inova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        System.out.println("Log do servidor que foi feita uma requisicao para '/'");
        return "Bem vindo ao Processo Seletivo BB Asset";
    }

}
