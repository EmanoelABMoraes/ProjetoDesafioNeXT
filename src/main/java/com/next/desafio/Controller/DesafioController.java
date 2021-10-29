package com.next.desafio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
  public class DesafioController {
    @Autowired
    private DesafioService meuService;
    @GetMapping("desafio")
    public String resolverDesafio(@RequestParam(name = "input") int[] numeros, @RequestParam(name = "soma") int soma){
        System.out.println("numeros: " + Arrays.toString(numeros) + " , soma:  " + soma);
        return "Resultado: " + meuService.calcular(numeros, soma);
    }

}
