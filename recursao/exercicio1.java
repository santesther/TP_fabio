package recursao;

/*
. Usando fun¸c˜oes, calcule de forma recursiva o n-´esimo termo da sequˆencia de Fibonacci, 1, 1, 2, 3, 5, 8, ...:
=> de forma recursiva.
F(n) = { 0 -> se n = 1
{ 1 -> se n = 2
{ F(n 1) + F(n - 2) -> se n > 1
 
*/

public class exercicio1 {
    public static void main(String[] args) {
        System.out.print(calcularFibonacciRecursivo(5));
}

static long calcularFibonacciRecursivo(int termo) {
    if(termo <= 2) {
        return 1;
    }
    else {
        return calcularFibonacciRecursivo(termo-1) + calcularFibonacciRecursivo(termo-2);
    } 	
}
}