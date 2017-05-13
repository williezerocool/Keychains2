/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keychains2;

import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class Keychains2 {

    /**
     * @param args     
     * @param numOfKeychains
     * @param chainPrice
     */
   public static void main( String[] args) {
       
        Scanner ky = new Scanner(System.in);
        int userInput,numOfKeychains, a;
        a = 1;
        numOfKeychains = 0;
        double chainPrice = 10.00;
        
        System.out.print("Ye Olde Keychain Shoppe\n" + "1. Add Keychains to Order\n" + "2. Remove Keychains from Order\n" + "3. View Current Order\n" + "4. Checkout\n" + "Please enter your choice: ");
        userInput = ky.nextInt();
        System.out.println();
        
        while(a > 0){
        
            if(userInput == 1){
            
                numOfKeychains = add_keychains(numOfKeychains);
                System.out.print("1. Add Keychains to Order\n" + "2. Remove Keychains from Order\n" + "3. View Current Order\n" + "4. Checkout\n" + "Please enter your choice: ");
                userInput = ky.nextInt();
                System.out.println();
            
            }else if(userInput == 2){
            
                numOfKeychains = remove_keychains(numOfKeychains);
                System.out.println("you now have " + numOfKeychains + " keychains" + "\n" );
               
                System.out.print("1. Add Keychains to Order\n" + "2. Remove Keychains from Order\n" + "3. View Current Order\n" + "4. Checkout\n" + "Please enter your choice: ");
                userInput = ky.nextInt();
                System.out.println();
            }else if(userInput == 3){
            
                view_order(numOfKeychains, chainPrice);
                System.out.print("1. Add Keychains to Order\n" + "2. Remove Keychains from Order\n" + "3. View Current Order\n" + "4. Checkout\n" + "Please enter your choice: ");
                userInput = ky.nextInt();
                System.out.println();
            }else if(userInput == 4){
            
                checkout(numOfKeychains, chainPrice);
                a = 0;
                
            }
            
        }
    
    
    }
    
    /**
     *
     * @param numOf
     * @return 
     */
    public static int add_keychains(int numOf){
    
        Scanner ky = new Scanner(System.in);
        int count;
        
        System.out.print("you have " + numOf + " keychains. How many to add? ");
        count = ky.nextInt();
        System.out.print("you now have " + (count + numOf) + " keychains" + "\n");
        return count;
    }
    
    public static int remove_keychains(int numOf){
        Scanner ky = new Scanner(System.in);
        int count;
        
        System.out.print("you have " +  numOf +" keychains. How many keychains do you want to remove? ");
        count = ky.nextInt();
        return numOf - count;
    }
    
    /**
     *
     * @param numOf
     * @param price
     */
    public static void view_order(int numOf, double price){
    
        
        String order = "You have " + numOf + " keychains\n" + "keychains cost $10.00 each\n" + "total cost is $" + (price * numOf) + "0\n";
        System.out.println(order);
    }
    
    public static void checkout(int numOf, double price){
        
        Scanner ky = new Scanner(System.in);
        String userInput;
        
        System.out.print("CHECKOUT \n"+ "What is your name? ");
        userInput = ky.next();
        
        String order = "You have " + numOf + " keychains\n" + "keychains cost $10.00 each\n" + "total cost is $" + (price * numOf) + "0\n" + "Thanks for your order " + userInput;
        System.out.println(order);
    }
    


}
