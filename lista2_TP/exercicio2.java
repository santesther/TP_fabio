package lista2_TP;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
Fa¸ca um programa para realizar a leitura do arquivo bin´ario anteriormente criado e apresentar todos os
seus campos na tela
*/

public class exercicio2 {
    public static void main(String[] args) throws IOException {
        String nome, plataforma, genero, publisher;
	    int rank, ano;
	    double NA_sales, EU_sales, JP_sales, Other_sales, Global_sales;
	    boolean finalDoArquivo = false;


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
                Other_sales = fluxoDeEntrada.readDouble();
                Global_sales = fluxoDeEntrada.readDouble();
	    		
                System.out.println("Rank: " + rank);
                System.out.println("Nome: " + nome);
                System.out.println("Plataforma: " + plataforma);
                System.out.println("Ano: " + ano);
                System.out.println("Genre: " + genero);
                System.out.println("Publisher: " + publisher);
                System.out.println("NA Sales: " + NA_sales);
                System.out.println("EU Sales: " + EU_sales);
                System.out.println("JP Sales: " + JP_sales);
                System.out.println("Other Sales: " + Other_sales);
                System.out.println("Global Sales: " + Global_sales);
	    		
	    	} catch (Exception EOFException) {
	    		finalDoArquivo = true;
	    	}
	    }
	    arquivoDeEntrada.close();
	  }
    }

