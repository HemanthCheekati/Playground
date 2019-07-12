import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner A=new Scanner(System.in);
      int n=A.nextInt();
      int m=n,s=0,k=0,r;
        while(n>0)
        {
          n=n/10;
          s++;
        }
      s=s-1;
      while(m>0)
      {
        r=m%10;
        k++;
        if(k==s)
          System.out.println(r);
         m=m/10; 
        
      }
	}
}