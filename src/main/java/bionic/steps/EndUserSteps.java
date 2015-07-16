package bionic.steps;

import bionic.pages.GmailLoginPage;
import bionic.pages.ImdbHomePage;
import bionic.pages.TheatreMoviePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class EndUserSteps extends ScenarioSteps {

    ImdbHomePage homePage;
    GmailLoginPage gmailLoginPage;
    TheatreMoviePage theatreMoviePage;

    @Step
    public void opensHomePage() {
        homePage.openPage();
    }

    @Step
    public boolean isLoginedWithGoogle(String login, String pass) {
        gmailLoginPage.openPage();
        return gmailLoginPage.enterLogin(login)
                             .enterPass(pass)
                             .isLogined();
    }

    @Step
    public void isLoginedTroughGoogleAccount() {
        assertThat(homePage.loginTroughGoogleAccount().isLogined()).isTrue();
    }

    @Step
    public void loginsWith(String login, String pass) {
        isLoginedWithGoogle(login, pass);
        opensHomePage();
        isLoginedTroughGoogleAccount();
    }

    @Step
    public void openTheatreMovieDetails() {
        homePage.clickTheatreMovieLink();
    }

    @Step
    public void opensComingSoonFilmDetails() {
        homePage.clickComingSoonMovieLink();
    }

    @Step
    public void rateMovie() {
        theatreMoviePage.clickRateMovieLink();
    }

    @Step
    public void shouldSeeMovieStatisticChanged() {
        assertThat(theatreMoviePage.isStatisticsChanged()).isTrue();
    }

    @Step
    public void shouldNotSeeOwnRate() {
        rateMovie();
        assertThat(theatreMoviePage.isYourRateIsDisplyed()).isFalse();
    }

    @Step
    public void logOutIfLogined() {
        if(homePage.isLogined()) homePage.clickLogout();
    }
}