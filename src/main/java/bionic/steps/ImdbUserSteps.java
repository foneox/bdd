package bionic.steps;

import bionic.pages.GmailLoginPage;
import bionic.pages.imdb.ImdbHomePage;
import bionic.pages.imdb.LoginDialog;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Sergii on 7/14/2015.
 */
public class ImdbUserSteps extends ScenarioSteps {
    GmailLoginPage gmailLoginPage;
    ImdbHomePage imdbHomePage;
    LoginDialog loginDialog;

    @Step
    public void logsIntoGmail(String email, String password) {
        gmailLoginPage.open();
        gmailLoginPage.specifyEmail(email);
        gmailLoginPage.specifyPassword(password);
    }

    @Step
    public void opensSiteHomePage() {
        imdbHomePage.open();
    }

    @Step
    public void shouldBeLoggedInWhenlogsIntoImdbWithGmail() {
        openSignInDialog();
        loginWithGmail();
        assertThat("user should be logged in", isUserLoggedIn());
    }
    @Step
    private boolean isUserLoggedIn() {
        return imdbHomePage.isUserLoggedIn();
    }

    @Step
    public void loginWithGmail() {
        imdbHomePage = loginDialog.loginWithGmail();
    }

    @Step
    public void openSignInDialog() {
        loginDialog  = imdbHomePage.openSighInDialog();
    }
}
