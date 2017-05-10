//Q1 
package codefight;

public class Passcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test case 1 
//		String[] attempts = {"1111", "4444",
//		                      "9999", "3333",
//		                      "8888", "2222",
//		                      "7777", "0000",
//		                      "6666", "7285",
//		                      "5555", "1111"};
//
		//test case 2
//		String[] attempts = {"9999", "9999",
//	            "9999", "9999",
//	            "9999", "9999",
//	            "9999", "9999",
//	            "9999", "1234",
//	            "9999", "9999"};
		
		//test case 3
		String[] attempts = {"1111", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "9999", 
				 "1111"};
		
		System.out.println(incorrectPasscodeAttempts("1111", attempts)); 
//		System.out.println(incorrectPasscodeAttempts("1234", attempts));
	}
		
	public static boolean incorrectPasscodeAttempts(String passcode, String[] attempts) 
	{
	        int count = 0 ;
	        for(int i=0;i<attempts.length;i++)
	        {
	        	 System.out.println("comparing "+passcode+ " with "+ attempts[i]);
	            if(passcode.equals(attempts[i]))
	            {
	               count = 0;
	            }
	            
	            else
	            {
	                count ++ ;
	                System.out.println("no. of wrong attempts  = " +count);
	                if(count == 10)
	                {
	                	break;
	                }
	            }
	        }
	        if(count >= 10)
	        {
	            return true;
	            
	        }
	        else
	        {
	            return false;
	        
	        }
	}
}
