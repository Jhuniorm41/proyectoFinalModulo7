package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.PasswordModal;
import session.Session;

import java.util.Map;

public class MyStepChangePassword {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();

    PasswordModal passwordModal = new PasswordModal();
    MenuSection menuSection= new MenuSection();


    @Given("la pagina {string} este abierta")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero realizar el login")
    public void yoQuieroRealizarElLogin(Map<String,String> credential) {
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(credential.get("email"));
        loginModal.pwdTxtBox.writeText(credential.get("password"));
        loginModal.loginButton.click();
    }

    @Then("yo deberia ingresar a la app web setting")
    public void yoDeberiaIngresarALaAppWebSetting(Map<String,String> password) {
        mainPage.seettingButton.click();
        passwordModal.pwdNewTxtBox.writeText(password.get("oldPass"));
        passwordModal.pwdNewTxtBox.writeText(password.get("newPass"));
        passwordModal.okButton.click();
    }

    @When("yo deberia ingresar a la app web con nuevo password")
    public void yoDeberiaIngresarALaAppWebNuevoPassword(Map<String,String> credential) {
        mainPage.logoutButton.click();

        mainPage.loginButton.click();
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(credential.get("email"));
        loginModal.pwdTxtBox.writeText(credential.get("password"));
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }

    @Then("yo deberia ingresar a la app web")
    public void yoDeberiaIngresarALaAppWeb() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");
    }
}
