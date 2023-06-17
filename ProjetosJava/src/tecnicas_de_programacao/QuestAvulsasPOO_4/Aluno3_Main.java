package tecnicas_de_programacao.QuestAvulsasPOO_4;

import java.util.Scanner;

public class Aluno3_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos deseja cadastrar?");
        int alu = sc.nextInt();
        Aluno3[] vt = new Aluno3[alu];
        for (int i = 0; i < alu; i++) {
            vt[i] = new Aluno3();
        }
        String aux = "%-10d %-32s %-8d %-13s";
        System.out.println("Seq.   " + "Matr.      " + "Nome                           " + 
        "  Idade   " + "Turma    ");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < alu; i++) {
            System.out.println(String.format("%03d    ", (i + 1)) + String.format(aux, vt[i].getMatricula(),
                    vt[i].getNome(), vt[i].getIdade(), vt[i].getTurma()));
        }
    }

}