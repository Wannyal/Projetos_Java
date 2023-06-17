package ProjetosJava.src.estrutura_de_dados_I.revisao_de_arrays;

import java.util.Scanner;

/*
Faça um programa em Java para criar dois vetores(A e B) de doubles,
cujas dimensões(da e db) serão fornecidas pelo usuário.
Preencha os vetores com valores fornecidos pelos usuários e depois
crie um terceiro vetor (C) do tamanho do primeiro (A).
Cada elemento do vetor (C) será dado pela equação:
C[i] = A[i] * Somatório(B[j])
com j variando de 0 a db */

public class Ex01 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor A: ");
        int da = sc.nextInt();
        System.out.println("Digite o tamanho do vetor B: ");
        int db = sc.nextInt();
        double A [] = new double [da];
        double B [] = new double [db];
        double C [] = new double [da];
        for(int i =0; i< da; i++) {
            System.out.printf("Digite os valores de A: \nValor %0.2d%n", i+1);
            A [i] = sc.nextDouble();
        }
        double soma = 0;
        for(int j =0; j< db; j++) {
            System.out.printf("Digite os valores de B: \nValor %0.2d%n", j+1 );
            B [j] = sc.nextDouble();
            soma= soma + B [j];
        }

        for (int i = 0; i<da ; i++) {
         C [i] = A [i] * soma;    
        }
    }
    
}