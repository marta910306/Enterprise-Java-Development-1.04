public class Diferencia {
    public static int diferenciaMaxMin (int[] numeros){
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        return mayor - menor;
    }






}