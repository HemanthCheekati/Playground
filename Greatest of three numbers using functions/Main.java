import java.util.Scanner;
class Main{
  public static int fun(int m,int n)
  {
    int c;
    if(m>n)
    {
    c=m;
      return c;
    }
    else
    {
      c=n;
    return c;
    }
  }
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int d=in.nextInt();
      int k,i;
      k=fun(a,b);
      i=fun(k,d);
      System.out.println(i);
    }
}