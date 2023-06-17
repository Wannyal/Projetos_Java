package tecnicas_de_programacao.ListaDeMetodos;

import java.util.Scanner;

/* Elabore um programa em java que permita solicitar dois valores inteiros e, em seguida, apresentar um menu com 
as seguintes opções:
1-Somar
2-Subtrair
3-Multiplicar
4-Dividir
5-Fim
 O usuário deve selecionar uma das opções indicadas e o programa deverá calcular a operação escolhida entre os 
dois números informados e apresentar o resultado da referida operação. O programa só deve finalizar quando o 
usuário informar a opão 5. Cada operação deve ser realizada em um método específico para cada operação, o qual 
deve retornar o resultado para o método principal */

public class ques02 {
    public static int soma (int a, int b){
        return a+b;
    }
    public static int subt (int a, int b) {
        return a-b;
    }
    public static int mult (int a, int b) {
        return a*b;
    }
    public static double div (int a, int b){
        if(b==0){
         System.out.print("Valor invalido");
         return Double.NaN;
        } else {
        return (double) a/b;
    }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe dois valores inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Informe qual operação deseja fazer com os números informados:\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Fim");
        int op = sc.nextInt();
        while(op!=5){
            if(op==1){
                System.out.println("A soma dos números informados é: " + soma(a, b));
            } else {
                if(op==2) {
                    System.out.println("A subtração dos números informados é: " + subt(a, b));
                } else {
                    if(op==3) {
                        System.out.println("A multiplicação dos números informados é: " + mult(a, b));
                    } else {
                        if(op==4) {
                            System.out.println("A divisão dos números informados é: " + div(a, b));
                        }
                    }
                }
            }
            System.out.println("Informe qual operação deseja fazer com os números informados:\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Fim");
            op = sc.nextInt();
        }
        System.out.println("Programa encerrado");

    }
    
}
