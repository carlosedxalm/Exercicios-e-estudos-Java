import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Configura o locale para garantir que o ponto seja usado como separador decimal
        Locale.setDefault(new Locale("en", "US"));
        /* 
        // Cria um Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis para armazenar as notas do aluno
        double nota1, nota2;

        // Solicita ao usuário que digite as duas notas do aluno
        System.err.println("Digite as duas notas do aluno: ");
        System.err.println("Nota 1: ");
        nota1 = sc.nextDouble();
        System.err.println("Nota 2: ");
        nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;
        System.err.println("Nota final: " + notaFunal);

        // Verifica se a nota final é menor que 60.0 para determinar se o aluno está aprovado ou reprovado
        if (notaFinal < 60.0) {
            System.err.println("Reprovado");
        } else {
            System.err.println("Aprovado");
            
        }
        sc.close();
        */
       /* 
        // Solicita ao usuário que digite um número inteiro, que pode ser positivo ou negativo
        System.err.println("Digite um numero inteiro, podendo ser positivo ou negativo: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero < 0) {
            System.err.println("NEGATIVO");
        } else {
            System.err.println("POSITIVO");
        }
        sc.close();
        */
        /* 
        // Solicita ao usuário que digite um número para verificar se é par ou ímpar
        System.err.println("Digite um numero para saber se é par ou impar: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        // Verifica se o número é par ou ímpar usando o operador módulo resto da divisão
        if (numero % 2 == 0) {
            System.err.println("PAR");
        } else {
            System.err.println("IMPAR");
        }
        sc.close();
        */

        System.err.println("Digite o salario: ");
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario <= 2000.0) {
            System.err.println("Isento");
        } else if (salario <= 3000.0) {
            double imposto = (salario - 2000.0) * 0.08;
            System.err.printf("R$ %.2f%n", imposto);
        } else if (salario <= 4500.0) {
            double imposto = (1000.0 * 0.08) + ((salario - 3000.0) * 0.18);
            System.err.printf("R$ %.2f%n", imposto);
        } else {
            double imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salario - 4500.0) * 0.28);
            System.err.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }
}
