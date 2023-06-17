package tecnicas_de_programacao.QuestAvulsasPOO_2;

public class Aluno1 {
    private String Nome;
    private int Matricula;
    private String Cpf;
    private int Idade;

    public Aluno1 () {
        this.Matricula = 0;
        this.Idade = 0;
    }
    public Aluno1 (String Cpf) {
        this.Cpf = Cpf;
    }
    public Aluno1 (int Matricula) {
        this.Matricula = Matricula;
    }
    public Aluno1 (String Nome, int Matricula, String Cpf, int Idade) {
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.Cpf = Cpf;
        this.Idade = Idade;
    }
public void setNome (String nome) {
    Nome = nome;
}
public String getNome () {
    return Nome;
}
public void setMatricula (int matricula) {
    Matricula = matricula;
}
public int getMatricula () {
    return Matricula;
}
public void setCpf (String cpf) {
    Cpf = cpf;
}
public String getCpf () {
    return Cpf;
}
public void setIdade (int idade) {
    Idade = idade;
}
public int getIdade () {
    return Idade;
}
public void printAluno1() {
    System.out.println("Nome: " + Nome);
    System.out.println("Matricula: " + Matricula);
    System.out.println("CPF: " + Cpf);
    System.out.println("Idade: " + Idade);

}
}
