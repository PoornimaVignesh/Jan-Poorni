package com.poori;

import java.io.File;
import java.io.IOException;

public class employee {
	public static void main(String[] args) throws IOException {
		File p=new File("F:\\Friends\\poorvi.txt\\lisa\\");
		//new folder creation
		//boolean mkdir = p.mkdir();
		//System.out.println(mkdir);
		//create a new file
		boolean createNewFile = p.createNewFile();
		System.out.println(createNewFile);
		//check weather we can able to read file or not
		boolean canRead = p.canRead();
		System.out.println(canRead);
		//check weather we can able to write file or not
	boolean canWrite = p.canWrite();
	System.out.println(canWrite);
	//check weather file is present or not
	boolean exists = p.exists();
	System.out.println(exists);
		//check weather given location is file or not
		boolean file = p.isFile();
		System.out.println(file);
		//check weather given location is directory or not
		boolean directory = p.isDirectory();
		System.out.println(directory);
		//print all files without location
		//String[] list = p.list();
		//for (String x : list) {
			//System.out.println(x);
			//}
		//print all files including location
		File[] listFiles = p.listFiles();
	for (File x1 : listFiles) {
			System.out.println(x1);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
