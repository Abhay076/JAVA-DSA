
public class ReplacePi {
	
	public static String replacePi(String str) {
		if(str.length()<=1) {
			return str;
		}
	   if(str.charAt(0)=='p'&&str.charAt(1)=='i') {
		   String smallOutput=replacePi(str.substring(2));
		   return "3.14"+smallOutput;
	   }
	   else {
		   String smallOutput=replacePi(str.substring(1));
		   return str.charAt(0)+smallOutput;
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans=replacePi("abcpi");
		System.out.println(ans);

	}

}
