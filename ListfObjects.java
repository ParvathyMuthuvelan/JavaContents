package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Product implements Comparable<Product>
{
	private int code;
	private String name;
	private double price;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Product [code=%10s, name=%30s, price=%10s]", code, name, price);
	}
	//obj1.compareTo(obj2)
	@Override
	public int compareTo(Product o) {
		int result=0;
		if(this.code==o.code)
			result=0;
		else if(this.code<o.code)
			result=1;
		else
			result=-1;
		return result;
	}

	
	
}
public class ListfObjects {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int code;
		String name;
		double price;
		List<Product> productList=new ArrayList<>();
		int n;
		System.out.println("Enter the number of products");
		n=scanner.nextInt();
		Product p;
		for(int i=1;i<=n;i++)
		{
		System.out.println("Enter product code,name and price");
		code=scanner.nextInt();
		scanner.nextLine();
		name=scanner.nextLine();
		price=scanner.nextDouble();
		p=new Product();
		p.setCode(code);
		p.setName(name);
		p.setPrice(price);
		productList.add(p);
			
		}
		System.out.println("Before sorting ");
		for(Product obj: productList)
		{
			System.out.println(obj);
		}
		Collections.sort(productList);
		
		System.out.println("After sorting ");
		for(Product obj: productList)
		{
			System.out.println(obj);
		}
//		System.out.println("enter the product code to search");
//		code=scanner.nextInt();
//		boolean flag=false;
//		for(Product obj: productList)
//		{
//			if(obj.getCode()==code)
//			{
//				flag=true;
//			System.out.println(obj);
//			break;
//			}
//		}
//		if(!flag)
//		{
//			System.out.println("Invalid product code");
//		}
	}

}











