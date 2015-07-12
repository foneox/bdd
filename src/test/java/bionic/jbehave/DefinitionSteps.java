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

    @When("I search for <phone>")
    public void whenISearchForPhone(@Named("phoneName") String phoneName) {
        endUser.looks_for(phoneName);
    }

    @Then("I see corresponding <smartphoneLink> link as first in the results list")
    public void thenISeeCorrespondingsmartphoneLinkLinkAsFirstInTheResultsList(@Named("expectedphoneLink") String expectedPhoneLink) {
        endUser.should_see_expected_link_first_in_results(expectedPhoneLink);
    }

}
