import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen7[] dsn = {
            new Dosen7("D05", "Siti Nur", "siti@gmail.com", 1995, "SIB"),
            new Dosen7("D02", "Hendro", "hendro@gmail.com", 2001, "Teknik Mesin"),
            new Dosen7("D04", "Aris Wahyudi", "aris@gmail.com", 1994, "Tata Busana"),
            new Dosen7("D03", "Gojo Satoru", "gojo@gmail.com", 1998, "Teknik Elektro"),
            new Dosen7("D01", "Mardiana", "mardiana@gmail.com", 2005, "Tata Boga"),
            new Dosen7("D06", "Dian Sastro", "dian@gmail.com", 2008, "Bisnis"),
        };

        boolean ulang = true;
        while (ulang){
            System.out.println("\n - Sistem Pengelolaan Data Dosen - ");
            System.out.println("\n1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan Data berdasarkan NIDN (ASC)");
            System.out.println("3. Cari Data Dosen");
            System.out.println("4. Urutkan Data berdasarkan Masa Kerja (DESC)");
            System.out.println("0. Keluar");
            System.out.print("\nMasukkan Pilihan : ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan){
                case 1:
                System.out.printf("| %-5s | %-15s | %-20s | %-10s | %-15s | %n",
                 "NIDN", "Nama", "Email", "Masa Kerja", "Program Studi");
                for (Dosen7 d : dsn) {
                    d.cetakInfo();
                }
                break;

                case 2:
                System.out.printf("| %-5s | %-15s | %-20s | %-10s | %-15s | %n",
                "NIDN", "Nama", "Email", "Masa Kerja", "Program Studi");
                DataDosen7.sortByNidnInsertionASC(dsn);
                break;

                case 3:
                System.out.print("Masukkan Nama Dosen : ");
                String cari = sc.nextLine();
                DataDosen7.searchByNama(dsn, cari);
                break;

                case 4:
                System.out.printf("| %-5s | %-15s | %-20s | %-10s | %-15s | %n",
                "NIDN", "Nama", "Email", "Masa Kerja", "Program Studi");
                DataDosen7.sortByMasaKerjaSelectionDESC(dsn);
                break;

                case 0:
                System.out.println("Terimakasih!");
                ulang = false;
                break; 

                default:
                System.out.println("Masukkan pilihan yang benar!");
            }
        }
    }
}
