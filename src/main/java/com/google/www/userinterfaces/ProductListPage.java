package com.google.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {
	
	public static final Target DETAIL_PRODUCT = Target.the("Detail product").locatedBy("//*[@id='ResultItems_15745865']/div/ul/li[1]/div/div");
	public static final Target BUTTON_ADD_PRODUCT = Target.the("Button Add Product").locatedBy("//div[@id='ResultItems_37079683']/div/ul/li[1]/div/div/div[6]/div[5]/div[2]/button");
	public static final Target BUTTON_GO_TO_MY_SHOPPING_CART = Target.the("Button Go To My Shopping Cart").locatedBy("//div[@id='ResultItems_37079683']/div/ul/li[1]/div/div/div[6]/div[5]/div[2]/button");
}
