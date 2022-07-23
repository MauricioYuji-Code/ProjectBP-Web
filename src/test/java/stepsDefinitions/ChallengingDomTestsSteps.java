package stepsDefinitions;

import io.cucumber.java.en.*;
import pages.ChallengingDomPage;

public class ChallengingDomTestsSteps {

    private ChallengingDomPage cd = new ChallengingDomPage();

    @Given("que eu navego até a url {string}")
    public void que_eu_navego_até_a_url(String url) {
        cd.navigateTo(url);
    }

    @When("a página carrega")
    public void a_página_carrega() {
        cd.validatePage();
    }

    @Then("clico no {string}")
    public void clico_no(String button) {
        cd.clickButtonByColor(button);
    }

    @Then("clico em todos os botões que contém edit e delete")
    public void clico_em_todos_os_botões_que_contém_edit_e_delete() {
        cd.clickAllButtonsEditAndDelete();
    }

}
