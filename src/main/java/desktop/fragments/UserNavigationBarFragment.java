package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserNavigationBarFragment extends AbstractFragment {
    @FindBy (xpath = "//div[@class='user-nav-wrap ']//a[@class ='home-icon-link']")
    private WebElement homeIconLink;

    @FindBy (xpath = "//div[@class='user-nav-wrap ']//li[@class ='mob-nav-account'")
    private WebElement contactUsIconLink;

    @FindBy (xpath = "//div[@class='user-nav-wrap ']//a[@href = '/help'")
    private WebElement helpIconLink;

    public UserNavigationBarFragment(WebElement element) {
        super(element);
    }

    public void homeIconLinkClick() {
        homeIconLink.click();
    }

    public void contactUsIconLinkClick() {
        contactUsIconLink.click();
    }

    public void helpIconLinkClick() {
        helpIconLink.click();
    }
}
