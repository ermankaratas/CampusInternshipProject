package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.List;

public class TopNav {
    @FindBy(xpath = "(//ms-layout-menu-button//button)[1]")
    public WebElement coursesButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[2]")
    public WebElement calendarButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[3]")
    public WebElement attendanceButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[4]")
    public WebElement assignmentsButton;
    @FindBy(xpath = "(//ms-layout-menu-button//button)[5]")
    public WebElement gradingButton;
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger mat-button-wrapper mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']")
    public WebElement hamburgerMenu;
    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingButton;
    @FindBy(xpath = "(//div/span[1])[6]")
    public WebElement welcomeText;

    @FindBy(xpath = "//span[contains(.,' Calendar ')]")
    public WebElement calendarText;
    @FindBy(xpath = "//span[contains(.,' Attendance ')]")
    public WebElement attendanceText;
    @FindBy(xpath = "//span[contains(.,' Assignments ')]")
    public WebElement assigmentsText;
    @FindBy(xpath = "//span[contains(.,' Grading ')]")
    public WebElement gradingText;
    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
    public List<WebElement> hamburgMenuList;
    @FindBy(xpath = "//span[contains(.,' Student_9 11A')]")
    public WebElement student_9Text;
    @FindBy(xpath = "//span[contains(.,' Messages')]")
    public WebElement messagesText;
    @FindBy(xpath = "//div/user-chat-bell")
    public WebElement chatsButton;
    @FindBy(xpath = "//div/user-message-bell")
    public WebElement messageBoxButton;
    @FindBy(xpath = "//span[contains(.,' Student_5 11A - Mark Zuckerberg')]")
    public WebElement chatsWindow;
    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[2]")
    public WebElement profileButton;
    @FindBy(xpath = "//button[@role='menuitem']")
    public List<WebElement> profileButtonList;
}
