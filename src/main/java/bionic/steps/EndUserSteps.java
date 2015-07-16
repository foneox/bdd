package bionic.steps;

import bionic.pages.GmailPage;
import bionic.pages.ImdbHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;


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
    public void loginToImdb(){
       imdbHomePage.loginToImdb();
    }

    @Step
    public void isUserLoggedIn(String user){
        assertTrue(imdbHomePage.isUserDisplayed(user));
    }

    @Step
    public void generalLogin(String email, String password){
        loginToGoogle(email, password);
        loginToImdb();
    }

    @Step
    public void openTheatreMoviePage(){
        assertTrue(imdbHomePage.openFirstTheatreMoviePage());
    }
}