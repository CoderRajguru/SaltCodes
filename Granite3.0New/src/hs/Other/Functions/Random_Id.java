package hs.Other.Functions;

import java.util.UUID;

public class Random_Id {

	String uuid;
	
	public static String getRandomString(int length) 
	{
	   String randomStr = UUID.randomUUID().toString();
	   while(randomStr.length() < length) {
	       randomStr += UUID.randomUUID().toString();
	   }
	   return randomStr.substring(0, length);
	}
	

}

