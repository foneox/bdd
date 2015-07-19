package bionic.jbehave;

import net.serenitybdd.core.Serenity;
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

    @Given("logged in user is on main page")
    public void givenLoggedInUserIsOnMainPage() {

    }

    @Given("unregistered user is on main page")
    public void givenUregisteredUserIsOnMainPage() {

    }


    @When("user select any coming soon film")
    public void whenUserSelectAnyComingSoonFilm() {

    }

    @Then("user shouldn't be able to rate film")
    public void thenUserShouldntBeAbleToRateFilm() {

    }

    @Given("Registered user with credentials <email>, <password>")
    public void givenRegisteredUserWithCredentialsemailpassword(String email, String password) {
        Serenity.getCurrentSession().put("email", email);
        Serenity.getCurrentSession().put("password", password);
    }

    @When("The user is on IMDB home page")
    public void whenTheUserIsOnIMDBHomePage() {
        endUser.openIMDBHomePage();
    }

    @Then("The user can log in to the system")
    public void thenTheUserCanLogInToTheSystem() {
        String email = (String)Serenity.getCurrentSession().get("email");
        String password = (String)Serenity.getCurrentSession().get("password");
        endUser.logInToImdb(email,password);
        endUser.verifyUserIsLoggedtoIMDB();
    }

}
