package funcoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {
    // Método que retorna a soma de dois números inteiros
    public int soma(int a, int b) {
        return a + b;
    }


    // Método que exibe um triângulo com a altura especificada
    public void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
// Método que lê o conteúdo de um arquivo e exibe
public static void leitor(String arquivo) {
    try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
        String print;
        while ((print = reader.readLine()) != null) {
            System.out.println(print);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
