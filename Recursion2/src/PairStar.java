
public class PairStar {
	public static String addStars(String s) {
		// Write your code here
         if (s.length()<=1){
            return s;
        }

        String temp = addStars(s.substring(1));
        if(s.charAt(0)==temp.charAt(0)){
            return s.charAt(0)+"*"+temp;
        }else{
             return s.charAt(0)+temp;
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addStars("hello"));

	}

}
