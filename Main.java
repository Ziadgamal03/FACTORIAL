package src;



import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = obj.nextInt();
        int fact=1;
       for (int i =num; i > 0; i--) {
           fact=fact*i;
       }
       System.out.println(" FACTORIAL IS EQUAL"+fact);


    }










    }
