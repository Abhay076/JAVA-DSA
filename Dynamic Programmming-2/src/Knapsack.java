
public class Knapsack {
	
	public static int kps(int w,int val[],int wt[],int i) {
		if(i==val.length) {
			return 0;
		}
		int ans;
		if(wt[i]<=w) {
			//including the items
			int ans1=val[i]+kps(w-wt[i], val, wt, i+1);
			//excluding items
			int ans2=kps(w, val, wt, i+1);
			ans=Math.max(ans1, ans2);
		}
		else {
			ans=kps(w, val, wt, i+1);
		}
		return ans;
	}
	
	
	public static int knapsackI(int W,int val[],int wt[]) {
		int n=val.length;
		int dp[][]=new int[n+1][W+1];
		for(int i=n-1;i>=0;i--) {
			for(int w=0;w<=W;w++) {
				int ans;
				if(wt[i]<=w) {
					int ans1=val[i]+dp[i+1][w-wt[i]];
					int ans2=dp[i+1][w];
					ans=Math.max(ans1, ans2);
				}
				else {
					ans=dp[i+1][w];
				}
				dp[i][w]=ans;
			}
		}
		return dp[0][W];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[]= {200,300,100};
		int wt[]= {20,25,30};
		int w=50;
		int ans=knapsackI(w, val, wt);
		System.out.println(ans);
		
	}

}
