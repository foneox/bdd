package bionic.steps;

import bionic.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps {

    GoogleAccountPage googleAccountPage;
    ImdbHomePage homePage;
    ImdbLoginPage loginPage;
    TheatreMoviePage moviePage;
    ComingSoonMoviePage comingSoonMoviePage;
    FilmPage filmPage;

    @Step
    public void loginToGoogleAccount(String userName, String password) {
        googleAccountPage.login(userName, password);
    }

    @Step
    public void openHomePage() {
        homePage.open();
    }

    @Step
    public void loginToSystemViaGoogle() {
        loginPage.goToLoginOptions();
        loginPage.logViaGoogle();
    }

    @Step
    public void verifyUserLoggedIn() {
        homePage.verifyUserIsLogged();
    }

    @Step
    public void loginProcess() {
        loginToGoogleAccount("bionic.bdd@gmail.com", "bionicbdd2015");
        homePage.open();
        loginToSystemViaGoogle();
    }

    @Step
    public void openMoviePage() {
        moviePage.open();
    }

    @Step
    public void openComingSoonPage() {
        comingSoonMoviePage.open();
    }

    @Step
    public void openComingSoonFilm(int index) {
        comingSoonMoviePage.openMovie(index);
    }

    @Step
    public void verifyMovieCannotBeScored() {
        filmPage.verifyMovieNotReleased();
    }

    @Step
    public void setMovieScore(int movieScore) {
        filmPage.setScore(movieScore);
    }

    @Step
    public void verifyMovieScoreChanged() {
        filmPage.verifyMovieWasScored();
    }
}