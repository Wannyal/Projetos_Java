package tecnicas_de_programacao.ListaDeStringeCaracteres;

import java.util.Scanner;

/*.Elabore um programa Java que:
a)leia um valor inteiro, converta-o para caractere e escreva esse caractere;
b)leia um caractere, converta-o para inteiro e escreva esse número;
c)Leia um nome com sobrenome em letras minúsculas, converta-o para maiúsculas e escreva
esse novo nome;
d)leia um nome com sobrenome em letras minúsculas e converta esse nome com a primeira
letra de cada parte do nome em maiúsculas e escreva o novo nome;
e)leia um nome com sobrenome em letras maiúsculas e converta esse nome com a primeira letra
de cada parte do nome em maiúsculas, as demais devem ficar em minúsculas. Em seguida,
escreva o novo nome.
 */

public class quest5 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um valor inteiro entre 0 e 9: ");
        int valor= sc.nextInt();
        char cValor = Character.forDigit(valor, 10);
        System.out.println(cValor);
        System.out.println("Digite um caracter: ");
        char carac = sc.next().charAt(0);
        int intCarac = (int) carac;
        System.out.println(intCarac);
        System.out.println("Digite um nome e um sobrenome em letras minusculas:");
        sc.nextLine();
        String nome1 = sc.nextLine();
        System.out.println(nome1.toUpperCase());
        System.out.println("Digite um novo nome e um sobrenome em letras minusculas:");
        String nome2 = sc.nextLine();
        String [] vetnome2 = nome2.split(" ");
        String novoNome2="";
        for(int i = 0; i < vetnome2.length ; i++) {
         String aux2 = vetnome2[i].substring(0, 1).toUpperCase();
         String restNome2 = vetnome2[i].substring(1);
         novoNome2 += aux2 + restNome2 + " ";
        }
        System.out.println(novoNome2);
        System.out.println("Digite um nome e sobrenome em letras maiusculas: ");
        String nome3 = sc.nextLine();
        String [] vetnome3 = nome3.split(" ");
        String novoNome3="";
        for(String nome:vetnome3){
            String aux3 = nome.substring(0, 1);
            String restNome3 = nome.substring(1).toLowerCase();
            novoNome3 += aux3 + restNome3 + " ";
        }
        System.out.println(novoNome3);
        




    }
    
}
