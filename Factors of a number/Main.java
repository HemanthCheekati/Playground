import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner m=new Scanner (System.in);
      int n=m.nextInt();
      int i,k=1;
      for(i=1;i<=n;i++)
      {
        if(n%i==0)
        System.out.println(i);
      }
	}
}