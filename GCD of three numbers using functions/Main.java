import java.util.Scanner;
public class Main{
   public static int fun(int m,int n)
  {
    int c,i;
     if(m>n)
       c=n;
       else
         c=m;
     int k=0;
     for(i=2;i<=c;i++)
     {
       if((m%i==0)&&(n%i==0))
       {
         k=i;
       }
     }
     return k;
   }
	public static void main (String[] args)
	{
	     Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int d=in.nextInt();
      int x,y;
      x=fun(a,b);
      y=fun(x,d);
      System.out.println(y);
	}
}