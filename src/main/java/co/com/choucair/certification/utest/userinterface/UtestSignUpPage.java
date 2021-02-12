package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpPage {

    public static final Target JOINTODAY_BUTTON = Target.the("button that shows us the form to Sign UP")
            .located(By.xpath("//A[@class='unauthenticated-nav-bar__sign-up'][text()='Join Today']"));

    public static final Target FIRST_NAME_USER = Target.the("text field where we can write the first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME_USER = Target.the("text field where we can write the last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_USER = Target.the("text field where we can write the last name")
            .located(By.id("email"));

    public static final Target MONTH_DATE_BIRD = Target.the("select the month date bird")
            .located(By.name("birthMonth"));

    public static final Target DAY_DATE_BIRD = Target.the("select the day date bird")
            .located(By.name("birthDay"));

    public static final Target YEAR_DATE_BIRD = Target.the("select the year date bird")
            .located(By.name("birthYear"));

    public static final Target SEARCH_LANGUAGE = Target.the("text field where we can write the language")
            .located(By.xpath("//INPUT[@type='search']"));

    public static final Target SELECT_LANGUAGE = Target.the("click in the language select")
            .located(By.xpath("(//SPAN[@class='ui-select-choices-row-inner'])"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("button that shows us the next: form (location)")
            .located(By.xpath("//A[@aria-label='Next step - define your location']//SPAN[text()='Next: Location']"));

    public static final Target CITY = Target.the("text where are you live")
            .located(By.name("city"));

    public static final Target POSTAL_CODE = Target.the("text the postal code or ZIP of you are living")
            .located(By.name("zip"));

    public static final Target COUNTRY = Target.the("country when you live")
            .located(By.className("ui-select-match-text pull-left"));

    public static final Target NEXT_DEVICES_BUTTON = Target.the("button to next section")
            .located(By.xpath("//SPAN[@aria-hidden='true'][text()='Next: Devices']"));

    public static final Target YOUR_COMPUTER = Target.the("the OS of your computer")
            .located(By.name(""));

    public static final Target VERSION = Target.the("version of your computer")
            .located(By.name(""));

    public static final Target LANGUAGE = Target.the("language of your computer")
            .located(By.name(""));
}
