<%-- 
    Document   : AddNewPatient
    Created on : Jul 24, 2020, 7:08:10 PM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Patient</title>
        <link href="bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body><br><br><br><br><br><br><br><br><br><br><br>
    <center><h1>Request Patient</h1></center>
    <br><br>
    <form action="WebServiceTribunal" method="POST">
        <table align="center">
                <tr>
                    <th align="right">ID Number</th>
                    <td><input type=text< name="txtID" placeholder="ID Number"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Request Information" class="btn btn-success"></td>
                </tr>
                <div class="col-md-4 text-center"> 
                    <tr>
                        <td colspan="2" align="center"><a href="AdminTools.jsp" class="btn btn-warning center-block">Go Back</a></td>
                    </tr>
                </div>
        </table>
    </form>
</body>
</html>
