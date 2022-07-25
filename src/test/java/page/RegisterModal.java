package page;

import control.Button;
import control.TextBox;
import javafx.scene.control.CheckBox;
import org.openqa.selenium.By;

public class RegisterModal {
    public TextBox nameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button termCheck = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button registerButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
