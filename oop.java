class Arithmatic
{
    public int NO1;
    public int NO2;
}

public Arithmatic()
{
    this.NO1=0
    this.NO2=0
}

public Arithmatic(inti, intj)
{
    this.NO1=i
    this.No2=j
}


class oop
{
    public static void main (String Arg[])
    {
    System.out.pintln("Inside main function");

    Arithmatic obj1 = new Arithmatic();
    Arithmatic obj2 = new Arithmatic(11,10);
     int iRet = 0;

     iRet = obj1.Addtion();
     System.out.println("Addition is:" +iRet);

     iRet = obj1.Substraction();
     System.out.println("Substraction is:" +iRet);

     iRet = obj2.Addition();
     System.out.println("Addition is:" +iRet);

     iRet = obj2.Substraction();
     System.out.println("Substraction is:" +iRet);







    }

}