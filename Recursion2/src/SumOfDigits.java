
public class SumOfDigits {
	public static int sumOfDigits(int input){
		// Write your code here
       if(input==0){
           return 0;
       }
       int smallAns=input % 10 + sumOfDigits(input / 10);
        return smallAns;
                
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(1234));

	}

}
