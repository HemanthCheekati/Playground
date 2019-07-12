import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i=in.nextInt();
      int s=1,j;
      for(j=1;j<=i;j++)
      {
        s=s*n;
      }
      System.out.println(s);
    }
}