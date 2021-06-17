package com.javaex.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		Writer fw = new FileWriter("C:\\Users\\Hi-PC\\Desktop\\JavaStudy\\file\\song.txt");
		
		String str = "학교종이 땡땡땡 어서 모이자 선생님이 우리를 기다리신다.";
		
		fw.write(str);
		
		
		fw.close();
	}

}
