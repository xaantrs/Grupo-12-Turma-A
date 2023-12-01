package RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class rpg {
    static Scanner entrada;
    static String nomeUsu;
    static int vida;

    public rpg() {
    }

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
        estiloEscrita("\nInstruções: \n1 - Fique vivo \n2 - Não olhe para trás, " + nomeUsu + ".\n\nDeseja retornar para o menu? \n1. Sim | 2. Não \n");
        return entrada.nextInt();
    }

    static int jogar() {
        int pontuacao = 0;
        estiloEscrita("\n Capítulo 1: A Origem \n");
        estiloEscrita("\nMimi, atormentada por visões assustadoras, encontra um zumbi à sua frente. Uma voz ecoa, desafiando-a:\n\nVoz Misteriosa: Para vencer este zumbi, responda:\n");
        String pergunta1Cap1 = "Como você declara uma variável inteira em Java?\na) int x;\nb) float x;\nc) String x;\nd) bool x;\n";
        String respostaCorreta1Cap1 = "a";
        pontuacao += apresentarDesafio(pergunta1Cap1, respostaCorreta1Cap1);
        String pergunta2Cap1 = "O que representa o operador lógico '&&' em Java?\na) OU\nb) E\nc) OU Exclusivo\nd) Negação\n";
        String respostaCorreta2Cap1 = "b";
        pontuacao += apresentarDesafio(pergunta2Cap1, respostaCorreta2Cap1);
        if (vida > 0) {
            estiloEscrita("\n Mimi: Ufa! Conseguimos passar pelo zumbi. Mas o desafio está apenas começando.\n");
            pontuacao += capitulo2();
        } else {
            estiloEscrita("\n Mimi: Infelizmente, não consegui superar o zumbi. O pesadelo continua...\n");
        }

        return pontuacao;
    }

    static int capitulo2() {
        int pontuacao = 0;
        estiloEscrita("\n Capítulo 2: Labirinto da Mente \n");
        estiloEscrita("\n Mimi, agora no labirinto da mente, encontra o dispositivo. Uma voz amigável surge:\n\nDispositivo: Olá, Mimi. Sou seu guia neste lugar surreal. Vamos superar isso juntos. Responda-me:\n");
        String pergunta1Cap2 = "O que é um array em Java?\na) Uma lista ordenada de elementos.\nb) Um tipo de variável lógica.\nc) Um operador de comparação.\nd) Uma estrutura de controle.\n";
        String respostaCorreta1Cap2 = "a";
        pontuacao += apresentarDesafio(pergunta1Cap2, respostaCorreta1Cap2);
        String pergunta2Cap2 = "Como você encerra um loop \"for\" em Java antes de sua conclusão normal?\na) continue;\nb) break;\nc) end;\nd) stop;\n";
        String respostaCorreta2Cap2 = "b";
        pontuacao += apresentarDesafio(pergunta2Cap2, respostaCorreta2Cap2);
        if (vida > 0) {
            estiloEscrita("\n Dispositivo: Muito bem, Mimi! Essas respostas abriram caminho para nossa jornada.\n");
            estiloEscrita("\n * Com a orientação do dispositivo, Mimi supera os enigmas do labirinto. * \n");
            pontuacao += capitulo3();
        } else {
            estiloEscrita("\n Dispositivo: Parece que o labirinto da mente foi demais para Mimi. A jornada termina aqui.\n");
        }

        return pontuacao;
    }

    static int capitulo3() {
        int pontuacao = 0;
        estiloEscrita("\n Capítulo 3: Redes de Pesadelo \n");
        estiloEscrita("\n Mimi, agora diante do braço direito da vizinha, é envolvida por pesadelos. O braço direito zomba dela.\n\nBraço Direito: Seus sonhos estão prestes a se tornar um pesadelo sem fim. Responda-me:\n");
        String pergunta1Cap3 = "O que é um construtor em Java?\na) Um método que destrói objetos.\nb) Um método que inicializa objetos.\nc) Um método que encapsula objetos.\nd) Um método que copia objetos.\n";
        String respostaCorreta1Cap3 = "b";
        pontuacao += apresentarDesafio(pergunta1Cap3, respostaCorreta1Cap3);
        String pergunta2Cap3 = "\n Como você instancia um objeto em Java?\na) new Object();\nb) create Object();\nc) Object.instance();\nd) Object.create();\n";
        String respostaCorreta2Cap3 = "a";
        pontuacao += apresentarDesafio(pergunta2Cap3, respostaCorreta2Cap3);
        if (vida > 0) {
            estiloEscrita("\n Braço Direito: Você não escapará dessa realidade distorcida tão facilmente!\n");
            estiloEscrita("\n Mesmo diante das adversidades, Mimi responde corretamente, desfazendo os pesadelos. \n");
            pontuacao += capituloFinal();
        } else {
            estiloEscrita("\n Braço Direito: Seu pesadelo está apenas começando, Mimi. Prepare-se para o pior.\n");
        }

        return pontuacao;
    }

    static int capituloFinal() {
        int pontuacao = 0;
        estiloEscrita("\n Capítulo Final: O Fim \n");
        estiloEscrita("\n Diante da vizinha, Mimi encara a última pergunta com confiança:\n\nVizinha: Parece que alguém estudou um pouco. Mas será que é suficiente para me derrotar? Responda-me então:\n");
        estiloEscrita(" \n Mimi: Estudar foi apenas o começo. Agora é hora de colocar esse conhecimento em prática.\n ");
        String pergunta1CapFinal = "O que é polimorfismo em Java?\na) Um tipo de variável.\nb) Uma estrutura de controle.\nc) Uma característica de herança.\nd) Uma capacidade de objetos se comportarem de maneiras diferentes.\n";
        String respostaCorreta1CapFinal = "d";
        pontuacao += apresentarDesafio(pergunta1CapFinal, respostaCorreta1CapFinal);
        if (vida > 0) {
            estiloEscrita("\n Mimi responde corretamente, e a vizinha, incrédula, é derrotada. Mimi emerge vitoriosa, suas habilidades em Java provando serem mais poderosas do que qualquer mal que a vizinha tentou lançar sobre ela. Com um suspiro de alívio, Mimi segue em frente, pronta para enfrentar o que quer que a vida lhe reserve.\n\n");
        } else {
            estiloEscrita("\n Vizinha: Você não foi páreo para o meu desafio final. Mimi, suas habilidades não foram suficientes. Seu destino é selado...\n");
        }

        return pontuacao;
    }

    static int apresentarDesafio(String pergunta, String respostaCorreta) {
        ArrayList<Character> opcoesEmbaralhadas = new ArrayList();
        char[] var3 = "abcd".toCharArray();
        int var4 = var3.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            char opcao = var3[var5];
            opcoesEmbaralhadas.add(opcao);
        }

        Collections.shuffle(opcoesEmbaralhadas);
        estiloEscrita("\n" + pergunta);
        Iterator var7 = opcoesEmbaralhadas.iterator();

        char respostaCorretaEmbaralhada;
        while (var7.hasNext()) {
            respostaCorretaEmbaralhada = (Character) var7.next();
            System.out.println("" + respostaCorretaEmbaralhada + ") Opção " + respostaCorretaEmbaralhada);
        }

        char respostaUsuario = entrada.next().charAt(0);
        respostaCorretaEmbaralhada = (Character) opcoesEmbaralhadas.get("abcd".indexOf(respostaCorreta.charAt(0)));
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
