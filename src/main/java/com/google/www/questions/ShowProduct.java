package com.google.www.questions;

import static com.google.www.userinterfaces.ShoppingCartList.SHOPPING_CART_LIST;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class ShowProduct implements Question<Boolean>{

	
	@Step("{0} Show Product in Shopping Cart")
	@Override
	public Boolean answeredBy(Actor actor) {
		
		return SHOPPING_CART_LIST.resolveFor(actor).isVisible();
	}
	public static ShowProduct validate() {
		return new ShowProduct();
	}
}
