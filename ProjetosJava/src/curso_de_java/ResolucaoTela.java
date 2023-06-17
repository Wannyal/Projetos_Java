package ProjetosJava.src.curso_de_java;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dm = tk.getScreenSize();
        System.out.println("A resolução da sua tela é: " + dm.width + " x " + dm.height);
    }  

}
