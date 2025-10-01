package week3assignment.day2;

public class Button extends WebElement {
    public void submit()
    {
    	System.out.println("Submitting the web element");
    }
    
	public static void main(String[] args) {
		
     Button b=new Button();
     b.submit();
     b.setText("Button class");
     b.click();
	}

}
