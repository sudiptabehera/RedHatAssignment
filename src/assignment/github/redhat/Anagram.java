package assignment.github.redhat;

//Write a program to check if two given String is Anagram of each other return true if Input
//string is anagram otherwise return false. (By the way, two String is called anagram, if
//they contain the same characters but in different order e.g. army and mary, stop and
//pots, etc. Anagrams are actually a mix-up of characters in String.) [ATTEMPT
//MANDATORY]
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean anagramChecker(String s1, String s2) {
		char[] org = s1.toCharArray();
        char[] modi = s2.toCharArray();
 
        Arrays.sort(org);
        Arrays.sort(modi);
		if (String.valueOf(org).equals(String.valueOf(modi))) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2;
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter First String");
        str1 = sc.nextLine();
 
        System.out.println("Enter Second String");
        str2 = sc.nextLine();
        
        String Result=anagramChecker(str1,str2)?"Is an Anagram":"Not a Anagram";
        System.out.println(Result);
        
    }
}


