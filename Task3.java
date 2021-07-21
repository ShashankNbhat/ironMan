package com.technoelevate;

public class Task3 {
	
	public static void printEqual(int a , int b , int c)
	{
		if((a<0)|| (b<0)||(c<0))
		{
			System.out.println("Invalid Value");	
		}
		else if((a==b)&&(a==c))
		{
			System.out.println("all Numbers Are Equal");	
		}
		else if((a==b)&&(a!=c))
		{
			System.out.println("Neither All Are Equal or Different");
			}
		else
			{
				System.out.println("All Numbers Are Different ");
			}
		}


	public static void main(String[] args) {
		Task3.printEqual(10, 29, 39);

	
	}}
