
package Steps;

import org.junit.jupiter.api.Assertions;

import PageLayer.ImdbPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImdbTestStep {
	private ImdbPage imdbpage;
	@When("user click on IMDB link")
	public void user_click_on_imdb_link() {
		 imdbpage=new ImdbPage();
		 imdbpage.clickOnIMDBLink();

	}

	@Then("capture the IMDB release date")
	public void capture_the_imdb_release_date() {
		imdbpage.captureTheIMDBReleaseDate();

	}

	@Given("compare relasedates")
	public void compare_relasedates() {
		//page = new GoogleSearchPage();
		
		boolean b=imdbpage.compareWikiAndImdbDate();
		Assertions.assertEquals(b, true);
		

	}
	

}
