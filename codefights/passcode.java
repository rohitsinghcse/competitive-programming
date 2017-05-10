//Q1 
//One Very Important User (VIU) has a Very Confidential Document (VCD) stored on his Dropbox account. He doesn't let anyone see the VCD, 
//especially his roommates who often have access to his devices. Opening the Dropbox mobile app on the VIU's tablet requires a 
//four-digit passcode. To ensure the confidentiality of the stored information, the device is locked out of Dropbox after 10
//consecutive failed passcode attempts. We need to implement a function that given an array of attempts made throughout the day and the
//correct passcode checks to see if the device should be locked, i.e. 10 or more consecutive failed passcode attempts were made.

package codefight;

public class Passcode {

	public static void main(String[] args) {
		
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
