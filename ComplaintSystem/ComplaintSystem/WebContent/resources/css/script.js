
$(document).on("change", "#department", function() {   
	$.get("/ComplaintSystem/department", function(responseJson) { 
		
    	var value=document.getElementById("department").value;
    	var $el = $("#complainttype");
    	$el.empty();
    	$el.append($("<option></option>").attr("value", "null").text("Please Select.."));
        $.each(responseJson, function(index, department) {
        	
            if(department.departmentname==value){
            	$el.append($("<option></option>").attr("value",department.complainttype).text(department.complainttype));
             }	 
        });
    });
});
$(document).on("change", "#complainttype", function() {   
	
	$.get("/ComplaintSystem/department", function(responseJson) { 
		var value=document.getElementById("complainttype").value;
		var $el = $("#complainto");
		$.each(responseJson, function(index, department) {
		    if(department.complainttype==value){
		    	$el.empty();
		    	$el.append($("<option></option>").attr("value", department.departmenthead).text(department.departmenthead));
		     }	 
		});
    });
});


