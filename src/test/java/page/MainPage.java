package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final static SelenideElement setCity = $x("//input");
    private final static ElementsCollection citiesToChoose = $$x("//li[@class='mini-suggest__item mini-suggest__item_type_nav']");
    private final static SelenideElement detailedForecast = $(byText("Подробный прогноз на 10 дней"));
    public static void openWebSite(String url) {
        Selenide.open(url);
    }
    public static void enterTheCity(String city){
        setCity.sendKeys(city);
        citiesToChoose.first().click();
    }
    public static void chooseDetailedForecast(){
        detailedForecast.click();
    }
}
