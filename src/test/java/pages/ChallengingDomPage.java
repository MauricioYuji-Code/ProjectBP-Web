package pages;

import core.CommonsBasePage;
import org.openqa.selenium.By;

public class ChallengingDomPage extends CommonsBasePage {

    private By btnBlue = By.className("button");
    private By btnRed = By.xpath("//a[2]");
    private By btnGreen = By.xpath("//a[3]");
    private By lblChallengingDOM = By.xpath("//h3[contains(text(),'Challenging DOM')]");

    public void navigateTo(String url) {
        navigate(url);
    }

    public void validatePage() {
        waitElementAppeared(lblChallengingDOM);
        validateConditionTrue("A página não carregou", getDriver().getPageSource().contains("Challenging DOM"));
    }

    public void clickButtonByColor(String color) {
        switch (color) {
            case "blue_button":
                clickElement(btnBlue);
                break;
            case "red_button":
                clickElement(btnRed);
                break;
            case "green_button":
                clickElement(btnGreen);
                break;
            default:
                System.out.println("O botão não foi encontrado");
        }
    }

    public void clickAllButtonsEditAndDelete() {
//        waitElementAppeared(By.xpath("//tbody/tr[" + 10 + "]/td[7]/a[1]"));
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= i; j++) {
                //Edit
                clickElement(By.xpath("//tbody/tr[" + i + "]/td[7]/a[1]"));
                //Delete
                clickElement(By.xpath("//tbody/tr[" + j + "]/td[7]/a[2]"));
                System.out.println("Valor do I: " + i + "\nValor do J: " + j);
            }
        }
    }
}
