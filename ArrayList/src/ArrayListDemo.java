import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,80);
		System.out.println(list.size());
		System.out.println(list.get(0));

	}

}
