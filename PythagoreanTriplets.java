package com.msbhosale;

public class PythagoreanTriplets {

	public static void main(String[] args) {

		final int LIMIT = 50;

		for (int i = 1; i < LIMIT; i++) {

			for (int j = (i + 1); j < LIMIT; j++) {

				for (int k = (j + 1); k < LIMIT; k++) {

					if ((i * i) + (j * j) == (k * k)) {

						System.out.println("[" + i + "-" + j + "-" + k + "]");
					}
				}
			}
		}
	}
}