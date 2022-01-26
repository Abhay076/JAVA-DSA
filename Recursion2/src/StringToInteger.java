
public class StringToInteger {
	public static int convertStringToInt(String input){
		// Write your code here
             if(input.length()==0){
                 return 0;
             }
        int smallAns = convertStringToInt(input.substring(1));
        return (input.charAt(0) - '0' )*(int) Math.pow(10,input.length() -1) + smallAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertStringToInt("1234"));

	}

}
