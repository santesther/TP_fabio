
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/*
Fazer um programa para apresentar a soma de todas as vendas de jogos de videogames (Em milh˜oes de
unidades).
O primeiro programa dever´a utilizar o objeto System.in com o seu fluxo de entrada padr˜ao redirecionado.
Fazer a leitura at´e que chegue o final do arquivo, isto ´e, a vari´avel inteira que recebe o byte lido ganhe o
valor -1.
Dica:
Esta linha concatena duas vari´aveis do tipo char em uma string, transforma a string para inteiro, soma o
valor 10 e faz a impress˜ao do resultado na tela. E prov´avel que vocˆe precise de um racioc´ınio semelhante a ´
este no seu programa. System.out.println(Integer.parseInt(”” + (char)dados[0] + (char)dados[1]) + 10);
*/


public class exercicio4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
		Scanner leitorNomes = null;
        int variavel;
        double somaTotal = 0;

        variavel = System.in.read();

		try {
			leitorNomes = new Scanner(file);
			while (variavel != -1) {
                String linha = leitorNomes.nextLine();
                String[] nomesJogos = linha.split(";");
                if (nomesJogos[2].equals("Global_Sales")){
                    linha = leitorNomes.nextLine();
                    somaTotal += Integer.parseInt(nomesJogos[2]);
                    System.out.println("Soma de todas as vendas de jogos " + somaTotal + " em milhões de unidades");
                }
                }
		} 
        catch (IOException e) {
        }
    }
		
    }

