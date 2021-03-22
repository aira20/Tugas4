/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas.pkg4;

import java.util.Scanner;
/**
 *
 * @author Aria
 */
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        //Input berapa string yang ingin di masukkan
        System.out.print("Berapa kota yang ingin di masukkan?: \n");
        count = scan.nextInt();
        
        
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        
        //String yang di input akan di masukkan dalam bentuk array
        System.out.println("Masukkan " + count + " Kota: \n");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        //Hasil string setelah di sort
        System.out.print("Kota yang di masukkan adalah: ");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}
    


