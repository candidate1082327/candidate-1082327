package starter.stepdefinitions;

import checkukvisapages.checkUKvisapage1;
import checkukvisapages.checkUKvisapage2;
import checkukvisapages.checkUKvisapage3;
import checkukvisapages.checkUKvisapage4;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class checkUKVisaRequirments {
	
	@Steps
	checkUKvisapage1 page1;
	
	@Steps
	checkUKvisapage2 page2;
	
	@Steps
	checkUKvisapage3 page3;
	
	@Steps
	checkUKvisapage4 page4;

	@Given("I provide a nationality of Japan")
	public void i_provide_a_nationality_of_Japan() {
		
		page1.openApplicantion();
		page1.selectNationality();
		page1.clickonNext();
			
	}
	
	@Given("I provide a nationality of Russia")
	public void i_provide_a_nationality_of_Russia() {
		
		page1.openApplicantion();
		page1.selectNationality2();
		page1.clickonNext();
			
	}
	
	@And("I select the reason “Study”")
	public void i_select_the_reason_Study() {
		
		page2.selectReasonforvisit();
		page2.clickonNext();
		
	}

	@And("I state I am intending to stay for more than {int} months")
	public void i_state_I_am_intending_to_stay_for_more_than_months(Integer int1) {
		
		page3.selectDurationofstay();
		
	}
	
	@And("I select the reason “Tourism”")
	public void i_select_the_reason_tourism() {
		
		
		page2.selectReasonforvisit2();
	}
	
	@And("I state I am not travelling or visiting a partner or family")
	public void i_state_i_am_not_travelling_or_visiting_a_partner_or_family() {
		
		page2.clickonNext();
		page3.stayingwithpartnerorfamily();
	}
		
	
	

	@When("I submit the form")
	public void i_submit_the_form() {
	
	page3.clickonNext();
	}

	@Then("I will be informed “I need a visa to study in the UK”")
	public void i_will_be_informed_I_need_a_visa_to_study_in_the_UK() {
		
		page4.VisaRequirementMessage();
	}
	
	
	@Then("I will be informed “I won’t need a visa to study in the UK”")
	public void i_will_be_informed_I_wont_need_a_visa_to_study_in_the_UK() {
		
		page4.VisaRequirementMessage();
	}
	
	@Then("I will be informed “I need a visa to come to UK”")
	public void i_will_be_informed_I_need_a_visa_to_come_to_UK() {
		
		//page4.VisaRequirementMessage();
	}
	
	
	
	
}



	   
	

	