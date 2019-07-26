<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Admin page</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link href="${pageContext.request.contextPath}/resources/css/admin.css" rel="stylesheet">
</head>

<body>

 <form action="/ComplaintSystem/filescomplaint" method="post"  >
<table height=85 border="5" bordercolor="black" style="width:100%; margin-top:50px; margin-left:00px;">
<tbody>
		<tr>
		<th>Serial No.</th>
		<th>Complaint_Id</th>
		<th>Complaint_Date_Time</th>
		<th>Applicant Name</th>
		<th>Registration Id</th>
		<th>Complaint Type</th>
		<th>Complaint Details</th>
		<th>Location Site</th>
		<th>Preferred DateTime</th>
		<th>Phone No</th>
		<th>Status</th>
		</tr>
  <tr>
   <c:forEach items ="${ComplaintDetails}" var="element"> 
        <tr>
        <td><center>${element.serial_no}</center></td>
        <td><center>${element.complaint_id}</center></td>
	    <td><center>${element.complaint_date}</center></td>
	    <td><center>${element.applicantname}</center></td>
	    <td><center>${element.registeration_id}</center></td>
	    <td><center>${element.complaint_type}</center></td>
	    <td><center>${element.complaintdetails}</center></td>
	    <td><center>${element.location}</center></td>
	    <td><center>${element.preferreddatetime}</center></td>
	    <td><center>${element.phoneno}</center></td>
	    <td><input type="radio" name=${element.complaint_id} value="Resolved" required="required">Resolved</input><input type="radio" name=${element.complaint_id} value="Not resolved" required="required">Pending</input></td>
	    </tr>
	</c:forEach>
	</tr>
	</tbody>
	</table>

<input type="submit">Submit </input>
<a class="button" href="/ComplaintSystem/report">Generate Report </a>
<a class="button" href="/ComplaintSystem/Resolved">Generate Resolved Report </a>

</form>

</body>
</html>