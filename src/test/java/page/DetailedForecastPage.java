package page;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class DetailedForecastPage {
    private final static ElementsCollection morning = $$x("//td[@class='weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper']/..//span[contains(text(), 'утром')]\n");
    private final static ElementsCollection day = $$x("//td[@class='weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper']/..//span[contains(text(), 'днём')]");
    private final static ElementsCollection evening = $$x("//td[@class='weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper']/..//span[contains(text(), 'вечером')]");
    private final static ElementsCollection night = $$x("//td[@class='weather-table__body-cell weather-table__body-cell_type_daypart weather-table__body-cell_wrapper']/..//span[contains(text(), 'ночью')]");
    private final static ElementsCollection dayName = $$x("//h2[contains(@class,'title')]/..//span[@class='a11y-hidden']");

    public static void detailedForecast(Integer countDays){
        for (int i = 0; i < countDays; i++) {
            System.out.println(dayName.get(i).getOwnText());
            System.out.println(morning.get(i).getOwnText());
            System.out.println(day.get(i).getOwnText());
            System.out.println(evening.get(i).getOwnText());
            System.out.println(night.get(i).getOwnText() + "\n");
        }
    }
}
