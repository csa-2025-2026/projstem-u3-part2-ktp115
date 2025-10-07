import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    //prob 1
    double target1 = 12.345;
    System.out.println("Enter a double: ");
    double input = scan.nextDouble();
    
    if(input == target1)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }

    //prob 2
    int target2 = 48;
    System.out.println("Enter an int: ");
    int input2 = scan.nextInt();
    
    if(input2 == target2)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }

    //prob 3
    System.out.println("Enter two int: ");
    int input3 = scan.nextInt();
    int input4 = scan.nextInt();
    
    if(input4 == (input3*2))
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }

    System.out.println("Enter an int: ");
    int input5 = scan.nextInt();

    if((input5 % 2) == 0)
    {
      System.out.println("Divisible by 2");
    }
    
    if((input5 % 3 == 0))
    {
      System.out.println("Divisble by 3");
    }

    //prob 5
    System.out.println("Enter an int: ");
    int input6 = scan.nextInt();

    if((input6 % 2) ==0)
    {
      System.out.println("Even");
    }
    else
    {
      System.out.println("Odd");
    }

    //prob 6

    



    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
