package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class OpenGoogleDefinitions
{
    WebDriver Driver;

    @Given("^the user navigates to JavaTpoint.com$")
    public void Setup()
    {
        WebDriverManager.chromedriver().setup();
        Driver=new ChromeDriver();
        Driver.get("https://www.javatpoint.com/");
    }
    @When("^the user clicks on Feedback, then the Feedback page opens$")
    public void feedbackpage() {
        logger.info("navigates to feedback page");
    }
    @And("^the user submits feedback message$")
    public void userfeedback() throws InterruptedException {
//Driver.findElement(By.xpath("//input[@id='le']")).sendKeys("nandhakumaaran142@gmail.com");
//Thread.sleep(5000);
        logger.info("User submit the Feedback")
        Driver.findElement(By.xpath("//input[@id='lp']")).sendKeys("1234567890");

        Thread.sleep(5000);
        Driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

    }
    @Then("^feedback should be received on the admin page$")
    public void validate() {
        System.out.print("you had got an feedback");
        String dtr= Driver.getTitle();
        Assert.assertTrue(dtr.contains("Login"));
    }
    @And("^admin can reply to the user$")
    public void reply{
    logger.info("admin can reply to the user");
}



}




