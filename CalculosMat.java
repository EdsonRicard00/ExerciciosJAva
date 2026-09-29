import java.util.Scanner;

public class CalculosMat {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Definindo Vetores
        int fibonacci[] = new int[10];
        int pa[] = new int[10];
        int pg[] = new int[10];

        // 1. Preencher vetor Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < 10; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // 2. Preencher o Vetor PA
        System.out.print("Digite o valor inicial da PA: ");
        int inicioPA = ler.nextInt();
        pa[0] = inicioPA;

        System.out.print("Digite o valor da razao da PA: ");
        int razaoPa = ler.nextInt();

        for (int i = 1; i < 10; i++) {
            pa[i] = pa[i - 1] + razaoPa;
        }

        // 3. Preenchendo o vetor PG
        System.out.print("Digite o valor inicial da PG: ");
        int inicioPG = ler.nextInt();
        pg[0] = inicioPG;

        System.out.print("Digite o valor da razao da PG: ");
        int razaoPG = ler.nextInt();

        for (int i = 1; i < 10; i++) {
            pg[i] = pg[i - 1] * razaoPG;
        }

        // 4. Imprimir os tres vetores
        System.out.println("\nVetor Fibonacci");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        System.out.println("\n\nVetor Progressão Aritmética");
        for (int i = 0; i < 10; i++) {
            System.out.print(pa[i] + " ");
        }

        System.out.println("\n\nVetor Progressão Geométrica");
        for (int i = 0; i < 10; i++) {
            System.out.print(pg[i] + " ");
        }

        // Fechamento do Scanner colocado no final
        ler.close();
    }
}
