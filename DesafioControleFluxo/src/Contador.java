import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Desafio Contorle de Fluxo");

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        System.out.println("O parâmetro Um é " + parametroUm + " e o parâmetro Dois é " + parametroDois);

        //contar(parametroUm, parametroDois);

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int contador = 0; contador < contagem; contador++) {
            System.out.println("Imprimindo o número " + (contador + 1));
        }
    }
}
