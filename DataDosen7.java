public class DataDosen7 {
    static void sortByNidnInsertionASC(Dosen7[] d){

        //Menggunakan Insertion Sort secara Ascending

        for (int i = 1; i < d.length; i++){
            Dosen7 temp = d[i];
            int j = i - 1;
            while (j >= 0 && d[j].NIDN.compareToIgnoreCase(temp.NIDN) > 0){
                d[j + 1] = d[j];
                j--;
            }
            d[j + 1] = temp;
        }

        for (Dosen7 dsn : d) {
            dsn.cetakInfo();
        }
    }

    static void searchByNama(Dosen7[] d, String cari){
        
        //Menggunakan Sequential Search
        int posisi = -1;
        for(int i = 0; i < d.length; i++){
            if((d[i].nama).equalsIgnoreCase(cari)){
                posisi = i;
                break;
            }
        }

        if (posisi != -1){
            System.out.println ("\nData ditemukan pada indeks-" + (posisi + 1) + 
            " : \n NIDN : " + d[posisi].NIDN + " | Nama : " + d[posisi].nama + " | Email : " 
            + d[posisi].email + " | Masa Kerja : " + d[posisi].masaKerja + " | Program Studi : " + d[posisi].programStudi);
        } else {
            System.out.println("Berikan nama yang valid!");
        }

    }

    static void sortByMasaKerjaSelectionDESC(Dosen7[] d){

        //Menggunakan Selection SOrt secara Descending
        
        for (int i = 0; i < d.length - 1; i++){
            Dosen7 kecil = d[i];
            for (int j = i + 1; j < d.length; j++){
                Dosen7 besar = d[j];
                if (kecil.masaKerja < besar.masaKerja){
                    kecil = d[j];
                    besar = d[i];
                }
                d[i] = kecil;
                d[j] = besar;
            }
        }

        for (Dosen7 dsn : d) {
            dsn.cetakInfo();
        }
    }
}
