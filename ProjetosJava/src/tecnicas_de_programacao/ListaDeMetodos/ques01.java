package tecnicas_de_programacao.ListaDeMetodos;

import java.util.Scanner;;

/* Elabore um programa em Java que permita ler diversas informações de pessoas:idade, grau de 
instrução(Fundamental, Médio, Superior e Pós e código do sexo (1-Fem, 2-Masc). As entradas de dados devem 
ser realizadas diretamente com métodos estáticos, sendo que se deve ter um método correspondente para cada 
tipo de entrada: um método para entrada com tipo inteiro e um método de entrada para tipo String, Além disso, 
deve-se ter também um método para apresentar uma mensagem específica. Considere que o flag é igual 0 para a 
idade. Cada método método de entrada de dados deve retornar o respectivo valor para o método principal.
Determine e escreva:
a) A quantidade de pessoas do sexo masculino com grau médio e a quantidade de mulheres com grau 
Fundamental;
b) A média aritmética das idades das pessoas com grau Pós;
c) A porcentagem de pessoas femininas com grau Superior; */

public class ques01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = entradaInt(sc);
        int contMmedio = 0, contFfund = 0, idTotal = 0, contPos = 0, contFsup = 0, contF = 0;
        while (idade != 0) {
            System.out.println("Informe seu grau de instrução: ");
            String grau = entradaString(sc);
            System.out.println("Informe o código do seu sexo (1-Fem, 2-Masc)");
            int sexo = entradaInt(sc);
            if (sexo == 2 && grau.equals("Medio")) {
                contMmedio++;
            }
            if (sexo == 1 && grau.equals("Fundamental") ) {
                contFfund++;
            }
            if (grau.equals("Pos") ) {
                idTotal = idTotal + idade;
                contPos++;
            }
            if (sexo == 1) {
                contF++;
            }
            if (sexo == 1 && grau.equals("Superior")) {
                contFsup++;
            }
            System.out.println("Informe sua idade:");
            idade = entradaInt(sc);
        }
        System.out.println("Quantidade de pessoas do sexo masculino e ensino médio: " + contMmedio);
        System.out.println("Quantidade de pessoas do sexo femenino e ensino fundamental: " + contFfund);
        if(contPos>0){
        System.out.println("Média das idades das pessoas com pós graduação: " + idTotal / contPos);
        } else {
            System.out.println("Média das idades das pessoas com pós graduação: 0");
        }
        System.out.println("Porcentagem de pessoas do sexo femenino e ensino superior: " + (double)((100 * contFsup) / contF) + "%");
    }

    public static int entradaInt(Scanner sc) {
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    public static String entradaString(Scanner sc) {
        String s = sc.nextLine();
        return s;
    }

}
