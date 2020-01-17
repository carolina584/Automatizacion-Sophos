package com.google.www.tasks;

import org.openqa.selenium.Keys;
import com.google.www.exceptions.NotFindElement;
import com.google.www.userinterfaces.PromartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Product implements Task {

	private String nameProduct;

	public Product(String name) {
		this.nameProduct = name;
	}

	@Step("{0} Search Product")
	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			actor.attemptsTo(Click.on(PromartHomePage.FIELD_SEARCH),
					Enter.theValue(nameProduct).into(PromartHomePage.FIELD_SEARCH).thenHit(Keys.ENTER));
		} catch (AssertionError e) {
			throw new NotFindElement(NotFindElement.ELEMENT_NOT_FIND, e);
		}}
	
	public static Product search(String nameProduct) {
		return Tasks.instrumented(Product.class, nameProduct);}}
