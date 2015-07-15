package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Log4Test;
import java.util.List;

@DefaultUrl("http://www.imdb.com/movies-coming-soon/?ref_=inth_cs")
public class ComingSoonMoviePage extends PageObject {
    private static Log4Test mLog = new Log4Test(ComingSoonMoviePage.class.getName());

    public FilmPage openMovie(int index) {
        mLog.info("Obtaining movies list.");
        List<WebElementFacade> movies = findAll("//div[contains(@class,'list_item')]//h4[@itemprop='name']");
        mLog.info("Go to movie page.");
        movies.get(index).click();
        return new FilmPage();
    }
}
