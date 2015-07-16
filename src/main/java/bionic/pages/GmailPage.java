package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Created by 1 on 15.07.2015.
 */

public class GmailPage extends PageObject {

    private String addAccountUrl = "https://accounts.google.com/ServiceLogin?sacu=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=uk&service=mail#identifier";

    @FindBy(id="Email")
    WebElementFacade emailField;

    @FindBy(id="next")
    WebElementFacade nextBtn;

    @FindBy(id="Passwd")
    WebElementFacade passwordField;

    @FindBy(id="signIn")
    WebElementFacade signInBtn;

    public void openAddAccountPage(){
        getDriver().get(addAccountUrl);
    }

    public void logIn(String email, String password){
        emailField.sendKeys(email);
        nextBtn.click();

        passwordField.sendKeys(password);
        signInBtn.click();
    }

    public boolean isLoggedIn(String email){
        return findAll(By.cssSelector("a[title*='"+email+"']")).size()>0;
    }


}
