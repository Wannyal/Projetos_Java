package ProjetosJava.src.curso_de_java;

import java.util.Locale;
import java.util.Locale.LanguageRange;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault(); //Método para descobrir o idioma utilizado pelo sistema
        System.out.println("O idioma do sistema é " + idioma.getDisplayLanguage());
    }
    
}
