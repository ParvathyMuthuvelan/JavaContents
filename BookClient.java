//java.util.Date
//java.sql.Date
package com.pack2;

import com.pack1.Book;

public class BookClient  {


	public static void main(String[] args) {
		Book book=new Book();
		//book.bookCode=200;
		book.setData(1000,"Gosling","Head First Java");
		book.display();
		//System.out.println(book);

	}

}
