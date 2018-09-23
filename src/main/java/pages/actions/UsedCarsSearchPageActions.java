package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.UsedCarsSearchPageLocators;
import pages.utils.SeleniumDriver;

public class UsedCarsSearchPageActions {

    UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;

    public UsedCarsSearchPageActions() {
        this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
    }

    public void selectCarMake(String carBrand){
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.carMakeDropDown);
        selectCarMaker.selectByVisibleText(carBrand);
    }

    public void selectCarModel(String carModel){
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.selectModelDropDown);
        selectCarMaker.selectByVisibleText(carModel);
    }

    public void selectLocation(String location){
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.selectLocationDropDown);
        selectCarMaker.selectByVisibleText(location);
    }

    public void selectCarprice(String carPrice){
        Select selectCarMaker = new Select(usedCarsSearchPageLocators.priceDropDown);
        selectCarMaker.selectByVisibleText(carPrice);
    }

    public void clickOnFindMyNextCarButton(){
        usedCarsSearchPageLocators.findMyCarBtn.click();
    }
}
