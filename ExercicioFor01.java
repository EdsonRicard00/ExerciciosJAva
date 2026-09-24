public class ExercicioFor01 {
    public static void main(String[] args) {
        System.out.println("Tabuada do numero 6: ");
        int numero = 6;
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}