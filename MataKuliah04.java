public class MataKuliah04 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah04(){

    }

    public MataKuliah04(String kode, String nm, int newSks, int jmlJam){
        kodeMK = kode;
        nama = nm;
        sks = newSks;
        jumlahJam = jmlJam;
    }

    void tampilInformasi(){
        System.out.println("\nKode\t:" + kodeMK);
        System.out.println("Nama\t:" + nama);
        System.out.println("SKS\t:" + sks);
        System.out.println("Jml Jam\t:" + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("\nSKS telah berhasil diubah menjadi :" + sks);
    }

    void tambahJam(int jam){
        jumlahJam =  jumlahJam + jam;
        System.out.println("\nJumlah jam berhasil ditambah " + jam +" jam");
        System.out.println("Jumlah jam sekarang adalah " + jumlahJam +" jam");
    }

    void kurangiJam(int jam){
        if(jam > jumlahJam){
            System.out.println("Pengurangan tidak dapat dilakukan, jumlah jam lebih kecil dari pengurang.");
        }else{
            jumlahJam =  jumlahJam - jam;
            System.out.println("\nJumlah jam berhasil dikurangi " + jam +" jam");
            System.out.println("Jumlah jam sekarang adalah " + jumlahJam +" jam");
        }
    }

}
