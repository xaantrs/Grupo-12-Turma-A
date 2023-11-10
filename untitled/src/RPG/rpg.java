package RPG;
import java.util.Scanner;

public class rpg {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int contador = 0;

        do{
            estiloEscrita("\n↞Contos de Horror da Mimi↠\n");

            String nomeUsu = pegaNome();
            estiloEscrita("\nBem vindo, " + nomeUsu +  ".\nEscolha o que deseja fazer:\n" + "\n1. Instruções \n2. Jogar \n3. Créditos \n4. Sair\n");

            int acaoInicio = entrada.nextInt();

            if (acaoInicio == 1) {
                contador = instrucoes();

            } else if (acaoInicio == 2){
                System.out.println("Jogar");

            } else if (acaoInicio == 3){
                contador = creditos();

            } else if (acaoInicio == 4){
                System.out.println("Sair");

            } else {
                System.out.println("Opção inválida.");
            }

        } while( contador == 1);

        entrada.close();
    }

    static int instrucoes(){
        String usuario = pegaNome();
        estiloEscrita("\nInstruções: \n1 - Fique vivo \n2 - Não olhe para trás, " + usuario + ".\n\nDeseja retornar para o menu? \n1. Sim | 2. Não \n");

        int voltaMenu = entrada.nextInt();
        return voltaMenu;
    }

    static void jogar(){

    }
    static int creditos(){
        estiloEscrita("Creditos\n");

        int voltaMenu = entrada.nextInt();
        return voltaMenu;
    }
    static void sair(){

    }

    static void estiloEscrita(String texto) {
        for (char caractere : texto.toCharArray()) {
            System.out.print(caractere);
            try {
                Thread.sleep(1);
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
