import java.util.Scanner;

/**
 * exerciciofor04Scanner
 */
public class exerciciofor04Scanner {
    public static void main(String[] args) {
        
		int i, j, inicio;

				

		Scanner entranda = new Scanner(System.in);

		System.out.print("Digite o numero de inicio para começar a tabuada: ");

		

		inicio = entranda.nextInt(); // 

				

		for(j = inicio; j <= 9; j++)

		{

			System.out.println("TABUADA DO " + j);

			

			for (i = 1; i <= 10; i++)

				System.out.println(j + " X " + i + " = " + (j * i));

		}
}
}