
public class BinarySearch {
	 public static int binarySearch(int a[],int si,int ei,int x){
	        if(si>ei){
	            return -1;
	        }
	        int midIndex=(si+ei)/2;
	        if(a[midIndex]==x){
	            return midIndex;
	        }else if(a[midIndex]<x){
	            return binarySearch(a,midIndex+1,ei,x);
	        }else{
	            return binarySearch(a,si,midIndex-1,x);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,5,6,8};
		System.out.println(binarySearch(arr, 0, arr.length-1, 3));

	}

}
