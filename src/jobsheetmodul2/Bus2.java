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
public class Bus2 {
   private int penumpang;
   private int maxpenumpang;
    
    //konstruktor maxpenumpang
    public Bus2(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    // method mutator utk menambah penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Penumpang melebihi kuota");}
        else {
            this.penumpang = temp;}
        }
    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah "+ penumpang);
    System.out.println("Penumpang maksimum yang seharusnya adalah " +maxpenumpang);
    }
    }

