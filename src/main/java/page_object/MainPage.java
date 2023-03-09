package page_object;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Urls.BASE_URL;

public class MainPage {

    private final WebDriver driver;
    private final By loginToAccount = By.xpath(".//button[text()='Войти в аккаунт']"); //локатор кнопки Войти в аккаунт
    private final By accountButton = By.xpath(".//p[text()='Личный Кабинет']"); //локатор кнопки Личный кабинет
    private final By orderButton = By.xpath(".//button[text()='Оформить заказ']"); //локатор кнопки Оформить заказ
    private final By bunsButton = By.xpath(".//span[contains(text(),'Булки')]"); //локатор текста Булки в конструкторе
    private final By bunsInConstructor = By.xpath(".//div[@style]/div[1]"); // локатор кнопки Булки в конструкторе
    private final By saucesButton = By.xpath(".//span[contains(text(),'Соусы')]"); //локатор текста Соусы
    private final By saucesInConstructor = By.xpath(".//div[@style]/div[2]"); // локатор кнопки Соусы в конструкторе
    private final By fillingButton = By.xpath(".//span[contains(text(),'Начинки')]"); //локатор текста Начинки
    private final By fillingsInConstructor = By.xpath(".//div[@style]/div[3]");// локатор кнопки в конструкторе
    private final By setBurgerIndicator = By.xpath(".//*[text()='Соберите бургер']"); //локатор надписи Соберите бургер

    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    @Step("Open main page")
    public void open() {//открыть страницу сайта stellar burgers
        driver.get(BASE_URL);
    }

    @Step("click on the Login button")
    public void clickLogin() {
        driver.findElement(loginToAccount).click();
    }

    @Step("Check if the inscription is displayed Соберите бургер on the main page")
    public boolean isBurgerInscriptionDisplayed() {
        return driver.findElement(setBurgerIndicator).isDisplayed();
    }

    @Step("Check if the Checkout button is displayed on the main page")
    public boolean isMainPageOpen() {
        return driver.findElement(orderButton).isDisplayed();
    }

    @Step("Click on the Personal Account button")
    public void clickAccountButton() {
        driver.findElement(accountButton).click();
    }

    @Step("Click on the bun button")
    public void clickBunsButton() {
        driver.findElement(bunsButton).click();
    }

    @Step("Click on the sauces button")
    public void clickSaucesButton() {
        driver.findElement(saucesButton).click();
    }

    @Step("Click on the fillings button")
    public void clickFillingsButton() {
        driver.findElement(fillingButton).click();
    }

    @Step("Get the text of the selected bun button")
    public String getTextFromSelectedBun() {
        return driver.findElement(bunsInConstructor).getText();
    }

    @Step("Get the text of the selected sauces button")
    public String getTextFromSelectedSauces() {
        return driver.findElement(saucesInConstructor).getText();
    }

    @Step("Get the text of the selected fillings button")
    public String getTextFromSelectedFilling() {
        return driver.findElement(fillingsInConstructor).getText();
    }


}
