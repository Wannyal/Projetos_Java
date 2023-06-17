package tecnicas_de_programacao.ListaDeStringeCaracteres;

import java.util.Scanner;

/*02. Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em uma variável
inteira), imprima cada um dos seus dígitos por extenso.
Exemplo:
Número digitado: 4571
Resultado: quatro, cinco, sete, um
 */

public class quest2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        String s = Integer.toString(valor); /*Função transforma um valor inteiro em String*/
        for(int i =0; i<s.length(); i++){
            char auxS = s.charAt(i);
            switch(auxS){
                case'0': 
                System.out.print("Zero");
                break;
                case'1': 
                System.out.print("Um");
                break;
                case'2': 
                System.out.print("Dois");
                break;
                case'3': 
                System.out.print("Três");
                break;
                case'4': 
                System.out.print("Quatro");
                break;
                case'5': 
                System.out.print("Cinco");
                break;
                case'6': 
                System.out.print("Seis");
                break;
                case'7': 
                System.out.print("Sete");
                break;
                case'8': 
                System.out.print("Oito");
                break;
                case'9': 
                System.out.print("Nove");
                break;
            }
            if(i<s.length()-1){
                System.out.print(", ");
            }
        }
    }
    
}
