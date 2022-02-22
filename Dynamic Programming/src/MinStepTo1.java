
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
	
	public static int countMinStepsToOneMemo(int n,int dp[]) {
		if(n<=1) {
			return 0;
		}
		if(n==2||n==3) {
			return 1;
		}
		int ans1;
		if(dp[n-1]==-1) {
			ans1=countMinStepsToOneMemo(n-1, dp);
			dp[n-1]=ans1;
		}
		else {
			ans1=dp[n-1];
		}
		int ans2=Integer.MAX_VALUE;
		if(n%2==0) {
			if(dp[n/2]==-1) {
				ans2=countMinStepsToOneMemo(n/2, dp);
				dp[n/2]=ans2;
			}
			else {
				ans2=dp[n/2];
			}
		}
		int ans3=Integer.MAX_VALUE;
		if(n%3==0) {
			if(dp[n/3]==-1) {
				ans3=countMinStepsToOneMemo(n/3, dp);
				dp[n/3]=ans3;
			}
			else {
				ans3=dp[n/3];
			}
		}
		return Math.min(ans1, Math.min(ans2, ans3))+1;
	}
	
	// Using Iterative DP
	public static int countMinStepsToOneIte(int n) {
		if(n == 1){
	           return 0;
	       }
	    	
	        int dp[]= new int[n+1];
	        dp[0]=0;
	        dp[1]=0;
		for(int i=2;i<dp.length;i++) {
			int DividedByTwo=Integer.MAX_VALUE;
			int DividedByThree=Integer.MAX_VALUE;
			int ans1=dp[i-1];
			if(i%2==0) {
				DividedByTwo=dp[i/2];
			}
			else if(i%3==0) {
				DividedByThree=dp[i/3];
			}
			dp[i]=1+Math.min(ans1, Math.min(DividedByTwo, DividedByThree));	
		}
		return dp[n];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
//		int recursion=countMinStepsToOne(n);
//		System.out.println(recursion);
//		int dp[]= new int[n+1];
//		for(int i=0;i<dp.length;i++) {
//			dp[i]=-1;
//		}
//		int ans=countMinStepsToOneMemo(n, dp);
//		System.out.println(ans);
		int ans=countMinStepsToOneIte(n);
		System.out.println(ans);

	}

}
