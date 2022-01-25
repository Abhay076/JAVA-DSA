import java.util.Scanner;

public class SumofNnaturalNumbers {

	public static int sumn(int n) {
		if(n==0) {
			return 0;
		}
		int smallOutput=sumn(n-1);
		int ans=smallOutput+n;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=sumn(n);
		System.out.println(ans);
		sc.close();

	}

}
