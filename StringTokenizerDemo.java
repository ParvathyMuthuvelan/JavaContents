package com.training.strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String str="This sentence is seperated by space";
		StringTokenizer st=new StringTokenizer(str);
		System.out.println("Number of tokens="+st.countTokens());
		while(st.hasMoreTokens())
		{
			String token=st.nextToken();
			System.out.println(token);
			//System.out.println(st.nextToken());
		}
		String str1="This :sentence, is se:perated, by co:mma";
		StringTokenizer st1=new StringTokenizer(str1,":");
		System.out.println("Number of tokens="+st1.countTokens());
		while(st1.hasMoreTokens())
		{
			String token=st1.nextToken();
			System.out.println(token);
			//System.out.println(st.nextToken());
		}
		StringTokenizer st3=new StringTokenizer(str1,",",true);
		System.out.println("Number of tokens="+st3.countTokens());
		while(st3.hasMoreTokens())
		{
			String token=st3.nextToken();
			System.out.println(token);
			//System.out.println(st.nextToken());
		}
	}

}
