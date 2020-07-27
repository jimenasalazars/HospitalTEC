/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author hecto
 */
@WebServlet(name = "WebServiceTribunal", urlPatterns = {"/WebServiceTribunal"})
public class WebServiceTribunal extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _ID = request.getParameter("txtID");
            
            try{
                if(!_ID.equals("")){
                    String[] info = scrapData(_ID);
                    
                    response.setContentType("text/html");  
                    out.println("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>Verify Info</title><link href=\"bootstrap.css\" type=\"text/css\" rel=\"stylesheet\"></head>");
                    out.println("<body><br><br><br><br><br><br><br><br><br><br><br>");
                    out.println("<center><h1>Is this info Correct?</h1></center><br><br>");
                    out.println("<form action=\"ExecuteQueries\" method=\"POST\">");
                    out.println("<table align=\"center\">");
                    out.println("<tr><center><th>Name</th></center><td><input type=text name=\"txtName\" value=\"" + info[0] + "\" readonly=\"true\" size=\"35\"></td></tr>");
                    out.println("<tr><center><th>Birth Date</th></center><td><input type=text name=\"txtDate\" value=\"" + info[1] + "\" readonly=\"true\" size=\"35\"></td></tr>");
                    out.println("<tr><center><th>Address</th></center><td><input type=text name=\"txtAddress\" value=\"" + info[2] + "\" readonly=\"true\" size=\"35\"></td></tr>");
                    out.println("<tr><center><th>Blood Type</th></center><td><input type=text name=\"txtBT\" size=\"35\" placeholder=\"Blood Type\" maxlength=\"20\"></td></tr>");
                    out.println("<tr><center><th>Nationality</th></center><td><input type=text name=\"txtNat\" size=\"35\" placeholder=\"Nationality\" maxlength=\"20\"\"></td></tr>");
                    out.println("<tr class=\"blank_row\"><td bgcolor=\"#FFFFFF\" colspan=\"3\">&nbsp;</td></tr>");
                    out.println("<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Yes\" class=\"btn btn-success\"></td></tr>");
                    out.println("<div class=\"col-md-4 text-center\"><tr><td colspan=\"2\" align=\"center\"><a href=\"AddNewPatient.jsp\" class=\"btn btn-danger center-block\">No</a></td></tr></div>");
                    out.println("</table></form></body></html>");
                    /*
                    
                    for(String data : info){
                        out.println(data);
                    }
                    response.sendRedirect(_ID);
                    */
                }
                else{
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Insert an ID to lookup');");
                    out.println("location='AddNewPatient.jsp';");
                    out.println("</script>");
                }
                
            } catch(Exception ie){
                out.println("Error:" + ie.getMessage());
            }
        }
    }        


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
        }
    
    public String[] scrapData(String ID){
        
        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Bases de Datos\\Progra 2\\Libs\\ChromeGeckoDriver\\chromedriver.exe");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        
        WebDriver driver =  new ChromeDriver(options);
        //driver.manage().window().setPosition(new Point(-2000, 0));
        driver.get("https://www.consulta.tse.go.cr/consulta_persona/consulta_cedula.aspx");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
        WebElement IDBox = driver.findElement(By.id("txtcedula"));
        IDBox.sendKeys(ID);
        
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
        
        String[] toReturn = new String[]{pNombre, pFecha, pResidencia};
        driver.quit();
        return toReturn;
    }
}