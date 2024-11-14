package src;

import java.util.Scanner;

public class Main {
    public int fact=1;
    public int factorial(int n) {
        for (int i = n; i > 0; i--) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = Obj.nextInt();
        Main obj1 = new Main();
        int num =obj1.factorial(value);
        System.out.println("the value is "+num );

    }
}
