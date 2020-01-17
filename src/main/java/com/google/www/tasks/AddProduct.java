package com.google.www.tasks;

import com.google.www.exceptions.NotFindElement;
import com.google.www.userinterfaces.ProductListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;

public class AddProduct implements Task {

	@Step("{0} Add product to cart")
	@Override
	public <T extends Actor> void performAs(T actor) {

		try {
			actor.attemptsTo(
					DoubleClick.on(ProductListPage.DETAIL_PRODUCT),
					Click.on(ProductListPage.BUTTON_ADD_PRODUCT),
					Click.on(ProductListPage.BUTTON_GO_TO_MY_SHOPPING_CART));
		} catch(AssertionError e) {
				throw new NotFindElement(NotFindElement.ELEMENT_NOT_FIND, e);
		}}
				
	public static AddProduct toCart() {
		return Tasks.instrumented(AddProduct.class);}}
