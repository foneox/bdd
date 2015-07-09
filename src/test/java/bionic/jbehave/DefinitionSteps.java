package bionic.jbehave;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import bionic.steps.EndUserSteps;
import org.jbehave.core.model.Meta;


public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    @Pending
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }


    @When("the user looks up the definition of the word '$word'")
    @Pending
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    @Pending
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }


    @Given("main page is opened")
    public void givenMainPageIsOpened() {
        endUser.open_shop();
    }

    @When("I see shop logo")
    public void whenISeeShopLogo() {
        endUser.should_see_logo();
    }

    @Then("I see products catalog")
    public void thenISeeProductsCatalog() {
        endUser.should_see_catalog();
    }

}
