package com.hefshine.beans;

public class Cipher {

	public String getEncriptedString(String string) {

		char[] letters = string.toUpperCase().toCharArray();

		StringBuffer sb = new StringBuffer();

		for (char letter : letters) {

			if (letter == 'A') {
				sb.append('Z');
			} else {
				sb.append(getEncriptedChar(letter));
			}
		}

		return sb.toString();

	}

	private char getEncriptedChar(char letter) {

		int oldLetterASCIIValue = (int) letter;

		char newLetter = (char) (oldLetterASCIIValue - 1);

		return newLetter;
	}
}