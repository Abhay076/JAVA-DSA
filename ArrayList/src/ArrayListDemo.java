import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,80);
//		list.remove(0);
		list.set(0, 100);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//enhanced for loop - for each loop
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println(list.size());
		System.out.println(list.get(0));

	}

}
