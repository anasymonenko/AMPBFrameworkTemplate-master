package desktop.pages;

import abstractclasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
    private static final String PAGE_URL = "https://www.bookdepository.com/account/login/to/account";

    @FindBy(id = "ap_email")
    WebElement signInEmailInput;

    @FindBy (id = "ap_password")
    WebElement signInPasswordInput;

    @FindBy (name = "rememberMe")
    WebElement rememberMeCheckbox;

    @FindBy (id = "auth-show-password-checkbox-container")
    WebElement showPasswordCheckbox;

    @FindBy (id = "signInSubmit")
    WebElement signInSubmitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage openPage() {
        driver.get(PAGE_URL);
        return this;
    }

    public void enterEmail(String email){
        signInEmailInput.sendKeys(email);
    }

    public void enterPassword(String password){
        signInPasswordInput.sendKeys(password);
    }

    public void checkShowPasswordCheckbox(){
        showPasswordCheckbox.click();
    }

    public void checkRememberMeCheckbox(){
        rememberMeCheckbox.click();
    }

    public void clickOnSignInButton(){
        signInSubmitButton.click();
    }

    public void signInToSite(String email, String password){
        signInEmailInput.sendKeys(email);
        signInPasswordInput.sendKeys(password);
        signInSubmitButton.click();
    }
}
