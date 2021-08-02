package com.emp;

public class EmpValidater {
	
	public void checkSal(double sal)throws PsalException, NsalException
	{
		if(sal > 0)
		{
			PsalException pe = new PsalException("Valid salary");
			throw(pe);
		}
		else
		{
			NsalException ne = new NsalException("Ivalid salary");
			
			throw(ne);
		}
	}

}
