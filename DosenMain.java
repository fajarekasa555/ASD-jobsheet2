public class DosenMain {
    public static void main(String[] args) {
        // membuat object menggunakan konstruktor default
        Dosen04 dosen1 = new Dosen04();
        // end

        // mengisi value attribut pada object dosen1
        dosen1.idDosen = "FES";
        dosen1.nama = "Fandi Estavista Sinkron";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2020;
        dosen1.bidangKeahlian = "Sistem Informasi";
        // end

        // mengakses method pada object dosen1
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        // print hasil perhitungan dari method hitungMasaKerja() pada object dosen1
        System.out.println("\nLama dosen bekerja adalah : " + dosen1.hitungMasaKerja(2025) + " tahun");
        // end
        dosen1.ubahKeahlian("Teknik Sipil");
        dosen1.tampilInformasi();
        // end

        // membuat objet baru menggunakan konstruktor dengan parameter
        Dosen04 dosen2 = new Dosen04("ARA", "Afrizal Rafli Ahmad", false, 1990, "Teknik Sipil");
        // end

        // mengakses method pada object dosen2
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        // print hasil perhitungan dari method hitungMasaKerja() pada object dosen2
        System.out.println("\nLama dosen bekerja adalah : " + dosen2.hitungMasaKerja(2025) + " tahun");
        // end
        dosen2.ubahKeahlian("Teknik Informatika");
        dosen2.tampilInformasi();
        // end
    }
}
