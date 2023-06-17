package tecnicas_de_programacao.QuestAvulsasPOO_3;

import java.util.Properties;

public class Aluno2 {
    private String Nome;
    private int Idade;
    private int Matricula;
    private String Turma;
    
    public Aluno2 (String nome, int idade, int matricula, String turma) {
        Nome = nome;
        Idade = idade;
        Matricula = matricula;
        Turma = turma;
    }
    
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return this.Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getTurma() {
        return this.Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }
}