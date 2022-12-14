package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.AddressFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CompleteSignUpAddressForm implements Task {
    public static CompleteSignUpAddressForm stepTwo() {
        return Tasks.instrumented(CompleteSignUpAddressForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

            WaitUntil.the(AddressFormPage.CITY_AUTO_DETECTED, WebElementStateMatchers.isVisible())
                                .forNoMoreThan(10).seconds(),

            /*Enter.theValue("Cali").into(AddressFormPage.INPUT_CITY),
            Enter.theValue("52007").into(AddressFormPage.INPUT_POSTAL_CODE),
            Click.on(AddressFormPage.INPUT_SELECT_COUNTRY),
            Enter.theValue("Colombia").into(AddressFormPage.INPUT_COUNTRY),
            Click.on(AddressFormPage.INPUT_ITEM_COUNTRY)*/

            Click.on(AddressFormPage.NEXT_DEVICES)
        );
    }
}
