public class Kalkulator {
     static void main(String[] args) {
        int a = 10;
        int b = 3;

        int hasilTambah = a + b;
        int hasilKurang = a - b ;
        int hasilKali = a * b ;
        double hasilBagi = a / (double )b ;
        int sisaBagi = a % b ;

        System.out.println("Tambah : " + hasilTambah);
        System.out.println("Kurang : " + hasilKurang);
        System.out.println("Kali : " + hasilKali);
        System.out.println("Bagi : " + hasilBagi);
        System.out.println("Sisa Bagi : " + sisaBagi);

        boolean lebihBesar = a > b ;
        System.out.println("Apakah a lebih besar dari b ? " + lebihBesar);

        int max = Integer.MAX_VALUE + 1;
         System.out.println(max);
     }
}
