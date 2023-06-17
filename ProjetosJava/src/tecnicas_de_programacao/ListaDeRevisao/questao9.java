package tecnicas_de_programacao.ListaDeRevisao;

import java.util.Scanner;

/* Desenvolva um programa para determinar e escrever o total de grãos serão 
inseridos em um tabuleiro de xadrez, sendo que deve-se inserir 1 grão na 
primeira casa e nas demais casas deve-se se inserir o dobro de grãos da casa 
anterior. */

public class questao9 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        long [][] tabuleiro = new long [8][8];
        long grao = 1;
        for(int i=0 ; i < 8 ; i++){
            for(int j=0 ; j < 8; j++ ){
                tabuleiro [i][j] = grao;
                grao = grao * 2; 
            }
        }
        for(int i =0; i<8 ; i++){
            for( int j = 0; j<8; j++){
        System.out.print(" " + tabuleiro [i][j]);
            }
            System.out.println();
        }
    }
    
}
