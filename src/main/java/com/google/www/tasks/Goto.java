package com.google.www.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Goto implements Task {

	private PageObject page;

	public Goto(PageObject page) {
		this.page = page;
	}

	@Step("Goto Aplication")
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Open.browserOn(page));
	}

	public static Goto on(PageObject page) {
		return Tasks.instrumented(Goto.class, page);
	}
}
