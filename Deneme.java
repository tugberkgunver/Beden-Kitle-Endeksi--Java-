
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tugberkgunver
 */
public class Deneme {
    
    public static void main(String[] args) {
            
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu giriniz:");
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu giriniz: Örneğin(1.70)");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        
        
        System.out.println("Beden kitle endeksiniz : " + bki);
    }
    
}
