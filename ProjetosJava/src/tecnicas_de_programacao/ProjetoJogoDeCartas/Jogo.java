package tecnicas_de_programacao.ProjetoJogoDeCartas;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {

        
    }

     private static int Menu() {
        String menu = "Escolha uma opção:\n"
                + "1. Iniciar jogo com nomes aleatórios\n"
                + "2. Iniciar jogo com nomes informados pelo usuário\n"
                + "3. Mostrar resultado novamente\n"
                + "4. Consultar informações por jogador\n"
                + "5. Fim";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.QUESTION_MESSAGE));
        return opcao;
    }

     private static int IniciaAl () {
       
        int qntCaracter = 0;

        do {
            try {
                qntCaracter = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de caracteres desejados para os nomes do jogadores: \n"));
            } 
            catch (NumberFormatException e) {
                qntCaracter = 0;
            }

            if (qntCaracter < 6 || qntCaracter > 10) {
                JOptionPane.showMessageDialog(null, "Valor inválido. \n O valor deve ser entre 1 e 98.");
            }
        } while (qntCaracter < 1 || qntCaracter > 98);

        return qntCaracter;
    }
       

    private static void IniciaUs () {

    }
    
}
