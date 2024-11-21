# APLIKASI SISTEM PENGELOLAAN DATA STUDI CLUB MAHASISWA SISTEM INFORMASI

KELOMPOK 10A

  1.Muhamad Nur Fadilah (2309116001)

  2.Fitri Yanti (2309116016)
  
  3.Adinda Salsabila Naura (2309116023)
  
  4.Rofi Hanif Fauzan (2309116026

## Latar Belakang

Di era digital saat ini, pemanfaatan teknologi informasi sangat penting, termasuk dalam lingkungan pendidikan tinggi pada jurusan Sistem Informasi. Pengelolaan data mahasiswa yang efisien menjadi kebutuhan utama, terutama terkait kegiatan study club, baik akademik maupun non-akademik, yang membantu mahasiswa mengembangkan kemampuan dan bersosialisasi.


## Deskripsi Project



## 1. FLOWCHART

Dari sebuah Aplikasi Sistem Pengelolaan Data Studi Club Mahasiswa Sistem Iformasi, dibuatkanlah sebuah alur diagram atau yang biasa dikenal dengan sebutan flowchart. Flowchart digunakan untuk menjelaskan alur dari sebuah program. Berikut adalah flowchart dari Aplikasi Sistem Pengelolaan Data Studi Club Mahasiswa Sistem Iformasi:

Menu Utama

![Menu Login drawio](https://github.com/user-attachments/assets/5be75ba2-4ce4-43e9-b480-1c72ae50d06a)


Menu Mahasiswa

![Menu Mahasiswa drawio (1)](https://github.com/user-attachments/assets/59b569ff-3179-4d74-b40f-e386d4c2284d)


Menu Admin

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
A. Mahasiswa dan Study Club /t
    1. Setiap mahasiswa dapat mengikuti satu atau banyak study club. 
    2. Setiap study club harus diikuti oleh satu dan hanya satu mahasiswa
       
B. Admin dan Study Club 
    1. Setiap admin harus mendata oleh satu dan hanya satu Study Club. 
    2. Setiap Study Club harus didata oleh satu dan banyak pengajar. 

C. Penanggung Jawab dan Study Club 
    1. Setiap penanggung jawab harus mengurus satu atau banyak Study Club  
    2. Setiap Study Club harus diurus oleh satu dan hanya satu penanggung jawab. 

- Relasi 
1. Mahasiswa dengan Study Club : Relasi yang menunjukkan  Bahwa mahasiswa “ikut” study club. Mahasiswa “mengikuti” study club dan  study club “diikuti” mahasiswa.  
2. Admin dengan Study Club : Relasi yang menunjukkan  Bahwa admin “data” Study Club. Admin “mendata” study club dan study  club “didata” admin. 
3. Penanggung Jawab dengan Study Club : Relasi yang menunjukkan  Bahwa penanggung jawab “urus” Study Club. Penanggung jawab “mengurus”  Study Club. Study club “diurus” studyy club  

 - Kardinalitas 
A. Kardinalitas Mahasiswa dan Study Club:  
    1. Setiap mahasiswa dapat mengikuti satu dan banyak Study Club  (Mahasiswa → Study Club: One-to-Many).  
    2. Setiap Study Club harus diikuti oleh satu dan hanya satu mahasiswa  (Study Club → Mahasiswa: Many-to-One).  

B. Kardinalitas Admin dan Study Club:  
    1. Setiap Admin harus mendata satu dan hanya satu Study Club (Admin  → Study Club: One-to-One).  
    2. Setiap Study Club harus diajar oleh satu dan banyak pengajar (Study  Club → Pengajar: One-to-Many).  

C. Kardinalitas Penanggung Jawab dan Study Club:  
    1. Setiap penanggung jawab harus mengurus satu atau banyak Study Club  (Penanggung Jawab → Study Club: One to-Many).  
    2. Setiap Study Club harus diurus oleh satu dan hanya satu penanggung  jawab (Study Club → Penanggung Jawab: Many-to-One). 

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



##  4. SCREENSHOT CODINGAN DAN PENJELASAN

-  LoginController

![image](https://github.com/user-attachments/assets/34ec2c53-6e9b-4fd0-bc3a-73a163683040)

![image](https://github.com/user-attachments/assets/54a2c311-2448-47f5-94b8-333a2197f4cf)



    






##  5. SCREENSHOT OUTPUT

