package tecnicas_de_programacao.ListaDeStringeCaracteres;

import java.util.Scanner;

/*Faça um programa que, a partir de um texto digitado pelo usuário, conte o número de caracteres total e o
número de palavras (palavra é definida por qualquer sequência de caracteres delimitada por espaços em
branco) e exiba o resultado. */

public class quest4 {
    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o texto desejado: ");
        String text = sc.nextLine();
        System.out.println("O texto inserido tem o total de " + text.length() + " caracteres");
        String [] vetText = text.split("\\s+"); /* \\s+ trata todo e qualquer tipo de espaço */
        System.out.println(("O texto inserido tem o total de "+ vetText.length + " palavras"));

    }
    
}
