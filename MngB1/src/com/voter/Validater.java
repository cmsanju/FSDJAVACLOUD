package com.voter;

public class Validater {
	
	public void checkAge(int age)throws ValidVoterException,InvlaidvoterException
	{
		if(age > 18)
		{
			ValidVoterException ve = new ValidVoterException("eligible for voter id");
			
			throw(ve);
		}
		else
		{
			InvlaidvoterException ie = new InvlaidvoterException("not eligible");
			
			throw(ie);
		}
	}

}
