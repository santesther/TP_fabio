package primeiroExercicio;

import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        int opcao;
        Scanner entradaDados = new Scanner(System.in);

        estoque e1 = new estoque();

        do{
            System.out.println("********************");
            System.out.println("Entre com uma opção: 1- Listagem | 2- Inclusão | 3- Sair");
            opcao = entradaDados.nextInt();
            switch(opcao){
                case 1: listarProdutos(e1);
                break;
                case 2: produto produtoParaIncluir = cadastrarProduto();
                e1.incluirProduto(produtoParaIncluir);
            }
        } while (opcao < 3);
    }

    static void listarProdutos(estoque e1){
        System.out.println("Total de produtos no estoque: " + e1.obterTotalProdutos());
        System.out.println("Listagem dos produtos");
        for (int indiceDoProduto = 0; indiceDoProduto < e1.obterTotalProdutos(); indiceDoProduto++){
            System.out.println(e1.obterEstoque()[indiceDoProduto].getNomeDoProduto());
            System.out.println(e1.obterEstoque()[indiceDoProduto].getQuantidadeEmEstoque());
            System.out.println(e1.obterEstoque()[indiceDoProduto].getPreco());
            System.out.println("------------------------------------------------------");
        }
    }

    static produto cadastrarProduto(){
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Informe o nome do produto");
        String nomeDoProduto = entradaDados.nextLine();
        System.out.println("Informe a quantidade em estoque do produto");
        int quantidadeEmEstoque = entradaDados.nextInt();
        System.out.println("Informe o preço do produto");
        double preco = entradaDados.nextDouble();
        return new produto(nomeDoProduto, quantidadeEmEstoque, preco);
    }
}
