package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    WebDriver driver;
    private By dropDownField=By.id("dropdown");
    private By emailLocator=By.id("email-input");
    private By passwordLocator=By.id("password-input");
    private By LoginButtonLocator=By.id("login-button");
    public DropDownPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void dropDownChoose(String option)
    {
        Select optionSelected=dropdownFind();
        optionSelected.selectByVisibleText(option);
        WebElement emailElement=driver.findElement(emailLocator);
        WebElement passElement=driver.findElement(passwordLocator);
        WebElement LoginButtonElement=driver.findElement(LoginButtonLocator);
    }
    public List<String> getSelectedOption()
    {
        Select OptionSelected=dropdownFind();
        return OptionSelected.getAllSelectedOptions().stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public Select dropdownFind()
    {
        Select optionSelected=new Select(driver.findElement(dropDownField));
        return optionSelected;
    }


}
