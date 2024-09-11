package lista2_TP;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
Fazer um programa para apresentar quem fez a maior venda de um t´ıtulo de videogame, se foi o Jap˜ao
ou os Estados unidos, informando tamb´em qual foi a quantidade vendida.
*/

public class exercicio3 {
    public static void main(String[] args) throws IOException {
        String nome, plataforma, genero, publisher;
	    int rank, ano;
	    double NA_sales, EU_sales, JP_sales, Other_sales, Global_sales, valor = 0;
	    boolean finalDoArquivo = false;
        int numero = 0;
        


        FileInputStream arquivoDeEntrada = new FileInputStream("D:/Desktop/vgsales_binario.dat");
	    DataInputStream fluxoDeEntrada = new DataInputStream(arquivoDeEntrada);

	    
	    while (finalDoArquivo == false) {	    	
	    	try {
                rank = fluxoDeEntrada.readInt();
                nome = fluxoDeEntrada.readUTF();
	    		plataforma = fluxoDeEntrada.readUTF();
                ano = fluxoDeEntrada.readInt();
	    		genero = fluxoDeEntrada.readUTF();
	    		publisher = fluxoDeEntrada.readUTF();
	    		NA_sales = fluxoDeEntrada.readDouble();
                EU_sales = fluxoDeEntrada.readDouble();
                JP_sales = fluxoDeEntrada.readDouble();
	    		
                if (NA_sales > JP_sales && NA_sales > valor ){
                    valor = NA_sales;
                    numero = 0;
                }

                if (JP_sales > NA_sales && JP_sales > valor ){
                    valor = JP_sales;
                    numero = 1;
                }

	    		
	    	} catch (Exception EOFException) {
	    		finalDoArquivo = true;
	    	}
	    }
        if (numero == 0){
            System.out.println("EUA vendeu mais cópias " + valor);
        }
        if (numero == 1){
            System.out.println("Japão vendeu mais cópias " + valor);
        }
	fluxoDeEntrada.close();  
        }
    }
    