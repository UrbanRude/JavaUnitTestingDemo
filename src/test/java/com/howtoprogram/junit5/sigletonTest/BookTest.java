package com.howtoprogram.junit5.sigletonTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.howtoprogram.junit5.singleton.Book;

class BookTest {

	

	@Test
	void singletonTestOne() {
		Book book = Book.getInstance();
		book.setNombre("Urbano");
		assertEquals("Urbano",book.getNombre());
		
		Book book1 = Book.getInstance();
		book1.setNombre("Artuto");
		assertEquals("Artuto",book1.getNombre());
		
		Book book2 = Book.getInstance();
		book2.setNombre("Minely");
		assertEquals("Minely",book2.getNombre());
	}

}
