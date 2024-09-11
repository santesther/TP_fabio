
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* 
- O primeiro programa dever´a utilizar o objeto System.in com o seu fluxo de entrada padr˜ao redirecionado.
Fazer a leitura at´e que chegue o final do arquivo, isto ´e, a vari´avel inteira que recebe o byte lido ganhe o
valor -1.

*/


public class exercicio {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
		Scanner leitorNomes = null;
        int variavel;

        variavel = System.in.read();

		try {
			leitorNomes = new Scanner(file);
			while (variavel != -1) {
                String linha = leitorNomes.nextLine();
                String[] nomesJogos = linha.split(";");
				System.out.println(nomesJogos[0]);
			}
		} 
		catch (IOException e) {
        }
    }
}
