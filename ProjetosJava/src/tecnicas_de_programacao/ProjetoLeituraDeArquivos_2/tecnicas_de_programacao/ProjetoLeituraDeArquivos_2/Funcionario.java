package tecnicas_de_programacao.ProjetoLeituraDeArquivos_2;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int Matricula;
    private String Nome;
    private String Salario;
    private String Gratificacao;
    private List<Filho> Filhos;

    public Funcionario(int matricula, String nome, String salario, String gratificacao) {
        Matricula = matricula;
        Nome = nome;
        Salario = salario;
        Gratificacao = gratificacao;
        Filhos = new ArrayList<>();
    }

    public int getMatricula() {
        return Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public String getSalario() {
        return Salario;
    }

    public String getGratificacao() {
        return Gratificacao;
    }

    public List<Filho> getFilhos() {
        return Filhos;
    }

    public void adicionarFilho(Filho filho) {
        Filhos.add(filho);
    }
}