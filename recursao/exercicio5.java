package recursao;

import java.util.Scanner;

/*
Fa¸ca um programa para converter n´umeros da base decimal para bin´ario e octal. O seu programa dever´a
utilizar uma fun¸c˜ao recursiva para convers˜ao. A sua fun¸c˜ao retornar´a uma string que vai sendo concatenada
na medida em que os resultados das divis˜oes s˜ao obtidos 
*/

public class exercicio5 {
    public static void main(String[] args){
        int numero;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Digite o número que queira passar para binário");
        numero = entradaTeclado.nextInt();
        String qualquer = decimalParaBinario(numero);
        System.out.println(qualquer);
    }

    private static String decimalParaBinario(int n) {
        String numeroBinario = "";
        if (n > 0){
            int resto = (n%2);
            numeroBinario = decimalParaBinario(n/2) + resto;  
        } 
        return numeroBinario;
    }
}

