# Apa Itu Programming, Compiler, JDK/JVM/JRE

## Learning Objectives
- Bisa jelaskan apa itu programming dengan kata sendiri
- Paham beda compiler vs interpreter
- Paham perbedaan JDK, JVM, JRE dan hubungan ketiganya

## Prerequisites
Tidak ada — ini fondasi paling dasar.

## File Location
`01-programming-fundamentals/01-apa-itu-programming/README.md`

## Apa Itu?
**Programming** adalah proses menulis instruksi (kode) yang komputer bisa jalankan untuk menyelesaikan suatu tugas. Komputer cuma paham angka biner (0 dan 1) — bahasa pemrograman seperti Java adalah "jembatan" supaya manusia bisa menulis instruksi dengan cara yang lebih mudah dibaca, lalu diterjemahkan ke bahasa mesin.

**Compiler** adalah program yang menerjemahkan seluruh source code kamu jadi bentuk lain (biasanya bahasa mesin atau bytecode) *sebelum* program dijalankan. **Interpreter** menerjemahkan kode baris per baris *saat* program dijalankan, tanpa hasil terjemahan disimpan permanen.

Java itu **hybrid**: source code (`.java`) di-**compile** oleh `javac` jadi **bytecode** (`.class`) — format perantara yang tidak spesifik ke satu sistem operasi. Bytecode ini baru dijalankan oleh **JVM**, yang meng-interpret (atau meng-compile ulang saat runtime lewat JIT — Just-In-Time compiler) jadi instruksi mesin sesungguhnya.

- **JDK** (Java Development Kit) — paket lengkap untuk *develop* Java: berisi compiler (`javac`), tools, dan JRE di dalamnya. Ini yang kamu install.
- **JRE** (Java Runtime Environment) — paket untuk *menjalankan* program Java yang sudah jadi (berisi JVM + library standar). Tidak ada compiler.
- **JVM** (Java Virtual Machine) — mesin virtual yang benar-benar mengeksekusi bytecode. Ini yang membuat Java "write once, run anywhere" — bytecode yang sama bisa jalan di Windows/Linux/Mac selama ada JVM-nya.

## Konsep Fundamental
```
HelloWorld.java  --[javac, si compiler]-->  HelloWorld.class (bytecode)  --[JVM]--> program jalan
```

## Analogi
Bayangkan kamu menulis resep masakan dalam Bahasa Indonesia (source code). Compiler seperti penerjemah yang mengubah resep itu jadi "bahasa dapur universal" (bytecode) — resep universal ini bisa dibaca koki di dapur mana pun (JVM di OS mana pun), walau bahasa aslinya beda-beda. JDK adalah seluruh perlengkapan dapur + penerjemah untuk *membuat* resep baru. JRE cuma dapur untuk *memasak* resep yang sudah jadi, tanpa alat untuk menulis resep baru.

## Common Mistakes
- Install JRE saja padahal butuh develop → tidak ada `javac`, tidak bisa compile.
- Mengira JVM = JDK. JVM cuma satu komponen di dalam JDK/JRE.

## Best Practices
- Selalu install JDK (bukan JRE saja) untuk keperluan development.
- Paham bahwa bytecode itulah yang membuat Java portable, bukan source code-nya langsung.

## Anti-Patterns
- Menghafal definisi tanpa paham alurnya — saat ditanya "kenapa Java portable", jawaban harus mengarah ke bytecode + JVM, bukan sekadar "karena Java emang gitu".

## Real World Usage
Saat kamu nanti deploy aplikasi Spring Boot ke server, server itu cukup punya JRE/JVM (tidak perlu JDK penuh) kalau hanya untuk *menjalankan* aplikasi yang sudah di-build — beda dengan mesin development yang butuh JDK lengkap.

## Exercise
Tulis ulang dengan kata-katamu sendiri (1-2 kalimat per poin):
1. Apa itu compiler?
2. Apa itu bytecode?
3. Apa beda JDK, JRE, JVM?

## Challenge
Jelaskan ke orang awam (tanpa istilah teknis sama sekali) kenapa program Java yang ditulis di Windows bisa jalan di Linux tanpa ditulis ulang.

## Interview Questions
1. Apa perbedaan JDK, JRE, dan JVM?
2. Kenapa Java disebut "write once, run anywhere"?
3. Apa fungsi bytecode dalam proses eksekusi program Java?

## Checklist
- [ ] Bisa jelaskan alur `.java` → `.class` → dijalankan JVM
- [ ] Bisa jelaskan beda JDK/JRE/JVM tanpa buka catatan
- [ ] Bisa jelaskan konsep "write once, run anywhere" ke orang awam

## Next Topic
`01-programming-fundamentals/02-program-pertama/README.md`
