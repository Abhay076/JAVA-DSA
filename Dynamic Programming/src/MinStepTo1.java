
public class MinStepTo1 {
	
	//Recursion
	public static int countMinStepsToOne(int n) {
		if(n<=1) {
			return 0;
		}
		else if(n==2||n==3) {
			return 1;
		}
		int Output1=countMinStepsToOne(n-1);
	    int Output2=Integer.MAX_VALUE;
	    int Output3=Integer.MAX_VALUE;
	    if(n%2==0) {
	    	Output1=countMinStepsToOne(n/2);
	    }
	    else if(n%3==0) {
	    	Output3=countMinStepsToOne(n/3);
	    }
	    return Math.min(Output1, Math.min(Output2, Output3))+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int recursion=countMinStepsToOne(n);
		System.out.println(recursion);

	}

}
