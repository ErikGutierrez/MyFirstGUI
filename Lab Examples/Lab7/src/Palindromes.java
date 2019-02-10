import java.io.*;
import java.util.*;

public class Palindromes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";
        char[] letters = new char[A.length()];
        
        for (int i = A.length() - 1; i >= 0; i--)
        {
        	letters[i] = A.charAt(i);
        	B += letters[i];
        }
        
        if (A.equals(B))
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }
}
