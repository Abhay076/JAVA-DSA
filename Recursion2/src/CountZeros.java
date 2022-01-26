
public class CountZeros {
	public static int countZerosRec(int input){
	      //Base case
	        if(input<10)
	      {
	        if(input==0)
	          return 1;
	        else
	          return 0;
	      }
	        
	      if(input%10==0)
	        return countZerosRec(input/10)+1;
	      
	      else
	        return countZerosRec(input/10);
			// Write your code here
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countZerosRec(1200200));
		

	}

}
