package main;

/*
@author Diego Roberto <github.com/diego-roberto>
*/

import java.util.Arrays;
import java.util.Random;

public class Gerador {

    public static int[] gerador(int numMax) {

        // gerador automático de números aleatórios para aposta com 6 números
        
        int[] aposta = new int[numMax];

        //preenche vetor
        for (int i = 0; i < aposta.length; i++) {
            aposta[i] = 0;
            System.out.printf("passou aqui %d vezes e aposta[i] eh %d", i, aposta[i]);
            System.out.println("");
        }
        //testa repetição de valores
        for (int i = 0; i < aposta.length; i++) {
            System.out.printf("passou aqui %d vezes", i);
            System.out.println("");
            int loopCheck = numMax;
            do {
                int numTemp = new Random().nextInt(60) + 1;
                if (Contains(aposta, numTemp)) {
                    numTemp = new Random().nextInt(60) + 1;
                } else {
                    aposta[i] = numTemp;
                    loopCheck--;
                }
            } while (loopCheck > 0); //só para quando todos os valores forem únicos no vetor aposta
        }

        Arrays.sort(aposta); //organiza em ordem crescente
        for (int i = 0; i < aposta.length; i++) {                  //exbibe no console <remover>
            System.out.println(aposta[i]);
        }
        return aposta;
        
    }
    
    public static boolean Contains(final int[] array, final int value) {

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
