import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner A=new Scanner(System.in);
      int n=A.nextInt();
      int t=n;
      int r,s=0;
      while(n>0)
      {
        r=n%10;
        n=n/10;
        s=r;
      }
      t=t%10;
     int k=t+s;
      System.out.println(k);
	}
}