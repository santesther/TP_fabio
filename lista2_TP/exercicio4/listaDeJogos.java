package lista2_TP.exercicio4;

import java.util.Scanner;

/*
Na classe ListaDeJogos dever´a ser criado o vetor de objetos Jogo bem como os m´etodos para inclus˜ao e
exclus˜ao de jogos no vetor. Tamb´em dever´a estar implementado um m´etodo para retornar o vetor viabilizando assim que o mesmo seja listado no programa principal (esta abordagem ser´a alterada futuramente
para a clonagem do objeto).
Por enquanto a inclus˜ao e exclus˜ao de um jogo acontecer´a sempre no final da lista de jogos.

considerar só name, platform, year e global sales.
*/

public class listaDeJogos {
        jogo listaDeJogos[];
        int totalDeJogos;
       
         public listaDeJogos() {
             this.listaDeJogos = new jogo[17000];
             this.totalDeJogos = 0;
         }

        public listaDeJogos(int tamanhoMaximoDaLista){
            this.listaDeJogos = new jogo[tamanhoMaximoDaLista];
            this.totalDeJogos = 0;
        }

       
        public void adicionarJogos(jogo jogo){
            this.listaDeJogos[totalDeJogos] = jogo;
            this.totalDeJogos++;
        }

        public boolean excluirJogo(){
            if (this.totalDeJogos > 0){
                this.totalDeJogos--;
                return true;
            }
            return false;
        }

        public jogo obterJogo(int indiceDoJogo){
           return this.listaDeJogos[indiceDoJogo];
        }

        public int obterTotalDeJogos(){
            return this.totalDeJogos;
        }
}