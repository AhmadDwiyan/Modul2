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
public class UjiBus3 {
    public static void main (String [] abc){
        Bus3 busan = new Bus3(0);
        busan.getpenumpang(17);
         busan.getpenumpang(24);
         busan.cetakpenumpang();
         
         busan.addPenumpang(1,43);
         busan.cetakpenumpang();
         
          busan.addPenumpang(2,54);
         busan.cetakpenumpang();
         
          busan.addPenumpang(2,54);
         busan.cetakpenumpang();
         
         
        
    }
}
