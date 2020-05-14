# carStack
Uses a stack data structure to store cars for rent

How It Works:

A fictitious rental car compant offers discount car rentals near the airport. The owner runs a small operation and has only a small strip of land for parking the cars when not in use, and they are all stored in a single lane. As a new car is parked at the back, all cars already in place are blocked and cannot be retrieved.

This program contains a simple car class, with fields for color, make, and license plate number and the appropriate get and set methods as well as an overridden toString() that returns the field data.

The CarsStack puts cars into a stack and output a list of the cars in the order they can be retrieved (without removing any). 

For the purpose of this program three customers come in at once, and three cars are removed from the stack, with the program outputting which cars have been retrieved. 

One new car that gets returned is added. The program outputs a current list of the remaining cars in the order they can be retrieved.
