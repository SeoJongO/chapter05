package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		List<String> Array = new ArrayList<String>();
		
		InputStream in = new FileInputStream("C:\\Users\\Hi-PC\\Desktop\\JavaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		String name = "", hp = "", company = "", line = "";
		
		
		while (true) {

			line = br.readLine();

			if (line == null) {
				break;
			}

			Array.add(line);
			
		}
		
		Array.add("서종오,010-2727-9509,02-8111-9509");
		
		for (int i = 0; i < Array.size(); i++) {

			String[] sArray = Array.get(i).split(",");

			name = sArray[0];
			hp = sArray[1];
			company = sArray[2];

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");

		}

		br.close();

	}

}
