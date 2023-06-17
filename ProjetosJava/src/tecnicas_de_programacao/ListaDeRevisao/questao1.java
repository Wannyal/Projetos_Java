package tecnicas_de_programacao.ListaDeRevisao;

/**01.Desenvolver um programa em Java que leia diversos números inteiros e 
que determina e escreva a quantidade de números primos. Considere como 
flag o valor 0 (zero).*/

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int N = sc.nextInt();
        int cont = 0;
        while (N != 0) {
            if (N == 1) {
                cont++;
            }
            if (N == 2) {
                cont++;
            }
            int div = 0;
            for (int i = 1; i <= Math.sqrt(N) && div <= 3; i++) {
                if (N % i == 0) {
                    div++;
                }
            }
            if (div == 2) {
                cont++;
            }
            System.out.println("Digite um número: ");
            N = sc.nextInt();

        }
        System.out.println("Foram digitados " + cont + " primos");
    }

}
