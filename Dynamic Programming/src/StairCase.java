
public class StairCase {
	// this is using through recursion
	public static long stairCase(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(n==3) {
			return 4;
		}
		long x=stairCase(n-1);
		long y=stairCase(n-2);
		long z=stairCase(n-3);
		long ans=x+y+z;
		return ans;
	}
	
	//memoization
	public static long stairCaseMemo(int n, long dp[]) {
		if(n==0||n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else {
			long ans1;
			if(dp[n-1]==-1) {
				ans1=stairCaseMemo(n-1, dp);
				dp[n-1]=ans1;
			}else {
				ans1=dp[n-1];
			}
			long ans2;
			if(dp[n-2]==-1) {
				ans2=stairCaseMemo(n-2, dp);
				dp[n-2]=ans2;
			}
			else {
				ans2=dp[n-2];
			}
			long ans3;
			if(dp[n-3]==-1) {
				ans3=stairCaseMemo(n-3, dp);
				dp[n-3]=ans3;
			}
			else {
				ans3=dp[n-3];
			}
			long myAns=ans1+ans2+ans3;
			return myAns;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
//		long ans=stairCase(n);
		long dp[]= new long[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		long ansMemoization=stairCaseMemo(n, dp);
		System.out.println(ansMemoization);

	}

}
