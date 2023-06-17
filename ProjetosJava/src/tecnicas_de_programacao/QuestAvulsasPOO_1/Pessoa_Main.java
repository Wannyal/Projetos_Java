package tecnicas_de_programacao.QuestAvulsasPOO_1;

import java.util.Scanner;


public class Pessoa_Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        Pessoa a, b, c;
        a = criaPessoa();
        b = criaPessoa();
        c = criaPessoa();
        a.printPessoa();
        b.printPessoa();
        c.printPessoa();
        

    }
 public static Pessoa criaPessoa() {
    System.out.println("Informe sua matricula: ");   
    int Matricula = Pessoa.inteiro();
    System.out.println("Informe seu nome: ");   
    String Nome = Pessoa.leString();
    System.out.println("Informe seu CPF: ");   
    String CPF = Pessoa.leString();
    System.out.println("Informe seu salário: ");   
    double Salario = Pessoa.decimais();
    return new Pessoa(Matricula, Nome, CPF, Salario);
 }  
}
