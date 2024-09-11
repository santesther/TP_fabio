import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 Fazer um programa para apresentar quantas unidades foram vendidas de um determinado jogo (Em
milh˜oes de unidades). O programa dever´a perguntar o nome do jogo e apresentar a quantidade de unidades
vendidas.
O programa dever´a instanciar a classe Scanner com o construtor recebendo um objeto do tipo File.
Buscar os m´etodos para facilitar a leitura dos tokens separados por ”,” (v´ırgula).
Fazer a leitura enquanto o m´etodo hasNext() do objeto Scanner retornar True.

Super Mario Bros.
*/

public class exercicio3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
		Scanner leitorNomes = null;
        String nomeJogo;
        Scanner entradaDados = new Scanner(System.in);
        float quantidade=0;

        try {
            System.out.print("Informe o nome do jogo");
            nomeJogo = entradaDados.nextLine();
			leitorNomes = new Scanner(file);
			while (leitorNomes.hasNext() == true ) {
                String linha = leitorNomes.nextLine();
                String[] nomesJogos = linha.split(";");
				if (leitorNomes.hasNext(nomeJogo)){
                    System.out.println("quantidade de unidades vendidas do jogo " + leitorNomes.next() + " " + nomesJogos[2]);
                }
			}
		} 
		catch (IOException e) {
			
		} 
    }
}
