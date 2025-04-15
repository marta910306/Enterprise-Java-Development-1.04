public class Main {
    public static void main(String[] args) {
        int[] numeros = {2, 8, 5, 1, 9};
        int resultado = Diferencia.diferenciaMaxMin(numeros);
        System.out.println("la diferencia es: " + resultado);

        Minimos.encontrarDosMinimos(numeros);


        double x = 3;
        double y = 5;

        double resultadoExpresion = calcularExpresion(x, y);
        System.out.println("El resultado de la expresión es: " + resultadoExpresion);
    }

    public static double calcularExpresion(double x, double y) {
        return Math.pow(x, 2) + Math.pow(((4.0 * y) / 5.0 - x), 2);
    }
}