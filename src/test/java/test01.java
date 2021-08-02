import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class test01
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.firefox.driver", "/drivers/selenium-firefox-driver-3.141.59.jar");
        File pathBinary = new File("D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathBinary);
        FirefoxProfile ffProfile = new FirefoxProfile();
        FirefoxDriver ffDriver = new FirefoxDriver(ffBinary,ffProfile);

        WebDriver driver = new FirefoxDriver();


         driver.get("https://demoqa.com/");

    }
}
