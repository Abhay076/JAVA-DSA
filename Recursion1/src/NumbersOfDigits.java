import java.util.Scanner;

public class NumbersOfDigits {

	public static int numbers(int n) {
		if(n<=9) {
			return 1;
		}
		int ans=numbers(n/10);
		return ans+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=numbers(n);
		System.out.println(ans);

	}

}
