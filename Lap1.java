/*********************************************
                    Lab 1
*********************************************/

/*
1.	Create a class named Printer
    o	Define the following variables & initialize each with the specified values:
        ▪	part1 – “There will be”
        ▪	visitors – 5
        ▪	part2 – “people for dinner.”
    o	Print the complete message: “There will be 5 people for dinner”
*/
class Printer {
    String part1 = "There will be";
    int visitors = 5;
    String part2 = "people for dinner.";
    
    public String toString(){
        return part1 + " " + visitors + " " + part2;  
    }  
}

public class MainClass {
    public static void main(String args[]) {
        Printer printer = new Printer();
        System.out.println(printer);
        printer.visitors += 2;
        System.out.println(printer);
    }
}


/*
3.	Create a class named Test
    o	Defines 2 random numbers: a, b
    o	print to console:
        ▪	each number
        ▪	the sum of the numbers
        ▪	the average value
        ▪	the remainder when dividing each in 10
        ▪	the area of a rectangle where one number is the width and the other is the height
*/
class Test {
    int num1 = (int) (Math.random() * 100) + 1;
    int num2 = (int) (Math.random() * 100) + 1;

    public int sum(){
        return num1 + num2;  
    }  
    
    public float avg(){
        return sum() /2;  
    }
}

public class MainClass {
    public static void main(String args[]) {
        Test test = new Test();
        System.out.println("Number One is : "+ test.num1);
        System.out.println("Number Two is : "+ test.num2);

        System.out.println("Sum of the numbers : "+ test.sum());
        System.out.println("Average of the numbers : "+ test.avg());
        System.out.println("Number One remainder when dividing in 10 : " + test.num1%10);
        System.out.println("Number Two remainder when dividing in 10 : " + test.num2%10);
        System.out.println("The area of a rectangle  : " + test.num1 * test.num2); 
        //length=num1 ; width=num2
    }
}


/*
4.	Create a class named Test
    o	Define a random number between 100 to 350 for time in minutes of a movie
    o	Print the time in minutes
    o	Print the time in terms of Hours and Minutes
*/
class Test {
     int time =  (int) (Math.random() * (350 - 100)) + 100);

    public String getTime(){
        int hours = time / 60; 
        int minutes = time % 60;
        return hours + ":" + minutes;  
    }  
    
}

public class MainClass {
    public static void main(String args[]) {
        Test test = new Test();
        System.out.println("Time in minutes : "+ test.time);
        System.out.println("Time in terms of Hours and Minutes : "+ test.getTime());
    }
}


//5.	Create a class that defines 2 random numbers and prints the bigger value
class Bigger {
    int num1 = (int) (Math.random() * 100) + 1;
    int num2 = (int) (Math.random() * 100) + 1;

    public String toString(){
        int bigger = num1 > num2 ? num1 : num2;
        return "The Bigger value is : " +bigger;  
    }  
}

public class MainClass {
    public static void main(String args[]) {
        Bigger bigger = new Bigger();
        System.out.println(bigger);
    }
}

