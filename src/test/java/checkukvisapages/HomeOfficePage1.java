package checkukvisapages;





import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class HomeOfficePage1 extends PageObject{
	
	
	
	public void selectNationality()
	
	
	{	
		
		$(By.id("response")).selectByValue("japan");	
			
	}
	
	
public void selectNationality2()
	
	
	{	
		
		$(By.id("response")).selectByValue("russia");	
			
	}
	
	
public void Nextstep()	
	
		{	
	
		$("*[role=main] *[type=submit]").submit();
		
		}

}

	
	

