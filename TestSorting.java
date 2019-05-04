package com.hefshine.test;

import com.hefshine.beans.Cipher;
import com.hefshine.io.Input;

public class TestSorting {

	public static void main(String[] args) {

		Cipher cipher = new Cipher();

		Input input = new Input();
		
		String password = input.getString("Enter a String to encrypt : ");

		String newPassword = cipher.getEncriptedString(password);

		System.out.print(newPassword);

	}
}