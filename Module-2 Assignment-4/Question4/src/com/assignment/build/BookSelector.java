package com.assignment.build;

public class BookSelector {
	private BookSelector() {
		// TODO Auto-generated constructor stub
	}

	public static Book getInstance(BookType choice) {
		switch(choice) {
		case FICTION_BOOK : return new FictionBook();
		case REFERENCE_BOOK : return new ReferenceBook();
		case NONFICTION_BOOK : return new NonFiction();
		}
		return null;
	}
	
}
