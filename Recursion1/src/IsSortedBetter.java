
public class IsSortedBetter {
	
	public static boolean isSorted(int arr[],int startIndex) {
		if(startIndex==arr.length-1) {
			return true;
		}
		if(arr[startIndex]>arr[startIndex+1]) {
			return false;
		}
		boolean smallOutput=isSorted(arr, startIndex+1);
		return smallOutput;
	}
	public static boolean isSorted(int arr[]) {
		return isSorted(arr, 0);
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		boolean ans=isSorted(arr);
		System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
