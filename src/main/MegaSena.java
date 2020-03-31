package main;

/*
@author Diego Roberto <github.com/diego-roberto>
*/

import java.util.Arrays;
import java.util.Random;

public class Gerador {

    public Integer[] criaAposta(Integer numMax) {

        // gerador automático de números aleatórios para apostas com 6 até 15 números
                
        Integer[] aposta = new Integer[numMax];

        //preenche vetor
        for (int i = 0; i < aposta.length; i++) {
            aposta[i] = 0;
        }
        //testa repetição de valores
        for (int i = 0; i < aposta.length; i++) {            
            int loopCheck = numMax;
            do {
                Integer numTemp = new Random().nextInt(60) + 1;
                if (Contains(aposta, numTemp)) {
                    numTemp = new Random().nextInt(60) + 1;
                } else {
                    aposta[i] = numTemp;
                    loopCheck--;
                }
            } while (loopCheck > 0); //só para quando todos os valores forem únicos no vetor aposta
        }

        Arrays.sort(aposta); //organiza em ordem crescente
        
        return aposta;
        
    }
    
    public static boolean Contains(final Integer[] array, final int value) {

        boolean result = false;

        for (int i : array) { //testa com todos os itens do array
            if (i == value) {
                result = true;
                break;
            }
        }
        return result;
    }
}
