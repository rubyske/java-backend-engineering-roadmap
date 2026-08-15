public class CekTahunKabisat {
    public static void main(String[] args) {
        int tahun = 1900;

        if (tahun % 400 == 0 || tahun % 4 == 0 && tahun % 100 != 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
