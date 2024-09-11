package primeiroExercicio;

import java.util.Scanner;

/*
    Faça um programa em Java para controlar um estoque de produtos utilizando um vetor de 100 posições.
O programa deverá viabilizar a entrada pelo teclado dos seguintes dados: nome do produto, quantidade em estoque e preço. 
Implemente as funcionalidades de inclusão de novos produtos e listagem dos produtos existentes no vetor.

No desenvolvimento crie obrigatoriamente uma classe produto contendo os atributos dos produtos e os métodos para definir e ler estes valores.

Crie também uma classe estoque, contendo o vetor e os métodos para armazenar produto obter produto, obter o total de produtos e retornar todo o estoque (uma cópia do vetor - utilizar o método clone).

Crie um teste para incluir produtos no estoque e fazer a leitura dos mesmos.
    */

public class estoque {
    private produto[] vetorProdutos = new produto[100];
    private int totalProdutos = 0;

    public produto obterProdutos(int indiceDoProduto){
        return this.vetorProdutos[indiceDoProduto];
    }

    public void incluirProduto(produto produtoParaSerIncluido){
        this.vetorProdutos[totalProdutos] = produtoParaSerIncluido;
        totalProdutos++;
    }

    public int obterTotalProdutos(){
        return this.totalProdutos;
    }

    public produto[] obterEstoque(){
        return this.vetorProdutos.clone();
    }
}
