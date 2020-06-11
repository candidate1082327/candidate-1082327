package checkukvisapages;

import net.serenitybdd.core.pages.PageObject;

public class HomeOfficePage2 extends PageObject{
	
	
	public void Reasonforvisit()
	
	{
			
		$("*[role=main] *[value=study]").click();
			
	}
	
	
	public void Reasonforvisit2()
	
	{					
		
		$("*[role=main] *[value=tourism]").click();
			
	}
	
	public void Nextstep()
	
		{	
		
		$("*[role=main] *[type=submit]").submit();
		
		
	     
		}
	
	
	

}
