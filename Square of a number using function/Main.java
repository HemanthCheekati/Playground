import java.util.Scanner;
class Main
{
  public static int mul(int m)
  {
    int k=m*m;
    return k;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int l;
      l=mul(n);
      System.out.println(l);
	} 
}