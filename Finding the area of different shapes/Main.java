import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
               Scanner in= new Scanner(System.in);
      
     int h=in.nextInt();
      switch(h)
      {
        case 1: 
          int m=in.nextInt();
          System.out.println(m*m); 
          break;
        case 2:
     int e=in.nextInt();
      int d=in.nextInt();
 		System.out.println(d*e);
          break;
        case 3:
           int c=in.nextInt();
      int b=in.nextInt();
 		System.out.println(0.5*b*c);
          break;
        case 4:
           
      int a=in.nextInt();
          System.out.println(3.14*a*a);
          break;
      }
    }
}