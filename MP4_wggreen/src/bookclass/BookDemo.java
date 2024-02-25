package bookclass;

public class BookDemo {
	
    public static void equals(Book b1,Book b2)
    {
    	if(b1.toString().equals(b2.toString()))
    	{
    		System.out.println("They are the same book");
    	}
    	else
    	{
    		System.out.println("They are not the same book");
    	}
    }

	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "JK", "Rowling", "1965-07-31", "B017V4IMVQ", 11.99);
		
		Book book2 = new Book("Harry Potter and the Chamber of Secrets", "JK", "Rowling", "1965-07-31", "B017V4IPPO", 13.0);
		
		System.out.println(book1);
		
		System.out.println(book2);
		
		equals(book1, book2);
	}

}
