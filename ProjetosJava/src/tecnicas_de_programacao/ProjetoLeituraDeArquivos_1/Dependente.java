package tecnicas_de_programacao.ProjetoLeituraDeArquivos_1;

public class Dependente {
    private String NomeDp;
    private String TipoDp;
    private String DtNascDp;

    public Dependente(String nomeDp, String tipoDp, String dtNascDp) {
        NomeDp = nomeDp;
        TipoDp = retornaTipoDep(tipoDp);
        DtNascDp = dtNascDp;
    }

    public String getNomeDp() {
        return this.NomeDp;
    }

    public void setNomeDp(String NomeDp) {
        this.NomeDp = NomeDp;
    }

    public String getTipoDp() {
        return this.TipoDp;
    }

    public void setTipoDp(String TipoDp) {
        this.TipoDp = TipoDp;
    }

    public String getDtNascDp() {
        return this.DtNascDp;
    }

    public void setDtNascDp(String DtNascDp) {
        this.DtNascDp = DtNascDp;
    }

    public String retornaTipoDep(String TipoDep) {
        switch (TipoDep) {
            case "1":
                return "Pai";
            case "2":
                return "Mãe";
            case "3":
                return "Cônjuge";
            case "4":
                return "Filho";
            case "5":
                return "Outros";
        }
        return null;
    }

    public String toStringDependente( ) {
        return String.format("                      %-31.31s %-10.10s %-15.15s", NomeDp, TipoDp, DtNascDp);
    }
}