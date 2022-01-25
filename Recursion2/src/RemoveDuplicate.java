
public class RemoveDuplicate {
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return removeConsecutiveDuplicates(s.substring(1));
        }
        else{
            String ans=removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0)+ans;
        }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans=removeConsecutiveDuplicates("aaabbbcc");
		System.out.println(ans);

	}

}
