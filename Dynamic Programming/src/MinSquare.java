
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=41;
		int ans=minSquar(n);
		System.out.println(ans);

	}

}
