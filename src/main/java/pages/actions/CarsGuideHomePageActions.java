package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.CarsGuideHomePageLocators;
import pages.utils.SeleniumDriver;

public class CarsGuideHomePageActions {

    CarsGuideHomePageLocators carsGuideHomePageLocators = null;

    public CarsGuideHomePageActions() {
        this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
    }

    public void moveToCarsForSaleMenu(){
        Actions actions = new Actions(SeleniumDriver.getDriver());
        actions.moveToElement(carsGuideHomePageLocators.carsForSaleLink).perform();

    }

    public void clickOnSearchCarsMenu(){
        //moveToCarsForSaleMenu
        carsGuideHomePageLocators.searchCarsLink.click();
    }

    public void clickOnUsedCarsSearchMenu(){
        //moveToCarsForSaleMenu
        carsGuideHomePageLocators.usedCarSearchLink.click();
    }

    public void moveToSellMyCarMenu(){
        Actions actions = new Actions(SeleniumDriver.getDriver());
        actions.moveToElement(carsGuideHomePageLocators.sellMyCarLink).perform();
    }
}
