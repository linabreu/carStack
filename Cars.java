/*
Lina Breunlin
Module 08 Lab
Part A

This is the class file for carstack. It has the informaiton needed to create car objects
 */
package carsstack;


public class Cars 
{
   //declare instance variables
    String color;
    String make;
    String licensePlate;
   
    /**sets the car color
    * @param carColor
    */   
    public void setColor (String carColor)
    {
        this.color = carColor;
    }

    /**set the car make
    * @param carMake
    */
    public void setMake (String carMake)
    {
        this.make = carMake;
    }
    
    /**sets license  plate
    * @param carPlate
    */   
    public void setlicensePlate (String carPlate)
    {
        this.licensePlate = carPlate;
    }
    
    /**
    gets current value of color
    @return color
    */
    public String getColor()
    {
        return this.color;
    }
    
    /**
    gets current value of make
    @return make
    */
    public String getMake()
    {
        return this.make;
    }
    
    /**
    gets current value of licensePlate
    @return licensePlate
    */
    public String getLicensePlate()
    {
        return this.licensePlate;
    }

    
    /**
       Overloaded constructor method
       @param carColor = color of the car
       @param carMake = make of the car
       @param carPlate = size of the shoe 
   **/
       public Cars (String carColor, String carMake, String carPlate)
    {
        this.color = carColor;  
        this.make = carMake;
        this.licensePlate = carPlate;
    }  
     
       
     //overrident toString() to return field data  
    @Override
    public String toString()
    {
        return color + " " + make + " " + licensePlate;
        
    }
    
 }  
    

    

