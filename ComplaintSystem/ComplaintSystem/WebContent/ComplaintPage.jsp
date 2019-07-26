<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
		<title>Complaint Page</title>
	
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
		<link href="${pageContext.request.contextPath}/resources/css/ComplaintPage.css" rel="stylesheet">
		<!-- google fonts -->
		<link rel="stylesheet" href='https://fonts.googleapis.com/css?family=Muli:300,500,400' type='text/css'>
		<!-- font awesome -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/css/script.js"></script>
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300" type="text/css" />
    </head>
	<body>
	<div  style="margin-left:1400px;margin-top:10px;width:100px;border-radius:40px;background-color:black;height:30px;text-align:center;padding-top:5px;" class="navigation">
  
	  <a style="text-decoration:none;color:white" class="btn1" href="/ComplaintSystem/logout">
       LOGOUT
      </a>
  
   </div>
    <div class="container" style="margin-top:30px">
    <div class="row">
		 <div class="col-sm-3">
			  <div class="w3-container">
			  <h2>Applicant Information </h2>
				  <ul class="w3-ul w3-card" style="width:100%">
				    <li style="color:black">Name of Applicant: <b> ${name}</b></li>
				    <li style="color:black">Registration Id : <b> ${rollno}</b></li>
				    <li style="color:black">Mobile No: <b> ${phoneno} </b></li>
				  </ul>
			   </div>
         </div>
	<div class="col-sm-9">
    	    <form action="/ComplaintSystem/submitcomplaint" method="post">
            <div class="form-row">
				  	<h1>COMPLAINT REGISTRATION FORM :-</h1>
                    	
				    <div class="col-md-4 mb-3">
				      <label for="validationServer02">Department :- </label>
				     
				      <select id="department" name="department" style="background-color: Black;color: #FFFFFF;"  required="required">
				      	<option value="None" >Please Select...</option>
				      	<option value="Dean of Academic Affair" >Dean of Academic Affair</option>
					    <option value="Registrar" >Registrar</option>
					    <option value="Chief Warden">Chief Warden</option>
					    <option value="Finance">Finance</option>
					    <option value="Maintainance">Maintainance</option>
					  </select>
				    </div>
                    
				     <div class="col-md-4 mb-3">
				      <label for="validationServer02">Complaint Type :- </label>
				      <select id="complainttype" name="complainttype" style="background-color: Black;color: #FFFFFF;"  required="required">
				      
				      </select>
				    
				    </div>
				    <div class="col-md-4 mb-3">
				      <label for="validationServer02">Complaint To :- </label>
				      <select id="complainto" name="complainto" style="background-color: Black;color: #FFFFFF;"  required="required">
				      
					  </select>
				    </div>
                      
                     <div class="col-12 col-md-8 high">
				      <label for="validationServer03">Complaint Details </label>
				      
				      <input  type="text" name="complaintdetails" class="form-control is-invalid retr" id="complaintdetails" placeholder="Details" required>
				     
					      <div class="invalid-feedback">
					        Please provide a valid complaint details.
					      </div>
				    </div>
             </div>
             <div class="form-row">

				     <div class="col-md-12 mb-12 high">
				      <label for="validationServer05"> Location : - </label>
				      <select id="location" name="location" style="background-color: Black;color: #FFFFFF;" required="required">

					    <option value="BH-1" >BH-1</option>
					    <option value="BH-2">BH-2</option>
					    <option value="BH-3">BH-3</option>
					    <option value="Faculty/StaffQuaters">Faculty/Staff Quaters</option>
					    <option value="GuestHouse">Guest House</option>
					    <option value="Lecture Hall Complex">Lecture Hall Complex</option>
					    <option value="Academic Block">Academic Block</option>
					    <option value="Main Gate 1">Main Gate 1</option>
					    <option value="Main Gate 2">Main Gate 2</option>
					    <option value="Sports Complex Area">Sports Complex Area</option>
					    <option value="Medical Unit">Medical Unit</option>
					    <option value="Shopping Complex">Shopping Complex</option>
					    <option value="Mess-A">Mess-A</option>
					    <option value="Mess-B">Mess-B</option>
					    <option value="Play Ground">Play Ground</option>
					    <option value="External Infrastructure ">External Infrastructure </option>
					    <option value="MME-Workshop">MME-Workshop</option>
					    <option value="MME-Building">MME-Building</option>
					</select>
				    </div>

				    <div class="col-12 col-md-12 high">
				      <label for="validationServer04">Location/Site of complaint:-</label>
				      <input type="text" name="locationsite" class="form-control is-invalid retr" id="locationsite" placeholder="Ex:-Room NO 10" required>
					      <div class="invalid-feedback">
					        Please provide a valid location.
					      </div>
				    </div>
              </div>
		        
		        <div class="col-12 col-md-8"> 
		     	 <p>Preferred Date:- <input type="date" min='2018-12-13' name="datepicker" id="datepicker" style="background-color: Black;color: #FFFFFF;" required></input></p>
		     	</div>
		     	
		     	<div class="col-6 col-md-4">
		     	 <p>Preferred Time: <input type="time" id="appt" name="appt" style="background-color: Black; color: #FFFFFF;"  min="09:00" max="18:00" required></input></p>
		     	</div>
		     
				 <button class="btn btn-primary" id="gh" type="Submit" align="Center">Submit</button>
				 
				 </form>
			 </div>
           </div>
        </div>
</body>
</html>