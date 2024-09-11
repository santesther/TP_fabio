package lista1_correta;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/*
LISTA SYSTEM IN SYSTEM OUT E SCANNER
- O segundo programa dever´a instanciar a classe Scanner com o construtor recebendo um objeto do tipo
File. Buscar os m´etodos para facilitar a leitura dos tokens separados por ”,” (v´ırgula). Fazer a leitura
enquanto o m´etodo hasNext() do objeto Scanner retornar True.
*/

public class exercicio1_v2 {
    public static void main(String[] args) throws IOException {
        File arquivoJogos = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
		Scanner leitorNomes = new Scanner(arquivoJogos);
        String linha;

        while (leitorNomes.hasNext()== true){
            linha = leitorNomes.nextLine();
            String vetorNomes[] = linha.split(";");
            System.out.println("Nome dos jogos: " + vetorNomes[0]);
        }

    }
}
