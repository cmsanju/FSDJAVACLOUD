package com.fls;

import java.io.FileWriter;

public class WriteTest {
	
	public static void main(String[] args) throws Exception
	{
		
		FileWriter fw = new FileWriter("src/charwrite.txt");
		
		String msg = "This is write operation with the help of char stream ";
		
		fw.write(msg);
		
		fw.flush();
		
		System.out.println("Done.");
	}

}
