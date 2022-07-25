package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.RegisterModal;
import session.Session;

import java.util.Random;

public class RegisterTest {
    MainPage mainPage = new MainPage();
    RegisterModal registerModal = new RegisterModal();
    MenuSection menuSection= new MenuSection();

    @BeforeEach
    public void goWebApp(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @AfterEach
    public void closeWebApp(){
        Session.getInstance().closeSession();
    }

    @Test
    public void verifyRegisterIsSuccessfully(){
        Random rand = new Random();

// Obtain a number between [0 - 49].
        int n = rand.nextInt(500);
        String correo = "juniorguzman" + n + "@gmail.com";
        mainPage.registerButton.click();
        registerModal.nameTxtBox.writeText("Vinx Junior Guzman Martinez");
        registerModal.emailTxtBox.writeText(correo);
        registerModal.pwdTxtBox.writeText("12345");
        registerModal.termCheck.click();
        registerModal.registerButton.click();



        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el registro fallo");

    }
}
