public class Minimos {
    public static void encontrarDosMinimos (int[] numeros){
        if (numeros.length < 2) {
            System.out.println("El array debe tener al menos dos elementos.");
            return;
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int numero : numeros) {
            if (numero < min1) {
                min2 = min1;
                min1 = numero;
            } else if (numero < min2 && numero != min1) {
                min2 = numero;
            }
        }
        if (min2 == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo valor mínimo distinto");
        } else {
            System.out.println("El menor es: " + min1);
            System.out.println("El segundo menor es: " + min2);
        }


    }



}
