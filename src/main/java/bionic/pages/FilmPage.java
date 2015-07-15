package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utils.Log4Test;
import java.util.List;
import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class FilmPage extends PageObject {
    private static Log4Test mLog = new Log4Test(FilmPage.class.getName());
    @FindBy(xpath = "//span[@itemprop='ratingValue']")
    WebElementFacade currentScore;
    @FindBy(xpath = "//a[contains(text(),'Not yet released')]")
    WebElementFacade notReleasedMovie;

    /**
     * This method sets score to the film
     * @param score should be from 1 to 10
     */
    public void setScore(int score) {
        List<WebElementFacade> movieRate = findAll("//td[@id='overview-top']//span[@class='rating-stars']/a");
        movieRate.get(score).click();
    }

    /**
     * Return the average score of the movie
     * @return average score
     */
    public double getAverageScore() {
        mLog.info("Get current movie score.");
        return Double.valueOf(currentScore.getText());
    }

    /**
     * This method get score of movie (when user sets it), not the average score
     * @return score of movie set by user
     */
    public int getMovieScoreCount() {
        List<WebElementFacade> movieRate = findAll("//td[@id='overview-top']//a[@class='rating-your']");
        int actualScore = movieRate.size();
        return actualScore;
    }

    /**
     * Verifies if the movie can be scored.
     * @return true = if can be; false - if not;
     */
    public boolean isMovieCanBeScored() {
         return !notReleasedMovie.isDisplayed();
    }

    public void verifyMovieNotReleased() {
        mLog.info("Verifying if the movie is not released.");
        assertFalse(isMovieCanBeScored());
    }

    public void verifyMovieScore(int expectedScore) {
        mLog.info("Verifying the movie score.");
        List<WebElementFacade> movieRate = findAll("//td[@id='overview-top']//a[@class='rating-your']");
        int actualScore = movieRate.size();
        assertEquals(expectedScore, actualScore);
    }

    private boolean isMovieScored() {
        boolean isScored = getMovieScoreCount() != 0;
        return isScored;
    }

    public void verifyMovieWasScored() {
        assertTrue(isMovieScored());
    }
}
