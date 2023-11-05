# Private
Public : bisa diakses di class manapun, di package yang sama maupun tidak.
Private : hanya bisa diakses dari dalam class itu sendiri.
Protected : hanya bisa diakses dari dalam class itu sendiri, dan class turunannya.

# Tahapan - tahapan
1. Pertama, buat Project Baru yang akan digunakan untuk membuat class-class nya.
2. Untuk categoriesnya, pilih Java with Ant dan projectnya pilih Java Application > Klik Next.
3. Beri nama project, Tugas 1 PBO > Klik Finish.
4. Buka package > klik kanan pada class > lalu pilih refactor > klik rename untuk merubah nama kelas.
5. Rename kelas menjadi Makhluk Hidup > Klik Refactor.
6. Kelas Makhluk Hidup merupakan superclass/kelas yang menjadi dasar yang sifatnya akan di turunkan kepada subclass/kelas turunannya. Didalam kelas diatas terdapat banyak variabel diantaranya nama, vertebrata, alat pernapasan, reproduksi, habitat, makanan, golongan, menghasilkan, warna, ciri-ciri, lainnya dan bergerak.
7. Selanjutnya yaitu mendeklarasikan variabel-variabel dari public menjadi private dan protected. Pertama blok terlebih dahulu mana yang akan di refactor > lalu pilih Encapsulate Fields. Refactor merupakan mengubah field menjadi private dan membuat getter dan setter untuk mengakses field tersebut.
8. Setelah klik encapsulate kotak untuk mengakses getter dan setter > centang getter dan setter akan dijadikan private > Klik Refactor.
9. Setelah melakukan refactor, maka source code nya akan otomatis berubah. Set digunakan untuk mengatur nilai pada variabel sedangkan get digunakan untuk mengambil nilai dari variabelnya.
10. Source code yang awalnya public String sekarang berubah menjadi private String yang hanya dapat diakses dikelas yang sama. Untuk itu, digunakan set dan get untuk mengatur dan mengambil nilai seperti penjelasan sebelumnya pada variabel nama, vertebrata, alat pernapasan, reproduksi, habitat, makanan, golongan, menghasilkan, warna, ciri-ciri,dan lainnya. Untuk variable bergerak, menggunakan protected yang hanya dapat diakses oleh turunanya, dalam kelas yang sama, dan dalam package yang sama. Pemilihan private dan protected sendiri tergantung kalian bagaimana data dan metode tersebut dapat diakses.
11. Langkah selanjutnya yaitu kita membuat class baru yang nantinya akan menjadi kelas turunan dari Makhluk Hidup.
12. Setelah itu, beri nama kelas turunan dengan nama Hewan > Klik Browse untuk mengambil dari mana superclassnya/kelas yang akan diturunkan > Klik OK > lalu Finish.
13. Maka, terbentuklah kelas Turunan dari Makhluk Hidup. Extends digunakan untuk membuat pewarisan antara superclass dan subclass/kelas turunan.
14. Buat kelas lagi dengan nama Sapi > Lalu ketik Hewan Sapi = new Hewan(); yang menandakan untuk membuat objek baru dari kelas Hewan dengan nama Sapi. Untuk yang private diatur dengan set dan pada system out println nya diambil dengan get. Untuk yang protected pada system out println nya langsung diketik sytem.out.println(Sapi.bergerak();, Sapi nama kelas yang sekarang dan bergerak adalah variabelnya yang diambil dari superclass.
