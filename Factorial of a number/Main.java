import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner A=new Scanner (System.in);
      int n=A.nextInt();
      int f=1;
      while(n>0)
      {
        f=f*n;
             
        n--;
      }
      System.out.println(f);
	}
}