/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huruf.a;
/**
 *
 * @author Manda Salsa
 */
public class HurufA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Salsabila rahmawati ningsih");
        
        char[] nama = {'s', 'a', 'l', 's', 'a', 'b', 'i', 'l', 'a', 'r', 'a', 'h', 'm', 'a', 'w', 'a','t','i','n','i','n','g','s','i','h'};
        int Count = 0;
        for (int i=0; i<nama.length; i++) {
           if (nama[i] == 'i') Count++;
        }
        System.out.println("Jumlah huruf i = "+Count);
        
        for (int i=1; i <= Count; i++){
        System.out.println("i");
    }
    } 
}
