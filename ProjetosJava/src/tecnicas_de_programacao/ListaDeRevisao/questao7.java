package tecnicas_de_programacao.ListaDeRevisao;

import java.util.Scanner;

/*Foi feita uma pesquisa de audiência de canal de TV em várias casas de
uma certa cidade, num determinado dia. Para cada casa visitada, é fornecido o 
número do canal (4,5,7,12) e o número de pessoas que o estavam assistindo 
naquela casa. Se a televisão estivesse desligada, nada era anotado, ou seja, a 
casa não entrava na pesquisa. Fazer um programa que: leia um número 
indeterminado de dados, sendo que o “FLAG” corresponde ao número do canal 
igual a zero (0). Calcule a porcentagem de audiência para cada emissora. 
Escreva o número do canal e a sua respectiva porcentagem
 */
public class questao7 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int canal, pes, cont4=0, cont5=0, cont7=0, cont12=0, contTV=0;
        System.out.println("Qual canal estava sendo assisto?");
        canal= sc.nextInt();
        while(canal!=0){
            System.out.println("Quantas pessoas estavam assistindo esse canal?");
            pes= sc.nextInt();
            contTV++;
            if(canal==4){
                cont4++;
            }
            else {
                if(canal==5){
                    cont5++;
                }
                else {
                    if(canal==7){
                        cont7++;
                    } else {
                        if(canal==12){
                            cont12++;
                        }
                    }
                }
            }
            System.out.println("Qual canal estava sendo assisto?");
            canal= sc.nextInt();
        }
        System.out.println("Programa encerrado!");
        if(contTV!=0){
        System.out.println("A audiencia do canal 4 foi: " + (double) 100*cont4/contTV);
        System.out.println("A audiencia do canal 5 foi: " + (double) 100*cont5/contTV);
        System.out.println("A audiencia do canal 7 foi: " + (double) 100*cont7/contTV);
        System.out.println("A audiencia do canal 12 foi: " + (double) 100*cont12/contTV);
        }
        
    }
    
}
