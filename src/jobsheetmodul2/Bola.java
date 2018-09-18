/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetmodul2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Bola {
    public double jarijari;
    public double diameter;
    public double luaspermukaan;
    public double volume;
    Scanner z = new Scanner(System.in);


public void setjarijari(double jarijari){
   this.jarijari = jarijari;
}
public double showDiameter() {
    return this.jarijari * 2;
}

public double showLuasPermukaan() {
    return this.jarijari * 4 * Math.PI * this.jarijari; 
}

public double showVolume(){
    return 4/3*Math.PI*this.jarijari*this.jarijari*this.jarijari;
}

public void cetak () {
 System.out.println("Program untuk Bangun Ruang Bola ");
 System.out.println("Nilai jari - jari : " + jarijari);
 System.out.println("Nilai diameter : " + showDiameter());
 System.out.println("Luas permukaan bola : " +showLuasPermukaan());
 System.out.println("Volume bola : " +showVolume());
}
}

