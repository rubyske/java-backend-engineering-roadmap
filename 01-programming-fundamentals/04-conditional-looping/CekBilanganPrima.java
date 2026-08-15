public class CekBilanganPrima {
    public static void main(String[] args) {
        int angka = 4;
        boolean isPrima = true;

        if (angka <= 1) {
            isPrima = false;
        } else {
            for (int i = 2 ; i < angka; i++) {
                if (angka % i == 0) {
                    isPrima = false;
                }
            }
        }

        if (isPrima) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan bilangan Prima");
        }
    }
}
