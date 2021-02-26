/*Create a list which contains multiple student data in the format regno,mark1,mark2,mark3. Find the students 
 whose average is greater than 90 and return their reg.no as list.
 Sample Input
 3
1001,90,90,90
1002,89,90,87
1003,67,65,78 list of string
 Sample Output
 1001
 1003 list of integer
 */
package com.training.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassingListAsArgument {

	static List<Integer> findAverage(List<String> input)
	{
		List<Integer> resultList=new ArrayList<>();
		double avg;
		int regno;
		//s=1001,78,89,90
		//str[0]=7001,str[1]=78,str[2]=89,str[3]=90
		for(String s:input)
		{
			String str[]=s.split(",");
			regno=Integer.parseInt(str[0]);
			double total=Integer.parseInt(str[1])+Integer.parseInt(str[2])+Integer.parseInt(str[3]);
			avg=total/3;
			if(avg>=90)
			{
				resultList.add(regno);
				System.out.println(avg);
			}
			
		}
		return resultList;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<String> inputList=new ArrayList<>();
		List<Integer> result;
		int n;
		System.out.println("Enter number of students");
		n=scanner.nextInt();
		String data;
		scanner.nextLine();
		for(int i=1;i<=n;i++)
		{
			data=scanner.nextLine();
			inputList.add(data);
		}
		result=findAverage(inputList);
		System.out.println("Result ="+result);

	}

}
