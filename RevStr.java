package boardExe;

public class RevStr {
	public static void main(String[] args) {
		String sk="System";
		String s="";
		for(int i=sk.length()-1;i>=0;i--) {
			s=s+sk.charAt(i);
		}
		System.out.println(s);
	}
}
