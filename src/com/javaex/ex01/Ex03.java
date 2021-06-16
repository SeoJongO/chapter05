package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\Users\\Main\\Desktop\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("C:\\Users\\Main\\Desktop\\javaStudy\\file\\BuffImg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		int data;

		while (true) {
			data = bin.read();
			if (data == -1) {
				break;
			}
			bout.write(data);
		}
		
		bout.close();
		bin.close();
		
	}
}
