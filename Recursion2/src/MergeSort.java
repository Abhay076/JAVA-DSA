
public class MergeSort {
	public static void mergeSort(int[] input){
        mergeSort(input,0,input.length-1);
    }
		// Write your code here
      public   static void mergeSort(int input[],int sI,int eI) {
		if(sI>=eI) {
			return ;
		}
		int mid=(sI+eI)/2;
		mergeSort(input,sI,mid);
		mergeSort(input,mid+1,eI);
		merge(input,sI,eI);
		
	}
	
	
	private static void merge(int input[],int sI,int eI) {
		int mid=(sI+eI)/2;
		int ans[]= new int[eI-sI+1];
		int i=sI;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=eI) {
			if(input[i]<input[j]) {
				ans[k]=input[i];
				i++;
				k++;
			}
			else {
				ans[k]=input[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			ans[k]=input[i];
			i++;
			k++;
		}
		while(j<=eI) {
			ans[k]=input[j];
			j++;
			k++;
		}
		for(int index=0;index<ans.length;index++) {
			input[sI+ index]=ans[index];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,2,7,6};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
