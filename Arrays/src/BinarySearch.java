
public class BinarySearch {

	public static int binarySearch(int arr[],int x) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]<x) {
				start=mid+1;
			}
			else if(arr[mid]>x) {
				end= mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int ans=binarySearch(arr, 7);
		System.out.println(ans);

	}

}
