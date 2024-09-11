package recursao;

/*
 Escreva uma fun¸c˜ao recursiva que receba uma string como parˆametro e retorne uma nova string que é o
reverso do string de entrada. Fa¸ca um programa principal para testar a fun¸c˜ao. 
*/

public class exercicio3 {
    public static void main(String[] args){
    String palavra = "arroz", resposta;
    int tamanho = palavra.length();

    System.out.println("Palavra antes da inversão: " + palavra);
    resposta = inverter(palavra, tamanho);
    System.out.println("Palavra após a inversão: " + resposta);

    }


static String inverter(String vetor, int tamanho){
    int i = 0;
    String novaPalavra = "";

    if ( i < tamanho){
        novaPalavra += vetor.charAt(tamanho-1) + inverter(vetor, tamanho-1);
    }
    return novaPalavra;
}
}


