package Stepdefinitions;

import Reusable_Functions.Generic_functions;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class Services_positive_scenario extends Generic_functions {
    static boolean value;
    String text;
    List<MobileElement> healthcare_rec;
    List<MobileElement> healthcare_fin;
    @Given("Home page of mpowered health app")
    public void home_page() throws Exception {
        try {
            app_launch();
            page_wait(4000);
            driver.resetApp();
            value = driver.findElement(By.xpath(OR_reader( "welcome_page_title"))).isDisplayed();
            Assert.assertEquals(true,value);
            page_wait(4000);
            click("welcome_login");page_explicit_wait("continue");
            click("continue");
            page_wait(9000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("home_page");
        }
    }

    @When("Login with valid credentials")
    public void login_page() throws Exception {
        try {
            app_login(2,4);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("login_page");
        }
    }

    @Then("Click on Services tab")
    public void click_services_tab() throws IOException {
        page_explicit_wait("services");
        click("services");
    }

    @Given("Services page")
    public void services_page() {

    }

    @When("Click on Second opinion tile")
    public void click_second_opinion() {
        healthcare_rec=driver.findElements(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther//XCUIElementTypeOther[1]"));
        System.out.println(healthcare_rec.size());
        for(MobileElement m:healthcare_rec){
            System.out.println(m.getText());
        }
        healthcare_rec.get(0).click();
    }

    @Then("Verify second opinion page")
    public void verify_second_opinion_page() {
        text=driver.findElement(By.xpath("//XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")).getText();
        Assert.assertEquals(text,"Second opinions");
        driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton")).click();
    }

    @When("click on Conditions")
    public void click_conditions() {
        healthcare_rec.get(1).click();
    }

    @Then("Verify Conditions page")
    public void verify_condition_page() {
        text=driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")).getText();
        Assert.assertEquals(text,"Conditions");
        driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton")).click();
    }

    @When("Click on medications page")
    public void click_medication_page() {
        healthcare_rec.get(2).click();
    }

    @Then("Verify Medications page")
    public void verifyMedicationsPage() {
        text=driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")).getText();
        Assert.assertEquals(text,"Medications");
        driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton")).click();
    }

    @When("Click Bills page")
    public void click_bills_page() {
        healthcare_fin=driver.findElements(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]"));
        System.out.println(healthcare_fin.size());
        healthcare_fin.get(0).click();
    }

    @Then("Verify Bills page")
    public void verifyBillsPage() {
        text=driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")).getText();
        Assert.assertEquals(text,"Bills");
        driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton")).click();
    }

    @When("Click claims page")
    public void clickClaimsPage() {
        healthcare_fin.get(1).click();
    }

    @Then("Verify Claims page")
    public void verifyClaimsPage() {
        text=driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")).getText();
        Assert.assertEquals(text,"Claims");
        driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton")).click();
    }
}
