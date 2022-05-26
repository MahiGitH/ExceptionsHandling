package ValidatingParameters;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        //Person
        Person person = new Person("Joe", 79);
        System.out.println(person);

        Person person3 = new Person("", 79); // IllegalArgumentException, name = null
        Person person2 = new Person("John", 130);// IllegalArgumentException, age > 120

        // Calculator

        Calculator calculator = new Calculator();

        System.out.println(calculator.factorial(-10));// IllegalArgumentException, num<0 | negative num.
        System.out.println(calculator.binomialCoefficient(5, 4));
    }
}
