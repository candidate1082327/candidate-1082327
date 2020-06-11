package checkukvisapages;


import net.thucydides.core.annotations.Step;

public class checkUKvisapage2 {
	
	
	
	
	HomeOfficePage2 checkUKvisapage2;
	
	
	@Step
	public void selectReasonforvisit()
	
	{
	
		checkUKvisapage2.Reasonforvisit();
							
	}
	
	
	@Step
	public void selectReasonforvisit2()
	
	{
	
		checkUKvisapage2.Reasonforvisit2();
							
	}
	
	
	@Step
	public void clickonNext()

	{
		
	checkUKvisapage2.Nextstep();
	
	}

}
