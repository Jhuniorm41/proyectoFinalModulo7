package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.RegisterModal;
import session.Session;

import java.util.Map;

public class MyStepRegister {


    MainPage mainPage = new MainPage();
    RegisterModal registerModal = new RegisterModal();
    MenuSection menuSection= new MenuSection();


    @Given("la pagina {string} este abierta")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero realizar el register")
    public void yoQuieroRealizarElRegister(Map<String,String> credential) {
        mainPage.registerButton.click();
        registerModal.nameTxtBox.writeText(credential.get("name"));
        registerModal.emailTxtBox.writeText(credential.get("email"));
        registerModal.pwdTxtBox.writeText(credential.get("password"));
        registerModal.termCheck.click();
        registerModal.registerButton.click();
    }

    @Then("yo deberia ingresar a la app web")
    public void yoDeberiaIngresarALaAppWeb() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}
