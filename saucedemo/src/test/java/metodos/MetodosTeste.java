package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.DriversFactory;

public class MetodosTeste extends DriversFactory{

	 public void escrever(By elemento,String texto) {
		  driver.findElement(elemento).sendKeys(texto);
		 }
		 public void clicar(By elemento) {
		  driver.findElement(elemento).click();
		 }
		 public void currentUrl( String urlDesejda) {
		  assertEquals(urlDesejda,  driver.getCurrentUrl());
		 }
		 
		 
		 public void evidencia(String nomeEvidencia) {
		   TakesScreenshot scrShot = (TakesScreenshot) driver;
		      File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		    File destFile = new File("./evidencias" + nomeEvidencia + ".png");
		    try {
		     FileUtils.copyFile(scrFile, destFile);
		    } catch (IOException e) {
		    
		     e.printStackTrace();
		    }
		 }
		public void validarTexto(By elemento, String mensagemEsperada) {
			String msgCapturada = driver.findElement(elemento).getText();
			assertEquals(msgCapturada, mensagemEsperada);
		}
}
