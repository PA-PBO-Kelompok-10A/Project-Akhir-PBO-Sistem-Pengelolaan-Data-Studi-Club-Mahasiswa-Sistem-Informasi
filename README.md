# APLIKASI SISTEM PENGELOLAAN DATA STUDI CLUB MAHASISWA SISTEM INFORMASI

KELOMPOK 10A

  1.Muhamad Nur Fadilah (2309116001)

  2.Fitri Yanti (2309116016)
  
  3.Adinda Salsabila Naura (2309116023)
  
  4.Rofi Hanif Fauzan (2309116026


## Deskripsi Project

Di era digital saat ini, pemanfaatan teknologi informasi sangat penting, termasuk dalam lingkungan pendidikan tinggi pada jurusan Sistem Informasi. Pengelolaan data mahasiswa yang efisien menjadi kebutuhan utama, terutama terkait kegiatan study club, baik akademik maupun non-akademik, yang membantu mahasiswa mengembangkan kemampuan dan bersosialisasi.

### Fitur Utama

CRUD Admin Study Club: Mengizinkan admin untuk menambah, mengubah, dan menghapus informasi study club yang tersedia. 

Daftar Study Club: Memudahkan pengguna untuk melihat secara detail data dari study club. 

Jadwal Study Club: Memudahkan pengguna untuk melihat jadwal study club. 

### Kebutuhan Sistem

Java (JDK 22): Bahasa pemrograman yang populer, multiplatform, dan berorientasi objek 

Apache Neatbeans IDE 22/23: Apache NetBeans adalah alat pengembangan komprehensif dengan dukungan untuk beberapa bahasa 

XAMPP: Sebuah software web server yang digunakan untuk mengembangkan dan merancang situs website pada server lokal 

phpMyAdmin: Perangkat lunak open source yang berfungsi untuk mengelola database MySQL dan MariaDB melalui web 

Canva: Platform desain grafis online yang memungkinkan pengguna untuk membuat berbagai jenis materi desain 

OracleDataModeler: Alat grafis gratis yang digunakan untuk membuat, menelusuri, dan mengedit model data 

Draw.io: Perangkat lunak diagram gratis dan sumber terbuka yang dapat digunakan untuk membuat diagram, grafik, dan infografis 

Bizagi Modeler: Perangkat lunak yang digunakan untuk membuat diagram, model, dokumen, dan simulasi proses bisnis secara visual 


src: Direktori yang berisi source code Java, termasuk paket Controller, Database, Model, dan View. 

dist: Berisi file JAR yang dapat dijalankan dan library pihak ketiga yang diperlukan untuk menjalankan aplikasi. 

nbproject: Berisi file konfigurasi yang spesifik untuk proyek NetBeans. 


### Cara Menjalankan

Untuk menjalankan aplikasi ini, Anda dapat menggunakan file JAR yang disediakan di dalam direktori dist. Pastikan bahwa semua library yang terdapat di dist/lib sudah termasuk dalam classpath aplikasi.

### Struktur Project 
<img width="275" alt="Tangkapan Layar 2024-11-21 pukul 21 00 54" src="https://github.com/user-attachments/assets/9f8816c5-6daf-45b3-9f1d-9a5af70ae763">

<img width="285" alt="Tangkapan Layar 2024-11-21 pukul 21 00 33" src="https://github.com/user-attachments/assets/aa56b5a8-eec4-4bd4-9ed6-adc28b67785c">

<img width="245" alt="Tangkapan Layar 2024-11-21 pukul 21 00 10" src="https://github.com/user-attachments/assets/789647fb-effb-4873-96cc-606b77385edd">


## 1. FLOWCHART

Dari sebuah Aplikasi Sistem Pengelolaan Data Studi Club Mahasiswa Sistem Iformasi, dibuatkanlah sebuah alur diagram atau yang biasa dikenal dengan sebutan flowchart. Flowchart digunakan untuk menjelaskan alur dari sebuah program. Berikut adalah flowchart dari Aplikasi Sistem Pengelolaan Data Studi Club Mahasiswa Sistem Iformasi:

### Menu Utama

![Menu Login drawio](https://github.com/user-attachments/assets/5be75ba2-4ce4-43e9-b480-1c72ae50d06a)


### Menu Mahasiswa

![Menu Mahasiswa drawio (1)](https://github.com/user-attachments/assets/59b569ff-3179-4d74-b40f-e386d4c2284d)


### Menu Admin

![Menu Admin drawio (1)](https://github.com/user-attachments/assets/2291fc18-a666-453f-bd50-9e70f1b56c17)

Alur proses dalam aplikasi ini dimulai dari menu utama yaitu menu login. didalam menu login ini user akan diminta untuk menginputkna username, password daan juga memilih role jika dari user tersebut telah memiliki akun. Jika user belum memiliki akun, maka user dapat melakukan registrasi akun terlebih dahulu dengan masuk ke tampilan registrasi, ditampilan registasi user akan diminta untuk menginputkan username berupa NIP/NIM baru, Nama baru dan juga Password baru. setelah itu user akan diarahkan untuk melakukan proses login dengan menginputkan data-data yang sudah dibuat sebelumnya pada saat melakukan registrasi. Setelah menginputkan data pada saat proses login, maka program akan melakukan pengecekkan terhadap inputar tersebut apakah data yang di inputkan tersebut valid, jika inputan tersebut sudah benar, maka program akan mengarahkan user ke menu admin jika user menginputkan akun sebagai admin, jika user menginputkan akun sebagai Mahasiswa maka user akan diarahkan ke menu Mahasiswa. Namun jika terdapat inputan yang tidak sesuai, maka program akan menampilkan notifikasi berupa teguran dan mengembalikan ke menu awal yaitu menu login.

Ketika user login sebagai admin, maka user dapat melakukan pengelolaan terhadap study club yang berupa jadwal study club, nama, kapasitas, deskripsi, jenis dan penanggung jawab pada study club. Admin dapat melakukan pengelolaan dengan cara membuat Study Club , Menampilkan Data Study Club, Memperbarui Data Study Club dan Juga Menghapus Data Study Club. Jika admin ingin membuat Study club maka admin memilih menu Create Data kemudian admin dapat menginputkan data-data study club berupa Nama study club, deskripsi,jadwal,kapasitas peserta, penanggung jawab dan juga jenis study club yang akan dibuat. Jika admin ingin melihat daftar dari study club maka admin memilih menu Read Data untuk menampilkan daftar daftar dari study club. Jika admin ingin memperbarui data dari study club maka admin memilih Update Data untuk melakukan pembaruan terhadap Study Club yang dimana admin diminta untuk menginputkan data terbaru dari kolom yang diinginkan, kemudian nantinya hasil dari pembaruan akan diperbarui juga di dalam database. Kemudian yang terakhir jika admin ingin melakukan penghapusan data study club maka admin akan memilih Delete Data yang kemudian admin memilih kolom baris data yang ingin dihapus, kemudian yang nantinya data study club yang di hapus akan terhapus juga didalam databse. Setiap kali admin melakukan pengelolaan dimasing-masing menu, jika sudah admin dapat menekan tombol home agar dapat kembali ke menu admin.

Ketika user login sebagai Mahasiswa, maka user dapat melakukan menampilkan data jenis-jenis study club dan juga jadwal pelaksanaan study club.Jika user memilih menu Study Club maka user akan ditampilkan daftar dari jenis-jenis Study Club yang dibuat oleh Admin. Jika user memilih menu Jadwal Study Club maka user akan ditampilkan jadwal pelaksaan study club berdasarkan jenis-jenis study club. Jika sudah melakukan semua menu pada Mahasiswa, user dapat menekan tombol home agar dapat kembali ke menu Mahasiswa.

## 2. ERD
- Relational
![WhatsApp Image 2024-11-21 at 19 27 47](https://github.com/user-attachments/assets/4b8f563f-7b8a-455a-bfbc-29c82a7a4a2d)

- Logical
![WhatsApp Image 2024-11-21 at 19 27 48](https://github.com/user-attachments/assets/32c757ad-5718-453f-9144-33cdddaccc80)

- ERDish
  
A. Mahasiswa dan Study Club

    > Setiap mahasiswa dapat mengikuti satu atau banyak study club
    
    > Setiap study club harus diikuti oleh satu dan hanya satu mahasiswa
       
B. Admin dan Study Club

    > Setiap admin harus mendata oleh satu dan hanya satu Study Club
    
    > Setiap Study Club harus didata oleh satu dan banyak admin

C. Penanggung Jawab dan Study Club 

    > Setiap penanggung jawab harus mengurus satu atau banyak Study Club 
    
    > Setiap Study Club harus diurus oleh satu dan hanya satu penanggung jawab

- Relasi
  
> 1. Mahasiswa dengan Study Club : Relasi yang menunjukkan  Bahwa mahasiswa “ikut” study club. Mahasiswa “mengikuti” study club dan  study club “diikuti” mahasiswa.
> 2. Admin dengan Study Club : Relasi yang menunjukkan  Bahwa admin “data” Study Club. Admin “mendata” study club dan study  club “didata” admin.
> 3. Penanggung Jawab dengan Study Club : Relasi yang menunjukkan  Bahwa penanggung jawab “urus” Study Club. Penanggung jawab “mengurus”  Study Club. Study club “diurus” study club  

 - Kardinalitas
   
A. Kardinalitas Mahasiswa dan Study Club: 
> Setiap mahasiswa dapat mengikuti satu dan banyak Study Club  (Mahasiswa → Study Club: One-to-Many).
> Setiap Study Club harus diikuti oleh satu dan hanya satu mahasiswa  (Study Club → Mahasiswa: Many-to-One).  

B. Kardinalitas Admin dan Study Club:  
> Setiap Admin harus mendata satu dan hanya satu Study Club (Admin  → Study Club: One-to-One).
> Setiap Study Club harus diajar oleh satu dan banyak pengajar (Study  Club → Pengajar: One-to-Many).  

C. Kardinalitas Penanggung Jawab dan Study Club:  
> Setiap penanggung jawab harus mengurus satu atau banyak Study Club  (Penanggung Jawab → Study Club: One to-Many).
> Setiap Study Club harus diurus oleh satu dan hanya satu penanggung  jawab (Study Club → Penanggung Jawab: Many-to-One). 

- Entitas dan Atribut  

1. Mahasiswa :   
    > NIM (PK) : Nomor Induk Mahasiswa, atribut unik sebagai identitas utama mahasiswa
    > nama : Nama lengkap mahasiswa
    > password : Kata sandi untuk mengakses sistem 

2. Admin :   
    > id_admin (PK) : Kode unik khusus untuk admin
    > username : nama penggunak untuk login ke sistem
    > password : kata sandi untuk akses role admin 

3. Study_Club :   
    > id_sc (PK) : Identitas unik untuk membedakan setiap study club
    > nama_sc : Nama dari study club
    > jadwal_sc : Jadwal kegiatan atau pertemuan study club
    > kapasitas_sc : Jumlah maksimum anggota yang dapat bergabung dalam study club
    > penanggungjawab_sc : Nama atau identitas orang yang bertanggung jawab atas study club
    > deskripsi_sc : Penjelasan singkat mengenai study club
    > jenis_sc : Kategori atau tipe dari study club, seperti bidang akademik dan non akademik 

4. Penanggung_Jawab :   
    > NIM (PK) : Kode unik untuk penanggung jawab
    > nama : Nama dari penanggung jawab
    > kelas_angkatan : Informasi kelas dan angkatan penanggung jawab 


##  3. HIRARKI KELAS

![Hirarki drawio](https://github.com/user-attachments/assets/a77bef19-b39b-4952-937e-51511f17d3c3)


Hirarki kelas dibuat berdasarkan program aplikasi yang telah dibuat, dalam aplikasi Sistem Pengelolaan Data Studi Club Mahasiswa Sistem Informasi ini, kami menerapkan konsep hirarki dengan metode Inheritence yang terdapat superclass berupa User, yang memiliki subclass yaitu Admin dan Mahasiswa. Dalam hirarki ini superclass User berfungsi untuk menyimpan atribut-atribut umum seperti ID user, nama, dan password. kemudian pada Subclass Admin ini memiliki fungsi untuk mengelola data pada Study Club, sedangkan Subclass Mahasiswa memiliki fungsi untuk melakukan tinjauan dan melihat isi dari Study Club tersebut. Penggunaan hirarki ini dapat membantu dalam pemeliharaan sistem pengelolaan study club dan juga dapat membuat aplikasi perpustakaan menjadi efisien dan terstruktur.



##  4. SCREENSHOT CODINGAN DAN PENJELASAN

-  LoginController
  
    mengimpor model dari Database,Admin,dan Mahasiswa yang digunakan untuk memanggil data dari database , kemudian untuk Admin dan Mahasiswa digunakan untuk memanggil atribut berupa ID user dan password dari kedua objek tersebut yang nantinya dipanggil untuk login. lalu mengimpor javax.swing.JOptionPane; untuk digunakan dalam inputan dan pesan.

![image](https://github.com/user-attachments/assets/c8767c87-7324-458a-b735-adb1f66b16cd)

Login Controller berfungsi untuk melakukan authentifikasi terhadap akun user yang terdapat pada database, yang dimana disini juga merupakan bagian validasi sebelum nantinya akan dipanggil untuk di eksekusi di tombol pada GUI login

  -  Terdapat variabel idUser.isEmpty || password.isEmpty yang berfungsi untuk mengecek apakah inputan tersebut kosong.
  -  Jika terdapat kesalahan atau kebenaran pada operasi authentifikasi pada sistem maka akan menampilkan pesan menggunakan JOptionpane.showMessageDialog.
  -  Fungsi dari role.equalsIgnoreCase membandingkan kedua string dan akan mengembalikan nilai true dengan apa yang diinputkan sesuai dengan data.
  -  Database.closeResources berfungsi untuk menutup interaksi terhadap database.

![image](https://github.com/user-attachments/assets/34ec2c53-6e9b-4fd0-bc3a-73a163683040)

![image](https://github.com/user-attachments/assets/54a2c311-2448-47f5-94b8-333a2197f4cf)

-  Admin.java

    Pada gambar dibawah ini merupakan kode untuk mengimpor HeadlessException yang befungsi jika aplikasi dijalankan tanpa ada dukungan tampilan grafis maka disitulah HeadlessException ini berfungsi, kemudian SQLException berfungsi untuk menampilkan kesalahan yang terjadi pada operasi sistem, dan yang terakhir JOptionPane untuk melakukan inputan dan juga menampilkan pesan.

![image](https://github.com/user-attachments/assets/28c0ed8e-74f2-4475-aed1-87de3ea642fe)

Kelas java admin adalah kelas turunan dari kelas user, yang dimana pada kelas ini memiliki atribut turunan dari kelas user yang memiliki jenis role final yaitu admin, fungsi dari admin ini yaitu untuk mengelola koneksi database berupa data study club yang dikelola.

![image](https://github.com/user-attachments/assets/f9c8b563-9de0-459b-a547-2d0538eef8a7)

Metode login pada admin digunakan untuk mencoba login ke database dengan memeriksa apakah terdapat kesesuaian username ID dan password di tabel admin. ini adalah metode publik dan final yang mengembalikan true jika login berhasil dan false jika gagal. Dalam metode ini:

  -  Terdapat koneksi ke database melalui Database.connection.
  -  Kemudian terdapat querry SQL untuk memeriksa dan mengambil username ID dan password untuk disiapkan dan dieksekusi.
  -  Kesalahan pada SQL akan ditangani dalam blok catch dan SQLException untuk menampilkan kesalahan yang tidak sesuai.
  -  Jika login berhasil maka akan mengembalikan dengan cara return true jika tidak berhasil maka akan return false.

![image](https://github.com/user-attachments/assets/16048d8c-8064-4479-aa87-82a34d6d6164)

- Mahasiswa.java

    Pada gambar dibawah ini merupakan kode untuk mengimpor HeadlessException yang befungsi jika aplikasi dijalankan tanpa ada dukungan tampilan grafis maka disitulah HeadlessException ini berfungsi, kemudian SQLEcxeption berfungsi untuk menampilkan kesalahan yang terjadi pada operasi sistem, dan yang terakhir JOptionPane untuk melakukan inputan dan juga menampilkan pesan.

![image](https://github.com/user-attachments/assets/6e45e206-b36d-4f8b-9724-67d25f8d3d88)

Kelas java Mahasiswa adalah kelas turunan kedua dari kelas user, yang dimana pada kelas ini memiliki atribut turunan dari kelas user yang memiliki jenis role final yaitu mahasiswa, fungsi dari mahasiswa ini yaitu untuk meninjau data dari study club yang dimana nantinya data tersebut diambil dari database tabel study club yang akan ditampilkan dalam menu Study Club dan Jadwal Study Club pada Mahasiswa.
    
![image](https://github.com/user-attachments/assets/bbdd46ce-d85f-4bde-92e9-eac0801f9b5b)

pada gambar dibawah ini merupakan fungsi dari getname untuk memanggil dan memeriksa nama dengan mencari nim menggunaka querry SQL yang dimana terdapat beberapa Metode yaitu:

  -  Terdapat koneksi ke database melalui Database.connection.
  -  Kemudian terdapat querry SQL untuk memeriksa nama dan nim untuk disiapkan dan dieksekusi.
  -  Kesalahan pada SQL akan ditangani dalam blok catch dan SQLException untuk menampilkan kesalahan yang tidak sesuai.

kemudian dibawah ini terdapat daftarMahasiswa yang berfungsi untuk menambahkan data ke dalam daftar Mahasiswa , disini memiliki koneksi ke database yaitu Database.connection.

![image](https://github.com/user-attachments/assets/920f6a2f-f3bd-4d17-9cdd-94f7be608e30)

-  PenanggungJawab.java

    Pada gambar dibawah ini merupakan kode untuk mengimpor HeadlessException yang befungsi jika aplikasi dijalankan tanpa ada dukungan tampilan grafis maka disitulah HeadlessException ini berfungsi, kemudian SQLEcxeption berfungsi untuk menampilkan kesalahan yang terjadi pada operasi sistem, dan yang terakhir JOptionPane untuk melakukan inputan dan juga menampilkan pesan.

![image](https://github.com/user-attachments/assets/9ca1cbff-e7b1-408e-9d6d-a95356f1afba)

Kelas penanggung jawab adalah kelas yang berfungsi untuk menyimpan atribut sebagai penanggung jawab study club.

![image](https://github.com/user-attachments/assets/9e6abb41-33d5-430d-90b1-0538c269b517)




##  5. SCREENSHOT OUTPUT

### Menu Admin
#### Menu Login
Dimana user akan memasukkan NIM dan password untuk mengakses menu admin, 
<img width="1276" alt="Tangkapan Layar 2024-11-21 pukul 21 54 30" src="https://github.com/user-attachments/assets/abc6b1c6-0b65-400f-a52c-a3e6bd4c2a39">

#### Menu Utama Admin
Ini tampilan menu utama ketika user berhasil login sebagai admin
<img width="1280" alt="Tangkapan Layar 2024-11-21 pukul 08 13 13" src="https://github.com/user-attachments/assets/7d4362b5-b7f4-468e-a416-dbe635efd5b8">

<img width="1281" alt="Tangkapan Layar 2024-11-21 pukul 08 14 54" src="https://github.com/user-attachments/assets/04485182-7120-4454-a147-06ed6336fbe4">

#### Menu Create Data
Ini merupakan menu untuk membuat data study club baru dengan cara menginputkan pada kolom teks yang ada
<img width="1280" alt="Tangkapan Layar 2024-11-21 pukul 08 16 53" src="https://github.com/user-attachments/assets/46cd8f06-3fce-4595-b6db-35a49595a824">

<img width="1278" alt="Tangkapan Layar 2024-11-21 pukul 08 17 10" src="https://github.com/user-attachments/assets/31219621-dec5-4b2f-9663-2a3fd280b974">

#### Menu Read Data
Disini user dapat melihat data yang baru dibuat tadi dan data yang ada di dalam database juga akan ditampilkan, di menu ini juga terdapat fitur lain yaitu sorting dan searching
<img width="1276" alt="Tangkapan Layar 2024-11-21 pukul 21 39 38" src="https://github.com/user-attachments/assets/04d8e33c-11d5-4d5b-a87a-698ad7d12cb6">

#### Menu Update Data
User dapat mengubah data yang ada dengan cara klik pada baris data yang ingin diubah lalu input data baru pada kolom teks
<img width="1275" alt="Tangkapan Layar 2024-11-21 pukul 21 40 15" src="https://github.com/user-attachments/assets/837c84a0-fa8f-4904-bacf-58f8abaefea3">

#### Menu Delete Data
User dapat melakukan penghapusan data dengan cara klik pada baris yang ingin dihapus lalu klik pada button delete dibawah
<img width="1271" alt="Tangkapan Layar 2024-11-21 pukul 21 42 35" src="https://github.com/user-attachments/assets/7ae0e7e2-f36a-4c43-86b5-71b716b38da5">

<img width="1274" alt="Tangkapan Layar 2024-11-21 pukul 21 42 54" src="https://github.com/user-attachments/assets/5f1f51b0-92ea-4061-beaf-9a10db23f0e0">

### Menu Mahasiswa

#### Menu Login
Untuk ingin akses ke menu mahasiswa, user dapat melakukan login seperti biasa dan jika tidak memiliki akun user dapat melakukan registrasi
<img width="1276" alt="Tangkapan Layar 2024-11-21 pukul 21 54 30" src="https://github.com/user-attachments/assets/55b7878e-278f-4b82-8f8e-387884dd7877">

#### Menu Utama Mahasiswa
Setelah user berhasil login menjadi mahasiswa, user akan langsung masuk ke mnu utama mahasiswa
<img width="1275" alt="Tangkapan Layar 2024-11-21 pukul 22 04 31" src="https://github.com/user-attachments/assets/d4938c31-da2e-4385-9f12-5847415fb783">

<img width="1273" alt="Tangkapan Layar 2024-11-21 pukul 22 04 47" src="https://github.com/user-attachments/assets/454fc88c-c302-4fd6-bf88-a5a971b71c67">

#### Menu Study Club
Ini merupakan menu dimana user dapat melihat daftar study club yang ada,  juga user dapat melakukan search berdasarkan nama study club dan melakukan sorting
<img width="1245" alt="Tangkapan Layar 2024-11-21 pukul 22 04 57" src="https://github.com/user-attachments/assets/8ee208d1-2a99-4a46-b0d4-31adab93251b">

#### Menu Jadwal Study Club
Sama seperti menu sebelumnya, namun bedanya disni hanya ditampilkan nama study club beserta jadwalnya saja
<img width="1278" alt="Tangkapan Layar 2024-11-21 pukul 22 05 11" src="https://github.com/user-attachments/assets/52123a2b-8c4f-4be4-99eb-d8f413c32502">

