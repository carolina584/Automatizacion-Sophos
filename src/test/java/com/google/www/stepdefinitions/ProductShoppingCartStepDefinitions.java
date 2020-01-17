package com.google.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;
import com.google.www.models.NameProduct;
import com.google.www.questions.ShowProduct;
import com.google.www.tasks.AddProduct;
import com.google.www.tasks.Goto;
import com.google.www.tasks.Product;
import com.google.www.userinterfaces.PromartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ProductShoppingCartStepDefinitions {

	private PromartHomePage promartHomePage;
	public static NameProduct l;
	
	@Managed(driver = "chrome")
	public WebDriver driver;
	Actor User = Actor.named("user");

	@Before
	public void SetUp() {
		User.can(BrowseTheWeb.with(driver));
	}

	@Given("^the user enters the promart application$")
	public void theUserEntersThePromartApplication() {
		User.wasAbleTo(Goto.on(promartHomePage));
	}

	@When("^user searches '(.*)' and adds the product$")
	public void userSearchesColchonesAndAddsTheProduct(String nameProduct) {
		
		User.attemptsTo(Product.search(nameProduct));
		User.attemptsTo(AddProduct.toCart());
	}

	@Then("^valid that the product is shown in the shopping cart list$")
	public void validThatTheProductIsShownInTheShoppingCartList() {
		User.should(seeThat(ShowProduct.validate()));
		}}
