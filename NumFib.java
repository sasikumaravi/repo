package boardExe;

public class NumFib {
	public static void main(String[] args) {
	 int a=0;
	 int b=1;
	 int c=0;
	 for(int i=0;i<=10;i++)    
	 {    
	  c=a+b;    
	  System.out.println(c);    
	  a=b;    
	  b=c;    	 
	}
	 int x=144;
	 int y=89;
	 int z=0;
	 for(int i=10;i>=0;i--) {
		 z=x-y;
		 System.out.println(z);
		 x=y;
		 y=z;
	 }
}
}
