
public class ReplaceChar {
	public static String replace(String str,char a,char b) {
		if(str.length()==0) {
			return str;
		}
		String smallOutput=replace(str.substring(1), a, b);
		if(str.charAt(0)==a) {
			return b+smallOutput;
		}
		else {
			return str.charAt(0)+smallOutput;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String ans=replace("abxcxcx", 'x', 'y');
	  System.out.println(ans);

	}

}
