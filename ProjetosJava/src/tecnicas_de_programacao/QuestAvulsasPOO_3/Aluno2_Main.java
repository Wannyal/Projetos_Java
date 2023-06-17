package tecnicas_de_programacao.QuestAvulsasPOO_3;

import java.util.Scanner;

public class Aluno2_Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos alunos deseja cadastrar?");
        int alu = sc.nextInt();
        Aluno2 [] vtAluno2 = new Aluno2 [alu];
        for( int i = 0; i < alu; i++) {
          vtAluno2 [i] = criAluno2();
        }
        String aux = "%-10d %-20s %-5d %-13s";
        System.out.println("Seq.   " + "Matr.      "+ "Nome               " + "Idade   "+ "Turma    ");
        for( int i = 0; i < alu; i++) {
            System.out.println("----------------------------------------------");
          System.out.println(String.format("%03d    ", (i+1)) + String.format(aux,vtAluno2 [i].getMatricula() , vtAluno2 [i].getNome() ,
           vtAluno2 [i].getIdade() ,  vtAluno2 [i].getTurma()) );
        }
        
    }
    public static Aluno2 criAluno2 () {
           Scanner sc = new Scanner (System.in);
        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Informe a idade do aluno: ");
        int idade = sc.nextInt();
        System.out.println("Informe a matricula do aluno: ");
        int matricula = sc.nextInt(); 
        String turma = "";
        if( idade < 12) {
        turma = "Infancia";
        } else {
            if( idade > 12 && idade < 18) {
              turma = "Adolescência";
            } else {
                if( idade > 18){
                    turma = "Adulto";
                }
            }
        }
        return new Aluno2(nome, idade, matricula, turma);
    }
}
