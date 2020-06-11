package checkukvisapages;

import net.serenitybdd.core.pages.PageObject;

public class HomeOfficePage3 extends PageObject{
	
	
public void Durationofstay()
	
	{
		$("*[role=main] *[value=longer_than_six_months]").click();
	}
	
public void stayingwithpartnerorfamily()

{
	$("*[role=main] *[value=no]").submit();
}


public void Nextstep()

	{	
	
	$("*[role=main] *[type=submit]").submit();
	
	
     
	}
	
	
	

}
