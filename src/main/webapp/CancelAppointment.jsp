<%-- 
    Document   : CancelAppointment
    Created on : Jul 27, 2020, 12:36:38 PM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cancel Appointment</title>
        <link href="bootstrap.css" type="text/css" rel="stylesheet">
    </head>
    <body><br><br><br><br><br><br><br><br><br><br><br>
    <center><h1>Select an Appointment to Cancel</h1></center>
    <br><br>
    <form action="" method="POST">
        <table align="center">
            <tr>
                <th align="right">Appointment Data:</th>
                <td colspan="2" align="center">
                    <select class="browser-default custom-select">
                        <option value="1">1 - Juanito Perez - 2020-07-07</option>
                        <option value="2">2 - Hector Delgado - 2021-02-20</option>
                        <option value="3">3 - María Monge - 2021-05-12</option>
                    </select>
                </td>
            </tr>
            <div class="col-md-4 text-center"> 
                <tr>
                    <td colspan="2" align="center"><a href="Doctor.jsp" class="btn btn-warning center-block">Go Back</a></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Cancel Appointment" class="btn btn-danger"></td>
                </tr>
            </div>
        </table>
    </form>
</body>
</html>
