import java.util.*;

class Input
{
    public static void main(String Arg[]);
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : "); 
        int iNO1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int iNO2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNO1+iNO2;
        System.out.println("Addtion is : " +iAns);

        sobj.close();
    }
}