package lista2_TP.exercicio4;

import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);
        listaDeJogos lista1 = new listaDeJogos();
        int opcao;
        do{
        System.out.println("--------- MENU DE OPÇÕES ---------");
        System.out.println("Escolha uma opção: 1- Adicionar jogo | 2- Excluir jogo | 3- Listar jogos | 4- Sair");
        opcao = entradaDados.nextInt();
        switch(opcao){
            case 1: adicionarJogos(lista1);
            break;
            case 2: excluirJogo(lista1);
            break;
            case 3: listarJogos(lista1);
            break;
        }
        } while (opcao != 4);
            }

            private static void adicionarJogos(listaDeJogos lista1) {
                Scanner leitorDoTeclado = new Scanner(System.in);
                String nome, plataforma;
                int ano;
                double globalSales;
        
                System.out.println("Informe o nome do jogo");
                nome = leitorDoTeclado.nextLine();
                System.out.println("Informe a plataforma do jogo");
                plataforma = leitorDoTeclado.nextLine();
                System.out.println("Informe o ano do jogo");
                ano = leitorDoTeclado.nextInt();
                System.out.println("Informe a quantidade de vendas globais do jogo");
                globalSales = leitorDoTeclado.nextDouble();
                jogo jogo = new jogo(nome, plataforma, ano, globalSales);
                lista1.adicionarJogos(jogo);
    }

            private static void listarJogos(listaDeJogos listaDeJogos){
                int totalDeJogos = listaDeJogos.obterTotalDeJogos();
                jogo Jogo;
                for (int i = 0; i < totalDeJogos; i++){
                    Jogo = listaDeJogos.obterJogo(i);
                    System.out.println("******************");
                    System.out.println("Nome do jogo: " + Jogo.obterNome());
                    System.out.println("Plataforma: " + Jogo.obterPlataforma());
                    System.out.println("Ano de lançamento: " + Jogo.obterAno());
                    System.out.println("Total de vendas globais: " + Jogo.obterGlobalSales());
                }
            }

            public static void excluirJogo(listaDeJogos lista1){
                boolean excluir;
                excluir = lista1.excluirJogo();
                if (excluir == true){
                    System.out.println("Jogo excluído ");
                } else{
                    System.out.println("Indisponível na lista");
                }
            }
        }


