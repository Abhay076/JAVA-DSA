
public class IsSortedArrays {
	
	public static boolean isSorted(int arr[]) {
		if(arr.length==1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int smallArray[]= new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallArray[i-1]=arr[i];
		}
		boolean smallOutputArray=isSorted(smallArray);
		return smallOutputArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,9,4,5};
		boolean ans=isSorted(arr);
		System.out.println(ans);

	}

}
