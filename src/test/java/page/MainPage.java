package page;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Button registerButton = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));

    public Button seettingButton = new Button(By.xpath("//a[@href='javascript:OpenSettingsDialog();']"));

    public Button logoutButton =  new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
}
