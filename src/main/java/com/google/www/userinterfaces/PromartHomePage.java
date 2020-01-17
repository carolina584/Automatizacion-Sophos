package com.google.www.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://www.promart.pe/")
public class PromartHomePage extends PageObject {

	public static final Target FIELD_SEARCH = Target.the("Field Search").located(By.id("i-search"));
}
