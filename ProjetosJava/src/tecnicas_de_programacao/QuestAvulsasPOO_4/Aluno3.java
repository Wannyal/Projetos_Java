package tecnicas_de_programacao.QuestAvulsasPOO_4;
import java.util.Random;

public class Aluno3 {
        private String Nome;
        private int Idade;
        private int Matricula;
        private String Turma;
        
        public Aluno3 (String nome, int idade, int matricula, String turma) {
            Nome = nome;
            Idade = idade;
            Matricula = matricula;
            Turma = turma;
        }
        
        public Aluno3 (){
            Random rd = new Random();
            String auxNome= "", auxSobre="";
            char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
           'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            for(int i =0 ; i < 15; i++){
                int posicao = rd.nextInt(letras.length); // gerei um valor aleatorio entre 0-25 que equivale a uma posição do vetor letras
                auxNome = auxNome + String.valueOf(letras[posicao]); // tranformei o vetor o caractere da posição "posicao" do vetor letras, em uma string e contatenei
            }
            for(int i =0 ; i < 15; i++){
                int posicao = rd.nextInt(letras.length);
                auxSobre = auxSobre + String.valueOf(letras[posicao]);
            }
            
            Nome = auxNome + " " + auxSobre;
            Idade = rd.nextInt(7,36);
            Matricula = rd.nextInt(1000,10000);
            if( Idade < 12 ) {
                Turma = "Infancia";
                } else {
                    if( Idade > 12 && Idade < 18) {
                      Turma = "Adolescência";
                    } else {
                        if( Idade > 18){
                            Turma = "Adulto";
                        }
                    }
                }
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
    

