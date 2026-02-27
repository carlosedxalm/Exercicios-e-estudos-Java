import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio de estrutura de repetição - while, URI 1134.
        /* Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        int tipo = sc.nextInt();

        while (tipo !=4) {
            if (tipo == 1) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
        */

    // Exercicio de estrutura de repetição - for, URI 1143.
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for (int i=1; i<=N; i++) {
        int primeiro = i;
        int segundo = i * i;
        int terceiro = i * i * i;
        System.out.println(primeiro + " " + segundo + " " + terceiro);
    }
    sc.close();
    
}
}

