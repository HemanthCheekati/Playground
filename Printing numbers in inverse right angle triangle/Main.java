import java.util.Scanner;
class Main{
	public static void main (String[] args){
	       Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
       int x=n;
        for(j=1;j<i;j++)
        {
          x--;
        }
        for(k=1;k<=n-i+1;k++)
        {
          System.out.print(x);
          x--;
        }
        System.out.print("\n");
      }
	}
}
	
