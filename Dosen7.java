class Dosen7{
    String NIDN;
    String nama;
    String email;
    int tahunMasuk;
    int masaKerja;
    String programStudi;

    Dosen7(String NIDN, String nama, String email, int tahunMasuk, String programStudi){
        this.NIDN = NIDN;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.programStudi = programStudi;
        hitungMasaKerja();
    }

    int hitungMasaKerja(){
        int tahunSaatIni = 2025;
        return masaKerja =  tahunSaatIni - tahunMasuk;
    }

    void cetakInfo(){
        System.out.printf("| %-5s | %-15s | %-20s | %-10s | %-15s | %n", NIDN, nama, email, masaKerja, programStudi);
    }


}