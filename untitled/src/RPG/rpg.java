package RPG;
import java.util.Scanner;

public class rpg {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Nome do jogo
        estiloEscrita("\n↞Contos de Horror da Mimi↠\n");

        //Mensagem de Bem vindo com nome de usuário da máquina
        String nomeUsu = pegaNome();
        estiloEscrita("\nBem vindo, " + nomeUsu +  ".\nEscolha o que deseja fazer:\n" + "\n1. Instruções \n2. Jogar \n3. Créditos \n4. Sair\n");

        int acaoInicio = entrada.nextInt();

        //criar uma função pra cada escolha pra facilitar a leitura do código
        if (acaoInicio == 1) {
            //instrucoes - fazer instruções no final já que não sabemos como o código e as questões funcionarão ainda
            //lembrar de colocar aviso para deixar o jogo em tela cheia pra melhorar a experiencia.
            instrucoes();

        } else if (acaoInicio == 2){
            //jogar
            System.out.println("Jogar");

        } else if (acaoInicio == 3){
            //créditos
            System.out.println("Creditos");

        } else if (acaoInicio == 4){
            //sair
            System.out.println("Sair");

        } else {
            System.out.println("Opção inválida.");
        }

        entrada.close();

    }

    //funções de funcionamento do jogo
    //Nas opções instrucoes e creditos, colocar opção de voltar para o menu
    static void instrucoes(){
        String usuario = pegaNome();
        estiloEscrita("\nInstruções: \n1 - Fique vivo \n2 - Não olhe para trás, " + usuario + ".\n\nDeseja retornar para o menu? \n1. Sim | 2. Não \n");
        int saidaIntrucoes = 1;

        if(saidaIntrucoes == 1){
            System.out.println("ainda nao fiz ele voltar :)");
        }else{

        }
    }

    static void jogar(){

    }
    static void creditos(){

    }
    static void sair(){

    }


    static void estiloEscrita(String texto) {
        for (char caractere : texto.toCharArray()) {
            System.out.print(caractere);
            try {
                Thread.sleep(100);
            }catch(InterruptedException e) {
                e.printStackTrace();

            }
        }
        return;
    }

    //retornar variavel com o valor do nome do usuário para evitar repetição de código
    static String pegaNome(){
        return System.getProperty("user.name");
    }

}
