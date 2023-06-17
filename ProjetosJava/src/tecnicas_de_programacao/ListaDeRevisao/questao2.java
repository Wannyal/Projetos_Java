package tecnicas_de_programacao.ListaDeRevisao;

/**02. Desenvolver um programa em Java que leia 200 valores e calcule e 
escreva a média aritmética dos valores lidos, a quantidade de valores positivos, 
a quantidade de valores negativos e opercentual de valores negativos e 
positivos. */
 
import java.util.Scanner;

public class questao2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int soma = 0;
        int pos = 0;
        int neg = 0;
         for(int i= 0; i< 200; i++) {
            System.out.println("Digite um número: ");
            int N = sc.nextInt();
            soma= soma + N;
            if(N>=0) {
                pos++;
            } 
            else {
                neg++;
            }

         }
         System.out.println("Média dos valores digitados: " + (float) soma/200);
         System.out.println("Valores positivos digitados: " + pos);
         System.out.println("Valores negativos digitados: " + neg);
         System.out.println("Porcentagem de valores positivos digitados: " + ((float)pos/2)*100 + " % ");
         System.out.println("Porcentagem de valores negativos digitados: " + ((float)neg/2)*100 + " % ");
    }
}
