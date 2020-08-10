/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportbd;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSetMetaData;

/**
 *
 * @author Usuario
 */
public class ReportBD {

    public static void pdfCreate3(String functionName, String nameDoc, String paramOne, String paramTwo, String id) throws SQLException, DocumentException, FileNotFoundException{
        
        String statement="select * from "+functionName+"("+paramOne+","+paramTwo+","+id+");";
        Statement stm;
        try {
            stm = DBConnection.con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error establishing connection. (Class: Procedures. Method: insert)");
            return;
        }
        
        System.out.println(statement);
        ResultSet rst = stm.executeQuery(statement);
        ResultSetMetaData columns = rst.getMetaData();
        
        Date fecha = new Date();
        DateFormat dateF = new SimpleDateFormat("hh-mm-ss_dd-mm-yyyy");
        String docDate = dateF.format(fecha);
        
        String file_name = "E:\\Archivos\\Trabjos TEC\\pdfs\\"+nameDoc+docDate+".pdf";
        
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(file_name));
        
        doc.open();
        Paragraph para = new Paragraph("                                                                        HospitalTEC"+"\n"+"\n"+"\n");
        doc.add(para);
        int returnCount = columns.getColumnCount();
        PdfPTable table = new PdfPTable(returnCount);
        
        System.out.println(returnCount);
        int count = 1;
        while(count<=returnCount){
            PdfPCell c1 = new PdfPCell(new Phrase(columns.getColumnName(count)));
            table.addCell(c1);
            count = count+1;
        }
        table.setHeaderRows(1);
        int count2=1;
        while(rst.next()){ 
            while(count2<=returnCount){
                PdfPCell c1 = new PdfPCell(new Phrase(rst.getString(count2)));
                table.addCell(c1);
                count2 = count2 + 1;
            }
            count2=1;
            }
        doc.add(table);
        doc.close();
    }

    public static void pdfCreate2(String functionName, String nameDoc, String paramOne, String paramTwo) throws SQLException, DocumentException, FileNotFoundException{
        
        String statement="select * from "+functionName+"("+paramOne+","+paramTwo+");";
        Statement stm;
        try {
            stm = DBConnection.con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error establishing connection. (Class: Procedures. Method: insert)");
            return;
        }
        
        System.out.println(statement);
        ResultSet rst = stm.executeQuery(statement);
        ResultSetMetaData columns = rst.getMetaData();
        
        Date fecha = new Date();
        DateFormat dateF = new SimpleDateFormat("hh-mm-ss_dd-mm-yyyy");
        String docDate = dateF.format(fecha);
        
        String file_name = "E:\\Archivos\\Trabjos TEC\\pdfs\\"+nameDoc+docDate+".pdf";
        
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(file_name));
        
        doc.open();
        Paragraph para = new Paragraph("                                                                        HospitalTEC"+"\n"+"\n"+"\n");
        doc.add(para);
        int returnCount = columns.getColumnCount();
        PdfPTable table = new PdfPTable(returnCount);
        
        System.out.println(returnCount);
        int count = 1;
        while(count<=returnCount){
            PdfPCell c1 = new PdfPCell(new Phrase(columns.getColumnName(count)));
            table.addCell(c1);
            count = count+1;
        }
        table.setHeaderRows(1);
        int count2=1;
        while(rst.next()){ 
            while(count2<=returnCount){
                PdfPCell c1 = new PdfPCell(new Phrase(rst.getString(count2)));
                table.addCell(c1);
                count2 = count2 + 1;
            }
            count2=1;
            }
        doc.add(table);
        doc.close();
    }
    
    public ReportBD() {
    }
    
    public static void pdfCreate1(String functionName, String nameDoc, String paramOne) throws SQLException, DocumentException, FileNotFoundException{
        
        String statement="select * from "+functionName+"("+paramOne+");";
        Statement stm;
        try {
            stm = DBConnection.con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error establishing connection. (Class: Procedures. Method: insert)");
            return;
        }
        
        System.out.println(statement);
        ResultSet rst = stm.executeQuery(statement);
        ResultSetMetaData columns = rst.getMetaData();
        
        Date fecha = new Date();
        DateFormat dateF = new SimpleDateFormat("hh-mm-ss_dd-mm-yyyy");
        String docDate = dateF.format(fecha);
        
        String file_name = "E:\\Archivos\\Trabjos TEC\\pdfs\\"+nameDoc+docDate+".pdf";
        
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(file_name));
        
        doc.open();
        Paragraph para = new Paragraph("                                                                        HospitalTEC"+"\n"+"\n"+"\n");
        doc.add(para);
        int returnCount = columns.getColumnCount();
        PdfPTable table = new PdfPTable(returnCount);
        
        System.out.println(returnCount);
        int count = 1;
        while(count<=returnCount){
            PdfPCell c1 = new PdfPCell(new Phrase(columns.getColumnName(count)));
            table.addCell(c1);
            count = count+1;
        }
        table.setHeaderRows(1);
        int count2=1;
        while(rst.next()){ 
            while(count2<=returnCount){
                PdfPCell c1 = new PdfPCell(new Phrase(rst.getString(count2)));
                table.addCell(c1);
                count2 = count2 + 1;
            }
            count2=1;
            }
        doc.add(table);
        doc.close();
    }
    
    public static void main(String[] args) throws FileNotFoundException, DocumentException, SQLException {
        
        ReportBD.pdfCreate3("appointmentPatientDate","Lohanna","'2020-07-24'", "'2020-07-28'", "3");
        ReportBD.pdfCreate2("TreatmentsPatientName","Gracias","'Chemotherapy'", "1");
        ReportBD.pdfCreate1("HospitalizedPatient","Pedro","3");
    }
    
}
