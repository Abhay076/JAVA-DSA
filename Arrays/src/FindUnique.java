import java.util.Scanner;

public class FindUnique {
	
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
	
	// find Unique first way
	public static int unique(int arr[]) {
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor^=arr[i];
		}
		return xor;
	}
	
	//find Unique second way
	public static int unique2(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int j=0;
			while(j<arr.length) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						break;
					}
				}
				j++;
			}
			if(j==arr.length) {
				return arr[i];
			}
			i++;
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		int ans=unique(arr);
		int ans1=unique2(arr);
		System.out.println(ans);
		System.out.println(ans1);

	}

}
