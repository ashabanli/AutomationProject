package day4_hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.DocuportConstants;
import utilities.WebDriverFactory;

public class Tasks01 {
    public static void main(String[] args) throws InterruptedException {
//       . go to docuport app
//        2. validate that Home, Received docs, My uploads, Invitations are displayed
//        3. press three lines
//        4. Home, Received docs, My uploads, Invitations will disappear
//        5. Validate the buttons are not displayed


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PLACEHOLDER_FOR_PASSWORD);
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        loginBtn.click();

        Thread.sleep(2000);
        WebElement continueBTtn = driver.findElement(By.xpath("//button[@type='submit']"));
        continueBTtn.click();

        //  2. validate that Home, Received docs, My uploads, Invitations are displayed

        Thread.sleep(2000);
        WebElement homePage = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[1]"));
        Thread.sleep(2000);
        System.out.println("homePage.isDisplayed() = " + homePage.isDisplayed());
        Thread.sleep(2000);
        WebElement receivedDocs = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[2]"));
        Thread.sleep(2000);
        System.out.println("receivedDocs.isDisplayed() = " + receivedDocs.isDisplayed());
        Thread.sleep(2000);
        WebElement myUploads = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[3]"));
        System.out.println("myUploads.isDisplayed() = " + myUploads.isDisplayed());
        Thread.sleep(3000);
        WebElement invitations = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[4]"));
        System.out.println("invitations.isDisplayed() = " + invitations.isDisplayed());

        // 3. press three lines
        WebElement threeLineBtn = driver.findElement(By.xpath("(((//div[@class='col col-4']/button"));
        threeLineBtn.click();
        Thread.sleep(2000);
        //       5. Validate the buttons are not displayed

        WebElement homePage2 = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[1]"));
        Thread.sleep(2000);
        System.out.println("homePage.isDisplayed() = " + homePage.isDisplayed());
        Thread.sleep(2000);
        WebElement receivedDocs2 = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[2]"));
        Thread.sleep(2000);
        System.out.println("receivedDocs.isDisplayed() = " + receivedDocs.isDisplayed());
        Thread.sleep(2000);
        WebElement myUploads2 = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[3]"));
        System.out.println("myUploads.isDisplayed() = " + myUploads.isDisplayed());
        Thread.sleep(3000);
        WebElement invitations2 = driver.findElement(By.xpath("(//div[@class='v-list-item__content'])[4]"));
        System.out.println("invitations.isDisplayed() = " + invitations.isDisplayed());
    }
    }

