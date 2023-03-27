package com.dayExceptionClass;

public class Login {
	public void CheckPassword(String a) throws PassWordException {
		try {
			if(a.length()>8) {
				System.out.println("Successfully login");		
			}
			else {
				throw new PassWordException("must contain more than 8");
			}
			}
			catch(PassWordException n) {
				n.printStackTrace();
			}
		
	}

}
