<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
    <head>
        <!-- title -->
        <title>NAME OF ORGANISATION</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1" />
        <link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
        </head>	
       <body>
        
        <img src="${pageContext.request.contextPath}/resources/img/port.png" alt="Norway" style="width:100%;"/>
        <div class="container1" id="hello">
            <form action="/ComplaintSystem/login" method="post"  >
              <div class="imgcontainer">
              <img src="${pageContext.request.contextPath}/resources/img/login-image.png" alt="Avatar" class="avatar" />
              </div>
              <div class="container">
                <label for="UserName"><b>USERNAME</b></label>
                <input type="text" id="username" placeholder="Enter Username" name="username" required>
                <span id="usernameError">${msg}</span>
                <br>
                <label for="Password"><b>PASSWORD</b></label>
                <input type="password" placeholder="Enter Password" name="password" required>
                 <span id="usernameError">${msg}</span> 
                 
                <button type="submit" >Login</button>
                <a class="button" href="/ComplaintSystem/adminlogin">If You Are Admin Click Here</a>
                
               </div>
               
               
               
           </form >
           
       </div>
        
      </body>     
 </html>