package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;

/**
 * Created by Illya on 15.07.2015.
 */
public class TheatreMoviePage extends PageObject {

    @FindBy(xpath="//*[@id='overview-top']//*[@class='rating-stars']/a[7]")
    private WebElementFacade rateMovieLink;

    @FindBy(xpath="//*[@class='rating-rating rating-your']/*[@class='value']")
    private WebElementFacade yourRateLink;

    @FindBy(xpath="//*[@id='overview-top']//div[@class='star-box-details']/a[contains(@href, 'ratings')]")
    private WebElementFacade statisticsUsers;

    @FindBy(css=".cboxIframe")
    private WebElementFacade loginFrame;

    private static String statistics;

    @WhenPageOpens
    private void loadStatistic() {
        //statistics = statisticsUsers.getText();
    }

    public void clickRateMovieLink() {
        statistics = statisticsUsers.getText();
        rateMovieLink.click();
    }

    public boolean isStatisticsChanged() {
        return (!statistics.equals(statisticsUsers.getText()));
    }

    public boolean isYourRateIsDisplyed() {
        if (yourRateLink.isCurrentlyVisible()) {
            return (!"-".equals(yourRateLink.getText()));
        } return true;
    }

    public boolean isLoginFrameIsDisplayed() {
        try {
            getDriver().switchTo().frame(loginFrame);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
