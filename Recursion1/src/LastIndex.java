
public class LastIndex {
	
	public static int lastIndex(int arr[],int x,int startIndex) {
		if(startIndex==arr.length) {
			return -1;
		}
		int ans=lastIndex(arr, x, startIndex+1);
		if(ans!=-1) {
			return ans;
		}
		if(arr[startIndex]==x) {
			return startIndex;
		}
		else {
			return -1;
		}
	}
	
	public static int lastIndex(int arr[],int x) {
		return lastIndex(arr, x, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,10,8};
		int ans=lastIndex(arr, 8);
		System.out.println(ans);

	}

}
