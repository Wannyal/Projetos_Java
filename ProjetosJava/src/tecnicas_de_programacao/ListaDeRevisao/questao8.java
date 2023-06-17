package tecnicas_de_programacao.ListaDeRevisao;

import java.util.Scanner;

/*.Uma universidade deseja fazer um levantamento a respeito do seu concurso 
vestibular. Para cada curso, é fornecido o seguinte conjunto de valores: código 
do curso, número de vagas, número de candidatos do sexo masculino; número 
de candidatos do sexo feminino. O último conjunto, para indicar o fim dos 
dados, contém o código do curso igual a zero. Fazer um algoritmo que: calcule 
e escreva, para cada curso, o número de candidatos por vaga e a porcentagem 
de candidatos do sexo feminino com o correspondente código do curso; 
determine o maior número de candidatos por vaga e escreva esse número 
juntamente com o código do curso correspondente (supor que não ocorra 
empate); calcule e escreva o total de candidatos. */

public class questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o código do curso: ");
        int cod = sc.nextInt();
        int maiorV = 0, codM=0;
        while (cod != 0) {
            System.out.println("Informe a quantidade de vagas: ");
            int vag = sc.nextInt();
            System.out.println("Informe a quantidade de candidatos do sexo masculino:  ");
            int mas = sc.nextInt();
            System.out.println("Informe a quantidade de candidatos do sexo feminino:  ");
            int fem = sc.nextInt();
            if (maiorV < (mas + fem)/vag) {
                maiorV = (mas + fem)/vag;
                codM = cod;
            }
            System.out.println("O número de candidatos por vaga é: " + (mas + fem)/vag);
            System.out.println("A porcentagem de candidatos do sexo feminino é: " + 100 * fem / (fem + mas));
            System.out.println("Informe o código do curso: ");
            cod = sc.nextInt();
        }
        System.out.println("O curso " + codM + " é o curso com maior candidatos por vaga. \nTotal de " +
                maiorV + "candidatos por vaga.");
    }
}
