import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        double nota1, nota2;

        System.err.println("Digite as duas notas do aluno: ");
        System.err.println("Nota 1: ");
        nota1 = sc.nextDouble();
        System.err.println("Nota 2: ");
        nota2 = sc.nextDouble();
        double notaFunal = nota1 + nota2;
        System.err.println("Nota final: " + notaFunal);

        if (notaFunal < 60.0) {
            System.err.println("Reprovado");
        } else {
            System.err.println("Aprovado");
        }
        sc.close();
    }
}
