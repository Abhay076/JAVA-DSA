
public class GeometricSum {
	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0){
            return 1;
        }
        double ans=findGeometricSum(k-1);
        return ans+1/Math.pow(2,k);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ans=findGeometricSum(3);
		System.out.println(ans);

	}

}
