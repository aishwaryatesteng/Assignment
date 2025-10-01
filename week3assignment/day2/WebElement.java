package week3assignment.day2;

public class WebElement {
    public void click()
    {
    	System.out.println("clicking the baseclass webelement");
    }
    public void setText(String text)
    {
    	System.out.println("Setting the text "+text);
    }
	public static void main(String[] args) {
		WebElement w= new WebElement();
		w.click();
		w.setText("Aishwarya");

	}

}
