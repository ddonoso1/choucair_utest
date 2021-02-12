package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.SingUpData;
import co.com.choucair.certification.utest.tasks.OpenUp;
import co.com.choucair.certification.utest.tasks.UtestSignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class utestStepDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Camilo wants to know the tester comunity$")
    public void camiloWantsToKnowTheTesterComunity() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage());
        //throw new PendingException();
    }

    @When("^he write the personal information on the utest register forms$")
    public void heWriteThePersonalInformationOnTheUtestRegisterForms(List<SingUpData> singUpData) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(UtestSignUp.the(singUpData.get(0).getStrFirstName(),
                singUpData.get(0).getStrLastName(),
                singUpData.get(0).getStrEmail(),
                singUpData.get(0).getMonth(),
                singUpData.get(0).getDay(),
                singUpData.get(0).getYear(),
                singUpData.get(0).getLanguages(),
                singUpData.get(0).getCity(),
                singUpData.get(0).getPostalCode(),
                singUpData.get(0).getCountry(),
                singUpData.get(0).getYourComputer(),
                singUpData.get(0).getVersion(),
                singUpData.get(0).getComputerLanguage()
                ));
        //throw new PendingException();
    }

    @Then("^he creates his new utest account$")
    public void heCreatesHisNewUtestAccount() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
