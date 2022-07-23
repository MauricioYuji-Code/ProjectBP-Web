package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public void createDriver() {
        //Caso não esteja com a variável de ambiente configurada, ajuste o caminho e desmarque a linha abaixo
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
