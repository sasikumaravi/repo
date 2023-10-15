package boardExe;

public class NumAvg {
	public static void main(String[] args) {
		int n1=89;
		int n2=97;
		int n3=96;
		int n4=98;
		int n5=100;
		int total=n1+n2+n3+n4+n5;
		int count =0;
		for(int i=0;i<5;i++) {
			count++;
		}
		System.out.println(total/count);
	}
}
