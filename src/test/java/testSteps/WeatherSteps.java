package testSteps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import page.DetailedForecastPage;
import page.MainPage;

public class WeatherSteps {
    public final static String url = "https://yandex.ru/pogoda/";

    @Дано("^Открываем https://yandex.ru/pogoda/$")
    public void openMainPage() {
        MainPage.openWebSite(url);
        System.out.println("Открываем сайт: " + url);
    }

    @Дано("^Ввести город '(.+)'$")
    public void enterCity(String city) {
        MainPage.enterTheCity(city);
        System.out.println("Вводим город " + city);
    }

    @Когда("^Выбрать подробный прогноз на 10 дней$")
    public void chooseDetailedForecast() {
        MainPage.chooseDetailedForecast();
        System.out.println("Выбираем подробный прогноз на 10 дней");
    }

    @Тогда("^Вывести погоду за (\\d+) дней$")
    public void outputDetailedForecast(Integer countDays) {
        DetailedForecastPage.detailedForecast(countDays);
    }
}
