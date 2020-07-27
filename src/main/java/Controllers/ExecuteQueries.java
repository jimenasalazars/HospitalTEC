/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hecto
 */
@WebServlet(name = "ExecuteQueries", urlPatterns = {"/ExecuteQueries"})
public class ExecuteQueries extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _Name = request.getParameter("txtName");
            
            String[] parts = _Name.split(" ");
            String Fname = "";
            String FLname = "";
            String SLname = "";
            
            if (parts.length == 4){
                Fname = parts[0] + " " + parts[1];
                FLname = parts[2];
                SLname = parts[3];
            }
            else{
                Fname = parts[0];
                FLname = parts[1];
                SLname = parts[2];
            }
            
            
            
            String _Date = request.getParameter("txtDate");
            
            String[] dateParts = _Date.split("/");
            String reDate = dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0];
            
            String _Address = request.getParameter("txtAddress");
            String _BT = request.getParameter("txtBT");
            String _Nat = request.getParameter("txtNat");
            
            try {
                Procedures.insert("NEW_PATIENT", new String[]{Fname, FLname, SLname, reDate, _BT, _Address, _Nat});
            } catch (SQLException ex) {
                System.out.println("Couldn't insert patient");
                Logger.getLogger(ExecuteQueries.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Patient Added Successfuly');");
            out.println("location='VerifyNewPatientInfo.jsp';");
            out.println("</script>");
            
            response.sendRedirect("AddNewPatient.jsp");
        }
    }        


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
        }
}