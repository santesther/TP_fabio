package lista2_TP.exercicio4;

/*
Fazer um programa para permitir ao usu´ario a inclus˜ao e exclus˜ao dos dados referentes aos jogos de
videogame, s´o que agora em um vetor em mem´oria.
Para tanto dever˜ao ser utilizados os mesmos campos existentes no arquivo vgasales.csv.
O seu programa dever´a apresentar um menu com as op¸c˜oes:
1 - Inclus˜ao de Jogo
2 - Exclus˜ao de Jogo
3 - Listar Jogos Cadastrados
Por enquanto a inclus˜ao e exclus˜ao de um jogo acontecer´a sempre no final da lista de jogos.
O programa dever´a obrigatoriamente possuir as classes Jogo e ListaDeJogos, al´em de uma classe principal
para a implementa¸c˜ao do menu e integra¸c˜ao das classes desenvolvidas.
Na classe Jogo dever˜ao estar os m´etodos getters e setters para a altera¸c˜ao dos atributos dos jogos.
Na classe ListaDeJogos dever´a ser criado o vetor de objetos Jogo bem como os m´etodos para inclus˜ao e
exclus˜ao de jogos no vetor. Tamb´em dever´a estar implementado um m´etodo para retornar o vetor viabilizando assim que o mesmo seja listado no programa principal (esta abordagem ser´a alterada futuramente
para a clonagem do objeto).

Obs: Crie uma classe separada, identificada com o nome PersistenciaBinariaSequencial para realizar as
opera¸c˜oes com arquivos.
*/

public class jogo {
        String nome, plataforma;
        int ano;
        double globalSales;

        public jogo (String nome, String plataforma, int ano, double globalSales){
            DefinirNome(nome);
            DefinirPlataforma(plataforma);
            DefinirAno(ano);
            DefinirGlobalSales(globalSales);
        }

        public String obterNome(){
            return nome;
        }
        public void DefinirNome(String n){
            this.nome = n;
        }

        public String obterPlataforma(){
            return plataforma;
        }
        public void DefinirPlataforma(String p){
            this.plataforma = p;
        }

        public int obterAno(){
            return ano;
        }
        public void DefinirAno(int a){
            this.ano = a;
        }

        public double obterGlobalSales(){
            return globalSales;
        }
        public void DefinirGlobalSales(double globalSales2){
            this.globalSales = globalSales2;
        }
    }

