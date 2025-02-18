public class Mahasiswa04 {
    String nama, nim, kelas;
    double ipk;

    public Mahasiswa04(){

    }

    public Mahasiswa04(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi(){
        System.out.println("Nama\t:" + nama);
        System.out.println("NIM\t:" + nim);
        System.out.println("IPK\t:" + ipk);
        System.out.println("Kelas\t:" + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if(ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0.");
        }
    }

    String nilaiKinerja(){
        if(ipk >= 3.5){
            return "Kinerja sangat baik";
        }else if(ipk >= 3.0){
            return "Kinerja bagus";
        }else if(ipk >= 2.0){
            return "Kinerja cukup";
        }else{
            return "Kinerja kurang";
        }
    }
}