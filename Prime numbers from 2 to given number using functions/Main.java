import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      for(i=2;i<=n;i++)
      {
        int c=0;
        for(j=2;j<=i;j++)
        {
        if(i%j==0)
          c++;
        }
        if(c==1)
          System.out.println(i);
      }
	}
}