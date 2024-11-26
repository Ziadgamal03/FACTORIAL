import java.util.Scanner;

public class main   {

        public static void main(String[] args) {
            Scanner Obj = new Scanner(System.in);
            System.out.println("Enter the number");
            int value = Obj.nextInt();
            factorial obj1 = new factorial();
            System.out.println(obj1.getFact(value));

    }
}

