package com.mphasis.basics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
public static void main(String[] args) throws IOException {
//	FileReader fis=new FileReader("a.txt");
	FileWriter fos=new FileWriter("b.txt");
//	int i=0;
//	//EOF (-1)
//	while((i=fis.read())!=-1) {
//		fos.write(i);
//	}
//	System.out.println();
//	System.out.println("copy completed");
	
	String s="hi how ar u";
	fos.write(s);
	
	fos.close();
	
}
}
