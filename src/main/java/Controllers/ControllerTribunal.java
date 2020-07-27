/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
 
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class ControllerTribunal {
 
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Bases de Datos\\Progra 2\\Libs\\ChromeGeckoDriver\\chromedriver.exe");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        
        WebDriver driver =  new ChromeDriver(options);
        //driver.manage().window().setPosition(new Point(-2000, 0));
        driver.get("https://www.consulta.tse.go.cr/consulta_persona/consulta_cedula.aspx");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
        WebElement IDBox = driver.findElement(By.id("txtcedula"));
        IDBox.sendKeys("305180832");
        
        WebElement sendID = driver.findElement(By.id("Button1"));
        sendID.click();
        
        WebElement mostrarVotacion = driver.findElement(By.id("btnMostrarVotacion"));
        mostrarVotacion.click();
        
        WebElement nombre = driver.findElement(By.id("lblnombrecompleto"));
        String pNombre = nombre.getText();
        
        WebElement fecha = driver.findElement(By.id("lblfechaNacimiento"));
        String pFecha = fecha.getText();
        
        WebElement residencia = driver.findElement(By.id("Gridvotacion"));
        
        
        List<WebElement> allRows = residencia.findElements(By.tagName("tr"));
        String[] info = new String[8];
        
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.xpath("./*"));
            int i = 0;
            for (WebElement cell : cells) {
                info[i] = cell.getText();
                i = i+1;
            }
        }
        
        String pResidencia = info[1] + " " + info[2] + " " + info[3];
        
        System.out.println(pNombre);
        System.out.println(pFecha);
        System.out.println(pResidencia);
        driver.quit();
    }
}
