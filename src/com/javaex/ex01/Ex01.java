package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("C:\\Users\\Main\\Desktop\\javaStudy\\file\\img.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\Main\\Desktop\\javaStudy\\file\\byteImg.jpg");

		int data;
		System.out.println("복사시작");
		while (true) {
			data = is.read();
			if (data == -1) {
				System.out.println("복사끝: " + data);
				break;
			}

			os.write(data);

		}

	}

}
