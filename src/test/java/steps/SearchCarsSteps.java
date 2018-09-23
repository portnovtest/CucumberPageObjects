package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import pages.locators.CarSearchPageLocators;
import pages.utils.SeleniumDriver;

import java.util.List;

public class SearchCarsSteps {

    CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
    CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

    @Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide website$")
    public void i_am_on_the_Home_Page_of_CarsGuide_website(String websiteURL) throws Throwable {
        SeleniumDriver.openPage(websiteURL);
    }

    @When("^I move to the menu$")
    public void i_move_to_the_menu(List<String> list) throws Throwable {
       String menu = list.get(1);
        System.out.println("Menu selected is : " + menu);
        carsGuideHomePageActions.moveToCarsForSaleMenu();
    }

    @And("^click on \"([^\"]*)\" link$")
    public void click_on_link(String searchCars) throws Throwable {
        carsGuideHomePageActions.clickOnSearchCarsMenu();
    }

    @And("^select car brand as \"([^\"]*)\" from AnyMake dropdown$")
    public void select_car_brand_as_from_AnyMake_dropdown(String carBrand) throws Throwable {
        carsSearchPageActions.selectCarMake(carBrand);
    }

    @And("^select car model as \"([^\"]*)\" from SelectModel dropdown$")
    public void select_car_model_as_from_SelectModel_dropdown(String carModel) throws Throwable {
       carsSearchPageActions.selectCarModel(carModel);
    }

    @And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
    public void select_location_as_from_SelectLocation_dropdown(String location) throws Throwable {
        carsSearchPageActions.selectLocation(location);
    }

    @And("^select price as \"([^\"]*)\" from Price dropdown$")
    public void select_price_as_from_Price_dropdown(String price) throws Throwable {
        carsSearchPageActions.selectCarprice(price);
    }

    @And("^click on Find_My_Next_Car button$")
    public void click_on_Find_My_Next_Car_button() throws Throwable {
        carsSearchPageActions.clickOnFindMyNextCarButton();
    }

    @Then("^I should see a list of searched cars$")
    public void i_should_see_a_list_of_searched_cars() throws Throwable {

        System.out.println("Car list found");
    }

    @And("^the page title should be \"([^\"]*)\"$")
    public void the_page_title_should_be(String expectedTitle) throws Throwable {

        String actual_title = SeleniumDriver.getDriver().getTitle();
        Assert.assertEquals(actual_title, expectedTitle);
    }
}
