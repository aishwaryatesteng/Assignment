package week3assignment.day2;

public class TextField extends WebElement{
    public void getText()
    {
    	System.out.println("Getting the text");
    }
	public static void main(String[] args) {
	 TextField t=new TextField();
	 t.getText();
	 t.click();
	 t.setText("In the text field");

	}

}
