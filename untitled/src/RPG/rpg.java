package RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class rpg {
    static Scanner entrada;
    static String nomeUsu;
    static int vida;

    // Menu
    public static void main(String[] args) {
        int contador = 0;

        do {
            estiloEscrita("\n↞Contos de Horror da Mimi↠\n");
            estiloEscrita("\nBem vindo, " + nomeUsu + ".\nEscolha o que deseja fazer:\n\n1. Instruções \n2. Jogar \n3. Créditos \n4. Sair\n");
            int acaoInicio = entrada.nextInt();

            switch (acaoInicio) {
                case 1:
                    contador = instrucoes();
                    break;
                case 2:
                    contador = jogar();
                    break;
                case 3:
                    contador = creditos();
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nAlerta! Opção inválida.");
            }
        } while (contador == 1);

        entrada.close();
    }

    static int instrucoes() {
        estiloEscrita("\nInstruções: \n1 - Fique vivo \n 2- Cuidado com suas escolhas \n3 - Não olhe para trás, " + nomeUsu + ".\n\nDeseja retornar para o menu? \n1. Sim | 2. Não \n");
        return entrada.nextInt();
    }

    static int jogar() {

        int pontuacao = 0;

        // Dialogo
        estiloEscrita("\n - Capítulo 1: A Origem - \n");
        estiloEscrita("\nMimi, mora em um cidade tranquila, porem há uma semana está sendo atormentada por coisas assustadoras, quando ela chega em seu apartamento escuta algo dentro de sua casa.");

        System.out.println("\nMimi deve abrar a porta?");
        System.out.println("\n1 - Sim");
        System.out.println("2 - Não");

        int escolhaCapitulo1 = entrada.nextInt();

        if (escolhaCapitulo1 == 1) {
            System.out.println("" +
                    "⣿⣿⣿⣿⣿⣿⡟⠁⠄⠄⠄⠄⣠⣤⣴⣶⣶⣶⣶⣤⡀⠈⠙⢿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⡟⠄⠄⠄⠄⠄⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠄⠈⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⠁⠄⠄⠄⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⢺⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⡄⠄⠄⠄⠙⠻⠿⣿⣿⣿⣿⠿⠿⠛⠛⠻⣿⡄⠄⣾⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⡇⠄⠄⠁ O ⠄⢹⣿⡗⠄ O ⢄⡀⣾⢀⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⡇⠘⠄⠄⠄⢀⡀⠄⣿⣿⣷⣤⣤⣾⣿⣿⣿⣧⢸⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⡇⠄⣰⣿⡿⠟⠃⠄⣿⣿⣿⣿⣿⡛⠿⢿⣿⣷⣾⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⡄⠈⠁⠄⠄⠄⠄⠻⠿⢛⣿⣿⠿⠂⠄⢹⢹⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⡐⠐⠄⠄⣠⣀⣀⣚⣯⣵⣶⠆⣰⠄⠞⣾⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣷⡄⠄⠄⠈⠛⠿⠿⠿⣻⡏⢠⣿⣎⣾⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⡿⠟⠛⠄⠄⠄⠄⠙⣛⣿⣿⣵⣿⡿⢹⡟⣿⣿⣿⣿⣿");

            // Dialogo
            estiloEscrita("\nHomem-Python aparece em sua frente\n");
            estiloEscrita("\nHomem-Python: - Oi. Voce pode me responder algo?");
            estiloEscrita("\nMimi com medo responde: - Cl... Claro.");

            // Pergunta 1 - Cap 1
            String pergunta1Cap1 = "\nHomem-Python: - Como você declara uma variável inteira em Java? \na) int x; b) float x; c) String x; d) bool x;\n";
            String respostaCorreta1Cap1 = "a";
            pontuacao += apresentarDesafio(pergunta1Cap1, respostaCorreta1Cap1);

            // Dialogo
            estiloEscrita("\nHomem-Python: - Antes de ir, vou te testar. Caso voce erre, eu te mato\n");

            // Pergunta 2 - Cap 1
            String pergunta2Cap1 = "Homem-Python: - O que representa o operador lógico '&&' em Java?\na) OU | b) E | c) OU Exclusivo | d) Negação\n";
            String respostaCorreta2Cap1 = "b";
            pontuacao += apresentarDesafio(pergunta2Cap1, respostaCorreta2Cap1);

            estiloEscrita("\nApós responder, o Homem-Python foge em um piscar de olhos...\n");

        } else if (escolhaCapitulo1 == 2) {
            estiloEscrita("\nMimi corre para o apartamento de sua amiga, ao chegar se depara com a porta já aberta...");
            estiloEscrita("\nAo ver sua amiga, Mimi cai no chão desesperada...\n");
            System.out.println("\n2         ⠤⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⢠⡞⠁⣸⣯⣿⣿⣿⣿⣿⠟⠁⠐⠉⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⣠⠛⠀⣼⣿⣿⣿⢻⡥⣻⡇⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⢀⡾⠁⢀⣾⢿⣾⣯⣿⣿⠃⣿⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣝⣿⣿⣿⣿⡝⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣛⣿⣿⣿⣿⣿⡏⠀⢀⡞⠁⢠⣿⢫⣿⢿⣼⡿⠏⢰⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣞⣿⣿⣿⣿⡜⣿⣿⣿⣿⣿⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⢃⣾⣿⣿⣿⣿⠏⠀⠀⣼⠁⢠⣿⢣⣿⡟⣾⡿⠉⡇⣼⠇⠀⠀⠀⠀⠀⠀⠈⢀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣌⢿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⢃⣾⣿⣿⣿⣿⠏⠀⠀⣼⠃⢠⣾⣏⣾⣿⣿⡿⠁⣸⠇⣿⠀⠀⠀⠀⠣⡀⠀⠀⠈⡄⠀⠀⠀⠸⣿⣿⣿⣿⣿⡌⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⢃⣿⣿⣿⣿⣿⡟⠀⠀⢠⡟⢀⣿⣿⣿⣿⣿⣿⠁⣠⡏⢸⡇⠀⠀⠀⠀⠀⠉⢄⠀⠀⠘⡄⠀⠀⠀⢹⣿⣿⣿⣿⣷⢾⣿⣿⣿⣿⡽⡆⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⢠⣿⣿⣿⣿⣟⣿⣿⣿⢃⣿⣿⣿⣿⣿⣿⠁⡀⠀⣼⢧⣾⣿⣿⣿⣿⣿⠃⢠⠏⠀⣺⠅⠀⠀⠀⠀⠀⠀⠈⢢⠀⠀⠸⡄⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠹⡄⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⡏⡼⣿⣿⣿⣿⣿⡏⠒⡀⠄⣿⣾⣿⣿⣿⣿⣿⠇⣠⠎⠀⢠⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢂⠀⠀⠹⡄⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠱⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡏⣶⢫⣿⢻⣿⣿⣿⠹⠀⠄⢰⣿⡏⣼⣿⣿⣿⠏⣰⠏⠀⠀⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⣄⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⡟⣸⠃⢾⠃⢸⣿⣿⣿⠀⣁⣼⢿⡟⣸⣿⣿⣿⣋⠛⠁⠀⠀⢰⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠂⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠸⣿⣿⣿⣿⣿⡟⠡⠀⢚⠁⠀⣻⣿⠿⣿⠛⠉⢁⢘⣿⡿⢛⢏⣽⠏⠀⠀⠀⠀⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⣹⣿⣿⣿⣿⠁⠀⢀⠃⣌⠲⣿⣿⢢⢄⠠⣀⣦⠿⢿⡄⢁⢺⠇⠀⠀⠀⠀⠀⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⡀⢀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢀⣿⣿⣿⣿⠟⠀⠀⠘⢠⡘⢧⣿⣿⣿⣼⣇⡜⢃⡀⠄⠸⣀⡿⠀⠀⡀⠃⡀⢸⡿⠀⠀⠀⠀⠀⠀⠀⠀⣠⣜⣃⣿⣄⠣⡜⠀⠀⠀⣿⡟⣿⣿⣿⢟⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢀⣾⣿⣿⣿⢏⠂⠀⡀⣦⣷⣿⣿⣿⣿⣿⣿⣿⣿⣧⣝⡦⢱⣈⠱⢀⢂⠐⠀⢇⣿⠇⠀⠄⠠⣀⢲⣶⣶⣿⣿⣿⣿⣿⣿⣷⣾⣄⠀⠀⣿⠱⡉⢿⣿⣼⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢈⣼⣿⣿⡿⠀⢐⣈⣶⣿⣿⣿⠿⢿⢿⣿⣿⣿⣿⣿⣿⣷⣧⢂⠡⠌⡂⠌⡑⠉⡁⢂⢩⣰⢷⣾⣿⣿⣿⣿⣿⠿⠿⠿⠿⣿⣿⣿⣷⠀⢹⡇⠁⠀⠉⢿⣿⣿⣿⣿⣿⣿⣿⣿⡁⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣼⣿⣿⡇⠀⣸⣯⣿⣿⠏⠀⢈⣠⣬⣌⠹⢻⣿⣿⣿⣿⣿⣛⢦⠑⡀⠂⠄⠠⠀⠌⣠⢟⣾⣿⣿⣿⣿⠋⠀⠀⠀⠀⠀⠀⠉⢿⣿⣧⠘⣷⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀\n" +
                    "⠀⠀⠞⣿⣿⣿⠀⠀⣸⣿⣿⡟⠀⢠⣿⣿⣿⣿⣿⣆⡳⣿⣿⣿⣿⣯⢎⠐⠠⠉⠀⠁⠈⠠⢙⣾⣿⣿⣿⡿⡆⣍⣴⣦⣤⣄⡀⠀⠀⠀⢻⣿⠀⣿⠀⠀⠀⠠⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣾⣿⣿⠀⠀⠼⣿⣿⣿⠀⢼⣿⣿⣿⣿⣿⣿⣱⢯⣿⣿⣿⣿⠎⡄⠁⠀⠀⠀⠀⠐⣼⣿⣿⣿⣿⣿⣱⣿⣿⣿⣿⣿⣿⡀⠀⠀⣼⣿⠆⡿⠀⠀⠀⠐⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀\n" +
                    "⠀⠀⢀⣿⣿⣿⠀⠀⠘⣷⣿⣿⣷⣬⢻⣿⣿⣿⣿⢯⣿⣿⣿⣿⣿⣟⠆⡀⠀⠀⠀⠀⠀⠘⢻⣿⣿⣿⣿⣷⣞⣿⣿⣿⣿⣿⣿⢁⣁⣰⣿⣿⠏⠁⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀\n" +
                    "⠀⠀⠿⣿⣿⣿⡆⠀⡐⢌⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣋⠖⡀⠀⠀⠀⠀⠀⠀⠩⠼⣿⣿⣿⣿⣿⣟⣿⣿⣿⣟⣷⣮⣷⣿⡿⡁⠂⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣿⣿⣿⣇⠀⢀⠘⣞⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢏⠶⡡⠊⠄⠁⠀⠀⠀⠀⠀⠀⠁⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡋⠄⠁⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣿⣿⣿⣿⣄⠀⡌⢌⣻⢻⣿⣿⣿⣿⣿⣿⣿⢋⠵⡈⠎⡔⠡⢈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠥⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⣉⠀⠀⠀⠀⠀⠠⣞⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣷⠀⠀⠀\n" +
                    "⠀⠀⢰⣿⣿⣿⣿⣿⡀⠌⢢⢡⢋⡿⣻⢿⡿⣛⠯⠄⢃⠆⡱⢈⠤⢁⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⢂⠑⡌⢻⠿⣿⣿⣿⣿⣿⢿⢫⠕⠂⠀⠀⠀⢀⣰⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠉⠀⠀⠀\n" +
                    "⠀⠀⢸⣿⣿⣿⣿⣿⣷⣌⢂⠣⢯⡜⣣⠟⡼⡡⢞⢨⠐⣂⠐⢡⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⢆⠀⠀⢂⠈⠄⡑⠬⡙⡝⣫⡜⢎⠱⠈⡀⠀⢀⠠⣂⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢷⡄⠀⠀\n" +
                    "⠀⠀⢸⣿⣿⣿⣿⣿⣿⡻⢿⣞⡤⡛⣄⠫⡔⡱⢊⠄⢣⠰⣌⠲⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠂⠀⢂⠱⢈⡕⡈⠆⡀⠐⢠⣁⣎⣶⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀\n" +
                    "⠀⠀⢸⣿⣿⣿⣿⣿⣿⣟⡼⣹⢻⡕⣢⠓⡬⢱⡈⠌⡄⢻⡝⢣⠀⠄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⠀⢆⠢⡐⡡⢆⣱⣬⣷⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀\n" +
                    "⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⡶⣥⢫⢽⡲⣍⠲⡁⠜⡠⢌⢣⡝⠄⣮⣶⣴⣹⢓⡶⣛⣦⣂⡀⠀⠀⢀⠀⠀⠀⠠⠈⢂⠱⢨⡵⣿⡿⡟⢯⣽⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀\n" +
                    "⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣜⡳⣮⠱⣎⡱⠈⢄⠡⢌⠺⣜⢢⣿⣿⣿⣿⠛⢾⣿⣿⣿⣟⠠⢀⠄⠀⠀⠀⠀⠐⠠⢌⡷⣿⢫⠱⣹⣾⡿⣋⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀\n" +
                    "⠀⢸⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡹⣷⣗⡈⠧⠁⠦⡈⢆⠹⡜⢢⢻⣿⣿⠣⡙⠀⠻⢿⣿⠃⠐⠀⠂⠀⠀⠀⠀⡀⢒⠎⡙⢀⣡⣾⡿⢏⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀\n" +
                    "⠀⠸⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡭⢿⣷⣜⠠⢑⠠⠌⢒⢩⢃⠯⡹⣆⠓⡌⢀⠀⠌⣆⠐⠠⠀⠀⠀⠀⢀⠀⠜⡠⢂⣰⣾⣿⠟⣡⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀\n" +
                    "⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⡽⣿⣷⡌⢒⡈⠎⢦⠩⢖⡱⢊⠱⡈⠤⢈⠰⢀⠊⢀⠀⠀⠀⠐⠀⠌⣠⣵⣾⡿⢟⡱⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀\n" +
                    "⠀⠀⣆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣱⢫⢿⣿⣷⣌⠜⣢⠙⡊⠔⡃⢆⠡⢂⠂⠐⠀⠠⠀⢀⠈⠀⢌⣦⣾⣿⡿⢟⡩⢶⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⣿⠀⠀⠀\n" +
                    "⠀⠀⢘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣯⡚⢿⣿⣿⣷⣦⡙⣀⠣⡘⠠⢃⠂⠄⡁⠠⢀⠐⢂⣤⣾⣿⣿⠿⢫⡑⢮⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀\n" +
                    "⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⡞⣿⣿⣿⣿⣶⣬⣰⠹⣮⢵⠦⡐⢡⣢⣾⣿⣿⣿⡟⣩⡛⣦⣟⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀\n" +
                    "⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣹⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⠿⣏⡳⣜⣣⢟⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀\n" +
                    "⠀⠀⣿⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣯⢿⣟⡿⣿⣿⣿⣿⣿⣿⡻⡽⣎⣵⡾⢷⣽⣞⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀\n" +
                    "⠀⠀⡏⢼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⡫⢟⡿⣞⣷⣻⣼⣶⡿⢿⠻⣍⡞⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n");

            // Dialogo
            estiloEscrita("\nCriatura: - Oi Mimi, tenho uma prova de Algoritmo amanhã. Eu preciso saber LOGO... ME RESPONDAAA!");

            // Pergunta 1 - Cap 1
            String pergunta2Cap1 = "\nO que representa o operador lógico '&&' em Java?\na) OU | b) E | c) OU Exclusivo | d) Negação\n";
            String respostaCorreta2Cap1 = "b";
            pontuacao += apresentarDesafio(pergunta2Cap1, respostaCorreta2Cap1);

            // Pergunta 2 - Cap 1
            String pergunta1Cap1 = "Parabens Mimi, não sou mais a mesma amiga que voce conhece. Por ultimo me responda:\n\nComo você declara uma variável inteira em Java? \na) int x; b) float x; c) String x; d) bool x;\n";
            String respostaCorreta1Cap1 = "a";
            pontuacao += apresentarDesafio(pergunta1Cap1, respostaCorreta1Cap1);

            // Dialogo
            estiloEscrita("\nApós responder, a criatura que era sua amiga desaparece...");

        }

        // Mensagem de ganho ou perca do desafio
        if (vida > 0) {
            estiloEscrita("\nMimi: Ué! Sumiu.\n");
            pontuacao += capitulo2();
        } else {
            estiloEscrita("\nMimi cai em eterno sofrimento\n");
        }

        return pontuacao;
    }

    static int capitulo2() {
        int pontuacao = 0;

        // Dialogo
        estiloEscrita("\n - Capítulo 2: Labirinto da Mente - \n");
        estiloEscrita("\nMimi sai correndo para o corredor e se depara com uma criatura ao fundo\n");
        estiloEscrita("\n* TODAS AS LUZES DO PREDIO SE APAGAM *\n");
        estiloEscrita("\nVoz sombria: - Pensou que se ia se livrar da gente tão facilmente? HAHAHA");
        estiloEscrita("\nVoz sombria: - Voce agora está presa em meu dominio...\n");
        estiloEscrita("\nMimi, agora está presa no labirinto da mente. Porem uma voz amigável surge!\nDispositivo: - Oi Mimi, aqui em baixo. Serei o seu guia neste lugar sombrio. Vamos superar isso juntos.\n");
        estiloEscrita("\nMimi: Um dispositivo? ");
        estiloEscrita("\nDispositivo: Isso mesmo, pode me pegar. Eu irei te ajudar. Mas agora preciso que me responda: ");

        // Pergunta 1 - Cap 2
        String pergunta1Cap2 = "\nO que é um array em Java?\na) Uma lista ordenada de elementos.| b) Um tipo de variável lógica. | c) Um operador de comparação. | d) Uma estrutura de controle.\n";
        String respostaCorreta1Cap2 = "a";
        pontuacao += apresentarDesafio(pergunta1Cap2, respostaCorreta1Cap2);

        if (respostaCorreta1Cap2 == "a") {

            // Dialogo
            estiloEscrita("\nVoz sombria: - Muahahahaha, parece que alguem aqui está se saindo bem, não é mesmo?");
            estiloEscrita("\nMimi: - Estou sempre preparada!");
            estiloEscrita("\nVoz sombria: - Te libertarei daqui caso consiga acertar essa pergunta, meu trabalho não é te matar ainda...");

        } else {
        }

        // Pergunta 2 - Cap 2
        String pergunta2Cap2 = "\nComo você encerra um loop \"for\" em Java antes de sua conclusão normal?\na) continue; | b) break; | c) end; | d) stop;\n";
        String respostaCorreta2Cap2 = "b";
        pontuacao += apresentarDesafio(pergunta2Cap2, respostaCorreta2Cap2);

        // Mensagem de ganho ou perca do desafio
        if (vida > 0) {
            estiloEscrita("\nDispositivo: Muito bem, Mimi! Essas respostas abriram caminho para nossa jornada.");
            estiloEscrita("\n * Com a orientação do dispositivo, Mimi supera os enigmas do labirinto. * \n");
            pontuacao += capitulo3();
        } else {
            estiloEscrita("\nDispositivo: Parece que o labirinto da mente foi demais para Mimi. A jornada termina aqui.\n");
        }

        return pontuacao;
    }

    static int capitulo3() {
        int pontuacao = 0;

        // Dialogo
        estiloEscrita("\n - Capítulo 3: Reino de Pesadelo - \n");
        estiloEscrita("\nMimi chega até a portaria do seu predio, porem o porteiro está morto");
        estiloEscrita("\nApos andar pelo corredor da entrada, Mimi escuta algo * Sons de gritos *");
        estiloEscrita("\nQuando Mimi olha pra tras, uma senhora bizarra está no canto devorando uma pessoa\n");
        estiloEscrita("\nDispositivo fala com Mimi: - Voce tem duas opções:\n");
        estiloEscrita("\n1. Correr");
        estiloEscrita("\n2. Ficar parada e espere ela sair\n");

        int escolhaCapitulo3 = entrada.nextInt();

        if (escolhaCapitulo3 == 1) {
            estiloEscrita("\nNo momento que Mimi levanta o pé, a senhora se teleporta em sua frente\n");
            System.out.println("\n " +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⢸⣿⡏⣿⠁⣾⡿⠁⠏⠀⣿⠋⠘⡿⠸⢿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢩⣿⡿⢻⣿⢰⠏⠘⠇⠛⠀⠸⡅⠀⠀⠀⠋⠀⠀⠿⠀⠞⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠃⠸⠙⠁⠈⠈⢀⣀⣠⣿⣷⡀⠀⠁⠀⢀⣠⣾⣶⣄⣀⣀⠀⠀⠁⢿⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣭⠻⣿⣿⣿⡿⢧⢀⣠⣤⣶⣶⣾⣿⣿⣿⣿⣿⣿⣆⠀⢀⣿⣿⣿⣿⣿⣿⣿⣷⣤⡀⠈⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣁⣷⢻⣿⣿⠇⢘⣿⣿⣿⣿⠿⣿⠿⠿⣿⣿⣿⣿⣿⠀⢸⣿⣿⣿⡿⢿⡿⣿⣿⣿⣿⣷⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⢹⢋⣧⣿⡇⠀⢸⣿⣿⣿⣿⣿⣶⣶⣿⣿⣿⣿⣿⣿⠀⢸⣿⣿⣿⣷⣾⣶⣾⣿⣿⣿⣿⡇⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣷⢸⣿⢹⠇⠀⠈⠻⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠸⢿⡟⠿⠟⠿⢿⠻⡿⣿⡿⡿⢁⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣌⠻⣿⡆⠀⠀⠀⠀⠀⠈⠀⠉⠛⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡈⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣃⣄⡀⠀⠀⣀⣵⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢣⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⡀⠀⠀⣠⡤⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠛⠛⠉⠀⠀⠀⠀⠀⣰⡶⠆⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠙⢿⣷⣦⣄⣀⣀⣀⣀⡀⠀⣀⠀⠀⠀⣀⣀⣀⣤⣴⣶⣾⡿⠁⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠙⠿⢿⣿⣿⣿⣿⡿⠿⠛⠁⠀⠀⢀⣾⣿⣿⣿⣿⣟⠯⠝⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡄⠀⠀⠀⠤⣄⣀⣀⣀⣀⣠⠤⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⠀⠀⠉⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡀⠀⠈⠙⠻⠿⠛⠁⠀⣀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣀⣀⣈⠙⠛⠿⣿⣿");

            // Dialogo
            estiloEscrita("\nVelha da Alura: - Pensou que eu não escutaria garotinha?");
            estiloEscrita("\nVelha da Alura: - Responda-me ou voce morre: ");

            // Pergunta 1 - Cap 3
            String pergunta1Cap3 = "\nO que é um construtor em Java?\na) Um método que destrói objetos. | b) Um método que inicializa objetos. | c) Um método que encapsula objetos. | d) Um método que copia objetos.\n";
            String respostaCorreta1Cap3 = "b";
            pontuacao += apresentarDesafio(pergunta1Cap3, respostaCorreta1Cap3);
        } else if (escolhaCapitulo3 == 2) {
            removeVida(vida);
        } else

            estiloEscrita("\nMimi, agora diante da Velha da Alura, uma mulher muito mal que apenas quer saber as respostas de Java. \n\nVeilha da Alura: - Seus sonhos estão prestes a se tornar um pesadelo sem fim. Responda-me:\n");

        // Pergunta 2 - Cap 3
        String pergunta1Cap3 = "\nQual é a palavra-chave usada para declarar uma variável constante em Java?\na) var | b) b) final | c) const. | d) static\n";
        String respostaCorreta1Cap3 = "b";
        pontuacao += apresentarDesafio(pergunta1Cap3, respostaCorreta1Cap3);


        // Mensagem de ganho ou perca do desafio
        if (vida > 0) {
            estiloEscrita("\nVelha da Alura: Você não escapará dessa realidade distorcida tão facilmente!\n");
            estiloEscrita("\nMesmo diante das adversidades, Mimi responde corretamente, desfazendo os pesadelos. \n");
            pontuacao += capituloFinal();
        } else {
            estiloEscrita("\nVelha da Alura: Seu pesadelo está apenas começando, Mimi. Prepare-se para o pior.\n");
        }

        return pontuacao;
    }

    // Capitulo Final
    static int capituloFinal() {
        int pontuacao = 0;

        // Dialogo
        estiloEscrita("\n - Capítulo Final: O Fim - \n");
        estiloEscrita("\nDiante da vizinha, Mimi encara a última pergunta com confiança:\n\nVizinha: Parece que alguém estudou um pouco. Mas será que é suficiente para me derrotar?\n");
        estiloEscrita("\nMimi: Estudar foi apenas o começo. Agora é hora de colocar esse conhecimento em prática.\n ");
        estiloEscrita("\nResponda-me então: ");

        // Pergunta Unica - Cap Final
        String pergunta1CapFinal = "O que é polimorfismo em Java?\na) Um tipo de variável. | b) Uma estrutura de controle. | c) Uma característica de herança. | d) Uma capacidade de objetos se comportarem de maneiras diferentes.\n";
        String respostaCorreta1CapFinal = "d";
        pontuacao += apresentarDesafio(pergunta1CapFinal, respostaCorreta1CapFinal);

        // Mensagem de ganho ou perca do desafio
        if (vida > 0) {
            estiloEscrita("\nMimi responde corretamente, e a vizinha, incrédula, é derrotada. Mimi emerge vitoriosa, suas habilidades em Java provando serem mais poderosas do que qualquer mal que a vizinha tentou lançar sobre ela. Com um suspiro de alívio, Mimi segue em frente, pronta para enfrentar o que quer que a vida lhe reserve.\n\n FIM!");
        } else {
            estiloEscrita("\nVizinha: Você não foi páreo para o meu desafio final. Mimi, suas habilidades não foram suficientes. Seu destino é selado...\n");
        }

        return pontuacao;
    }



    // Funções - Jogo



    static int apresentarDesafio(String pergunta, String respostaCorreta) {
        ArrayList<Character> opcoesOriginais = new ArrayList<>();
        char[] opcoes = "abcd".toCharArray();

        for (char opcao : opcoes) {
            opcoesOriginais.add(opcao);
        }

        Collections.shuffle(opcoesOriginais);
        estiloEscrita("\n" + pergunta);

        for (int i = 0; i < opcoesOriginais.size(); i++) {
            char opcaoEmbaralhada = opcoesOriginais.get(i);
            System.out.println(opcaoEmbaralhada + ") " + "Opção " + opcaoEmbaralhada);
        }

        char respostaUsuario = entrada.next().charAt(0);
        char respostaCorretaEmbaralhada = opcoesOriginais.get("abcd".indexOf(respostaCorreta.charAt(0)));

        if (verificarResposta(respostaUsuario, String.valueOf(respostaCorretaEmbaralhada))) {
            estiloEscrita("\nResposta correta! Avance para o próximo desafio.\n");
            return 1;
        } else {
            estiloEscrita("\nResposta incorreta! Você perdeu uma vida.\n");
            vida = removeVida(vida);
            return 0;
        }
    }

    static void estiloEscrita(String texto) {
        char[] var1 = texto.toCharArray();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            char caractere = var1[var3];
            System.out.print(caractere);

            try {
                Thread.sleep(10L);
            } catch (InterruptedException var6) {
                var6.printStackTrace();
            }
        }

    }

    static int creditos() {
        limparTerminal();
        estiloEscrita("\nCreditos\nEste jogo foi criado por Vinicius Bessa e Alexandre Torres.\n\nDeseja retornar para o menu? \n1. Sim | 2. Não \n");
        return entrada.nextInt();
    }

    static int removeVida(int vidaAtual) {
        --vidaAtual;
        System.out.println("Sua quantidade de vida atual: " + vidaAtual);
        return vidaAtual;
    }

    static int qtdVida() {
        return 5;
    }

    static String pegaNome() {
        return System.getProperty("user.name");
    }

    public static void limparTerminal() {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
    }

    static boolean verificarResposta(char respostaUsuario, String respostaCorreta) {
        return Character.toLowerCase(respostaUsuario) == respostaCorreta.charAt(0);
    }

    static {
        entrada = new Scanner(System.in);
        nomeUsu = pegaNome();
        vida = qtdVida();
    }
}
