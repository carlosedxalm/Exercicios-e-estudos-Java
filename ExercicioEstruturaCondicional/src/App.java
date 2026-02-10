import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Configura o locale para garantir que o ponto seja usado como separador decimal
        Locale.setDefault(new Locale("en", "US"));
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
    }
}
