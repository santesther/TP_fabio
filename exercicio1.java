
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
- O segundo programa dever´a instanciar a classe Scanner com o construtor recebendo um objeto do tipo
File. Buscar os m´etodos para facilitar a leitura dos tokens separados por ”,” (v´ırgula). Fazer a leitura
enquanto o m´etodo hasNext() do objeto Scanner retornar True
*/

public class exercicio1 {
    public static void main(String[] args) throws IOException {

        File file = new File("D:/workplaceIDE/tecnicasP/src/tecnicasP/vgsalesModificado.txt");
		Scanner leitorNomes = null;
		try {
			leitorNomes = new Scanner(file);
			while (leitorNomes.hasNextLine() == true ) {
                String linha = leitorNomes.nextLine();
                String[] nomesJogos = linha.split(";");
				System.out.println(nomesJogos[0]);
			}
		} 
		catch (IOException e) {
			
		} 
    }
}
