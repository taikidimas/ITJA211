/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerbill;

/**
 *
 * @author Taiki
 */

import java.util.Scanner;

public class CustomerBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter client name:");
    String clientname = input.nextLine();
    Transaction trans1 = new Transaction(clientname,0,0);
    double itemAmount = 0;
    int counter = 1;
    
    System.out.printf("Enter item number %d's price:",counter);
    itemAmount = input.nextDouble();
    
while (itemAmount != 12345)
        {
        trans1.Total(itemAmount);
        trans1.SetItems(counter);
        counter ++;
        System.out.printf("Enter item number %d's price:",counter);
        itemAmount = input.nextDouble();
        }   

System.out.printf("%s bought %d items which came to a total amount of R%.2f", trans1.getName(),trans1.GetItems(), trans1.getTotal());
    
    }
    
}
