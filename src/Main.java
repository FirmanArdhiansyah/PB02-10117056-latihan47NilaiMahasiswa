/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {
    public static void main(String[] args) {
        NilaiMahasiswa nm = new NilaiMahasiswa(60,80,75);

        System.out.println("QUIZ \t = "+nm.getQuiz());
        System.out.println("UTS \t = "+nm.getUts());
        System.out.println("UAS \t = "+nm.getUas());
        System.out.println("\nNilai Akhir = "+ nm.nilaiAkhir());
        System.out.println("\nIndex = "+ nm.indexNilai());
        System.out.println("Keterangan = "+ nm.ketereangan());

    }
}
