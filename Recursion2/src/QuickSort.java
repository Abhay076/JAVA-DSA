
public class QuickSort {
	public static void quickSort(int[] input) {
    quickSort(input,0,input.length-1);
	}
    
    public static void quickSort(int input[],int sI,int eI){
        if(sI>=eI){
            return ;
        }
        int pivotPos=Partition(input,sI,eI);
        quickSort(input,sI,pivotPos-1);
        quickSort(input,pivotPos+1,eI);
    }
    
    public static int Partition(int input[],int si,int ei){
        int count=0;
    for(int i=si+1;i<=ei;i++)
    {
      if(input[i]<=input[si])
        count++;
    }
    int pos=si+count;
    int temp=input[pos];
    input[pos]=input[si];
    input[si]=temp;
    int i=si,j=ei;
    while(i<pos&&j>pos)
    {
      while(input[i]<=input[pos]&&i<pos)
        i++;
      while(input[j]>input[pos]&&j>pos)
        j--;
      temp=input[i];
      input[i]=input[j];
      input[j]=temp;
    }
    return pos;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,5,8,6};
		quickSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}

	}

}
