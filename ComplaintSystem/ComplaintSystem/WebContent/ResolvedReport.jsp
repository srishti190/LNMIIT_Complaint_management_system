<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Report Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link href="${pageContext.request.contextPath}/resources/css/admin.css" rel="stylesheet">
</head>
<body>
 
<table height=85 border="5" bordercolor="black" style="width:100%; margin-top:50px; margin-left:00px;">
<tbody>
		<tr>
		<th>Serial No.</th>
		<th>Complaint_Id</th>
		<th>Complaint Details</th>
		<th>Location </th>
		<th>Location Site</th>
		<th>Preferred DateTime</th>
		<th>Complaint Status </th>
		</tr>
  <tr>
   <c:forEach items ="${RegisterDetails}" var="element"> 
        <tr>
        <td><center>${element.serial_id}</center></td>
        <td><center>${element.complaint_id}</center></td>
	    <td><center>${element.complaintdetails}</center></td>
	    <td><center>${element.location}</center></td>
	    <td><center>${element.location_site}</center></td>
	    <td><center>${element.preferreddatetime}</center></td>
	    <td><center>${element.complaint_status}</center></td>
	    </tr>
	</c:forEach>
	</tr>
	</tbody>
	</table>

</body>
</html>