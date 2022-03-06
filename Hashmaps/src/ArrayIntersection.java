import java.util.HashMap;

public class ArrayIntersection {
	
	
	public static void printIntersection(int arr1[],int arr2[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int value=map.get(arr1[i]);
			     map.put(arr1[i], value+1);		
			}
			else {
				map.put(arr1[i], 1);
			}
		}
		for(int j=0;j<arr2.length;j++) {
			if(map.containsKey(arr2[j])) {
				int freq=map.get(arr2[j]);
				if(freq>0) {
					System.out.print(arr2[j]+" ");
					map.put(arr2[j], freq-1);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[]= {1,4,5,2,2,3,6,5,3,2};
        int arr2[]= {0,2,3,2,6,6,5,1};
        printIntersection(arr1, arr2);
	}

}
