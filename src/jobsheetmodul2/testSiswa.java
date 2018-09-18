/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetmodul2;

/**
 *
 * @author ASUS
 */
public class testSiswa {
    public static void main (String [] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setnama("Julian");
        siswa.setumur(23);
        siswa.getalamat("Malang");
        System.out.print("Nama : " + siswa.getnama()
                 + " Absen : " +siswa.getabsen() 
                + " Alamat : " +siswa.getalamat() );
    }
}
