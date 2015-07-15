package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com")
public class GoogleLoginPage extends PageObject {
    @FindBy(id = "Email")
    private WebElementFacade inputEmail;

    @FindBy(id = "Passwd")
    private WebElementFacade inputPassword;

    @FindBy(id = "next")
    private WebElementFacade btnNext;

    @FindBy(id = "signIn")
    private WebElementFacade btnSignIn;

    public ImdbHomePage login(String email, String password) {
        enterLogin(email);
        enterPassword(password);
        return new ImdbHomePage();
    }

    private void enterLogin(String email) {
        this.inputEmail.sendKeys(email);
        btnNext.click();
    }

    private void enterPassword(String password) {
        this.inputPassword.sendKeys(password);
        btnSignIn.click();
    }
}
