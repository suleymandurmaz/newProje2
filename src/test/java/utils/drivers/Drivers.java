package utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drivers {
    public  static WebDriverWait wait;
  public   static WebDriver driver;
  public static WebDriver getDriver(){


      WebDriverManager.chromedriver().setup();
      ChromeOptions chromeOptions=new ChromeOptions();
      chromeOptions.addArguments("--remote-allow-origins=*");
      driver=new ChromeDriver(chromeOptions);


      return driver;
  }


}
