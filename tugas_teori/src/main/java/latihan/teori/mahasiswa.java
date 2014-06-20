/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan.teori;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Putra Tarihoran
 */
public class mahasiswa {
    public static void main(String[] x) throws Exception {
        //1. buat variabel bertipe FileReader
        String namafile = "src/main/resources/mahasiswa.csv";
        FileReader fr = new FileReader (namafile);
        
        //2. Bungkus dalam BufferedReader supaya ada method radLine
        BufferedReader reader = new BufferedReader (fr);
        
        //3. Looping, baca data, dan tampilkan
        String data = reader.readLine(); //header, ignore
        data = reader.readLine();
        while(data != null){
            System.out.println("========================");
            String[] mahasiswa = data.split(",");
            System.out.println("id : "+mahasiswa[0]);
            System.out.println("npm : "+mahasiswa[1]);
            System.out.println("nama : "+mahasiswa[2]);
            System.out.println("email : "+mahasiswa[3]);
            System.out.println("tanggal_lahir : "+mahasiswa[4]);
            System.out.println("tahun_masuk : "+mahasiswa[5]);
            data = reader.readLine();
        }
        //4. Tutup file
        reader.close();
    }
}
