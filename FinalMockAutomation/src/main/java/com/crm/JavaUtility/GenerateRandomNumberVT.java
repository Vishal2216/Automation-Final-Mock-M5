package com.crm.JavaUtility;

import java.util.Random;

public class GenerateRandomNumberVT 
{

	public static int random()
	{	
        Random r =new Random();
        int value = r.nextInt(1000);
        return value;
}
}