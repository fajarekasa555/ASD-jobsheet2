public class MataKuliahMain04 {
    public static void main(String[] args) {
        
        // membuat object dengan konstruktor default
        MataKuliah04 matkul1 = new MataKuliah04();
        // end

        // memasukkan value pada attribut object matkul1
        matkul1.kodeMK = "CORS";
        matkul1.nama = "Cross-Origin Resource Sharing";
        matkul1.sks = 20;
        matkul1.jumlahJam = 20;
        // end

        // memanggil method dari object matkul1
        matkul1.tampilInformasi();
        matkul1.ubahSKS(25);
        matkul1.tambahJam(10);
        matkul1.kurangiJam(2);
        matkul1.tampilInformasi();
        // end

        // membuat object dengan konstruktor berparameter
        MataKuliah04 matkul2 = new MataKuliah04("BD", "Basis Data", 23, 24);
        // end

        // memanggil method dari object matkul2
        matkul2.tampilInformasi();
        matkul2.ubahSKS(100);
        matkul2.tambahJam(100);
        matkul2.kurangiJam(25);
        matkul2.tampilInformasi();
        // end

    }
}
