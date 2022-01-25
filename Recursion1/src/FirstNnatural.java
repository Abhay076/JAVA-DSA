import java.util.Scanner;

public class FirstNnatural {

	public static void numbers(int n) {
		if(n==0) {
			return;
		}
		numbers(n-1);
		System.out.println(n+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	     numbers(n);
	     sc.close();

	}

}
