
import java.util.Scanner;

public class TabuadaExercicio2 {

    public static void main(String[] args) {
        
        Scanner calcu = new Scanner(System.in);
        
        System.out.print("Introduza um numero: ");
        int n1 = calcu.nextInt(); 
        
        System.out.println("--- Tabuada do " + n1 + " ---");
        
        
        for (int i = 1; i <= 10; i++) {
            int resultado = n1 * i;
            System.out.println(n1 + " x " + i + " = " + resultado);
        }
        
        calcu.close();
    }
}