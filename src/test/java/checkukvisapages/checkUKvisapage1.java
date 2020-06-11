package checkukvisapages;

import net.thucydides.core.annotations.Step;

public class checkUKvisapage1 {
	
	HomeOfficePage1 checkUKvisapage1;
		
	@Step
	public void openApplicantion()
	
	{
		checkUKvisapage1.open();
	}
	@Step
	public void selectNationality()
	
	{
	
		checkUKvisapage1.selectNationality();
			
	}
	
	
@Step	
public void selectNationality2()
	
	{
	
		checkUKvisapage1.selectNationality2();
			
	}
	
	@Step	
	public void clickonNext()
	
	{
		
		checkUKvisapage1.Nextstep();
		
	}
	

}
