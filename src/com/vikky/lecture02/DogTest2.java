/**
 * An example of showing that we didn't create a constructor in the Dog class... so Java created a default constructor for us... A way of of checking that is going to:
 *  - Tools
 *     - Generate Javadocs
 *  - Click on the class ( when the window pops up)
 *      - Construct
 *          - It should say public dog () which is the constructor that was created for the document
 */
package com.vikky.lecture02;

public class DogTest2 {
    public static void main(String[] args) {
         Dog d1 = new Dog();

         // TEST 1: if all the properties were commented out like this .... like d1.name, d1.breed..etc... it will still print out whatever is in the constructor and then it will assign the default values to the data types and still print out hte statement on line 21
       d1.name = "Bubbly";
        d1.breed = "Poodle";
        d1.color = "White";
        d1.age = 10;

      // TEST 2: calling one of the methods on d1 with the properties not assigned / commented out
        d1.eat(); // OUTPUT: null is eating
      // this is an example of why we would assign all the properties in the constructor (in dog.java file under Dog())
        System.out.println(d1.name + ": " + d1.breed + " : " + d1.color + " : " + d1.age);

      // TEST 3: creating a new dog object
      Dog d2 = new Dog();
      System.out.println(d2.name + ": " + d2.breed + " : " + d2.color + " : " + d2.age);
      d2.eat();

      // TEST 4: uncommenting out the lines 16 - 20 and adding the System.out.println for d2... it will print out this output:
        /*Inside the Dog() constructor
        Bubbly is eating
        Bubbly: Poodle : White : 10
        Inside the Dog() constructor
        Hunter: Bulldog : Brown : 5
        Hunter is eating*/

      // So it will print the statement in the constructor for each object that is initialized within the Dog class
      // Since there are specific properties for d1.. it will print out the d1 properties
      // Since d2 doesn't have anything specific... it will default to whatever is in the constructor

     // Test 5: Creating a constructor to accept other arguments
     Dog d3 = new Dog("Rusty", "Husky", 3, "black");
        System.out.println(d3.name + ": " + d3.breed + " : " + d3.color + " : " + d3.age);
        d3.wagTail();
     // OUTPUT: Rusty: Husky : black : 3
        //Rusty is wagging tail
     // since we didn't run through the default constructor with the set values and we ran through the constructor we created.. we were able to print out what was given on line 45-46...

    }
}
