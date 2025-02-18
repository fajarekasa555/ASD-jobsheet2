public class Dosen04 {
    String idDosen, bidangKeahlian, nama;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen04(){

    }

    public Dosen04(String id, String nm, boolean aktif, int bergabung, String keahlian){
        idDosen = id;
        nama = nm;
        statusAktif = aktif;
        tahunBergabung = bergabung;
        bidangKeahlian = keahlian;
    }

    void tampilInformasi(){
        System.out.println("\nId Dosen\t: " + idDosen);
        System.out.println("Nama Dosen\t: " + nama);
        System.out.println("Status Aktif\t: " + "Dosen" + (statusAktif == true ? "" : " tidak") + " aktif");
        System.out.println("Tahun Bergabung\t: " + tahunBergabung);
        System.out.println("Bidang Keahlian\t: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("\nStatus Aktif Berhasil diubah");
        System.out.println("Dosen" + (statusAktif == true ? "" : " tidak") + " aktif");
    }

    int hitungMasaKerja(int thnSkrng){
        int tahunKerja = thnSkrng - tahunBergabung;
        return tahunKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        System.out.println("\nBidang Keahlian Berhasil diubah");
        System.out.println("Bidang Keahlian sekarang adalah : " + bidangKeahlian);
    }
}
