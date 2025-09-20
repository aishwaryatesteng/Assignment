package w2.week2day1assignment;

public class LibraryManagement {

	public static void main(String[] args) {
	
     Library object2=new Library();
     object2.addBook("Calling from Library management");
     object2.issueBook();
     System.out.println(object2.addBook("Calling from Library management"));
	}

}
