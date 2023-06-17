package tecnicas_de_programacao.ProjetoLeituraDeArquivos_2;
import tecnicas_de_programacao.ProjetoLeituraDeArquivos_2.Filho;
import tecnicas_de_programacao.ProjetoLeituraDeArquivos_2.Funcionario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arquivo = ("C:/Users/Wanny/OneDrive/Área de Trabalho/ProjetoLei2.txt");
        
        List<Funcionario> funcionarios = lerArquivo(arquivo);

        if (!funcionarios.isEmpty()) { // se a lista funcionario não está fazia, entra nessa chave
            int valorInicialSequencia = ValorInicialSeq();
            PrintFunc(funcionarios, valorInicialSequencia);
        } else {
            JOptionPane.showMessageDialog(null, "O arquivo está vazio.");
        }
    }

    private static List<Funcionario> lerArquivo(String arquivo) {
        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                Funcionario funcionario = criarFuncionario(linha);
                funcionarios.add(funcionario);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage());
        }

        return funcionarios;
    }

    private static Funcionario criarFuncionario(String linha) {
        String[] dadosDaLinha = linha.split("-"); // Vetor irá aguardar cada informação numa posição e sem os traços

        int matricula = Integer.parseInt(dadosDaLinha[0]); // Transformo a string em int
        String[] nome = dadosDaLinha[1].split(" ");
        String nomeFunc = "";
        for (int i = 0; i < nome.length; i++) {
            nomeFunc += nome[i].substring(0, 1) + nome[i].substring(1).toLowerCase() + " ";
        }

        
        String salario = FormatSalario(dadosDaLinha[2]);
        String gratificacao = FormatGratificacao(dadosDaLinha[3]);

        Funcionario funcionario = new Funcionario(matricula, nomeFunc, salario, gratificacao);

        if (dadosDaLinha.length > 4) {
            for (int i = 4; i < dadosDaLinha.length; i += 3) {
                String[] nomef = dadosDaLinha[i].split(" ");
                String nomeFilho = "";
                for (int j = 0; j < nomef.length; j++) {
                    nomeFilho += nomef[j].substring(0, 1) + nomef[j].substring(1).toLowerCase() + " ";
                }
                String dataNas = FormatData(dadosDaLinha[i + 1]);
                String sexo = dadosDaLinha[i + 2];

                Filho filho = new Filho (nomeFilho, dataNas, sexo);
                funcionario.adicionarFilho(filho);
            }
        }
     return funcionario;
    }
    

    public static String FormatSalario(String salario) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
    double salarioDouble = Double.parseDouble(salario) / 100; // Divide por 100 para ajustar a escala
    return "R$ " + df.format(salarioDouble);
    }

    public static String FormatGratificacao(String gratificacao) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
    double gratificacaoDouble = Double.parseDouble(gratificacao) / 100; // Divide por 100 para ajustar a escala
    return "R$ " + df.format(gratificacaoDouble);
}

    public static String FormatData(String dataNas) {
        dataNas = dataNas.substring(0, 2)
                + "/" + dataNas.substring(2, 4)
                + "/" + dataNas.substring(4);
        return dataNas;
    }



    private static int ValorInicialSeq() {
        int valorIni = 0;

        do {
            try {
                valorIni = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inicial para a sequência (1 a 98):"));
            } 
            catch (NumberFormatException e) {
                valorIni = 0;
            }

            if (valorIni < 1 || valorIni > 98) {
                JOptionPane.showMessageDialog(null, "Valor inválido. \n O valor deve ser entre 1 e 98.");
            }
        } while (valorIni < 1 || valorIni > 98);

        return valorIni;
    }

    private static void PrintFunc (List<Funcionario> funcionarios, int valorInicialSeq) {
       String printFun = ("Lista de funcionários\n=========================================================\n");

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            
            String dadosFun = (String.format("%03d", valorInicialSeq + i)) + "  -  " + funcionario.getNome() + "  -  "
                    + (funcionario.getSalario()) + "  -  " + (funcionario.getGratificacao() + "\n");

 
            List<Filho> filhos = funcionario.getFilhos();
            if (filhos.isEmpty()) {
                dadosFun += "        <Sem filhos>\n";
            } else {
                for (Filho filho : filhos) {
                   dadosFun += "       " + filho.getNome() + " - " + filho.getDataNas() + " -  " + filho.getSexo() + "\n";
                }
            }
            printFun += dadosFun + "\n";
        }
        JOptionPane.showMessageDialog(null, printFun.toString());

    }

}