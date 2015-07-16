package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by bdd on 13.07.15.
 */

public class ImdbHomePage extends PageObject {

    @FindBy(id="nblogin")
    WebElementFacade loginBtn;

    @FindBy(css=".oauth-link[rel='open_google']")
    WebElementFacade openGoogle;

    @FindBy(className = "cboxIframe")
    WebElementFacade frame;

    private String imdbUrl="http://www.imdb.com/";

    public void openImdbPage(){
        getDriver().get(imdbUrl);
    }

    public void loginToImdb(){
        loginBtn.click();
        getDriver().switchTo().frame(frame);
        openGoogle.click();
        ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(0));
        getDriver().close();
        getDriver().switchTo().window(tabs2.get(1));
    }

}
