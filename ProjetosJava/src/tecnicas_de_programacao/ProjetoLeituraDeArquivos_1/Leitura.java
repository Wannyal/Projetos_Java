package tecnicas_de_programacao.ProjetoLeituraDeArquivos_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Leitura {
   public static void main(String[] args) throws FileNotFoundException, IOException {
      Scanner sc = new Scanner(System.in);
      String arquivo = ("C:\\Users\\Wanny\\OneDrive\\Área de Trabalho\\ProjetoLeitura.txt");
      try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
        String linha = br.readLine(); //Está lendo a primeira linha e guardando na variavél linha
        int contL = 3; //Contador de linha
        String cabecalho = ("RELAÇÃO DE FUNCIONÁRIOS E SEUS DEPENDENTES\n" + 
        (String.format("%-8.8s %-31.31s %-15.15s %-15.15s","Seq." , "Nome do Funcionário" , "Data Nasc", "Cpf")) + "\n=============================================================================");
        System.out.println(cabecalho);
        while (linha != null) { //Condicional para reimpressão do cabeçalho
           Funcionario F = criaFuncionario(linha); // F do tipo Funcionario
           contL = contL + 1 + F.retornaListaDp().size(); //
           if(contL>=15){
              System.out.println(cabecalho); 
              contL =3;
            }
            F.printFuncionario();
            linha = br.readLine(); //Ler a proxima linha
            
         }
      } catch (IOException e) {
         System.out.println("Error: " + e.getMessage());
      }

   }

   public static Funcionario criaFuncionario(String linha) {
      ArrayList<Dependente> listaDependetes = new ArrayList<>(); //Criei uma lista do tipo Dependentes pra aguardar os dependentes
      String mat = linha.substring(0, 4);
      linha = linha.substring(4);
      String nome = EncontrarNome(linha);
      nome = FormatNome(nome);
      linha = linha.substring(nome.length());
      String data = linha.substring(0, 8);
      data = FormatData(data);
      linha = linha.substring(8);
      String cpf = linha.substring(0, 11);
      cpf = FormatCpf(cpf);
      linha = linha.substring(11);
      if (linha.isEmpty()) { // *Retorna se a string ainda possiu char */
      } else {
         while (linha.isEmpty() == false) {
            String nomedep = EncontrarNome(linha);
            nomedep = FormatNome(nomedep);
            linha = linha.substring(nomedep.length());
            String tipodep = linha.substring(0, 1);
            linha = linha.substring(1);
            String datadep = linha.substring(0, 8);
            datadep = FormatData(datadep);
            linha = linha.substring(8);
            listaDependetes.add(new Dependente(nomedep, tipodep, datadep));
         }

      }
      return new Funcionario(mat, nome, data, cpf, listaDependetes);
   }

   public static String FormatData(String dataS) {
      dataS = dataS.substring(0, 2)
            + "/" + dataS.substring(2, 4)
            + "/" + dataS.substring(4);
      return dataS;
   }

   public static String FormatCpf(String cpfS) {
      cpfS = cpfS.substring(0, 3)
            + "." + cpfS.substring(3, 6)
            + "." + cpfS.substring(6, 9)
            + "-" + cpfS.substring(9);
      return cpfS;
   }

   public static String EncontrarNome(String linha) {
      String nome = "";
      for (int i = 0; Character.isAlphabetic(linha.charAt(i)) || linha.charAt(i) == ' '; i++) {
         nome = nome + linha.charAt(i);
      }
      return nome;
   }

   public static String FormatNome(String nome) {
      String[] vtNome = nome.split(" ");
      String formatNome = "";
      for (int i = 0; i < vtNome.length; i++) {
       String pnome = vtNome[i].substring(0,1);
       nome = vtNome[i].substring(1);  
       formatNome += pnome + nome.toLowerCase();
       if (i < vtNome.length - 1) {
         formatNome += " ";
     }
 }
 return formatNome;
}  
}
