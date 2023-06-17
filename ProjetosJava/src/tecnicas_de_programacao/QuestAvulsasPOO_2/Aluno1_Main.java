package tecnicas_de_programacao.QuestAvulsasPOO_2;

import java.util.Scanner;


public class Aluno1_Main {
 public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
  Aluno1 a = new Aluno1();
  Aluno1 b = new Aluno1("03022619235");
  Aluno1 c = new Aluno1(2022251);
  Aluno1 d = new Aluno1("Maria", 02022541, "2541123", 3);
  a.printAluno1();
  b.printAluno1();
  c.printAluno1();
  d.printAluno1(); 
}    
}
