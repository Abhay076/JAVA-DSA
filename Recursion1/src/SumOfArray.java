import java.util.Scanner;

public class SumOfArray {

	   public static int sum(int arr[],int startIndex) {
		   if(arr.length==startIndex) {
			   return 0;
		   }
		   int smallOutput=arr[startIndex]+sum(arr, startIndex+1);
		   return smallOutput;
	   }
	   public static int sum(int arr[]) {
		   return sum(arr,0);
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc =new Scanner(System.in);
	   int size=sc.nextInt();
	   int arr[]= new int[size];
	   for(int i=0;i<size;i++) {
		   arr[i]=sc.nextInt();
	   }
	   int ans=sum(arr);
	   System.out.println(ans);
		sc.close();

	}

}
