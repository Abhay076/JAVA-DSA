import java.util.Scanner;

public class Duplicates {
	
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int size=sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static int duplicates(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						return arr[i];
					}
				}
			}
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= takeInput();
		int ans=duplicates(arr);
		System.out.println(ans);

	}

}
