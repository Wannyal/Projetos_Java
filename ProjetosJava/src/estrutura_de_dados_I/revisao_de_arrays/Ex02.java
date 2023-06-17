package ProjetosJava.src.estrutura_de_dados_I.revisao_de_arrays;

import java.util.Scanner;

/*Faça um programa em Java para criar
inicialmente dois arrays unidimensionais
de valores reais, com tamanhos
fornecidos pelo usuário. 
• Se eles forem conformes ( mesmo
tamanho ) efetue a soma destes dois
vetores e armazene o resultado num 
terceiro vetor.
• Imprima todos os arrays.
• O programa deve repetir os passos
anteriores enquanto o usuário desejar. */

public class Ex02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Você deseja prosseguir? \nDigite 1 para sim e 2 para não: ");
        int resp = sc.nextInt();
        while (resp == 1) {
            System.out.println("Informe o tamanho do primeiro vetor: ");
            int ta = sc.nextInt();
            System.out.println("Informe o tamanho do segundo vetor: ");
            int tb = sc.nextInt();
            double A[] = new double[ta];
            double B[] = new double[tb];
            for (int i = 0; i < ta; i++) {
                System.out.println("Digite os valores de A: ");
                A[i] = sc.nextDouble();
            }
            for (int i = 0; i < tb; i++) {
                System.out.println("Digite os valores de B: ");
                B[i] = sc.nextDouble();
            }
            System.out.println("Valores do vetor A:");
            for (int i = 0; i < ta; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println("\nValores do vetor B:");
            for (int i = 0; i < tb; i++) {
                System.out.print(B[i] + " ");
            }

            if (ta == tb) {
                double C[] = new double[ta];

                for (int i = 0; i < ta; i++) {
                    C[i] = A[i] + B[i];
                }
                System.out.println("\nValores do vetor C:");
                for (int i = 0; i < ta; i++) {
                    System.out.print(C[i] + " ");

                }
            }

            System.out.println("\nVocê deseja prosseguir? \nDigite S para sim e N para não: ");
            resp = sc.next().charAt(0);

        }

    }

}
