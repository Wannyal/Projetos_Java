package tecnicas_de_programacao.ListaDeStringeCaracteres;

import java.text.DecimalFormat;
import java.util.Scanner;


/* 6.Considere a seguinte linha de dados bancários de um arquivo de retorno de pagamento de
boleto bancário:
10423547000003587253007202202082022
Sendo que se tem na sequência, as seguintes informações:
Banco(3 casas) moeda (1 casa) ag bancaria (5 digitos) valor do boleto (10 casas, sendo as duas
últimas representam os centavos) data de vencimento (8 dígitos) data de pagamento (8 dígitos)
A moeda deve ser verificada, sendo: 1=real, 2=dólar, 3=euro, 4=peso, 5=libra
Faça um programa que separe os respectivos conteúdos e escreva-os, sendo que o valor e as
datas devem ser preparados para serem escritos no formato correto.
Exemplo de saída com dados fictícios:
Banco ............... 355
Moeda ..............Real
Agencia .......... : 35.470
Valor do boleto: 25.890,24
Dt.Vencimento: 25/10/2022
Dt.Pagamento ...08/11/2022
 */

public class quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a linha de dados do boleto bancário: ");
        String linha = sc.nextLine();
        String banco = linha.substring(0, 3);
        System.out.println("Banco............... " + banco);
        String moeda = linha.substring(3, 4);
        if (moeda.equals("1")) {
            System.out.println("Moeda................. Real");
        } else {
            if (moeda.equals("2")) {
                System.out.println("Moeda............... Dólar");
            } else {
                if (moeda.equals("3")) {
                    System.out.println("Moeda................. Euro");
                } else {
                    if (moeda.equals("4")) {
                        System.out.println("Moeda................. Peso");
                    }  else {
                        if (moeda.equals("5")) {
                            System.out.println("Moeda............... Libra");
                        }
                    }
                }
            }
        }
        String agencia = linha.substring(4, 9);
        String auxAg = agencia.substring(0, 2);
        agencia = auxAg + "."+ agencia.substring( 2);
        System.out.println("Agencia............. "+ agencia);
        String valor = linha.substring(9, 19);
        DecimalFormat decFort = new DecimalFormat();
        decFort.applyPattern("#,##0.00");
        double val = Double.parseDouble(valor);
        val = val/100;
        System.out.println("Valor do boleto..... " + decFort.format(val));
        String venc = linha.substring(19, 27);
        String auxVenc = venc.substring(0, 2) + "/" + venc.substring(2, 4) + "/" + venc.substring(4);
        System.out.println("Dt Vencimento......."+ auxVenc);
        String pag = linha.substring(27, 35);
        String auxPag = pag.substring(0, 2) + "/" + pag.substring(2, 4) + "/" + pag.substring(4);
        System.out.println("Dt Pagamento........"+ auxPag);
    }
}