package bionic.steps;

import bionic.pages.MainPage;
import bionic.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class EndUserSteps extends ScenarioSteps {

    MainPage mainPage;
    SearchPage searchPage;

    @Step
    public void open_shop() {
        mainPage.openPage();
    }

    @Step
    public void should_see_logo(){
        mainPage.isLogoDisplayed();
    }

    @Step
    public void should_see_catalog(){
        assertThat(mainPage.isCatalogDisplayed()).isTrue();
    }

    @Step
    public void searches_by_keyword(String keyword) {
        mainPage.enterSearchTerms(keyword);
    }

    @Step
    public void should_see_item_with_title(int number, String name) {
        assertThat(searchPage.itemTitleContains(number-1, name)).isTrue();
    }

    @Step
    public void should_see_items_in_result_list_related_to_category(String category) {
        assertThat(searchPage.itemsBelongToCategory(category)).isTrue();
    }

}