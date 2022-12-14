package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.LastFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteSignUpLastForm implements Task {

    protected String strPassword;

    public CompleteSignUpLastForm(String strPassword) {
        this.strPassword = strPassword;
    }

    public static CompleteSignUpLastForm stepFour(String strPassword) {
        return Tasks.instrumented(CompleteSignUpLastForm.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(strPassword).into(LastFormPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(LastFormPage.INPUT_CONFIRM_PASSWORD),
                Click.on(LastFormPage.INPUT_TERMS_OF_USE),
                Click.on(LastFormPage.INPUT_PRIVACY_SECURITY),

                Click.on(LastFormPage.BUTTON_COMPLETE_FORM)
        );
    }
}
