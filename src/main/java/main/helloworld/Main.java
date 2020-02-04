package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("HelloWorld!");
        System.out.println("MatijaLosic");
        
        int age = 5;
        
        if (age > 18) {
            System.out.println("Osoba je punoletna.");
            } else {
            System.out.println("Osoba je maloletna");
        }
        
        System.out.print("Unesite broj godina: ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        
        System.out.println("Korisnik je uneo: " + userAge);
        
        if (userAge < 0 && userAge > 150) {
            System.out.println("Invalid");
        } else if (userAge > 0 && userAge <= 5) {
            System.out.println("Baby");
        } else if (userAge <= 11) {
            System.out.println("Kid");
        } else if (userAge <=17) {
            System.out.println("Teen");
        } else if (userAge >= 18) {
            System.out.println("Adult");
        } 
        }
        }
         
        
    
    

