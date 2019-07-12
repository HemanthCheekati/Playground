import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
     int n=in.nextInt();
      int m=in.nextInt();
     int k=n;
      for(int i=1;i<=n;i++)
      {
        m=n;
        for(int j=1;j<=n;j++)
        {
         if(j<=i)
           System.out.print(m);
                         m--;        
        }
        for(int j=1;j<=n;j++)
        {
          if(j<=n-i)
           System.out.print(k);
        }
        k--;
        System.out.println(" ");
      }
    }
}