package com.next.desafio.Controller;

import org.springframework.stereotype.Service;

@Service
public class DesafioService {
    public int calcular(int[] numeros, int soma){
        int total=0;
        for(int i = 0; i < numeros.length-1; i++){
            for(int j = i + 1; j < numeros.length; j++){
                if(numeros[i]+numeros[j]==soma){
                    total++;
                }
            }
        }
        return total;
    }
}
