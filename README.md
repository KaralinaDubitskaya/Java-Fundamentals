# Laboratory work №1. Introduction to Java

Web technologies (part #2), BSUIR 2018

#### General requirements for the code of tasks included in the laboratory work.
- Be sure to use the Java Code Convention.
- Do not place the code of the entire application in one method (even if the task seems to be
small and "there is nothing to write").
- Be sure to use the packages.
- Do not mix data-handling code and logic in the same class. Create different types of classes: classes, objects, store data, and classes which methods process the data. Place these classes in different packages.
- The requirement for JUnit-tests is mandatory.
- Name the variables, methods, class, and so on so that you can understand the purpose of the
element. 

#### Task 1. Solve the problem.
Calculate the value of the expression by the formula (all variables accept valid values). 
For unit testing of an application create JUnit tests.
![Formula](https://github.com/KaralinaDubitskaya/Java-Fundamentals/blob/master/screenshots/task1.JPG)

#### Task 2. Solve the problem.
For a given region compile a program that prints true, if a point with coordinates *(x, y)* belongs to the shaded area, and false otherwise. Create JUnit tests.
![Region](https://github.com/KaralinaDubitskaya/Java-Fundamentals/blob/master/screenshots/task2.JPG)

#### Task 3. Solve the problem.
Create a program to calculate the values of the function F(x) on the interval *[a, b]* with step *h*. Result should be presented as a table, the first column of which is the value of the argument, the second is corresponding function values. Create JUnit tests.
![Function](https://github.com/KaralinaDubitskaya/Java-Fundamentals/blob/master/screenshots/task3.JPG)

#### Task 4. Solve the problem.
An integer array of dimension N is given. Print the indexes of the prime elements. Create JUnit tests.

#### Task 5. Solve the problem.
An integer table *A[n]* is given. Find the smallest number of the elements you can throw out of the given sequence to get the increasing subsequence as long as possible. Create JUnit tests.

#### Task 6. Solve the problem.
The real numbers *a1, a2, ..., an* are given. Get the next square order matrix n. Create JUnit tests.
![Matrix](https://github.com/KaralinaDubitskaya/Java-Fundamentals/blob/master/screenshots/task6.JPG)

#### Task 7. Solve the problem.
*Shell sort.* An array of n real numbers is given. It is required to sort it by ascending order. This is done as follows: two neighboring elements *ai* and *ai + 1* are compared. If *ai <= ai + 1*, then move forward one element. If *ai > ai + 1*, then swap the elements and shift one element back. Create an algorithm for this sorting.

#### Task 8. Solve the problem.
Let two non-decreasing sequences of real numbers are given: *a1 <= a2 <= ... <= an* and *b1 <= b2 <= ... <= bm*. Specify the places on which to insert elements of the second sequence in the first sequence so that the new the sequence remained increasing.

#### Task 9. Solve the problem.
Create a class *Ball*. Create a class *Busket*. Fill the basket with balls. Determine weight of the balls in the basket and the number of blue balls. For unit testing of the application
create JUnit tests. 

#### Task 10. Create and run an application from the command line
Compile and run the application created when solving the task #9 from the command lines.

#### Task 11. Create a jar-file.
Create a jar-file and run the application created when solving the task #9.

#### Task 12. Override the equals (), hashCode () and toString () methods
Without using code autogeneration tools, override the *equals()*, *hashCode()* and *toString()* methods for the *Book* class.
```
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;
}
```
#### Task 13. Override methods equals (), hashCode () and toString ()
Not using code autogeneration override for the *ProgrammerBook* class methods *equals()*, *hashCode()* and *toString()*.
```
public class ProgrammerBook extends Book {
    private String language;
    private int level;
}
```
#### Task 14. Override the clone() method
Not using code autogeneration override for the *Book* class from the task #12 *clone()* method.

#### Task 15. Implement the Comparable interface
Add the ISBN field to the *Book* class from the task #12. Implement the *Comparable* interface in the *Book* class so that books acquire the default sorting according to the ISBN number. Write JUnit tests.

#### Task 16. Implement the Comparator interface
Implement comparators for the *Book* class from the task #12, which allow sorting books by name; by title, and then by author; by author, and then by name; by author, title and price. Write JUnit tests that validate sorts.

#### 💬 Contact
Karalina Dubitskaya                           
dubitskaya.karalina@gmail.com
