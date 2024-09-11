package primeiroExercicio;

import javax.xml.namespace.QName;

/*
    Faça um programa em Java para controlar um estoque de produtos utilizando um vetor de 100 posições.
O programa deverá viabilizar a entrada pelo teclado dos seguintes dados: nome do produto, quantidade em estoque e preço. 
Implemente as funcionalidades de inclusão de novos produtos e listagem dos produtos existentes no vetor.

No desenvolvimento crie obrigatoriamente uma classe produto contendo os atributos dos produtos e os métodos para definir e ler estes valores.

Crie também uma classe estoque, contendo o vetor e os métodos para armazenar produto obter produto, obter o total de produtos e retornar todo o estoque (uma cópia do vetor - utilizar o método clone).

Crie um teste para incluir produtos no estoque e fazer a leitura dos mesmos.
    */
 public class produto {
        private String nomeDoProduto;
        private int quantidadeEmEstoque;
        private double preco;

        public produto(String nomeDoProduto, int quantidadeEmEstoque, double preco){
            this.nomeDoProduto = nomeDoProduto;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
            this.preco = preco;
        }

        public String getNomeDoProduto(){
            return this.nomeDoProduto;
        }

        public void setNomeDoProduto(String n){
            this.nomeDoProduto = n;
        }

        public int getQuantidadeEmEstoque(){
            return this.quantidadeEmEstoque;
        }

        public void setQuantidadeEmEstoque(int q){
            this.quantidadeEmEstoque = q;
        }

        public double getPreco(){
            return this.preco;
        }

        public void setPreco(double p){
            this.preco = p;
        }
    }

