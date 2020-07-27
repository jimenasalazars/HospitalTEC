<%-- 
    Document   : Frontpage
    Created on : Jul 24, 2020, 4:11:29 PM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Employee!</title>
        <link href="bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body><br><br><br><br><br><br><br><br><br><br><br>
    <center><h1>Welcome Employee!</h1></center>
    <br><br>
    <form action="" method="POST">
        <table align="center">
            <tr>
                <th align="right">Please select your role:</th>
            </tr>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Doctor.jsp" class="btn btn-primary center-block">Doctor</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Nurse.jsp" class="btn btn-primary center-block">Nurse</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Secretary.jsp" class="btn btn-primary center-block">Secretary</a></td>
                </tr>
            </div>
            <div class="col-md-4 text-center">
                <tr>
                    <td colspan="2" align="center"><a href="AdminTools.jsp" class="btn btn-danger center-block">Administrative Tools</a></td></center
                </tr>
            </div>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="index.jsp" class="btn btn-warning center-block">Go Back</a></td>
                </tr>
            </div>

        </table>
    </form>
</body>
</html>
