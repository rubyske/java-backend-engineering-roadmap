# Variable, Tipe Data Primitif, Operator

## Learning Objectives
- Bisa mendeklarasikan variable dengan tipe data yang tepat
- Hafal 8 tipe data primitif Java beserta ukuran dan kegunaannya
- Bisa menggunakan operator aritmatika, perbandingan, dan logika

## Prerequisites
`01-programming-fundamentals/02-program-pertama/README.md`

## File Location
`01-programming-fundamentals/03-variable-tipe-data-operator/Kalkulator.java`

## Apa Itu?
**Variable** adalah "wadah" bernama untuk menyimpan data di memory, yang nilainya bisa berubah selama program berjalan. Setiap variable di Java punya **tipe data** yang menentukan jenis nilai apa yang boleh disimpan dan berapa besar memory yang dipakai.

## Mengapa Penting?
Semua logic program — dari kalkulator sederhana sampai sistem order e-commerce — pada akhirnya adalah manipulasi data yang disimpan di variable. Salah pilih tipe data bisa menyebabkan bug (misalnya kehilangan presisi angka desimal) atau pemborosan memory.

## Konsep Fundamental

### 8 Tipe Data Primitif
| Tipe | Ukuran | Contoh Nilai | Kegunaan |
|---|---|---|---|
| `byte` | 8 bit | -128 s/d 127 | Angka sangat kecil, hemat memory |
| `short` | 16 bit | -32,768 s/d 32,767 | Jarang dipakai, angka kecil |
| `int` | 32 bit | ±2 miliar | **Paling umum** untuk bilangan bulat |
| `long` | 64 bit | sangat besar | Angka besar (contoh: ID database, timestamp). Ditulis dengan suffix `L` |
| `float` | 32 bit | desimal, presisi rendah | Jarang dipakai, ditulis dengan suffix `f` |
| `double` | 64 bit | desimal, presisi tinggi | **Paling umum** untuk bilangan desimal |
| `boolean` | 1 bit (logis) | `true` / `false` | Kondisi benar/salah |
| `char` | 16 bit | satu karakter, contoh `'A'` | Satu huruf/simbol |

Catatan: `String` **bukan** tipe primitif — dia adalah class (object), akan dibahas terpisah. Tapi karena sangat sering dipakai, kamu boleh menggunakannya mulai sekarang.

### Operator
- **Aritmatika**: `+` `-` `*` `/` `%` (modulo/sisa bagi)
- **Perbandingan**: `==` `!=` `>` `<` `>=` `<=` → hasilnya selalu `boolean`
- **Logika**: `&&` (AND), `||` (OR), `!` (NOT)
- **Assignment**: `=`, dan bentuk singkat `+=` `-=` `*=` `/=`

## Analogi
Variable itu seperti kotak berlabel di gudang. Tipe data adalah **ukuran dan jenis kotak** — kotak kecil (`byte`) tidak bisa dipakai menyimpan barang besar (`long`), dan kotak khusus cairan (`double`) beda perlakuan dari kotak khusus barang bulat (`int`).

## Syntax
```java
public class Kalkulator {
    public static void main(String[] args) {
        int a = 10;v
        int b = 3;

        int hasilTambah = a + b;
        int hasilKurang = a - b;
        int hasilKali = a * b;
        double hasilBagi = a / (double) b; // cast ke double supaya tidak dibulatkan
        int sisaBagi = a % b;

        System.out.println("Tambah: " + hasilTambah);
        System.out.println("Kurang: " + hasilKurang);
        System.out.println("Kali: " + hasilKali);
        System.out.println("Bagi: " + hasilBagi);
        System.out.println("Sisa Bagi: " + sisaBagi);

        boolean lebihBesar = a > b;
        System.out.println("Apakah a lebih besar dari b? " + lebihBesar);
    }
}
```

## Penjelasan Code
- `int a = 10;` — deklarasi variable `a` bertipe `int`, diisi nilai 10.
- `a / (double) b` — pembagian dua `int` di Java hasilnya **dibulatkan ke bawah** (integer division) kalau tidak di-cast. `(double) b` memaksa `b` jadi desimal dulu supaya hasil pembagian punya desimal (`10 / 3.0 = 3.333...`, bukan `10 / 3 = 3`).
- `a % b` — modulo, sisa hasil bagi (`10 % 3 = 1`).
- `"Tambah: " + hasilTambah` — operator `+` di sini melakukan **string concatenation** (menggabung teks), bukan penjumlahan, karena salah satu operand adalah `String`.

## Common Mistakes
- Membagi dua `int` dan berharap hasil desimal tanpa cast — hasilnya akan salah (dibulatkan ke bawah).
- Overflow: `int` cuma sampai ±2 miliar, kalau angka lebih besar harus pakai `long`.
- Lupa suffix `L` untuk literal `long` besar (`long x = 10000000000;` akan error, harus `10000000000L`).
- Membandingkan `String` pakai `==` (nanti dibahas detail saat materi String/OOP — untuk sekarang cukup tahu: hindari, akan salah hasil).

## Best Practices
- Default pakai `int` untuk bilangan bulat dan `double` untuk desimal, kecuali ada alasan spesifik pakai tipe lain.
- Beri nama variable yang jelas maknanya (`totalHarga` bukan `x`).

## Anti-Patterns
- Menyimpan semua angka sebagai `String` lalu di-convert bolak-balik — tidak efisien dan rawan bug.

## Real World Usage
Di aplikasi order nanti, harga produk akan pakai `double` (atau lebih tepatnya `BigDecimal` untuk uang — akan dibahas saat materi lanjut), quantity pakai `int`, status pembayaran pakai `boolean`.

## Exercise
Ketik ulang kode di atas, jalankan, pastikan outputnya sesuai ekspektasi kamu untuk setiap baris.

## Challenge
Buat program baru `KonversiSuhu.java`: input suhu dalam Celsius (hardcode nilainya di variable, misal `double celsius = 30;`), lalu hitung dan cetak hasil konversi ke Fahrenheit dengan rumus `F = C * 9/5 + 32`. Perhatikan potensi masalah pembagian integer di rumus ini.

## Interview Questions
1. Apa beda `int` dan `long`? Kapan harus pakai `long`?
2. Kenapa `10 / 3` di Java hasilnya `3`, bukan `3.33`?
3. Apa hasil `int` yang di-overflow (misal `int x = Integer.MAX_VALUE + 1;`)?

## Checklist
- [ ] Hafal 8 tipe data primitif dan kegunaan umumnya
- [ ] Paham kenapa pembagian int perlu di-cast untuk hasil desimal
- [ ] Bisa membedakan operator aritmatika, perbandingan, dan logika

## Next Topic
Day 4 — Conditional (`if/else`, `switch`) dan Looping (`for`, `while`).
