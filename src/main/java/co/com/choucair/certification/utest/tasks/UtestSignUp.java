package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSignUpPage;
import com.gargoylesoftware.htmlunit.html.Keyboard;
import io.appium.java_client.android.nativekey.PressesKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class UtestSignUp implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String languages;
    private String city;
    private String postalCode;
    private String country;
    private String yourComputer;
    private String version;
    private String computerLanguage;



    public UtestSignUp(String firstName, String lastName, String email, String month, String day, String year, String languages,
                       String city, String postalCode, String country, String yourComputer, String version, String computerLanguage)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.yourComputer = yourComputer;
        this.version = version;
        this.computerLanguage = computerLanguage;


    }

    public static UtestSignUp the(String firstName, String lastName, String email, String month, String day, String year, String languages,
                                  String city, String postalCode, String country, String yourComputer, String version, String computerLanguage) {
        return Tasks.instrumented(UtestSignUp.class, firstName, lastName, email, month, day, year, languages,
                                                     city, postalCode, country, yourComputer, version, computerLanguage);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSignUpPage.JOINTODAY_BUTTON),
                Enter.theValue(firstName).into(UtestSignUpPage.FIRST_NAME_USER),
                Enter.theValue(lastName).into(UtestSignUpPage.LAST_NAME_USER),
                Enter.theValue(email).into(UtestSignUpPage.EMAIL_USER),
                SelectFromOptions.byVisibleText(month).from(UtestSignUpPage.MONTH_DATE_BIRD),
                SelectFromOptions.byVisibleText(day).from(UtestSignUpPage.DAY_DATE_BIRD),
                SelectFromOptions.byVisibleText(year).from(UtestSignUpPage.YEAR_DATE_BIRD),
                Enter.theValue(languages).into(UtestSignUpPage.SEARCH_LANGUAGE),
                Click.on(UtestSignUpPage.SELECT_LANGUAGE),
                Click.on(UtestSignUpPage.NEXT_LOCATION_BUTTON),
                //Location
                Enter.theValue(city).into(UtestSignUpPage.CITY),
                Hit.the(Keys.DOWN).into(UtestSignUpPage.CITY),
                Hit.the(Keys.ENTER).into(UtestSignUpPage.CITY),
                Enter.theValue(postalCode).into(UtestSignUpPage.POSTAL_CODE),
                Click.on(UtestSignUpPage.NEXT_DEVICES_BUTTON));








    }
}
