package com.exercicio2;

public class Jogo {
    private static char[][] tabuleiro;
    Jogador p1, p2;
    
    Jogo() {};

    public void start() {
        tabuleiro = new char[3][9];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 9; j++)
                tabuleiro[i][j] = '_';
    }

    public void imprimeTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(tabuleiro[i][j - 1]);
                if (j !=0 && j % 3 == 0) System.out.print("\t");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void adicionarJogada(int i, int j, int k, Jogador p) {
        tabuleiro[i][j + (k * 3)] = p.simbolo;
    }
    
    public void setJogadores(Jogador p1, Jogador p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    private boolean porCamada() {
  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    char simbol = tabuleiro[i][j];
                    boolean linha = tabuleiro[i][j] == simbol && tabuleiro[i][j + 1] == simbol && tabuleiro[i][j + 1] == simbol;
            
                }
            }
        }
    }

    public boolean vitoria() {
        
        return false;
    }

}
