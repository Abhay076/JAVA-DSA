import java.util.Scanner;

public class Power {

	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput=power(x,n-1);
		int ans=smallOutput*x;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int ans=power(x, n);
		System.out.println(ans);
		sc.close();
		

	}

}
