//com.companyname.applnname.dao

package com.pack1;

public class Book {
	private int bookCode;
	private String author;
	private String title;
	public void setData(int code,String aname,String bname)
	{
		bookCode=code;
		author=aname;
		title=bname;
	}
   public void display()
	{
		System.out.println("Code :"+bookCode);
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
	}
//	public String toString() //overriden method
//	{
//		String result="\nBook code: "+bookCode+"\n Author :"+author+"\n Title :"+title;
//		return result;
//	}

}
