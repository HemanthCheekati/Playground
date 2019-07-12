import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
     int base=in.nextInt();
      int ex=in.nextInt();
      int n=base;
      for(int i=ex;i>1;i--)
      {
        
        base=base*n;
      }
      System.out.println(base);

    }
}