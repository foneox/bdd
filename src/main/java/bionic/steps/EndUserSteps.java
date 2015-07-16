package bionic.steps;

import bionic.pages.GmailPage;
import bionic.pages.ImdbHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {
    GmailPage gMailPage;
    ImdbHomePage imdbHomePage;

    @Step
    public void loginToGoogle(String email,String password){
        gMailPage.openAddAccountPage();
        gMailPage.logIn(email, password);
        assertTrue(gMailPage.isLoggedIn(email));
    }

    @Step
    public void openImdbPage(){
        imdbHomePage.openImdbPage();
    }

    @Step
    public void loginToImdb(String userName){
       imdbHomePage.loginToImdb();
    }
}