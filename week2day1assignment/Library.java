package w2.week2day1assignment;
  

public class Library {
	public String addBook(String bookTitle)
	{
	   System.out.println("Book added successfully");
	   return bookTitle;
	}
	public void issueBook()
	{
	    System.out.println("Book issued successfully");	

	}
	public static void main(String[] args) {
	
    Library object1=new Library();
    object1.addBook("Test automation Engineer");
    object1.issueBook();
	}

}
