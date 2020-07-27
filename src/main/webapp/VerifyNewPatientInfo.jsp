<%-- 
    Document   : VerifyNewPatientInfo
    Created on : Jul 25, 2020, 3:15:48 AM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>Verify Info</title><link href="bootstrap.css" type="text/css" rel="stylesheet"></head>
    <body><br><br><br><br><br><br><br><br><br><br><br>
    <center><h1>Is this info Correct?</h1></center><br><br>
    <form action="" method="POST">
        <table align="center">
                <tr><center><th>Name</th></center><td><input type=text name="txtName" value="Vamo" readonly="true" size="35" maxlength="20"></td></tr>
                <tr><center><th>Birth Date</th></center><td><input type=text name="txtDate" value="Ronaldo" readonly="true" size="35" maxlength="20"></td></tr>
                <tr><center><th>Address</th></center><td><input type=text name="txtAddress" value="Soccer" readonly="true" size="35" maxlength="20"></td></tr>
                <tr><center><th>Additional Required Information</th></tr>
                <tr><center><th>Blood Type</th></center><td><input type=text name="txtBT" size="35" placeholder="Blood Type" maxlength="20"></td></tr>
                <tr><center><th>Nationality</th></center><td><input type=text name="txtNat" size="35" placeholder="Nationality" maxlength="20""></td></tr>
                <tr class="blank_row"><td bgcolor="#FFFFFF" colspan="3">&nbsp;</td></tr>
                <tr><td colspan="2" align="center"><input type="submit" value="Yes" class="btn btn-success"></td></tr>
                <div class="col-md-4 text-center"><tr><td colspan="2" align="center"><a href="AddNewPatient.jsp" class="btn btn-danger center-block">No</a></td></tr></div>
        </table></form></body></html>
