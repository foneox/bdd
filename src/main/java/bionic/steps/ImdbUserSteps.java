package bionic.steps;

import bionic.pages.GmailLoginPage;
import bionic.pages.ImdbHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Sergii on 7/14/2015.
 */
public class ImdbUserSteps extends ScenarioSteps {
    GmailLoginPage gmailLoginPage;
    ImdbHomePage imdbHomePage;

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
}
