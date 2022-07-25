package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.PasswordModal;
import session.Session;

public class ChangePassTest {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();

    PasswordModal passwordModal = new PasswordModal();
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
    public void verifyLoginIsSuccessfully(){
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText("juniorgm@gmail.com");
        loginModal.pwdTxtBox.writeText("1234");
        loginModal.loginButton.click();

        mainPage.seettingButton.click();
        passwordModal.pwdOldTxtBox.writeText("1234");
        passwordModal.pwdNewTxtBox.writeText("1234");
        passwordModal.okButton.click();

        mainPage.logoutButton.click();



        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText("juniorgm@gmail.com");
        loginModal.pwdTxtBox.writeText("1234");
        loginModal.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");


    }
}
