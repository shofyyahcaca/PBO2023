# Interface
- “Interface adalah blue print dari class. Isi method-nya kosong dan nanti akan diimplementasikan pada class lain.” 
https://www.petanikode.com/java-oop-interface/
- Interface dapat diimplementasikan oleh sebuah class dengan menggunakan keyword "implements".

# Tahapan - tahapan
Kantor merupakan SuperClass yang akan mewariskan. Lobby dan Kantin adalah turunan dari Kantor. Class Kantin di implements ke Class interface BukaUsaha, Investor, dan Karyawan.

1. Pertama, buat class Kantor terlebih dahulu. Terdapat beberapa atribut yaitu tataTertib, jenisPekerjaan, jenisPerlengkapan, dan ruangan. Lalu, terdapat juga metod yaitu pulang.
2. Kedua, buat kelas turunan dari Kantor. Beri nama class turunan pertama dengan nama Lobby. Pada class turunan pertama ini, saya tidak membuat class interface.
3. Ketika, Beri nama class turunan kedua dengan nama Kantor. Beri nama class turunan pertama dengan nama Kantin. Dalam class Kantin terdapat class interface yang implements dari Karyawan, bukaUsaha, dan tradingSaham. Terdapat konstruktor tanpa parameter untuk menginisialisasi atribut dari class Kantor, atribut-atribut tersebut akan diatur sesuai dengan nilai-nilai yang ditentukan.
