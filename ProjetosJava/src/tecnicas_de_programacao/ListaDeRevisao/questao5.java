package tecnicas_de_programacao.ListaDeRevisao;

import java.util.Scanner;

/*. Supondo que a população de uma cidade A seja da ordem de 90.000 
habitantes com taxa anual de crescimento de 3% e que a população de uma 
cidade B seja de 200.000 habitantes com uma taxa anual de crescimento de 
1,5%. Faça um programa que determine e escreva o tempo (em anos) 
necessário para que população da cidade A ultrapasse ou se iguale a 
população da cidade B, mantidas essas taxas de crescimento.
 */

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cidA = 90000, cidB = 200000, cont = 0;
        double cresA = 3 / 100, cresB = 1.5 / 100;
        while (cidA < cidB) {
            cidA = cidA + (int) (cidA * cresA);
            cidB = cidB + (int) (cidB * cresB);
            cont++;
        }
        System.out.println("São necessários " + cont + " anos para a cidade A ultrapassar a B.");

    }

}
