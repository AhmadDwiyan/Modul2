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
public class UjiBus2 {
  public static void main(String[] args) {
        Bus2 busbesar = new Bus2(40);
        busbesar.cetak();
       busbesar.addPenumpang(15);
       busbesar.cetak();
       
       busbesar.addPenumpang(5);
       busbesar.cetak();
       
       busbesar.addPenumpang(26);
       busbesar.cetak();
    }
    
}
