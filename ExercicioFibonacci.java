import java.util.Scanner;

public class ExercicioFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduza o número de elementos da sequência: ");
        int n = scanner.nextInt();
        
        long t1 = 1, t2 = 1;
        
        System.out.println("--- Sequência de Fibonacci ---");
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            long proximo = t1 + t2;
            t1 = t2;
            t2 = proximo;
        }
        
        scanner.close();
    }
}