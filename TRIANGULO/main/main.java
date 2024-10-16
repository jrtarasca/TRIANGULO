package main;
import funcoes.FuncoesUteis;

public class main {
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // Testando o método soma
        int resultadoSoma = funcoes.soma(20, 10);
        System.out.println("Soma de 20 e 10: " + resultadoSoma);

        // Testando o método triangulo
        System.out.println("Triângulo de altura 30:");
        funcoes.triangulo(30);
        FuncoesUteis.leitor("teste.txt");
    }
}
