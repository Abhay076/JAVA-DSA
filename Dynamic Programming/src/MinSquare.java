
public class MinSquare {
	public static int minSquar(int n) {
		if(n==0) {
			return 0;
		}
		int MinAns = Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int currAns=minSquar(n-(i*i));
			if(MinAns>currAns) {
				MinAns=currAns;
			}
		}
		int myAns=1+MinAns;
		return myAns; 
		
	}
	//memoization
	public static int minCountHelper(int n, int[] dp)
    {
        if (n==0) {
            return 0;
        }
        int minVal = Integer.MAX_VALUE;
        for (int i=1;i*i<=n;i++)
        {
            if (dp[n-(i*i)]==-1)
                dp[n-(i*i)]=minCountHelper(n-(i*i),dp);
            int currVal = dp[n-(i*i)];
            if (currVal<minVal)
                minVal=currVal;
        }
        
        return minVal+1;
	}
	
	public static int minSquareI(int n) {
		int dp[]= new int[n+1];
		dp[0]=0;
		for(int i=1;i<=n;i++) {
			int minAns=Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++) {
				int currAns=dp[i-(j*j)];
				if(minAns>currAns) {
					minAns=currAns;
				}
				
			}
			dp[i]=1+minAns;
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=41;
//		int ans=minSquar(n);
//		System.out.println(ans);
//		int dp[]= new int[n+1];
//		for(int i=0;i<dp.length;i++) {
//			dp[i]=-1;
//		}
//		int ans=minCountHelper(n, dp);
//		System.out.println(ans);
		int ans=minSquareI(n);
		System.out.println(ans);

	}

}
