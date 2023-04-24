package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.commonmodule.Loader;

import java.util.*;

public class TestPageNewAVT extends TestBase {

    PageDashBoard pageDashBoard;
    PageNewAVT pageNewAVT;


    @BeforeClass
    public void init() {
        pageNewAVT = new PageNewAVT(eventFiringWebDriver);
    }

    Loader loader;

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify valid user are allowed to access")



    @Test
    public void clickOnConsignment() throws InterruptedException {
        Thread.sleep(30000);


        pageDashBoard = new PageDashBoard(eventFiringWebDriver);
        pageDashBoard.clickOnNavBar();

    }


    @Test(dataProviderClass = DataProviderList.class, dataProvider = "NewAvtDataFile")
    public void createRecordWithIndividualWork(Map<String, String> testDataSet) throws InterruptedException {


        Thread.sleep(5000);
        pageDashBoard.clickOnNewAVTViaAccordion();
        Thread.sleep(5000);


        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
        eventFiringWebDriver.switchTo().window(tabsCount.get(1));
        pageNewAVT = new PageNewAVT(eventFiringWebDriver);
        Thread.sleep(15000);
//        pageConsignment.clickOnCustomerTypeDD();
        pageNewAVT.clickOnCustomerTypeDDIndividualWork();
//        pageConsignment = new PageNewAVT(eventFiringWebDriver);
        pageNewAVT = new PageNewAVT(eventFiringWebDriver);
        Thread.sleep(5000);
        pageNewAVT.checkValidationsOnContactCard();
        Thread.sleep(5000);
        pageNewAVT.enterCustomerFirstName(testDataSet.get("CustomerFirstName"));
        Thread.sleep(5000);
        pageNewAVT.enterCustomerContactLastName(testDataSet.get("CustomerLastName"));
        pageNewAVT.enterCustomerContactPrimNumber(testDataSet.get("ContactPrimNumber"));
        pageNewAVT.enterCustomerEmailAddress(testDataSet.get("EmailAddress"));
        Thread.sleep(5000);
        pageNewAVT.enterDeliverAddressForWorkPlace(testDataSet.get("WorkDeliveryAddress"));
        Thread.sleep(10000);
        pageNewAVT.enterWorkPlaceName("AE");
        pageNewAVT.staticExplicitWait(10);
        pageNewAVT.enterWorkPlaceName(testDataSet.get("WorkplaceName"));
        pageNewAVT.staticExplicitWait(20);

        pageNewAVT.selectDestinationType();
        pageNewAVT.staticExplicitWait(20);

        pageNewAVT.webEleClickOnProceedBtn();
        pageNewAVT.staticExplicitWait(40);

        pageNewAVT.webEleDoneBtn();
//        pageDashBoard.clickOnAddressList();
        pageNewAVT.staticExplicitWait(40);

        pageNewAVT.clickOnMyRecordsTab();
        pageNewAVT.staticExplicitWait(50);

        pageNewAVT.clickOnReportingTab();
        pageNewAVT.staticExplicitWait(50);
    }


    @Test(dataProviderClass = DataProviderList.class, dataProvider = "NewAvtDataFile")
    public void createRecordWithIndividualHome(Map<String, String> testDataSet) throws InterruptedException {

//        Thread.sleep(5000);
//        pageDashBoard.clickOnNewAVTViaAccordion();
//        Thread.sleep(5000);


//        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
//        eventFiringWebDriver.switchTo().window(tabsCount.get(1));
        pageNewAVT = new PageNewAVT(eventFiringWebDriver);
        Thread.sleep(15000);
//        pageConsignment.clickOnCustomerTypeDD();
        pageNewAVT.clickOnCustomerTypeDDIndividualHome();
        pageNewAVT = new PageNewAVT(eventFiringWebDriver);
        Thread.sleep(5000);
        pageNewAVT.enterCustomerFirstName(testDataSet.get("CustomerFirstName"));
        Thread.sleep(5000);
        pageNewAVT.enterCustomerContactLastName(testDataSet.get("CustomerLastName"));
        pageNewAVT.enterCustomerContactPrimNumber(testDataSet.get("ContactPrimNumber"));
        pageNewAVT.enterCustomerEmailAddress(testDataSet.get("EmailAddress"));
        Thread.sleep(5000);
        pageNewAVT.enterDeliverAddressForWorkPlace(testDataSet.get("HomeDeliveryAddress"));
        Thread.sleep(10000);
        pageNewAVT.staticExplicitWait(10);

        pageNewAVT.selectDestinationTypeForHome();
        pageNewAVT.staticExplicitWait(20);

        pageNewAVT.webEleClickOnProceedBtn();
        pageNewAVT.staticExplicitWait(40);

        pageNewAVT.webEleDoneBtn();
//        pageDashBoard.clickOnAddressList();
        pageNewAVT.staticExplicitWait(50);



    }



    @Test(dataProviderClass = DataProviderList.class, dataProvider = "NewAvtDataFile")
    public void createRecordWithIndividualOther(Map<String, String> testDataSet) throws InterruptedException {

//        Thread.sleep(5000);
//        pageDashBoard.clickOnNewAVTViaAccordion();
//        Thread.sleep(5000);
//
//
//        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
//        eventFiringWebDriver.switchTo().window(tabsCount.get(1));
//        pageNewAVT = new PageNewAVT(eventFiringWebDriver);
//        Thread.sleep(15000);
//        pageConsignment.clickOnCustomerTypeDD();
        pageNewAVT.clickOnCustomerTypeDDIndividualOther();
        pageNewAVT = new PageNewAVT(eventFiringWebDriver);
        Thread.sleep(5000);
        pageNewAVT.enterCustomerFirstName(testDataSet.get("CustomerFirstName"));
        Thread.sleep(5000);
        pageNewAVT.enterCustomerContactLastName(testDataSet.get("CustomerLastName"));
        pageNewAVT.enterCustomerContactPrimNumber(testDataSet.get("ContactPrimNumber"));
        pageNewAVT.enterCustomerEmailAddress(testDataSet.get("EmailAddress"));
        Thread.sleep(5000);
        pageNewAVT.enterDeliverAddressForWorkPlace(testDataSet.get("OtherDeliveryAddress"));
        Thread.sleep(10000);
        pageNewAVT.staticExplicitWait(10);

        pageNewAVT.selectDestinationTypeForOther();
        pageNewAVT.staticExplicitWait(20);

        pageNewAVT.webEleClickOnProceedBtn();
        pageNewAVT.staticExplicitWait(30);
        pageNewAVT.webEleClickOnAskCustomerToAssistBtn();
        pageNewAVT.staticExplicitWait(2);
        pageNewAVT.webEleClickOnCustomerWillFixBtn();
        pageNewAVT.staticExplicitWait(20);
        pageNewAVT.webEleDoneBtn();
//        pageDashBoard.clickOnAddressList();
        pageNewAVT.staticExplicitWait(50);



    }

}



