import java.util.Scanner;
class Main{

	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=0,i;
      for(i=n;i>0;i--)
      {
       k=k+i;
       
      }
      System.out.println(k);
        
	}
}