import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> remove(int arr[]){
		ArrayList<Integer> ans= new ArrayList<Integer>();
		HashMap<Integer, Boolean> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			ans.add(arr[i]);
			map.put(arr[i], true);
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,2,3,1,6,2,5};
		ArrayList<Integer> ans=remove(arr);
		System.out.println(ans);
		

	}

}
