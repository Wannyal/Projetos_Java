package tecnicas_de_programacao.ListaDeRevisao;

import java.util.Scanner;

/*A comissão organizadora de um rallye automobilístico decidiu apurar os 
resultados da competição através de um processamento eletrônico. Um dos 
algoritmos necessários para a classificação das equipes concorrentes é o que 
emite uma listagem geral do desempenho das equipes, atribuiindo pontos 
segundo determinadas normas. O algoritmo deverá:
a)Ler: 
a.1)os tempos-padrão (em minutos decimais) para as três fases de competição
a.2)o número de inscrição de cada equipe e os tempos (em minutos decimais) 
que as mesmas despenderam ao cumprir as três diferentes etapas. Considere 
como flag a inscrição de número 9999
b)Calcular:
b.1)os pontos de cada equipe em cada uma das etapas, seguindo o seguinte 
critério:
Seja β o valor absoluto da diferença entre o tempo-padrão (lido inicialmente) e 
o tempo despendido pela equipe numa etapa:
 Se β < 3 minutos ► Atribuir 100 pontos à etapa
 Se 3 ≤ β ≤ 5 minutos ► Atribuir 80 pontos à etapa
 Se β > 5 minutos ► Atribuir 80 - β−5 / 5 pontos à etapa
b.2)o total de pontos de cada equipe nas três etapas
b.3)a equipe vencedora
c)Escrever
c.1) para cada equipe, o número de inscrição, os pontos obtidos em cada etapa 
e o total de pontos obtidos
 */

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetTempo = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o tempo padrão da " + (i + 1) + "ª fase:");
            vetTempo[i] = sc.nextDouble();
        }
        System.out.println("Informe o número de inscrição da equipe:");
        int nIns = sc.nextInt();

        double eqVenc = 0;
        int nInsVen = 0;

        while (nIns != 9999) {

            double[] vetTequipe = new double[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Informe o tempo da equipe " + nIns + " na " + (i + 1) + "ª fase:");
                vetTequipe[i] = sc.nextDouble();
            }

            double vetPonto[] = new double[3];
            double totalP = 0;
            for (int i = 0; i < 3; i++) {
                double b = Math.abs(vetTempo[i] - vetTequipe[i]);
                if (b < 3) {
                    vetPonto[i] = 100;
                } else {
                    if (b >= 3 && b <= 5) {
                        vetPonto[i] = 80;
                    } else {
                        vetPonto[i] = 80 - ((b - 5) / 5);
                    }
                }
                totalP = totalP + vetPonto[i];
            }

            if (eqVenc < totalP) {
                eqVenc = totalP;
                nInsVen = nIns;
            }
            System.out.println("Número de inscrição da equipe: " + nIns);
            for (int i = 0; i < 3; i++) {
                System.out.println("Pontos obtidos na " + (i + 1) + "ª etapa: " + vetPonto[i]);
            }
            System.out.println("Pontos totais obtidos na competição: " + totalP);
            System.out.println("Informe o número de inscrição da equipe:");
            nIns = sc.nextInt();
        }
        System.out.println("A equipe vencedora foi a de nº: "+ eqVenc);

    }
}