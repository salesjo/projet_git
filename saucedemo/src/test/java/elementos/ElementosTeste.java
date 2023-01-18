package elementos;

import org.openqa.selenium.By;

public class ElementosTeste {
	 public By username = By.xpath("//input[@id='user-name']");
	 public By password = By.xpath("//input[@id='password']");
	 public By btLogin = By.xpath("//input[@id='login-button']");
	 
	 //mensagem
	 public By msgBlock  = By.xpath("//*[text()='Epic sadface: Sorry, this user has been locked out.']");
	 public By msgemBranco  = By.xpath("//*[text()='Epic sadface: Username is required']");
	 public By msgInvalida  = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");
}
