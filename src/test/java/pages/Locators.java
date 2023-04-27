package pages;

import org.openqa.selenium.By;

public  class Locators {
 public  static   By lLogin= By.xpath("//a[@href='/login'][contains(.,'Signup / Login')]");
  public static By lImail=By.xpath("//input[contains(@data-qa,'login-email')]");
  public static By LPassword=By.xpath("//input[contains(@type,'password')]");
  public static By LLoginButton=By.xpath("//button[text()='Login']");
  public static By LlogoutLink=By.xpath("//a[@href='/logout'][contains(.,'Logout')]");



}
