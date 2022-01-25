

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		int smallOutput=fact(n-1);
		int ans=smallOutput*n;
		return  ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println(ans);
        sc.close();
	}

}
