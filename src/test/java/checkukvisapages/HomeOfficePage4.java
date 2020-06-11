package checkukvisapages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomeOfficePage4 extends PageObject{
	WebElementFacade driver;

	
	public void confirmUKvisarequirement()
	
	{
	 String name =$("*[role=main] *[id=result-info]").getText();			
	 //System.out.println($("*[role=main] *[id=result-info]").getText());
	 System.out.println(name.contains("visa"));
	
	}
	
	}
