package com.training.strings;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		String str1="hello";
		String str2="world";
		String str3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Length of "+str1+"= "+str1.length());
		str3=str1.concat(str2);
		System.out.println("Concatenated string="+str3);
		System.out.println("str1="+str1 +" str2="+str2+"str3 ="+str3);
		System.out.println("Character at 3rd index ="+str3.charAt(3));
		System.out.println("Index of first occurrence of l in str3="+str3.indexOf('l'));
		System.out.println("Index of first occurrence of a in str3="+str3.indexOf('a'));
		System.out.println("Index of last occurrence of l in str3="+str3.lastIndexOf('l'));
		String str4="WORLD";
		System.out.println(str2 +" equals "+ str4 + " ="+str2.equals(str4));
		System.out.println(str1 +" equals "+ str4 + " ="+str1.equals(str4));
		System.out.println(str2 +" equals ignoring case "+ str4 + " ="+str2.equalsIgnoreCase(str4));
		
		int res=str1.compareTo(str2);
		System.out.println("Res ="+res);
		System.out.println("str1="+str1+" str2="+str2);
		if(res==0)
		{
			System.out.println(str1 + "and  "+str2 +" are equal");
		}
		else if(res>0)
		{
			System.out.println(str1 + "is greater than  "+str2 );
		}
		else
		{
			System.out.println(str2 + "is greater than  "+str1);
			
		}
		System.out.println("str3="+str3);
		System.out.println("characters starting from 3rd index="+str3.substring(3));
		System.out.println("characters starting from 2rd index to 5th index="+str3.substring(2,6));
		char ch[]= {'a','b','c','d','e'};
		String s=new String(ch);
		char c[]=str3.toCharArray();
		System.out.println(str1.toLowerCase() +" "+str1.toUpperCase());
		System.out.println("s="+s);
		s=s.replace('a', 'A');
		
		System.out.println("After replacing s="+s);
		StringBuffer sb=new StringBuffer(str1);
		
		String revString=sb.reverse().toString();
				System.out.println("Reversed string="+revString);
		System.out.println("str3="+str3);
		int len=str3.length();
		System.out.println("Reversing string using for loop");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str3.charAt(i));
		}
		String strarr[];
		int n;
		System.out.println("Enter number of strings");
		n=scanner.nextInt();
		strarr=new String[n];
		System.out.println("enter "+n+" strings");
		
		for(int i=0;i<n;i++)
		{
			strarr[i]=scanner.next();
		}
		for(String var:strarr)
		{
			System.out.println(var);
		}
		//System.out.println(str1.charAt(10)); StringIndexOutOfBoundsException
		String str="This sentence, is seperated, by comma";
		String words[]=str.split(",");
		System.out.println("Number of words="+words.length);
		System.out.println("Tokens");
		for(String var:words)
		{
			System.out.println(var);
		}
		

	}

}




