/*********************************************
                    Lab 3
*********************************************/

/*
1.	Print 10 times without any Loop: “Hello World”
*/
class HelloWorld{
    public static void main(String []args){
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
    }
}

/*
2.	Now print 10 times “Hello World” Using:
o	for loop
▪	Incremental loop
▪	Decremental Loop
o	While loop
▪	Incremental loop
▪	Decremental Loop
*/
class HelloWorld{
    public static void main(String []args){
        System.out.println("For loop Incremental");
        for(int i=1;i<=10;i++){
            System.out.println(i+" - Hello, World");
        }
        
        System.out.println("For loop decremental");
        for(int i=10;i>=0;i--){
            System.out.println(i+" - Hello, World");
        }
        
        System.out.println("While loop Incremental");
        int i=1;
        while(i<=10){
            System.out.println(i+" - Hello, World");
            i++;
        }
       
       System.out.println("While loop decremental");
        int x=10;
        while(x>0){
            System.out.println(x+" - Hello, World");
            x--;
        }
    }
}

/*
3.	Create a class that defines a random number and prints all numbers
from 1 to that number
*/
class RandomNumberloop{
    int num = (int) (Math.random() * 101);

    public void print(){
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}


class MainClass {
    public static void main(String[] args) {
        RandomNumberloop loop = new RandomNumberloop();
        loop.print();
    }
}

/*
4.	Create a class that defines two random values and prints all values between them. note - which variable holds the higher value is not known.
*/
class RandomNumberloop{
    int num1 = (int) (Math.random() * 101);
    int num2 = (int) (Math.random() * 101);

    public void print(){
        if(num1 > num2){
            for(int i=num2;i<=num1;i++)
                System.out.println(i);
        }else{
            for(int i=num1;i<=num2;i++)
                System.out.println(i);
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        RandomNumberloop loop = new RandomNumberloop();
        loop.print();
    }
}


/*
5.	Create a class that defines a random number and prints all even numbers from 0 to that number
*/


class RandomNumberloop{
    int num = (int) (Math.random() * 101);

    public void print(){
        for(int i=0;i<=num;i+=2){
            System.out.println(i);
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        RandomNumberloop loop = new RandomNumberloop();
        loop.print();
    }
}


/*
6.	Create a class that defines two random values ‘max’ and ‘den’ and prints all the numbers from 0 to ‘max’ that can be divided with ‘den’
*/
class RandomNumberloop{
    int max = (int) (Math.random() * 101);
    int den = (int) (Math.random() * 11);

    public void print(){
        System.out.println("Max number = "+max);
        System.out.println("Den number = "+den);
        for(int i=0;i<=max;i+=den){
            System.out.println(i);
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        RandomNumberloop loop = new RandomNumberloop();
        loop.print();
    }
    
    
    
/*
7.	Create a class that defines a random number between 1-7.
o	print the number
o	prints the factorial value [4  1 X 2 X 3 X 4]
*/

class FactorialValue {
    int num =  (int) (Math.random() * (7 - 1) + 1);
    
    public int getValue(){
        int value = 1;
        for (int i = 1; i <= num; i++)
            value *= i;
        return value;
    }
    
    public  void print(){
        System.out.println("Number = "+num);
        System.out.println("Factorial Value "+getValue());
    }
}

class MainClass {
    public static void main(String[] args) {
        FactorialValue factorial = new FactorialValue ();
        factorial.print();
    }
}



/*
8.	Regarding the factorial exercise print the factorial using:
o	for loop
▪	Incremental loop
▪	Decremental Loop
o	While loop
▪	Incremental loop
▪	Decremental Loop
*/
class FactorialValue {
    int num =  (int) (Math.random() * (7 - 1) + 1);
    
    public int factorialForIncremental(){
        int value = 1;
        for (int i = 1; i <= num; i++)
            value *= i;
        return value;
    }
   
    public int factorialForDecremental(){
        int value = 1;
        for (int i = num; i > 0; i--)
            value *= i;
        return value;
    }
    
    public int factorialWhileIncremental(){
        int value = 1;
        int i = 1;
        while ( i <= num){
            value *= i;
            i++;
        }
        return value;
    }
    
    public int factorialWhileDecremental(){
        int value = 1;
        int i = num;
        while ( i > 0){
            value *= i;
            i--;
        }
        return value;
    }
    
    public  void print(){
        System.out.println("Number = "+num);
        System.out.println("Factorial For Incremental "+factorialForIncremental());
        System.out.println("Factorial For Decremental "+factorialForDecremental());
        System.out.println("Factorial While Decremental "+factorialWhileIncremental());
        System.out.println("Factorial While Decremental "+factorialWhileDecremental());
    }
}

class MainClass {
    public static void main(String[] args) {
        FactorialValue factorial = new FactorialValue ();
        factorial.print();
    }
}



/*
9.	Create a class that defines a random number with value between 0-10000 and print the length of digits: [1998    4]
*/
class FactorialValue {
    int num =  (int) (Math.random() * 10001);
    
    public int digitsLength (){
        int length = 0;
        while (num != 0) {
          num /= 10;
          length++;
        }
        return length;
    }

    public  void print(){
        System.out.println("Number = "+num);
        System.out.println("Length "+digitsLength());
    }
}

class MainClass {
    public static void main(String[] args) {
        FactorialValue factorial = new FactorialValue ();
        factorial.print();
    }
}

/*
10.	Create a class that defines a random number with value between 0-10000 and print the right digit: [1998    8]
*/
class LastDigit{
    int num =  (int) (Math.random() * 10001);
    
    public int getLastDigit(){
        return num%10;
    }

    public  void print(){
        System.out.println("Number = "+num);
        System.out.println("Last Digit "+getLastDigit());
    }
}

class MainClass {
    public static void main(String[] args) {
        LastDigit lastDigit = new LastDigit();
        lastDigit.print();
    }
}

/*
11.	Create a class that defines a random number with value between 0-10000 and print the left digit: [1998    1]
*/
class FirstDigit{
    int num =  (int) (Math.random() * 10001);
    
    public int geFirstDigit(){
        while (num >= 10) 
            num /= 10;
        return num;
    }

    public  void print(){
        System.out.println("Number = "+num);
        System.out.println("First Digit "+geFirstDigit());
    }
}

class MainClass {
    public static void main(String[] args) {
        FirstDigit firstDigit = new FirstDigit();
        firstDigit.print();
    }
}
/*
12.	Create a class that defines a random number with value between 0-10000 and print the opposite order of the number’s digits: [1998    8991]
*/
class ReverseDigits{
    int num =  (int) (Math.random() * 10001);
    
    public int geReverseDigits(){
        int reverse = 0;  
        while(num != 0)   {  
            int remainder = num % 10;  
            reverse = reverse * 10 + remainder;  
            num = num/10;  
        }
        return reverse;
    }

    public  void print(){
        System.out.println("Number = "+num);
        System.out.println("Reverse Digits "+geReverseDigits());
    }
}

class MainClass {
    public static void main(String[] args) {
        ReverseDigits reverseDigits = new ReverseDigits();
        reverseDigits.print();
    }
}



/*
13.	Create a class that defines a random number with value between 0-10000 and print the following details with clear messages:
o	number of digits [4867    4]
o	the first left digit [ 6843    6]
o	sum of the number’s digits [ 473  14]
o	opposite order of the number’s digits [5892  2985]
*/
class DigitsOperations{
    int num =  (int) (Math.random() * 10001);
    
    public int geFirstDigit(){
        int number = num;
        while (number >= 10) 
            number /= 10;
        return number;
    }
    
    public int getLastDigit(){
        int number = num;
        return number%10;
    }

    public int digitsLength (){
        int number = num;
        int length = 0;
        while (number != 0) {
          number /= 10;
          length++;
        }
        return length;
    }


    public int geReverseDigits(){
        int reverse = 0; 
        int number = num;
        while(number != 0)   {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }
        return reverse;
    }
    
    public int getSumDigits(){
        int sum = 0; 
        int number = num;
        while(number != 0)   {  
            sum += number % 10;  
            number = number/10;  
        }
        return sum;
    }
    
    public  void print(){
        System.out.println("Number = "+num);
        System.out.println("Length "+digitsLength());
        System.out.println("First Digit "+geFirstDigit());
        System.out.println("Sum Digits "+getSumDigits());
        System.out.println("Reverse Digits "+geReverseDigits());
    }
}

class MainClass {
    public static void main(String[] args) {
        DigitsOperations digitsOperations = new DigitsOperations();
        digitsOperations.print();
    }
}



/*
14.	Create a class that defines a random value between 0-100,000 and prints if it is a palindrome (a symmetric number like: 12321, 666, 47974, 404 …)
*/
class Palindrome{
    int num =  (int) (Math.random() * 100001);
    
    public boolean checkPalindromeValue(){
        int r;
        int sum=0;    
        int temp=num;    
        
        while(num>0){    
            r=num%10;
            sum=(sum*10)+r;    
            num=num/10;    
        }    
        return temp==sum;
    }

    public  void print(){
        System.out.println("Number = "+num);
        System.out.println(checkPalindromeValue());
    }
}

public class MainClass {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.print();
    }
}



