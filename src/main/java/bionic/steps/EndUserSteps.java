package bionic.steps;

import bionic.pages.MainPage;
import bionic.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    SearchResultsPage searchResultsPage;

    MainPage mainPage;

    @Step
    public void starts_search() {
        mainPage.lookup_term();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    @Step
    private void enters(String term) {
        mainPage.enters_term(term);
    }

    @Step
    public void open_shop() {
        mainPage.open();
    }

    @Step
    public void should_see_logo(){
        mainPage.isLogoDisplayed();
    }

    @Step
    public void should_see_catalog(){
        assertTrue(mainPage.isCatalogDisplayed());
    }

    public void should_see_expected_link_first_in_results(String expectedPhoneLink) {
        assertEquals(expectedPhoneLink, searchResultsPage.getSearchResultLinkByIndex(0));
    }
}