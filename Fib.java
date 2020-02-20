import java.util.*;
import java.io.*;

class Fib
{

	static int fibo( int n )
	{
	
		if( n <= 2 )
			return 1;

		return fibo(n-1) + fibo(n-2);
	
	}


	public static void main(String[] args)
	{

		System.out.println("Number is:  " + fibo(9));

	}

}

//Positions
//1 2 3 4 5 6 7  8  9 10 11 12 

//0 1 1 2 3 5 8 13 21 34 55 89

//Indexes
//0 1 2 3 4 5 6  7  8  9 10 11
