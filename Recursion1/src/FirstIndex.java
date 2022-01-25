
public class FirstIndex {
	
	public static int firstIndex(int arr[],int x,int startIndex) {
		if(startIndex==arr.length) {
			return -1;
		}
		if(arr[startIndex]==x) {
			return startIndex;
		}
		int smalloutput=firstIndex(arr, x, startIndex+1);
		return smalloutput;
	}
	public static int firstIndex(int arr[],int x) {
		return firstIndex(arr, x, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,10,8};
		int ans=firstIndex(arr, 8);
		System.out.println(ans);

	}

}
