package tecnicas_de_programacao.ProjetoLeituraDeArquivos_2;

public class Filho {
    private String Nome;
    private String DataNas;
    private String Sexo;

    public Filho (String nome, String dataNas, String sexo) {
        Nome = nome;
        DataNas = dataNas;
        Sexo = retornaSexo(sexo);
    }

    public String getNome() {
        return Nome;
    }

    public String getDataNas() {
        return DataNas;
    }

    public String getSexo() {
        return Sexo;
    }
     public String retornaSexo (String Sexo){
        switch (Sexo) {
            case "F":
            return "Femenino";
            case "M":
            return "Masculino";
        }
        return Sexo;
}
}
