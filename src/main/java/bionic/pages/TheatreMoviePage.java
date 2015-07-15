package bionic.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Log4Test;

@DefaultUrl("http://www.imdb.com/movies-in-theaters/?ref_=cs_inth")
public class TheatreMoviePage extends PageObject {
    private static Log4Test mLog = new Log4Test(TheatreMoviePage.class.getName());
}
