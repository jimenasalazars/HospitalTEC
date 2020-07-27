<%-- 
    Document   : ManagePatients
    Created on : Jul 24, 2020, 7:05:08 PM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Patients</title>
        <link href="bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body><br><br><br><br><br><br><br><br><br><br><br>
    <center><h1>Manage Patients</h1></center>
    <br><br>
    <form action="" method="POST">
        <table align="center">
            <div class="col-md-4 text-center">
                <tr>
                    <td colspan="2" align="center"><a href="AddNewPatient.jsp" class="btn btn-primary center-block">Add New Patient</a></td></center
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Patient.jsp" class="btn btn-primary center-block">Delete Patient</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="AdminTools.jsp" class="btn btn-warning center-block">Go Back</a></td>
                </tr>
            </div>

        </table>
    </form>
</body>
</html>
