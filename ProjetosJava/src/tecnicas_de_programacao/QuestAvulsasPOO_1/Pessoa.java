package tecnicas_de_programacao.QuestAvulsasPOO_1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

/* EXERCÍCIO DE FIXAÇÃO
Usando orientação a objetos, desenvolva uma mini-aplicação (com um programa principal, usando main, 
e as demais classes) em Java que:
a) Leia a matrícula(int), nome(String), cpf(String) e salário(double) de 3
pessoas;
b) Cada pessoa deve ser armazenada em objetos distintos da classe Pessoa;
c) Escrever os dados dos 03 objetos;
Observações:
i) Considere que a leitura e a escrita dos dados devem ser realizados utilizando métodos estáticos 
distintos para entrada dos tipos int, String e valores decimais, respectivamente;
ii)Considere que a leitura deve ser realizada com a classe Scanner e a escrita
com a classe print ou printin. */

public class Pessoa {
    private int Matricula;
    private String Nome;
    private String CPF;
    private double Salario;

    public Pessoa(int Matricula, String Nome, String CPF, double Salario) { /* CONSTRUTOR */
        this.Matricula = Matricula; /* Esta variavel (Matricula) vai receber o que for passado como parametro */
        this.Nome = Nome;
        this.CPF = CPF;
        this.Salario = Salario;
    }

    public static int inteiro() { /* Função que ler o valor int e o retorna */
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String leString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static double decimais() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();

    }
    public void printPessoa () {
        System.out.println("Matricula: " + Matricula);
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Salário: " + Salario);
    }
}
