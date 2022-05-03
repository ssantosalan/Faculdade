package lista;

import java.util.Scanner;

public class UsaLista {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        int entrada;
        do {

            System.out.println("Escolha a entrada:");
            System.out.println("(1) push");
            System.out.println("(2) pop");
            System.out.println("(3) empty");
            System.out.println("(4) top");
            System.out.println("(5) size");
            System.out.println("(6) sair");
            entrada = sc.nextInt();
            switch (entrada) {

                case 1:
                    lista.push(entrada);
                    break;
                case 2:
                    lista.pop();
                    System.out.println("removendo...");
                    break;
                case 3:
                    System.out.println("oi");
                    break;
                case 4:
                    System.out.println("oi");
                    break;
                case 5:
                    System.out.println("oi");
                    break;
                case 6:
                    System.out.println("saindo...");
                    break;
                default:
                    break;

            }
            lista.exibir();
        } while (entrada != 6);
    }

}
