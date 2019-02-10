
public class RecursiveFunctions {

	public static long factorial(long n)
	{
		if(n-1 <= 1)
			return 1;
		else
			return (n*factorial(n-1));
	}
	
	public static boolean isPalindrome(String word)
	{
		if (word.length() <= 1)
			return true;
		else if(word.charAt(0) == word.charAt(word.length()-1))
			{
				String word2 = word.substring(1, word.length()-1);
				return isPalindrome(word2);
			}
		else
			return false;
		
	}
	
	public static long fibonacci(int n)
	{
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
		
	}
	
	public static long fibonacci(int n, int f1, int f0)
	{
		if (n == 0)
			return f0;
		else if (n == 1)
			return f1;
		else
			return fibonacci(n-1, f1+f0, f1);
	}

	public static long fiboIter(long n)
	{
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		else
		{
			long f0 = 0;
			long f1 = 1;
			for(int i = 0; i < n-1; i++)
			{
				long temp = f1;
				f1 += f0;
				f0 = temp;
			}
			
			return f1;
		}
	}

	
	
	
	
	
	
}
