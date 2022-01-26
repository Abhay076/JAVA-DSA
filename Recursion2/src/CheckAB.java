
public class CheckAB {
	
	public static boolean checkAB(String input) {
		// Write your code here

            if(input.length() == 1)
      {
          return input.charAt(0)=='a' ;
      }
    if(input.charAt(0) != 'a')
        {
            return false ;
        }
        if(input.charAt(1) == 'a')
        {
            return checkAB(input.substring(1)) ;
        }
    else{
            if(input.length() == 2)
            {
                return false ;
            }
            else if(input.length() == 3)
            {
 if(   input.charAt(1) == 'b' && input.charAt(2) == 'b')
{
    return true  ;   
}
 else{
     return false ;
 }          
            }
       else{   
           if( !(input.charAt(1) == 'b' && input.charAt(2) == 'b' ) )
           {
               return false ;
           }
           else{
            return checkAB(input.substring(3)) ;
           }
           }     
            
            
            
            
        }
        
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAB("abb"));

	}

}
