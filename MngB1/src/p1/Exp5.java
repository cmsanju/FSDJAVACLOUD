package p1;

public class Exp5 {
	
	private int prt = 200;
	
	        int dflt = 40;
	
   protected int prtd = 50;
   public  int pbl = 98;
   
   
   
   public void disp()
   {
	   System.out.println(prt);
	   System.out.println(dflt);
	   System.out.println(prtd);
	   System.out.println(pbl);
   }
   
   public static void main(String[] args) {
	
	   Exp5 obj = new Exp5();
	   
	   obj.disp();
}

}

class Exp4 extends Exp5
{
	public void disp()
	   {
		  // System.out.println(prt);
		   System.out.println(dflt);
		   System.out.println(prtd);
		   System.out.println(pbl);
	   }
}
