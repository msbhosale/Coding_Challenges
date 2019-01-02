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
/*
Output:
[3-4-5]
[5-12-13]
[6-8-10]
[7-24-25]
[8-15-17]
[9-12-15]
[9-40-41]
[10-24-26]
[12-16-20]
[12-35-37]
[15-20-25]
[15-36-39]
[16-30-34]
[18-24-30]
[20-21-29]
[21-28-35]
[24-32-40]
[27-36-45]
*/
