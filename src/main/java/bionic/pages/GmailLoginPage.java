package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by Illya on 14.07.2015.
 */
@DefaultUrl("https://gmail.com")
public class GmailLoginPage extends PageObject{

    @FindBy(id = "Email")
    private WebElementFacade emailField;

    @FindBy(id = "Passwd")
    private WebElementFacade passField;

    private static final String URL_MATCH="mail";

    public void openPage() {
        open();
        getDriver().manage().window().maximize();
    }

    public GmailLoginPage enterLogin(String login) {
        emailField.typeAndEnter(login);
        return this;
    }

    public GmailLoginPage enterPass(String pass) {
        passField.typeAndEnter(pass);
        new WebDriverWait(getDriver(), 10).until(titleContains("@gmail"));
        return this;
    }

    public boolean isLogined() {
        return getDriver().getCurrentUrl().contains(URL_MATCH);
    }
}
