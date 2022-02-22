
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		long ans=stairCase(n);
		System.out.println(ans);

	}

}
