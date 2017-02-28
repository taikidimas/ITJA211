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
public class Transaction {
 private String name;
 private double BillTotal;
 private int NumberofItems;
 
 public Transaction (String name, double BillTotal, int NumberofItems )
 {
 this.name = name;
 this.BillTotal = BillTotal;
 this.NumberofItems = NumberofItems;
 }
  
 void Total (Double Item)
 {
 this.BillTotal += Item;     
 }
 
  public String getName()
 {
 return name; 
 }
 
 public double getTotal()
 {
 return BillTotal; 
 }
 
  public int GetItems()
 {
 return NumberofItems; 
 }
 
 void SetItems(int ItemNum)
 {
         this.NumberofItems = ItemNum;
 }
}
