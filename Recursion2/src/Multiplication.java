
public class Multiplication {
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        if(n==0){
            return 0;
        }
        
        int a=multiplyTwoIntegers(m,(n-1));
        return a+m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplyTwoIntegers(2, 3));

	}

}
