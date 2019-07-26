<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link href="${pageContext.request.contextPath}/resources/css/Complaint.css" rel="stylesheet">
</head>

<body>
<div id="msg">Welcome ${email}</div>
<div class="navigation">
  
	<a class="bt" href="/ComplaintSystem/logout">
    <div class="logout">LOGOUT</div>
   </a>
  
</div>
<form action="/ComplaintSystem/Complaint" method="GET"  >
<button class="btn" type="Submit" >File a complaint</button>
</form>
<br>

<table height=85 border="5" bordercolor="black" style="width:100%; margin-top:40px; margin-left:00px;">
  <tbody><tr>
    
	<th>Serial No.</th>
	<th>Complaint_Id</th>
	<th>Complaint_Type</th>
	<th>Complaint_Details</th>
	<th>Department</th>
	<th>Preferred_Date_Time</th>
	<th>Status</th>
	</tr>
	<c:forEach items ="${ComplaintDetails}" var="element"> 
        <tr>
        <td><center>${element.serial_id}</center></td>
        <td><center>${element.complaintId}</center></td>
	    <td><center>${element.complaintType}</center></td>
	    <td><center>${element.complaintDetails}</center></td>
	    <td><center>${element.department}</center></td>
	    <td><center>${element.preferredDateTime}</center></td>
	    <td><center>${element.status}</center></td>
        </tr>
	</c:forEach>
    </tbody>
    </table>
</body>
</html>