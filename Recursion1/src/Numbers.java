
public class Numbers {

	public static boolean numbers(int arr[],int x,int startIndex) {
		if(startIndex==arr.length) {
			return false;
		}
		if(arr[startIndex]==x) {
			return true;
		}
		boolean smallOutput=numbers(arr, x, startIndex+1);
		return smallOutput;
	}
	public static boolean numbers(int arr[],int x) {
		return numbers(arr, x, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,10};
		boolean ans=numbers(arr, 9);
		System.out.println(ans);

	}

}
