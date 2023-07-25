import java.util.*;
public class LargestNum {

    public static void main(String[] args) {

         Scanner sc=new Scanner (System.in);
         System.out.println("Enter the number1: ");
         int n1=sc.nextInt();
         System.out.println("Enter the number2: ");
         int n2=sc.nextInt();
         System.out.println("Enter the number3: ");
         int n3=sc.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
              