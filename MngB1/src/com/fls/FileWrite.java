package com.fls;

import java.io.File;
import java.io.FileOutputStream;

public class FileWrite 
{
	public static void main(String[] args) throws Exception
	{
		
		File file = new File("src/write.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		String msg = "Hi This is file write example using ByteStream";
		
		fos.write(msg.getBytes());
		
		System.out.println("Done.");
	}
}
