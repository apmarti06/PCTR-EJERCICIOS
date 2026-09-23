public class SumaArray {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 4, 1};
        int suma = 0;

        for (int n : numeros) {
            suma += n;
        }

        System.out.println("Números: " + java.util.Arrays.toString(numeros));
        System.out.println("Suma total: " + suma);
        System.out.println("Media: " + (suma / (double) numeros.length));
    }
}