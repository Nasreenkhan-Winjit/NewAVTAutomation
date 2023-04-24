package pages;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.commonmodule.Loader;
import pages.commonmodule.Login;

import java.security.Key;
import java.time.Duration;
import java.util.List;

import static org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.function;

public class PageNewAVT extends BasePage {

    //    Actions actions;
    private Loader loader;
    private WebDriver webDriver;
    private RemoteWebDriver remoteWebDriver;

    public PageNewAVT(WebDriver webDriver) {
        super(webDriver);

        this.webDriver = webDriver;
        loader = new Loader(driver);
    }


    public WebElement getShadowRootElement(WebElement element) {
        WebElement ele = (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot", element);
        return ele;
    }


    @Step(" Select customer type as Individual Work")
    public void clickOnCustomerTypeDDIndividualWork() throws InterruptedException {
//       WebElement root1 = driver.findElement(By.id("customerType"));
//       WebElement shadowRoot1 = getShadowRootElement(root1);
//       WebElement shadowElement = shadowRoot1.findElement(By.cssSelector("div"));
//       shadowElement.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement customerType = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"div\")");
        customerType.click();
        Thread.sleep(5000);
        try {
            Actions select = new Actions(driver);
            select.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER)).build().perform();
        } catch (Exception e) {
            System.out.println("Catch block");
        }
    }

    @Step(" Select customer type as Individual Home")
    public void clickOnCustomerTypeDDIndividualHome() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement customerTypeIndividualHome = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"div\")");
        customerTypeIndividualHome.click();
        Thread.sleep(5000);
        try {
            Actions select = new Actions(driver);
            select.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER)).build().perform();
        } catch (Exception e) {
            System.out.println("Catch block");
        }
    }
        @Step(" Select customer type as Individual Other")
    public void clickOnCustomerTypeDDIndividualOther() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement customerTypeIndividualOther = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"div\")");
            customerTypeIndividualOther.click();
        Thread.sleep(5000);
        try {
            Actions select = new Actions(driver);
            select.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
        } catch (Exception e) {
            System.out.println("Catch block");
        }

    }


    @Step()
    public  void checkValidationsOnContactCard() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement firstName = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#firstName\")");
        firstName.click();
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement lastName = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#lastName\")");
        lastName.click();
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement primaryContactNum = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#primaryNum\")");
        primaryContactNum.click();

        WebElement emailAddress = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#email\")");
        emailAddress.click();

    }

    @Step(" Select customer type")
    public  void enterCustomerFirstName(String txt) throws InterruptedException {
//       JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebElement selectCustomerType = (WebElement) jse.executeScript ("return document.querySelector(\"option[value='__mask_2']\")");
//        WebElement selectCustomerType = (WebElement) jse.executeScript ("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"div > select\")");
//        selectCustomerType.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement firstName = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#firstName\")");
        firstName.sendKeys(txt);
    }
 @Step(" Enter Contact Last Name")
    public  void enterCustomerContactLastName(String txt) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement lastName = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#lastName\")");
     lastName.sendKeys(txt);
    }
 @Step(" Enter primary contact number")
    public  void enterCustomerContactPrimNumber(String txt) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement primaryContactNum = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#primaryNum\")");
     primaryContactNum.sendKeys(txt);

    }

@Step(" Enter primary contact number")
    public  void enterCustomerEmailAddress(String txt) throws InterruptedException {
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    WebElement emailAddress = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#email\")");
    emailAddress.sendKeys(txt);
//    firstName.sendKeys(Keys.CONTROL + "a");
//    firstName.sendKeys(Keys.CONTROL + "x");
//    Thread.sleep(2000);


//    firstName.sendKeys("Nasreen@test.com", Keys.TAB, Keys.TAB, Keys.TAB,Keys.CONTROL + "v");
//    Thread.sleep(7000);
//    Actions select = new Actions(driver);
////125 change
//    select.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN)).click().build().perform();
//
//    Thread.sleep(15000);

//headlessui-combobox-options-67
}
    @Step(" Enter Delivery Address-WorkPlace")
    public  void enterDeliverAddressForWorkPlace(String txt) throws InterruptedException {

        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
        WebElement webEleInputAddressShadowContent = searchContext.findElement(By.cssSelector("form#addressForm input"));
        webEleInputAddressShadowContent.sendKeys(txt);

        staticExplicitWait(30);

        WebElement webElement = searchContext.findElement(By.cssSelector("form#addressForm ul>li:nth-child(3)"));
//        WebElement webElement = searchContext.findElement(By.cssSelector("form#addressForm ul>li svg:not[stroke]"));
//        WebElement webElement = searchContext.findElement(By.cssSelector("form#addressForm button"));
        webElement.click();

//        WebElement webElementAddressSelectionPicker = searchContext.findElement(By.cssSelector("form#addressForm ul>li svg>g"));
//        webElementAddressSelectionPicker.click();

    }
    @Step("Enter Workplace Name")
    public void enterWorkPlaceName(String txt){
//        form#addressForm #workplaceName

        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
        WebElement webEleInputWorkplaceName = searchContext.findElement(By.cssSelector("form#addressForm #workplaceName"));
        webEleInputWorkplaceName.sendKeys(Keys.CONTROL + "a");
        webEleInputWorkplaceName.sendKeys(Keys.DELETE);
        webEleInputWorkplaceName.sendKeys(txt);
    }
   @Step("Click and select #destinationType ")
    public void selectDestinationType(){
//        form#addressForm #workplaceName

        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
        WebElement webEleClickOnDestinationType = searchContext.findElement(By.cssSelector("form#addressForm #destinationType"));
        scrollToElement(webEleClickOnDestinationType);
       webEleClickOnDestinationType.click();

       staticExplicitWait(2);
       try{
           Actions selectDestinationType = new Actions(driver);
           selectDestinationType.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
       } catch (Exception e){
           System.out.println("Catch block");
       }
       staticExplicitWait(5);


//       #destinationName
       WebElement webEleEnterDestinationName = searchContext.findElement(By.cssSelector("form#addressForm #destinationName"));
       webEleEnterDestinationName.sendKeys("RAM Headquarter");
   }
    @Step("Click on proceed button")
    public void webEleClickOnProceedBtn(){
        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
        WebElement webElementClickOnProceedBtn = searchContext.findElement(By.cssSelector("form#addressForm button"));
        scrollToElement(webElementClickOnProceedBtn);
        webElementClickOnProceedBtn.click();
    }

    @Step("Click On Done button")
    public void webEleDoneBtn(){

        //button[normalize-space()='Done']
//
//         copyAVTReferenceNumber.sendKeys(Keys.CONTROL + "c");
//document.querySelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)")

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement webEleClickOnCopyBtnARN = (WebElement) jse.executeScript("return document.querySelector(\"body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > button:nth-child(1)\")");
        webEleClickOnCopyBtnARN.click();

        staticExplicitWait(2);

        WebElement webElementClickOnDoneBtn =driver.findElement(By.xpath("//button[normalize-space()='Done']"));
        webElementClickOnDoneBtn.click();

//        WebElement copyAVTReferenceNumber= driver.findElement(By.xpath("//span[@class='grow text-right font-medium']"));
//        copyAVTReferenceNumber.sendKeys(Keys.CONTROL + "c");
    }

    @Step("Click on AskCustomerToAssist button")
    public void webEleClickOnAskCustomerToAssistBtn(){
//        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
//        WebElement webEleClickOnAskCustomerToAssistBtn = searchContext.findElement(By.cssSelector("form#addressForm button(2)"));
//        scrollToElement(webElementClickOnProceedBtn);
//
//       button[class='mb-3 block w-full rounded-lg bg-black py-2 px-6 text-white shadow-sm outline-none focus:ring-2 focus:ring-black focus:ring-offset-2']
//        WebElement webEleClickOnAskCustomerToAssistBtn =driver.findElement(By.cssSelector("button[class='mb-3 block w-full rounded-lg bg-black py-2 px-6 text-white shadow-sm outline-none focus:ring-2 focus:ring-black focus:ring-offset-2']"));


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement webEleClickOnAskCustomerToAssistBtn = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#headlessui-tabs-panel-8 > div > div > div.z-50.max-w-sm.rounded-lg.bg-white.p-4 > button.mb-3.block.w-full.rounded-lg.bg-black.py-2.px-6.text-white.shadow-sm.outline-none.focus\\\\:ring-2.focus\\\\:ring-black.focus\\\\:ring-offset-2\")");
        webEleClickOnAskCustomerToAssistBtn.click();
    }
 @Step("Click on CustomerWillFix button")
    public void webEleClickOnCustomerWillFixBtn(){
//        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
//        WebElement webEleClickOnAskCustomerToAssistBtn = searchContext.findElement(By.cssSelector("form#addressForm button(2)"));
//        scrollToElement(webElementClickOnProceedBtn);
//
//       button[class='mb-3 block w-full rounded-lg bg-black py-2 px-6 text-white shadow-sm outline-none focus:ring-2 focus:ring-black focus:ring-offset-2']
//        WebElement webEleClickOnAskCustomerToAssistBtn =driver.findElement(By.cssSelector("button[class='mb-3 block w-full rounded-lg bg-black py-2 px-6 text-white shadow-sm outline-none focus:ring-2 focus:ring-black focus:ring-offset-2']"));


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement webEleClickOnCustomerWillFixBtn = (WebElement) jse.executeScript("return document.querySelector(\"#app > div > div.grow.overflow-y-auto > div > address-component\").shadowRoot.querySelector(\"#headlessui-tabs-panel-8 > div > div > div.z-50.max-w-sm.rounded-lg.bg-white.p-4 > button.mb-3.block.w-full.rounded-lg.bg-black.py-2.px-6.text-white.shadow-sm.outline-none.focus\\\\:ring-2.focus\\\\:ring-black.focus\\\\:ring-offset-2\")");
     webEleClickOnCustomerWillFixBtn.click();

    }


//       driver.switchTo().frame(2);
//       WebElement root1 = driver.findElement(By.id("customerType"));
//       WebElement shadowRoot1 = getShadowRootElement(root1);
//       WebElement shadowElement = shadowRoot1.findElement(By.cssSelector("div"));
//       shadowElement.click();
//       ((JavascriptExecutor) driver).executeScript("arguments[0].shadowRoot", customerType);
//       SearchContext shadowRoot = customerType.getShadowRoot();
//       ((JavascriptExecutor) driver).executeScript(driver, customerType);
//
////       String js = "arguments[0].setAttribute('value','pdf')";
////       ((JavascriptExecutor) driver).executeScript(js, customerType);
//       System.out.println("ShadowRoot1");
//       ((JavascriptExecutor) driver).executeScript("arguments[0].shadowRoot", shadowRoot);
//       System.out.println("ShadowRoot2");
//       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", shadowRoot);
//       System.out.println("ShadowRoot3");//
//            WebElement customerType = driver.findElement(By.cssSelector("#customerType"));
//            SearchContext shadowRoot = customerType.getShadowRoot();
//       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", shadowRoot);


    @Step("Click and select Home #destinationType for Home CT")
    public void selectDestinationTypeForHome(){
//        form#addressForm #workplaceName

        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
        WebElement webEleClickOnDestinationType = searchContext.findElement(By.cssSelector("form#addressForm #destinationType"));
        scrollToElement(webEleClickOnDestinationType);
        webEleClickOnDestinationType.click();

        staticExplicitWait(2);
        try{
            Actions selectDestinationType = new Actions(driver);
            selectDestinationType.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
        } catch (Exception e){
            System.out.println("Catch block");
        }
        staticExplicitWait(2);


//       #destinationName
//        WebElement webEleEnterDestinationName = searchContext.findElement(By.cssSelector("form#addressForm input"));
//        webEleEnterDestinationName.sendKeys("Automation Test");

    }

    @Step("Click and select Home #destinationType for Other CT")
    public void selectDestinationTypeForOther(){
//        form#addressForm #workplaceName

        SearchContext searchContext = getShadowHost("div#app>div>div:nth-of-type(2)>div *:nth-child(1)");
        WebElement webEleClickOnDestinationType = searchContext.findElement(By.cssSelector("form#addressForm #destinationType"));
        scrollToElement(webEleClickOnDestinationType);
        webEleClickOnDestinationType.click();

        staticExplicitWait(2);
        try{
            Actions selectDestinationType = new Actions(driver);
            selectDestinationType.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
        } catch (Exception e){
            System.out.println("Catch block");
        }
        staticExplicitWait(2);


//       #destinationName
        WebElement webEleEnterDestinationName = searchContext.findElement(By.cssSelector("form#addressForm #destinationName"));
        webEleEnterDestinationName.sendKeys("Automation Test");

    }
    @Step("Click On My Records tab to check is present in Grid")
    public void clickOnMyRecordsTab(){
        WebElement clickOnMyRecord = driver.findElement(By.xpath("//div[normalize-space()='My Records']"));
        clickOnMyRecord.click();

        staticExplicitWait(5);
//        a.key_down(Keys.CONTROL).send_keys('F').key_up(Keys.CONTROL).perform()

//        clickOnMyRecord.sendKeys(Keys.CONTROL + "f");
//        clickOnMyRecord.sendKeys(Keys.CONTROL + "v");




        

    }

    @Step("Click On My Records tab to check is present in Grid")
    public void clickOnReportingTab(){
        WebElement clickOnMyRecord = driver.findElement(By.xpath("//div[normalize-space()='Reporting']"));
        clickOnMyRecord.click();
        staticExplicitWait(5);



    }






}




