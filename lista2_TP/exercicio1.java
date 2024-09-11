package lista2_TP;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Fazer um programa que leia o arquivo texto vgsales.csv original, com todas as suas 11 colunas e gere um
novo arquivo s´o que no seu formato bin´ario.
Para tanto transforme os campos Rank e Year para inteiros e os campos NA Sales, EU Sales, JP Sales,
Other Sales e Global Sales para double.
*/

public class exercicio1 {
    public static void main(String[] args) throws IOException {
        String nome, plataforma, genero, publicador;
        int rank, year;
        double NA_sales, EU_sales, JP_sales, Other_sales, Global_sales;
        

        File file = new File("D:/Desktop/novo_vgsales.txt");
        FileOutputStream arquivoDeSaida = new FileOutputStream("D:/Desktop/vgsales_binario.dat");
        DataOutputStream fluxoDeSaida = new DataOutputStream(arquivoDeSaida); 
		Scanner leitorNomes = null;
        
        
		try {

			leitorNomes = new Scanner(file);
			while (leitorNomes.hasNextLine() == true) {    
                String linha = leitorNomes.nextLine();
                String[] dadosJogos = linha.split(",");

                if (dadosJogos[0].equals("Rank")){

                }
                else{
                    rank = Integer.parseInt(dadosJogos[0]);
                    fluxoDeSaida.writeInt(rank);
                    System.out.println(rank);
                }

                if (dadosJogos[1].equals("Name")){

                }
                else{
                     nome = dadosJogos[1];
                     fluxoDeSaida.writeUTF(nome);
                }

                if (dadosJogos[2].equals("Platform")){

                }
                else{
                    plataforma = dadosJogos[2];
                    fluxoDeSaida.writeUTF(plataforma);
                }

                if (dadosJogos[3].equals("Year")){

                }
                else{
                    year = Integer.parseInt(dadosJogos[3]);
                    fluxoDeSaida.writeInt(year);
                }

                if (dadosJogos[4].equals("Genre")){

                }
                else{
                    genero = dadosJogos[4];
                    fluxoDeSaida.writeUTF(genero);
                }

                if (dadosJogos[5].equals("Publisher")){

                }
                else{
                    publicador = dadosJogos[5];
                    fluxoDeSaida.writeUTF(publicador);
                }

                if (dadosJogos[6].equals("NA_Sales")){

                }
                else{
                    NA_sales = Double.parseDouble(dadosJogos[6]);
                    fluxoDeSaida.writeDouble(NA_sales);
                }

                if (dadosJogos[7].equals("EU_Sales")){

                }
                else{
                    EU_sales = Double.parseDouble(dadosJogos[7]);
                    fluxoDeSaida.writeDouble(EU_sales);
                }

                if (dadosJogos[8].equals("JP_Sales")){

                }
                else{
                    JP_sales = Double.parseDouble(dadosJogos[8]);
                    fluxoDeSaida.writeDouble(JP_sales);
                }

                if (dadosJogos[9].equals("Other_Sales")){

                }
                else{
                    Other_sales = Double.parseDouble(dadosJogos[9]);
                    fluxoDeSaida.writeDouble(Other_sales);
                }

                if (dadosJogos[10].equals("Global_Sales")){

                }
                else{
                    Global_sales = Double.parseDouble(dadosJogos[10]);
                    fluxoDeSaida.writeDouble(Global_sales);
                }
			}
		} 
		catch (IOException e) {
			fluxoDeSaida.close();
		}

    }
}

