# Conditional & Looping

## Learning Objectives
- Bisa menggunakan `if / else if / else` dan `switch` untuk percabangan logika
- Bisa menggunakan `for`, `while`, `do-while` untuk perulangan
- Paham kapan memilih jenis loop yang tepat

## Prerequisites
`01-programming-fundamentals/03-variable-tipe-data-operator/README.md`

## File Location
`01-programming-fundamentals/04-conditional-looping/FizzBuzz.java`

## Apa Itu?
**Conditional** adalah cara program mengambil keputusan berbeda berdasarkan kondisi (true/false). **Looping** adalah cara mengulang eksekusi sekumpulan kode tanpa menulis ulang manual.

## Mengapa Penting?
Hampir semua logic bisnis nyata bergantung pada percabangan ("kalau stok habis, tolak order") dan perulangan ("proses semua item di keranjang"). Tanpa dua ini, program hanya bisa jalan lurus satu arah, satu kali.

## Konsep Fundamental

### Conditional
```java
if (kondisi) {
    // dijalankan kalau kondisi true
} else if (kondisiLain) {
    // dijalankan kalau kondisi pertama false, ini true
} else {
    // dijalankan kalau semua di atas false
}
```

`switch` cocok dipakai kalau membandingkan **satu variable** dengan banyak nilai spesifik:
```java
switch (hari) {
    case 1 -> System.out.println("Senin");
    case 2 -> System.out.println("Selasa");
    default -> System.out.println("Hari tidak dikenal");
}
```
(Syntax `->` ini adalah **switch expression** modern sejak Java 14 — lebih ringkas dan aman dibanding `switch` lama yang pakai `case: ... break;`.)

### Looping
```java
// for: dipakai kalau tahu jumlah perulangan / butuh counter
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// while: dipakai kalau jumlah perulangan tidak pasti, tergantung kondisi
while (kondisi) {
    // ...
}

// do-while: sama seperti while, tapi badan loop dijalankan MINIMAL 1x
// walaupun kondisinya false dari awal
do {
    // ...
} while (kondisi);
```

## Analogi
`if/else` seperti persimpangan jalan dengan rambu — kamu belok kiri, kanan, atau lurus tergantung kondisi. `for` seperti "ulangi tugas ini tepat 10 kali". `while` seperti "terus lakukan tugas ini selama masih ada antrian", tanpa tahu pasti berapa kali.

## Syntax — Program Contoh: FizzBuzz
```java
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```

## Penjelasan Code
- `for (int i = 1; i <= 20; i++)` — tiga bagian: inisialisasi (`int i = 1`), kondisi berhenti (`i <= 20`), dan increment (`i++`, artinya `i = i + 1`).
- `i % 15 == 0` — dicek duluan karena kalau angka habis dibagi 15, otomatis habis dibagi 3 **dan** 5 juga. Urutan pengecekan ini penting — kalau `i % 3 == 0` dicek duluan, angka 15 akan salah dicetak "Fizz" bukan "FizzBuzz".

## Common Mistakes
- Infinite loop — lupa update variable kondisi di `while`, program tidak pernah berhenti.
- Off-by-one error — salah pakai `<` vs `<=` di kondisi `for`, hasil kurang/lebih satu iterasi.
- Urutan `else if` yang salah pada kasus tumpang tindih (seperti FizzBuzz di atas).
- Lupa `break` di `switch` gaya lama (`case: ...`) — tapi kalau pakai `->` (switch expression modern), masalah ini otomatis hilang.

## Best Practices
- Pakai `for` kalau jumlah iterasi diketahui/terbatas jelas.
- Pakai `while` kalau kondisi berhenti tidak pasti di awal.
- Hindari nested `if` terlalu dalam (lebih dari 2-3 level) — nanti ada teknik refactor untuk ini di materi lanjut.

## Anti-Patterns
- Menulis kondisi `if (x == true)` — cukup `if (x)`, karena `x` sudah boolean.

## Real World Usage
Validasi input order ("kalau quantity <= 0, tolak"), proses semua item di keranjang belanja (loop), routing berdasarkan status pembayaran (switch) — semua pakai pola ini.

## Exercise
Ketik ulang & jalankan `FizzBuzz.java`, pastikan output baris 15 muncul "FizzBuzz", bukan "Fizz" atau "Buzz".

## Challenge
Buat program baru `CekBilanganPrima.java`: cek apakah sebuah angka (hardcode, misal `int angka = 29;`) adalah bilangan prima, pakai `for` loop dan `boolean` flag. Cetak `"Prima"` atau `"Bukan Prima"`.

## Interview Questions
1. Kapan sebaiknya pakai `for` vs `while`?
2. Apa itu infinite loop dan bagaimana cara mencegahnya?
3. Kenapa di FizzBuzz, kondisi `i % 15 == 0` harus dicek paling pertama?

## Checklist
- [ ] Bisa jelaskan beda `for`, `while`, `do-while`
- [ ] Paham kenapa urutan kondisi `if/else if` berpengaruh ke hasil
- [ ] Berhasil menjalankan FizzBuzz dan hasilnya benar

## Next Topic
Day 5 — Method dan Array.
