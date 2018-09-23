package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;

import java.util.List;

public class UsedCarsSteps {

    CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
    UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();

    @And("^click on \"([^\"]*)\" link on Used Search Car page$")
    public void click_on_link_on_Used_Search_Car_page(String arg1) throws Throwable {
        carsGuideHomePageActions.clickOnUsedCarsSearchMenu();
    }

    @And("^select car brand as \"([^\"]*)\" from AnyMake dropdown on Used Search Car page$")
    public void select_car_brand_as_from_AnyMake_dropdown_on_Used_Search_Car_page(String carBrand) throws Throwable {
        usedCarsSearchPageActions.selectCarMake(carBrand);
    }

    @And("^select car model on Used Search Car page$")
    public void select_car_model_on_Used_Search_Car_page(List<String> list) throws Throwable {
        String menu = list.get(1);
        usedCarsSearchPageActions.selectCarModel(menu);
    }

    @And("^select location as \"([^\"]*)\" from SelectLocation dropdown on Used Search Car page$")
    public void select_location_as_from_SelectLocation_dropdown_on_Used_Search_Car_page(String location) throws Throwable {    // Write code here that turns the phrase above into concrete actions
        usedCarsSearchPageActions.selectLocation(location);
    }

    @And("^select price as \"([^\"]*)\" from Price dropdown on Used Search Car page$")
    public void select_price_as_from_Price_dropdown_on_Used_Search_Car_page(String carPrice) throws Throwable {
       usedCarsSearchPageActions.selectCarprice(carPrice);
    }

    @And("^click on Find_My_Next_Car button on Used Search Car page$")
    public void click_on_Find_My_Next_Car_button_on_Used_Search_Car_page() throws Throwable {
        usedCarsSearchPageActions.clickOnFindMyNextCarButton();
    }

    @Then("^I should see a list of searched cars on Used Search Car page$")
    public void i_should_see_a_list_of_searched_cars_on_Used_Search_Car_page() throws Throwable {
        System.out.println("Used car list populated");
    }
}
