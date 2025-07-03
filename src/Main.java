import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        ----------(Question One)-----------
        Write a Java program that accept three numbers from the user and print the largest number .
        ----------(Solution)---------------
        System.out.println("Enter number one here : ");
        int num1 = in.nextInt() ;
        System.out.println("Enter number Two here : ");
        int num2 = in.nextInt() ;
        System.out.println("Enter number Three here : ");
        int num3 = in.nextInt() ;
        if(num1 > num2){
            System.out.println(Math.max(num1,num3));
        }else{
            System.out.println(Math.max(num2,num3));
        }
         */

        /*
        ----------(Question Two)-----------
        Write a Java program that accept a String and a number from the user,then print the character in the given index .
        ----------(Solution)---------------
        System.out.println("Enter a string here :");
        String s = in.nextLine();
        System.out.println("Enter an index to take it's char from the String :");
        int index = in.nextInt();
        System.out.println(s.charAt(index));
         */


        /*
        ----------(Question Three)-----------
        Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
        ----------(Solution)---------------
        //if the user enter (111) the program will end .

        System.out.println("enter the number, to end the program enter (111), the program will sum the entered numbers");
        int userSelection = in.nextInt();
        int sum = 0 ;
        while(userSelection != 111){
            sum += userSelection;
            System.out.println("enter the number, to end the program enter (111)");
            userSelection = in.nextInt();
        }
        System.out.println("the sum of the Entered numbers = "+sum);
         */

        /*
        ----------(Question Four)-----------
        Write a Java program to find positive and negative numbers of a given array
        ----------(Solution)---------------
        //the Zero case is ignored according to the instructor ( Majd )call
        int []numbers = {10, -21 , 30, 31, -25};
        for(int number : numbers){
            System.out.println((number > 0)? number+" is a positive number ":number+" is a negative number ");

        }
         */


        /*
        ----------(Question Five)-----------
        Write a Java program to find a shortest word of a given array
        ----------(Solution)---------------
        String []words = {"Tuwaiq", "Bootcamp" , "Student","JAVA"};
        int max = words[0].length() ;
        String shortestWord = "" ;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() < max){
                max = words[i].length();
                shortestWord = words[i];
            }
        }
        System.out.println(shortestWord);
         */

    }
}