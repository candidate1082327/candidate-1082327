package checkukvisapages;

import net.thucydides.core.annotations.Step;

public class checkUKvisapage3 {
	
	HomeOfficePage3 checkUKvisapage3;
	
	@Step
	public void selectDurationofstay()
	
	{
		
		checkUKvisapage3.Durationofstay();
				
	}
	
@Step	
public void stayingwithpartnerorfamily()
	
	{
		
		checkUKvisapage3.stayingwithpartnerorfamily();
				
	}
	
	@Step
	public void clickonNext()

	{
		
		checkUKvisapage3.Nextstep();
	
	}
	
	

}
