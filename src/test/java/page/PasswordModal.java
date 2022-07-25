package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class PasswordModal {
    public TextBox pwdOldTxtBox = new TextBox(By.id("TextPwOld"));
    public TextBox pwdNewTxtBox = new TextBox(By.id("TextPwNew"));
    public Button okButton = new Button(By.xpath("//button[span='Ok']"));
}
