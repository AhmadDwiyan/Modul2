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
public class EncapSiswa {
    private String nama;
    private String alamat;
    private int absen;
    
    public int getabsen(){
    return absen;    
    
}
    public String getnama(){
    return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public void setumur(int newAbsen){
        absen = newAbsen;
    }
    public void setnama(String newNama) {
        nama = newNama;
    }
    public void getalamat(String newAlamat){
        alamat = newAlamat;
    }
}