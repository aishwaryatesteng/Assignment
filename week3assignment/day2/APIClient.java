package week3assignment.day2;

public class APIClient {
  public void sendRequest(String endPoint)
  {
	  System.out.println(endPoint);
  }
  public void sendRequest(String endPoint,String requestBody, boolean requestStatus)
  {
	  System.out.println(endPoint);
	  System.out.println(requestBody);
	  System.out.println(requestStatus);
  }
	public static void main(String[] args) {
		 APIClient a=new APIClient();
		 a.sendRequest("Endpoint");
		 a.sendRequest("second endpoint", "second requestbody", false);
	}

}
