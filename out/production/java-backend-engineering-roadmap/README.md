# Program Pertama — Hello World

## Learning Objectives
Bisa menulis, compile, dan menjalankan program Java sederhana; paham struktur minimal `main()`.

## Prerequisites
`01-programming-fundamentals/01-apa-itu-programming/README.md`

## File Location
`01-programming-fundamentals/02-program-pertama/HelloWorld.java`

## Apa Itu?
Program Java paling sederhana yang bisa di-compile dan dijalankan JVM: satu class dengan satu method `main`.

## Mengapa Penting?
Ini titik masuk (entry point) setiap aplikasi Java — dari program 3 baris ini sampai aplikasi Spring Boot production, semuanya tetap butuh method `main()` sebagai starting point.

## Syntax
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Badru!"); // print ke terminal
    }
}
```

## Penjelasan Code
- `public class HelloWorld` — deklarasi class bernama `HelloWorld`. **Nama file wajib sama persis dengan nama class public** (`HelloWorld.java`).
- `public static void main(String[] args)` — ini **entry point**: method yang pertama kali dijalankan JVM saat program di-run.
    - `public` — bisa diakses dari luar class (JVM perlu akses ini dari luar).
    - `static` — method bisa dipanggil tanpa membuat object dari class ini dulu (detail lengkap dibahas di materi OOP nanti).
    - `void` — method ini tidak mengembalikan nilai apa pun.
    - `String[] args` — parameter untuk menerima argumen dari command line saat program dijalankan (belum dipakai di contoh ini).
- `System.out.println(...)` — perintah untuk mencetak teks ke terminal, dengan baris baru di akhir.
- `//` — komentar satu baris, diabaikan compiler, hanya catatan untuk manusia.

## Common Mistakes
- Nama file tidak sama dengan nama class → error: `class HelloWorld is public, should be declared in a file named HelloWorld.java`.
- Lupa titik koma `;` di akhir statement.
- Salah kapitalisasi `Main` vs `main` — Java case-sensitive, harus persis `main`.
- Menjalankan `java HelloWorld.class` (salah) alih-alih `java HelloWorld` (benar, tanpa ekstensi).

## Best Practices
- Nama class pakai `PascalCase` (huruf awal tiap kata kapital).
- Satu file `.java` = satu public class.
- Compile dan jalankan minimal sekali lewat terminal manual (bukan cuma klik tombol Run IDE) supaya paham proses di baliknya.

## Anti-Patterns
- Menulis banyak logic langsung di `main()` tanpa method terpisah — untuk program sekecil ini tidak masalah, tapi jangan jadi kebiasaan (akan dibahas di materi method, Day 5).

## Real World Usage
Setiap aplikasi Java yang dijalankan sebagai standalone program — termasuk aplikasi Spring Boot — punya satu method `main()` sebagai titik awal eksekusi.

## Exercise
Compile & jalankan dari terminal (bukan tombol Run IntelliJ) — ini penting supaya kamu paham proses di baliknya:
```bash
cd 01-programming-fundamentals/02-program-pertama
javac HelloWorld.java   # compile -> menghasilkan HelloWorld.class
java HelloWorld         # jalankan (tanpa .class)
```

## Challenge
Modifikasi program supaya mencetak 3 baris: nama kamu, umur kamu, dan satu kalimat motivasi — pakai 3 `System.out.println()` terpisah. Coba dulu sendiri sebelum minta solusi.

## Interview Questions
1. Kenapa perintahnya `java HelloWorld` bukan `java HelloWorld.class`?
2. Apa yang terjadi kalau nama file dan nama class berbeda?
3. Apa fungsi kata kunci `static` pada method `main`?

## Checklist
- [ ] Berhasil compile & run dari terminal
- [ ] Paham fungsi `main()` sebagai entry point
- [ ] Paham arti tiap kata kunci di signature `main()`

## Next Topic
Day 3 — Variable, tipe data primitif, operator.
