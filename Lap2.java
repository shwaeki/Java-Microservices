/*********************************************
                    Lab 2
*********************************************/

/*
1.	Create a new class that defines a random number with a value between 0-100.
    o	if the number is greater than 50 – print “Big!”
    o	if the number is less than 50 – print “Small!”
    o	if the number equals to 50 – print “Bingo!”
*/
class Test {
    int num = (int) (Math.random() * 101);

    public String checkNumber(int num){
        if(num > 50)
            return "Big!";
        else if(num == 50)
            return "Bingo!";
        else
            return "Small!"; 
    }   

    public String toString(){
        return  num + " is " + checkNumber(num);  
    }  
}

public class MainClass {
    public static void main(String args[]) {
        Test test = new Test();
        System.out.println(test);
    }
}

/*
2.	Create a new class that defines a random number with a value between 0-100.
    o	if the value is between 0-50 – print “Small!”
    o	else – print “Big!”
    o	in addition:
    ▪	if the value is even (can be divided by 2) – print “Even”
    ▪	else – print “Odd”
*/

class Test {
    int num = (int) (Math.random() * 101);

    public String checkNumber(int num){
        if(num >= 0 && num <=50)
            return "Small!";
        else
            return "Big!"; 
    }   

    public String checkNumber2(int num){
        if ( num % 2 == 0 )
            return "Even"; 
        else
            return "Odd"; 
    }   
    
    public String toString(){
        return  num + " is " + checkNumber(num) + " - " +  checkNumber2(num);  
    }  
}

public class MainClass {
    public static void main(String args[]) {
        Test test = new Test();
        System.out.println(test);
    }
}


/*
3.	Create a new class named “SalaryRaiser”
    o	define a random number named ‘salary’ with a value between 5000-6000.
    o	print the current salary
    o	Now, raise the salary:
    ▪	By 10% - only if the result is not greater than 6000 (which is the maximum salary allowed)
    ▪	By 5% - Otherwise.
    o	print the updated salary
*/
class SalaryRaiser {
    int salary =  (int) (Math.random() * (6000 - 5000) + 5000);
}

public class MainClass {
    public static void main(String args[]) {
        SalaryRaiser salaryRaiser = new SalaryRaiser();
        int salary =  salaryRaiser.salary;
        System.out.println("Salary is : " + salary);
        
        if((salary + (salary* 0.10 )) > 6000){
            System.out.println("New Salary is : " + (salary + (salary* 0.05 )));
        }else{
             System.out.println("New Salary is : " + (salary + (salary* 0.10 )));
        }
    }
}

/*
4.	Create a class that defines 3 random numbers and prints the bigger value
*/
class Bigger {
    int num1 = (int) (Math.random() * 100) + 1;
    int num2 = (int) (Math.random() * 100) + 1;
    int num3 = (int) (Math.random() * 100) + 1;

    public String toString(){
        int bigger = num1;
        if(num2 > bigger)
            bigger = num2;
        if(num3 > bigger)
            bigger = num3;  
            
        return "The Bigger value is : " +bigger;  
    }  
}

public class MainClass {
    public static void main(String args[]) {
        Bigger bigger = new Bigger();
        System.out.println(bigger);
    }
}


/*
5.	Create a class that defines 3 random numbers and prints the smaller value
*/
class Smaller  {
    int num1 = (int) (Math.random() * 100) + 1;
    int num2 = (int) (Math.random() * 100) + 1;
    int num3 = (int) (Math.random() * 100) + 1;

    public String toString(){
        int smaller = num1;
        if(num2 < smaller)
            smaller = num2;
        if(num3 < smaller)
            smaller = num3;  
            
        return "The Smaller value is : " +smaller;  
    }  
}

public class MainClass {
    public static void main(String args[]) {
        Smaller smaller = new Smaller();
        System.out.println(smaller);
    }
}

/*
6.	Create a class named “TaxCalculator”
    o	Salary taxes are calculated according to the following:
    ▪	0- 23,000 nis   tax rate is 10%
    ▪	23,000- 50,000 nis   tax rate is 20%
    ▪	50,000- 100,000 nis   tax rate is 30%
    ▪	100,000 - up nis   tax rate is 40%
        o	that takes a random salary of an employee (randomize a value to be used as an input)
        o	Print the salary before tax
        o	Print the tax calculation
        o	Print the salary after tax
*/
import java.util.Scanner;

class TaxCalculator  {
    int salary;;

    public double getTaxRate(){
        double rate = 0;
        if(salary < 23000)
            rate = 0.10;
        else if(salary > 23000 && salary < 50000)
          rate = 0.20;
        else if(salary > 50000 && salary < 100000)
          rate = 0.30;
        else if(salary > 100000)
          rate = 0.40;
          
        return rate;
    }
    
}

public class MainClass {
    public static void main(String args[]) {
        TaxCalculator taxCalculator = new TaxCalculator();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Salary ");
 
        int salary = scanner.nextInt();
        taxCalculator.salary = salary;
        double tax = taxCalculator.getTaxRate();
        System.out.println("Salay before tax : " + salary);
        System.out.println("Tax Rate : " + (tax*100) + "%");
        System.out.println("Salay after tax : " +  (salary+(salary*tax)));
    }
}


/*
8.	Create a class that randomizes a value to present a year (like 970, 1990, 2010 …) and prints the year and if it is leap year or not.
Leap year definition:
    o	divide by 4 AND not divide by 100
    o	divide by 400
*/
class LeapClass  {
    int year =  (int) (Math.random() * (2023 - 1000) + 1000);

    public boolean isLeapYear() {
      return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    
}

public class MainClass {
    public static void main(String args[]) {
        LeapClass leapClass = new LeapClass();
        String isLeap = leapClass.isLeapYear() ? "Leap year" : "not leap year";
        System.out.println(leapClass.year + " is " + isLeap);
    }
}
