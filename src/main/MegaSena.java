package main;
import java.util.Random;
import java.util.Arrays;
 // @author Diego Roberto
public class MegaSena {
    public static void main(String[] args) {
        // gerador automático de números aleatórios para aposta com 6 números
        
        int[] aposta = new int[6];  //preenche array com valores (já aleatórios)
        
        for (int i = 0; i < aposta.length; i++) {
            aposta[i] = new Random().nextInt(60) + 1;            
        }        
        
        for (int i = 0; i < aposta.length; i++) {   //testa repetições de valores
            int numTemp = aposta[i];            
            if (contains(aposta, numTemp)) {
                numTemp = new Random().nextInt(60) + 1; //se já existe o valor, gera e testa outro
                if (contains(aposta, numTemp)) {
                    numTemp = new Random().nextInt(60) + 1;
                    aposta[i] = numTemp;
                }
            aposta[i] = numTemp;
            }
        }        
        
        Arrays.sort(aposta); //organiza em ordem crescente
        
        for (int i = 0; i < aposta.length; i++) {
            System.out.println(aposta[i]);
        }
    }    
    public static boolean contains(final int[] array, final int value) {
        
        boolean result = false;
        
        for(int i : array){
            if(i == value){
                result = true;
                break;
            }
        }
        return result;    
    }
}