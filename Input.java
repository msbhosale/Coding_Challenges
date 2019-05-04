package com.hefshine.io;

import java.util.Scanner;

public class Input {

	Scanner scanner = new Scanner(System.in);
	
	public String getString(String message) {
	
		String string = null;
		
		System.out.print(message);
		
		string = scanner.next();
		
		return string;
	}
}