# Apps Perpustaskaan Berbasis Desktop Menggunakan Java Swing dan Database MySQL

Aplikasi Perpustakaan ini adalah sistem manajemen perpustakaan berbasis desktop yang dibangun menggunakan Java Swing untuk antarmuka pengguna dan MySQL sebagai database untuk penyimpanan data. Aplikasi ini dirancang untuk memudahkan pengelolaan buku, anggota perpustakaan, dan peminjaman buku. Namun file yang di share ini hanya dalam bentuk demo, jadi jika anda menginginkan file ini bisa menjadi member di channel [YouTube Belajar Ngoding](https://www.youtube.com/@belajarngoding_id)

#### Teknologi :
- [MySQL](https://downloads.mysql.com/archives/get/p/25/file/mysql-installer-community-8.0.28.0.msi) : 8.0.28
- [JDK](https://www.oracle.com/id/java/technologies/javase/jdk11-archive-downloads.html) : 11
Untuk menjalankan demo ini, Anda hanya memerlukan JDK 11, karena database diunggah secara online. Namun, harap diperhatikan bahwa koneksi database mungkin mengalami keterlambatan.

#### Library atau Dependensi :
- **Flatlaf** : Untuk mempercantik tampilan aplikasi.
- **Date Chooser Raven** : Untuk date chooser dalam pemilihan tanggal.
- **MySQL Driver** : Untuk menghubungkan aplikasi java swing dengan database MySQL.
- **Jasper Report** : Untuk mencetak report.

#### Fitur Utama :
- **Manajemen Buku:** Menambah, mengedit, dan menghapus informasi buku di perpustakaan.
- **Manajemen Anggota:** Menambah, mengedit, dan menghapus data anggota perpustakaan.
- **Peminjaman Buku:** Proses peminjaman buku oleh anggota dan pengembalian buku.
- **Laporan:** Melihat laporan peminjaman buku, laporan data anggota dan laporan data buku.

#### Arsitektur Proyek (Package) :
- **Config** : Menghubungkan aplikasi dengan database.
- **Service** : Mengandung logika bisnis untuk operasi CRUD.
- **DAO** : Implementasi logika bisnis yang spesifik untuk database, termasuk implementasi antarmuka service.
- **Icon** : Menyimpan ikon aplikasi.
- **JDialog** : Mengelola tampilan form input.
- **Form** : Mengelola tampilan data di tabel.
- **Main** : Mengelola tampilan menu utama.
- **Model** : Mewakili entitas tabel database.
- **Menu** : Mengelola daftar menu aplikasi.
- **Report** : Mengelola file laporan aplikasi.
- **Theme** : Mengelola design warna dan layout aplikasi.

#### Instalasi dan Konfigurasi

**1. Clone Repository** :
```sh
git clone git@github.com:idteguhjulianto/AppPerpus-Desktop.git
```

**2. Masuk ke Direktori Proyek** :

```sh
cd AppPerpus-Desktop
```

**3. Jalankan Aplikasi** :
```sh
java -jar AppPerpus.jar
```
Atau Anda bisa langsung mengklik file JAR untuk menjalankan demo aplikasi perpustakaan ini.

Terima kasih

