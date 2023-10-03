# Sprint1_T7_Annotations
Annotations &amp; Reflection

Level 1

- Exercise 1

Create a hierarchy of objects with three classes: Worker, Online Worker and On-site Worker.

The Worker class has the attributes first name, last name, price/hour, and the calculateSou() method which receives as a parameter the number of hours worked and multiplies it by the price/hour. Child classes must override it, using @Override.

From the main() of the Main class, make the necessary invocations to demonstrate the operation of the @Override annotation.

In the case of face-to-face workers, the method to calculate their salary will receive as a parameter the number of hours worked per month. When calculating the salary, the number of hours worked will be multiplied by the price/hour, plus the value of a static attribute called petrol that we will add in this class.

For online workers, the method to calculate their salary will receive to parameter the number of hours worked per month. When calculating the salary, the number of hours worked will be multiplied by the price/hour and the price of the flat Internet rate will be added, which will be a constant of the Online Worker class.


- Exercise 2

Add to the child classes some obsolete (deprecated) methods, and use the corresponding annotation. It invokes the obsolete methods from an external class, suppressing through the corresponding annotation the "warnings" for being obsolete.


Level 2

- Exercise 1

Create a custom annotation that should allow you to serialize a Java object into a JSON file. The annotation must receive the directory where the resulting file will be placed.


Level 3

- Exercise 1

Adds the possibility that the annotation created in the previous level is recorded by the Virtual Machine at runtime. Demonstrates that annotation reading is performed using Java Reflection.


Tutorials:

https://docs.oracle.com/javase/tutorial/java/annotations/index.html

https://docs.oracle.com/javase/tutorial/reflect/index.html
