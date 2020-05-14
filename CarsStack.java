/*
Lina Breunlin
Module 08 Lab
Part A

This is the program for Remi's rental cars. It uses a stack data structure to keep track of his rental car inventory
 */
package carsstack;

import java.util.Iterator;
import java.util.Stack;


public class CarsStack 
{

    public static void main(String[] args) 
    {
        
        // create an empty stack 
        Stack<Cars> carStack = new Stack<Cars>(); 
        
        //create car objects for the stack
        Cars rental1 = new Cars ("white", "Chevy Cruz", "TGY47598");
        Cars rental2 = new Cars ("Black", "Chrysler 200", "MJK1265");
        Cars rental3 = new Cars ("Tan", "Ford Taurus", "CVB78452");
        Cars rental4 = new Cars ("Blue", "Nissan Altima", "WSC9633");
        Cars rental5 = new Cars ("White", "Toyota Camry", "RET6697");
        Cars rental6 = new Cars ("Gray", "Toyota Corrolla", "QAZ5521");
        Cars rental7 = new Cars ("Red", "Chevy Malibu", "RWE7415");
        
        //add cars to the stack
        carStack.push(rental1);
        carStack.push(rental2);
        carStack.push(rental3);
        carStack.push(rental4);
        carStack.push(rental5);
        carStack.push(rental6);
        carStack.push(rental7);
        
        // Creating an iterator to go through the car stack 
        Iterator iterator = carStack.iterator(); 
        
        // Displaying the cars available to rent
        System.out.println("The cars available for rental are: "); 
        while (iterator.hasNext()) 
        { 
            System.out.println(iterator.next()); 
        }
        
        //remove three cars from the stack
        
        //remove first car
        System.out.println("First car removed is: " +  carStack.pop()); 
        
        //remove second car
        System.out.println("Second car removed is: " +  carStack.pop()); 
        
        //remove third car
        System.out.println("Third car removed is: " +  carStack.pop());
        
        //add a new car that just got returned
        Cars rental8 = new Cars ("Silver", "Honda Civic", "BVC4555");
        carStack.push(rental8);

        //display available cars after three are rented
        System.out.println("Cars currently available for rental:  " + carStack); 
      
        }
       
        
    }
    

