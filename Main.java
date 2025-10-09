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
    String a = "A";
    String b = "B";
    String c = "C";
    String d = "D";
    String f = "F";

    System.out.println("Enter a letter grade: ");
    String input7 = scan.next();
    if(input7.equals(a))
    {
      System.out.println("90-100");
    }
    else if(input7.equals(b))
    {
      System.out.println("80-90");
    }
    else if(input7.equals(c))
    {
      System.out.println("70-80");
    }
    else if(input7.equals(d))
    {
      System.out.println("60-70");
    }
    else if(input7.equals(f))
    {
      System.out.println("0-60");
    }
    else
    {
      System.out.println("Invalid letter grade");
    }
    
    //prob 7

    int firstNum = (int) (Math.random() * 51);
    int secondNum = (int) ((Math.random() * 51)+51);
    System.out.println(firstNum + " + " + secondNum + " = ?");
    int input8 = scan.nextInt();

    if (input8 == firstNum+secondNum)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Wrong!");
    }

    //prob 8

    System.out.println("What is the temperature?");
    int input9 = scan.nextInt();

    if (input9 <= 99 && input9 >= 97)
    {
      System.out.println("Temperature is OK");
    }
    else
    {
      System.out.println("NOT NORMAL");
    }



    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
