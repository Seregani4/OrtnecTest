package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.example.snapchat.ortnec;

public class loginPage extends ortnec{

    //try to remember how I should use page object pattern
    public static WebElement loginButton;
    public static WebElement emailField;
    public static WebElement passwordField;
    public static WebElement secondLoginButton;

    public loginPage() {
        loginButton = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
        emailField = driver.findElements(By.xpath("//android.widget.EditText[@index='0']")).get(0);
        passwordField = driver.findElements(By.xpath("//android.widget.EditText[@index='0']")).get(1);
        secondLoginButton = driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']"));
    }
}
