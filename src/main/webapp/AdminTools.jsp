<%-- 
    Document   : AdminTools
    Created on : Jul 24, 2020, 6:37:18 PM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrative Tools</title>
        <link href="bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body><br><br><br><br><br><br><br><br><br><br><br>
    <center><h1>Administrative Tools</h1></center>
    <br><br>
    <form action="" method="POST">
        <table align="center">
            <tr>
                <th align="right">Please select a function to proceed:</th>
            </tr>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="ManagePatients.jsp" class="btn btn-primary center-block">Manage Patients</a></td></center
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Doctor.jsp" class="btn btn-primary center-block">Manage Areas</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Nurse.jsp" class="btn btn-primary center-block">Manage Centers</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Secretary.jsp" class="btn btn-primary center-block">Manage Employees</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Frontpage.jsp" class="btn btn-primary center-block">Manage Diagnostics Catalog</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Frontpage.jsp" class="btn btn-warning center-block">Go Back</a></td>
                </tr>
            </div>
            

        </table>
    </form>
</body>
</html>
