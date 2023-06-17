package tecnicas_de_programacao.ProjetoLeituraDeArquivos_1;

import java.util.ArrayList;


public class Funcionario {
    private String Matricula;
    private String Nome;
    private String Cpf;
    private String DtNasc;
    private ArrayList <Dependente> dependente;

    public Funcionario(String matricula, String nome,String dtNasc, String cpf, ArrayList<Dependente> listadep) {
        Matricula = matricula;
        Nome = nome;
        Cpf = cpf;
        DtNasc = dtNasc;
        dependente = listadep; 
    }
    public void addDependente (Dependente dep) { // Função para adicionar um novo dependente a lista, parametro objeto dep do tipo Dependente
        dependente.add(dep);
    }
    public ArrayList <Dependente> retornaListaDp() { // Retorna lista de dependentes
       return dependente;
    }

    public String getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return this.Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getDtNasc() {
        return this.DtNasc;
    }

    public void setDtNasc(String DtNasc) {
        this.DtNasc = DtNasc;
    }
   
    public void printFuncionario () {
    
        String funFormatado = String.format("%-8.8s %-31.31s %-15.15s %-15.15s", getMatricula(), getNome() , getDtNasc()  , getCpf());
        System.out.println(funFormatado);
        printDependente();
        System.out.println("\n.............................................................................");
        }
    
    private void printDependente () {
        ArrayList<Dependente> listaDep = retornaListaDp();
        if (listaDep.isEmpty()) {
            System.out.println("Dependentes:(NÃO POSSUI)");
        } else {
            System.out.print("         Dependentes: ");
            System.out.printf(String.format("%-31.31s %-10.10s %-15.15s", "Nome",  "Tipo",  "Data Nasc."));
            System.out.println();
            for (Dependente dependente : listaDep) {
                System.out.println(dependente.toStringDependente());
            }
        }
    }
}
