package tecnicas_de_programacao.ListaDeStringeCaracteres;

import java.util.Scanner;

/*.Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas iniciais.
As iniciais são formadas pela primeira letra de cada nome, sendo que todas deverão aparecer
em maiúsculas na saída do programa. Note que os conectores e, do, da, dos, das de, di, du não são considerados
nomes e, portanto, não devem ser considerados para a obtenção das iniciais. As iniciais devem ser impressas
em maiúsculas, ainda que o nome seja entrado todo em minúsculas.
Exemplos:
Maria das Graças Pimenta => MGP
João Carlos dos Santos => JCS
José da Silva => JS
Pedro Pereira Teixeira => PPT */

public class quest3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o nome desejado: ");
        String nome = sc.nextLine();
        nome = nome.toLowerCase();
        String [] vetS = nome.split(" "); /*Função quebra a string com a condição desejada */
        String inic="";
        for(String i:vetS) { /* */
            /*Função compara a variavel i com e, para saber se são iguais ou não */
            //Pode-se ler essa função como "igual", comparando a string i com a string entre parenteses.
            //Quando se coloca o '!', o igual vira "diferente"
            if ( !i.equals('e') && !i.equals("do") && !i.equals("de") && !i.equals("da") && !i.equals("das") && !i.equals("di") && !i.equals("du") && !i.equals("dos")) { 
              inic+=i.charAt(0);
            }
        }
        System.out.println(inic.toUpperCase());
    }
    
}
