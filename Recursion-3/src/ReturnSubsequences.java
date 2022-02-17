import java.util.Scanner;

public class ReturnSubsequences {
	
	public static String[] returnsebsequences(String str) {
		if(str.length()==0) {
			String output[]= new String[1];
			output[0]="";
			return output;
		}
		String smallOutput[]=returnsebsequences(str.substring(1));
	    String output[]= new String[smallOutput.length*2];
	    for(int i=0;i<smallOutput.length;i++) {
	    	output[i]=smallOutput[i];
	    }
	    for(int i=0;i<smallOutput.length;i++) {
	    	output[smallOutput.length+i]=str.charAt(0)+smallOutput[i];
	    }
	    return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.next();
		String ans[]=returnsebsequences(input);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+" ");
		}

	}

}
