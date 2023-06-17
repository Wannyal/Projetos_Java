package tecnicas_de_programacao.ListaDeRevisao;

import java.util.Scanner;

/*Desenvolver um algoritmo que leia a altura e o código do sexo (1-masculino, 
2-feminino) de 15 pessoas. Este programa deverá calcular e mostrar :
a. A menor altura do grupo;
b. A maior altura do grupo; 
c.A maior altura dos homens; 
d.A menor altura das mulheres; */

public class questao3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float alt, altMe = 10, altMa = 0, altHo = 0, altMu = 10;
        int sexo;

        for (int i = 0; i < 15; i++) {
            System.out.println("Informe a altura da pessoa " + (i + 1) + ":");
            alt = sc.nextFloat();
            System.out.println("Informe o sexo da pessoa " + (i + 1) + " (1-masculino, 2-feminino):");
            sexo = sc.nextInt();
            if (alt > altMa) {
                altMa = alt;
            }
            if (alt < altMe) {
                altMe = alt;
            }
            if (sexo == 1 && alt > altHo) {
                altHo = alt;
            }
            if (sexo == 2 && alt < altMu) {
                altMu = alt;
            }
        }
        System.out.println("A maior altura do grupo é: " + altMa);
        System.out.println("A menor altura do grupo é: " + altMe);
        System.out.println("A maior altura entre os homens do grupo é: " + altHo);
        System.out.println("A menor altura entre as mulheres do grupo é: " + altMu);
    }

}
