package tecnicas_de_programacao.ProjetoJogoDeCartas;

import tecnicas_de_programacao.ProjetoJogoDeCartas.Cartas;
import java.util.ArrayList;

public class Jogador {
    private String Nome;
    private ArrayList<Cartas> Baralho; // Arrylist do tipo Cartas para guardas as cartas de cada jogador
    private double PontosT;

    public Jogador(String nome, ArrayList<Cartas> baralho) { // Método construtor da classe Jogador
        Nome = nome;
        Baralho = baralho;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Cartas> getBaralho() {
        return this.Baralho;
    }

    public void setBaralho(ArrayList<Cartas> Baralho) {
        this.Baralho = Baralho;
    }

    public double getPontosT() {
        CalculaPontos();
        return this.PontosT;
    }

    public void setPontosT(double PontosT) {
        this.PontosT = PontosT;
    }

    public void CalculaPontos () {
        double aux = 0;
        for (Cartas C : Baralho ) {
          aux += C.getValor() + C.RetornaPesoCarta();
        }
        PontosT = aux;
    }
}
