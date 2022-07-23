package stepsDefinitions;

import io.cucumber.java.en.*;
import pages.ChallengingDomPage;

public class ChallengingDomTestsSteps {

    private ChallengingDomPage cd = new ChallengingDomPage();

    @Given("que eu navego ate a url {string}")
    public void que_eu_navego_ate_a_url(String url) {
        cd.navigateTo(url);
    }

    @When("a pagina carrega")
    public void a_pagina_carrega() {
        cd.validatePage();
    }

    @Then("clico no {string}")
    public void clico_no(String button) {
        cd.clickButtonByColor(button);
    }

    @Then("clico em todos os botoes que contem edit e delete")
    public void clico_em_todos_os_botoes_que_contem_edit_e_delete() {
        cd.clickAllButtonsEditAndDelete();
    }

}
