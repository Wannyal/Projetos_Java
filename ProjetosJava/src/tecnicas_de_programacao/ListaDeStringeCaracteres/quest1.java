package tecnicas_de_programacao.ListaDeStringeCaracteres;

import java.util.Scanner;

/*01.Elabore um programa em Java que, a partir de uma string digitada pelo usuário, imprima:
a) O número de caracteres da string.
b) A string com todas suas letras em maiúsculo.
c) O número de vogais da string.
d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
f) O número de dígitos (0 a 9) da string. */

public class quest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a string desejada: ");
        String s = sc.nextLine();
        System.out.println("A string '" + s + "' têm " + s.length() + " caracteres."); /* Função informa o número de caracteres da string*/
        System.out.println("A string digitada em maiusculo: " + s.toUpperCase());/* Função transformar toda a string em maiuscula*/
        int contV = 0;
        for (int i = 0; i < s.length(); i++) {
            char aux = s.charAt(i); /* Função retorna o caracter na posição i */
            if (aux == 'A' || aux == 'a' || aux == 'E' || aux == 'e' || aux == 'I' || aux == 'i' || aux == 'O'
                    || aux == 'o' || aux == 'U' || aux == 'u') {
                contV++;
            }
        }
        System.out.println("A string '" + s + "' têm " + contV + " vogais");
        String sAux = s.toLowerCase(); /* Função transforme em minusculo */
        if (sAux.startsWith("uni")) {
            System.out.println("A string começa com UNI.");
        } else {
            System.out.println("A string não começa com UNI.");
        }
        if (sAux.endsWith("rio")) {
            System.out.println("A string termina com RIO.");
        } else {
            System.out.println("A string não termina com RIO.");
        }
        int contD= 0;
        for(int i=0; i<s.length(); i++) {
            char auxD = s.charAt(i);
            if(Character.isDigit(auxD)){ /*Função verifica se o caracter é um digito */
            contD++;
            }
        }
        System.out.println("A string têm " + contD + " digitos");
    }

}
