package day4_hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DocuportConstants;
import utilities.WebDriverFactory;

import java.util.List;

public class Task02 {
    public static void main(String[] args) throws InterruptedException {
//        1. go to docuport
//        2. sign as adviser
//        3. store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
//        4. iterate and print out href values
//
//        optional step:
//        5. Validate that expected matching to actual
//
//        Home, Received docs, My uploads, Clients, Invitations, Users, Leads, Bookkeeping, 1099 form, Reconciliation

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys("b1g2_advisor@gmail.com");
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PLACEHOLDER_FOR_PASSWORD);
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        loginBtn.click();
        Thread.sleep(2000);
//        WebElement continueBTtn = driver.findElement(By.xpath("//button[@type='submit']"));
//        continueBTtn.click();
//
//        Thread.sleep(2000);
//        WebElement threeLineBtn = driver.findElement(By.xpath("(((//div[@class='col col-4']/button"));
//        threeLineBtn.click();
//        Thread.sleep(2000);

        List<WebElement> list = driver.findElements(By.tagName("a"));
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getText().equals("")) {
                System.out.println("list.get(i).getText() = " + list.get(i).getText());
                System.out.println("list.get(i).getAttribute = " + list.get(i).getAttribute("href"));

            }

        }
        driver.quit();
    }
}