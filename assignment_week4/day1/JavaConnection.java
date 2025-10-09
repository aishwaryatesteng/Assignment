package assignment_week4.day1;

public class JavaConnection implements DatabaseConnection {
	public void connect()
	{
		System.out.println("connect in concrete class");
	}
	public void disconnect()
	{
		System.out.println("Disconnect in concrete class");
	}
	 public void executeUpdate()
	 {
		 System.out.println("Execute update in concrete class");
	 }
	public static void main(String[] args) {
		
     JavaConnection j=new JavaConnection();
     j.executeUpdate();
     j.disconnect();
     j.connect();
	}

}
