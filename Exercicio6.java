import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduza o número inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Introduza a razão: ");
        int razao = scanner.nextInt();
        System.out.print("Introduza o valor de finalização (limite): ");
        int fim = scanner.nextInt();

        System.out.println("Progressão Geométrica:");
        int termo = inicio;
        while (termo <= fim) {
            System.out.print(termo + " ");
            termo *= razao;
        }
        
        scanner.close();
    }
}