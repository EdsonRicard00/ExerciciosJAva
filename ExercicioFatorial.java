import java.util.Scanner;

public class ExercicioFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduza um número para o fatorial: ");
        int n = scanner.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fatorial);
        scanner.close();
    }
}