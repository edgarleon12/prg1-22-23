public class reto4 {
    public static void main(String[] args) {
        int dimension;
        dimension = 21;
        for (int j = 1; j <= dimension; j = j + 1) {
         System.out.println();
         for (int i = 1; i <= dimension; i = i + 1) {

            if (
            // El código desde aqui
            i>= 8 && i<= 14
            // El código hasta aquí
            ) {
            System.out.print("(*)");
            } else {
            System.out.print(" . ");
                }
            }
        System.out.println();
        }
    }
}