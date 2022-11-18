package com.exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static ArrayList<Jogador> pvp()
    {
        Scanner inputObj = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador p1 = new Jogador();
        Jogador p2 = new Jogador();

        System.out.println("Jogador 1");
        System.out.print("Nome: ");
        p1.nome = inputObj.nextLine();
        System.out.print("Simbolo: ");
        p1.simbolo = inputObj.next().charAt(0);

        System.out.println("Jogador 2");
        System.out.print("Nome: ");
        p2.nome = inputObj.nextLine();
        System.out.print("Simbolo: ");
        p2.simbolo = inputObj.next().charAt(0);

        jogadores.add(p1);
        jogadores.add(p2);
        return jogadores;
    }
    public static ArrayList<Jogador> pve()
    {
        Scanner inputObj = new Scanner(System.in);
        char botSimble = 'X';
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador p1 = new Jogador();
        Jogador bot = new Jogador();

        System.out.println("Jogador");
        System.out.print("Nome: ");
        p1.nome = inputObj.nextLine();
        System.out.print("Simbolo: ");
        p1.simbolo = inputObj.next().charAt(0);

        if (p1.simbolo == 'X') {
            botSimble = 'O';
        }

        bot.nome = "Bot";
        bot.simbolo = botSimble;

        jogadores.add(p1);
        jogadores.add(bot);

        return jogadores;
    }
    public static int userInterface()
    {
        Scanner inputObj = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println(
                "Boas Vindas\n" + 
                "1. Jogar PvP (Jogador vs Jogador)\n"  +
                "2. Jogar PvE (Jogador vs Robo)\n" +
                "0. Sair"
            );
            input = inputObj.nextInt();
            if (input != 0) return input;
        } while(input != 0);
        return input;
    }
    public static void main( String[] args )
    {
        Jogo game = new Jogo();
        int escolha = userInterface();
        game.start();

        if (escolha == 1)
            game.setJogadores(pvp().get(0), pvp().get(1));
        else if (escolha == 2)
            game.setJogadores(pve().get(0), pve().get(1));

        
    }
}
