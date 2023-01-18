package runnes;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    tags = "@login",
    monochrome = true,
    dryRun = false,
    plugin = {"pretty","html:target/cucumber-report.html"},
    snippets = SnippetType.CAMELCASE
  )
public class Executa extends DriversFactory {
	public static void abrirNavegador() {
		  boolean headless = false;
		  String  site ="https://www.saucedemo.com";
		     WebDriverManager.chromedriver().setup();
		      ChromeOptions chromeOptions = new ChromeOptions();
		      chromeOptions.addArguments("--start-maximized");
		      
		      if (headless) {
		       chromeOptions.addArguments("--headless"); 
		      }
		      driver = new ChromeDriver(chromeOptions);
		      driver.get(site);
		  }
		 public static void fecharNavegador() {
		  driver.quit();
		 }
		 
}
