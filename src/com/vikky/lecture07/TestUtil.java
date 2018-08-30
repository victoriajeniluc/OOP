/**
 * Example for how methods are ran during runtime - refer to the picture lecture8Methods5.png
 *
 * @author Udayan Khattry
 */

package com.vikky.lecture07;

// 1. In the heap, it will load the TestUtil template on the top of the heap. It has an area to store anything static.
// 2. Then invokes the main method in top of the stack - has its own area. Main method has a parameter of a string argument... but we didn't pass anything in the command line argument hence an empty string object is created in the heap.
// 3. Every object has a length property ... and in this case, it is a zero value
// 4. variable args is created in the stack area and it references to the string object in note#3
// 5. Then java starts to execute everything inside of the main method...

public class TestUtil {
    public static void main(String[] args) {
        // 6. It creates a variable called i1 and assigns 100 to it.
        int i1 = 100;

        // 7. The system prints out the statement before increment and i1 which is 100 (comment below)
        System.out.println("Value of i1 before increment: " + i1); // 100

        // 8. Util is another class.. so it knows to put another template on top of the heap (next to the TestUtil). This class also has it associated static area. Then on top of the stack, increment has a created area. Increment has a parameter of x, which creates a variable in the stack called x. During invocation, we use i1 which copies the contents of i1 to x - which is 100. Java executes the statement in increment which is x + 1. Then 101 replaces the 100 in x (in the stack). THIS POPS OFF OF THE STACK AFTER IT IS EXECUTED.
        Util.increment(i1);

        // 9. The changes made to the variable x is lost from note#8 so ... The system prints out the statement after increment and i1 which is still 100 in the main (comment below)
        System.out.println("Value of i1 after increment: " + i1); // 100

        // 10. This is executed next... and the statement on the right is executed first, but before it creates a point object in the space.. it loads the template of the point class. Then the point object is created in the heap space. Inside this object, Java runtime assigns all the properties of this object... there are two properties which is x and y. Java runtime also assigns the default values to all the properties, so x is 0 and y is 0.
        // 11. The new Point invokes the parameterized constructor so the parametrized constructor goes on the top of the stack. It has two parameter variables which are x1 and y1. It copies the values 10 and 20 to its respective parameter variables: x1 - 10, y1 - 20. This constructor also has a variable of this which refers to the current point object.
        // 12. It copies the value of x1 to x and y1 to y. So the point object should have values of x and y as 10 and 20. AFTER IT IS DONE BEING EXECUTED, IT POPS OFF OF THE STACK. Variables x1 and y1 are gone and the link to the object is gone too.
        // 13. After the right side gets evaluated, the left gets evaluated... so the variable point in the stack references to the point object in the heap.
        Point point = new Point(10,20);

        //14. The system executes the statement point before increment to the console.
        System.out.println("Point before increment: ");

        // 15. After line 36, the printPoint is invoked on the point object It pushes the printPoint method on top of the stack. Since printPoint is an instance method, it has access to the implicit this (which is referring to the current Point object) and references to the current point object
        // 16. This method accesses the instance variables x and y to print out the statement in printPoint. Once the method is executed... IT POPS OFF OF THE STACK. Link is gone from the point object and the printPoint method
        point.printPoint(); // Point: (10, 20)

        // 17. Since Util's template is uploaded already on the heap, it pushes the incrementXY on top of the stack. It has a parameter of Point type named pt. It references to the point object. It executes the statement inside, so x becomes 11 and y becomes 21. THIS POPS OFF THE STACK ONCE IT IS COMPLETED.. the link is gone between the incrementXY and the point object. Control goes back to the main method(everytime something pops off of the stack)
        Util.incrementXY(point);

        //18. This get printed on the console
        System.out.println("Point after increment: ");

        // 19. Since the Point template is uploaded already o nthe heap, it pushes the printPoint method onto the stack and references to the current point object. It has a implict this.. and it is able to access the properties of the Point Object.Once this is completed, IT POPS OFF OF THE STACK and the link is gone between the printPoint method and the point object.
        point.printPoint(); // Point: (11,21)

        // 20. Once there is no other things to execute, the main method pops off of the stack. Heap and the Stack are gone, and the program ends

        // NOTE: FIRST CALL - INCREMENT AND SECOND CALL - INCREMENTXY
        // INCREMENT METHOD: ACCEPTS PRIMITIVE PARAMETER - DURING INVOCATION, THERE WAS A VARIABLE TYPE THAT WAS PASSED WHICH IS i1... so 100 was copied to x --> KNOWN AS PASS BY VALUE.
            // VALUE OF X IS DIFFERENT i1... so the changes to variable x is not reflected to the variable i1
        // INCREMENTXY METHOD: ACCEPTS A REFERENCE TYPE PARAMETER DURING INVOCATION OF THE POINT TYPE VARIABLE WAS PASSED.. SO THE VALUE OF POINT OBJECT WAS COPIED TO PT WHICH RESULT POINT AND PT TO REFERENCE TO THE SAME OBJECT THIS TIME. - CHANGES MADE IN PT'S PROPERTIES ARE REFLECTED IN THE POINTS PROPERTIES AS WELL! -- KNOWN AS PASS BY REFERENCE

        // NOTE: PRIMITIVES ARE PASSED BY VALUES AND OBJECTS ARE PASSED BY REFERENCE
    }
}
