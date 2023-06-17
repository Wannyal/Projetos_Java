package tecnicas_de_programacao.ProjetoJogoDeCartas;

public class Cartas {
    private char Nipes;
    private int Valor;

    public Cartas (char nipes, int valor) { //Método construtor da classe cartas
      Nipes = nipes;
      Valor = valor;
    }

    public int getNipes() {
        return this.Nipes;
    }

    public void setNipes(char Nipes) {
        this.Nipes = Nipes;
    }

    public int getValor() {
        return this.Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
    public int RetornaPesoCarta () {
        switch (Nipes) {
            case 'O': 
            return 1;
            case 'C':
            return 2;
            case 'P':
            return 3;
            case 'E':
            return 4;  
        }
        return 0;
    }

    }

