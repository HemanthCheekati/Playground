import java.util.Scanner;
class Main{
	public static void main (String[] args){
	      Scanner m=new Scanner (System.in);
      int n=m.nextInt();
      int i,k=0;
      for(i=1;i<=n;i++)
      {
        k+=i;
      }
        System.out.println(k);
	}
}