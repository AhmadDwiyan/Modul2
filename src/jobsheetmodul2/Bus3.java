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
public class Bus3 {
       public int penumpang;
   public int maxpenumpang;
   public double berat;
    //konstruktor maxpenumpang
    public Bus3(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
        this.berat = 0;
    }
    
   
    
    // method mutator utk menambah penumpang
    public void addPenumpang(int penumpang, int berat){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Penumpang melebihi kuota");}
        else {
            this.penumpang = temp;
        this.berat = this.berat + berat;}
        }

public void getpenumpang(int password){
if (password == 24){
System.out.println("Password benar");}
else {
    System.out.println("Password salah");}
}
public double getaverage () {
   return this.berat / this.penumpang; 
} 
public void cetakpenumpang(){
     System.out.println("Penumpang bus sekarang adalah "+ penumpang);
    System.out.println("Penumpang maksimum yang seharusnya adalah " +maxpenumpang);
    System.out.println("Rata - rata berat penumpang awal : " + getaverage());
    }
    }