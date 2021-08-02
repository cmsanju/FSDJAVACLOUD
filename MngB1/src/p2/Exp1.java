package p2;

import p1.Exp5;

public class Exp1 {
	
	Exp5 e = new Exp5();
	
	public void disp()
	   {
		  // System.out.println(e.prt);
		  // System.out.println(e.dflt);
		  // System.out.println(e.prtd);
		   System.out.println(e.pbl);
	   }

}

class Exp6 extends Exp5
{
	public void disp()
	   {
		   //System.out.println(prt);
		  // System.out.println(dflt);
		   System.out.println(prtd);
		   System.out.println(pbl);
	   }
}
