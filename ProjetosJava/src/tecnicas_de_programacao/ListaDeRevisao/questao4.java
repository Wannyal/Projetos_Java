package tecnicas_de_programacao.ListaDeRevisao;

import java.util.Scanner;

/*Fazer um algoritmo que calcule e escreva a soma dos termos da seguinte 
série: s = 100/1 − 997/2 + 994/3 − 991/4 + ⋯ . Sabendo-se que a quantidade de termos 
da série deve ser informada pelo usuário. */

public class questao4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int termo;
        float div =997;
        System.out.println("Quantos termos você deseja: ");
        termo = sc.nextInt();
        float soma= 0;
        if(termo>=1) {
            soma = 100;
            for(int i=1; i<termo; i++){
                if(i%2!=0) {
              soma = soma + ((div/(i+1)) * (-1));
            }
            else {
                soma = soma + (div/(i+1));
            }
            div= div - 3;
            }
        }
        System.out.printf("O somatório dos termos é: " + String.format("%.2f", soma)); 
    }
    
}
