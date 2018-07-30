# Coding_Challenges
Here you will find answers to tricky programming challenges !

Feel free to ask your questions here : [Facebook/msbhosale](https://www.facebook.com/msbhosale97)

I will try my best to answer you.

## Sample question:

Write a program to check if a number is prime or not.

## Answer:

```C

#include<stdio.h>
void main()
{
	int number = 15;
	int counter = 0;

	for(int i=2;i<number;i++)
	{
		if(number%i == 0)
		{
			counter++;
		}
	}

	if(counter == 0)
	{
		printf("Number is prime\n");
	}
	else
	{
		printf("Number is not prime\n");
	}
}
	
```
