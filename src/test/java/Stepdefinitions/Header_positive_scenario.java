package Stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.io.IOException;
import Reusable_Functions.Generic_functions;

public class Header_positive_scenario extends Generic_functions {
    static boolean value;
    String text,context_app;
    @Given("Launch URL")
    public void launch_URL() throws Exception {
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
            takeScreenShot("launch_URL");
        }
    }

    @When("Navigated to the 'Header' page")
    public void navigated_header_page() throws Exception {
        try {
            app_login(2,4);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("navigated_header_page");
        }
    }
/*TC_001_Validate that the mpowered health logo/hamburger in the header*/
    @Then("Verify hamburger in the header")
    public void header_positive_tc_001() throws Exception {
        try {
        page_wait(6000);
        } catch (Exception e){
            e.printStackTrace();
           takeScreenShot("header_positive_tc_001");
        }

    }
/*TC_002_Validation of the Drop down tab */
    @When("Click on Drop down or  hamburger tab")
    public void click_DropDown_Hamburger() throws Exception {
        try {
            value = driver.findElement(By.xpath(OR_reader("hamburger"))).isDisplayed();
            Assert.assertEquals(true, value);
            page_wait(1000);
            click("hamburger");
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_DropDown_Hamburger");
        }
    }

    @Then("Verify the drop down options")
    public void verify_dropdown_options() throws IOException {
        click("hamburger_back");
    }
/* TC_003_Validate profile page on clicking  Your profile tab*/

    @Then("click on  Your profile")
    public void click_your_profile() throws Exception {
        value=driver.findElement(By.xpath(OR_reader("your_profile"))).isDisplayed();
        Assert.assertEquals(true,value);
        click("your_profile");
    }

    @And("Verify the profile page")
    public void verify_profile_page() throws Exception {
        try{
        value=driver.findElement(By.xpath(OR_reader("your_profile_title"))).isDisplayed();
        Assert.assertEquals(true,value);
        click("back_button");}
        catch (Exception e){
            e.printStackTrace();
            takeScreenShot("verify_profile_page");
        }
    }

    /* TC_004_Validate  Your ratings dashboard */

    @Then("click on  Your ratings")
    public void click_your_ratings() throws IOException {
        click("header_rating");
    }

    @Then("Verify  the ratings dashboard page.")
    public void verify_Ratings_dashboard() throws Exception {
        try{
        value=driver.findElement(By.xpath(OR_reader("header_rating_title"))).isDisplayed();
        Assert.assertEquals(true,value);
        page_wait(2000);
        click("back_button");}
        catch (Exception e){
            e.printStackTrace();
            takeScreenShot("verify_Ratings_dashboard");
        }
    }

    /*TC_005_Validate the alerts page */
    @When("Click on Your alerts icon")
    public void click_alerts_icon() throws Exception {
        click_DropDown_Hamburger();
        click("header_alert");
    }

    @Then("Verify the alerts page")
    public void verify_alerts_Page() throws Exception {
        try {
            page_wait(2000);
            text = driver.findElement(By.xpath(OR_reader("header_alert_title"))).getText();
            Assert.assertEquals(text,"Your alerts");
            click("back_button");
            System.out.println("4");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("header_positive_tc_005");
        }
    }


    /*TC_006_Validate Help or FAQ  page*/
    @Then("click on Help icon")
    public void click_help_icon() throws IOException {
        click("header_FAQ");
    }

    @Then("Verify  the help or FAQ page")
    public void TC_007_Validate_Help_or_FAQ_page() throws Exception {
        try {
            page_wait(2000);
            text = driver.findElement(By.xpath(OR_reader("header_FAQ_title"))).getText();
            System.out.println(text);
            Assert.assertEquals(text,"Frequently asked questions");
            click("back_button");
            System.out.println("4");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("header_positive_tc_007");
        }
    }

    /*TC_007_Validate the Contact Us page*/
    @Then("click on  Contact Us")
    public void click_contact_us() throws IOException {
        click("header_contact_us");
        page_wait(7000);
    }

    @Then("Verify  Contact Us page")
    public void verify_contact_us() throws Exception {
        try {
            page_explicit_wait("contactus_firstname");
            text = driver.findElement(By.xpath(OR_reader("header_contact_us_title"))).getText();
            Assert.assertEquals(text,"Contact Us");
            page_wait(2000);
              driver.findElement(By.xpath(OR_reader("contactus_firstname"))).sendKeys("test");
              page_wait(2000);
            driver.findElement(By.xpath(OR_reader("contactus_lastname"))).sendKeys("test");
            page_wait(2000);
            driver.findElement(By.xpath(OR_reader("contactus_email"))).sendKeys("test@test.com");
         Actions builder=new Actions(driver);
         builder.click(driver.findElement(By.xpath(OR_reader("contactus_feedback")))).build().perform();
         builder.sendKeys("testing").build().perform();
            builder.click(driver.findElement(By.xpath(OR_reader("contactus_submit")))).build().perform();
/*            page_wait(40000);
            page_explicit_wait("contactus_success");
            text=driver.findElement(By.xpath(OR_reader("contactus_success"))).getText();
            Assert.assertEquals("Thank you",text);*/
               app_launch();
               page_wait(6000); launch_URL();navigated_header_page();
                System.out.println("8");
        } catch (Exception e) {
            e.printStackTrace();
          //  takeScreenShot("verify_contact_us");
        }
    }
/*TC_008_Validate  Privacy Policy dialogue box on clicking on the Privacy Policy*/
    @Then("click on  Privacy Policy")
    public void click_privacy_policy() throws IOException {
        page_wait(2000);
        click("header_privacy_policy");
    }

    @Then("Verify the dialogue box")
    public void verify_dialogue_box() throws Exception {
        try {
            page_wait(8000);
            text = driver.findElement(By.xpath(OR_reader("header_privacy_policy_title"))).getText();
            Assert.assertEquals(text,"Privacy Policy");
                driver.findElement(By.xpath(OR_reader("header_privacy_ok"))).click();
                click("header_back");
                  System.out.println("9");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("header_positive_tc_009");
        }
    }

    /*TC_009_Validate Terms & Conditions dialogue box on clicking on the Terms & Conditions*/
    @Then("click on  Terms & Conditions")
    public void click_terms_conditions() throws IOException {
       click("header_terms_conditions");
        page_wait(9000);
    }

    @Then("Verify the  dialogue box on terms and conditions page")
    public void verify_terms_conditions() throws Exception {
        try {
            text = driver.findElement(By.xpath(OR_reader("header_terms_conditions_title"))).getText();
            Assert.assertEquals(text,"Terms & Conditions");
            click("header_terms_conditions_ok");
            click("header_back");
            System.out.println("10");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("header_positive_tc_010");
        }
    }

    /*TC_010_Validate that the user is navigated to the Feedback Port   page  on clicking Feedback*/
    @Then("click on  Feedback")
    public void click_feedback() throws Exception {
        page_explicit_wait("hamburger");
        click_DropDown_Hamburger();
        page_wait(6000);
        click("header_feedback");
        page_wait(9000);
    }

    @And("Verify the Feedback Port.")
    public void verify_feedback_port() throws Exception {
        try {
            page_wait(20000);
            driver.findElement(By.xpath(OR_reader("your_feedback"))).sendKeys("Test");
            driver.findElement(By.xpath(OR_reader("feedback_details"))).sendKeys("test");
            page_wait(4000);
            driver.findElement(By.xpath(OR_reader("feedback_email"))).sendKeys("test@test.com");
            page_wait(5000);
            click("feedback_share");
            page_wait(8000);
            System.out.println("6");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("header_positive_tc_010");
        }
    }
    @And("Verify the thank you message")
    public void verify_thankYou_message() throws Exception {
        try{
            // page_wait(6000);
            text=driver.findElement(By.xpath(OR_reader("feedback_thankyou"))).getText();
            Assert.assertEquals("Thank you for your feedback.",text);
            driver.launchApp();
            page_wait(2000);
            launch_URL();
            navigated_header_page();
        }
        catch(Exception e){
            e.printStackTrace();
            takeScreenShot("verify_thankYou_message");
        }
    }
    /*TC_011_Validate the Landing page on clicking Log out icon*/
    @When("click on Log out icon")
    public void click_logOut() throws Exception {
        page_wait(6000);
        click_DropDown_Hamburger();
        click("logout");
    }

    @Then("Verify navigation to the Landing  page")
    public void verify_landing_page() throws IOException {
       value=driver.findElement(By.xpath(OR_reader("login_page_title"))).isDisplayed();
        Assert.assertEquals(true,value);
    }

}
