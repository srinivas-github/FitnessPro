<!DOCTYPE html>
<html>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 30%;
    padding: 12px 20px;
    margin: 5px 0;
    display: inline-block;
    border: 1px solid #ccc;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}


span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
<body>

	<br><br><br><br><br><br>

<form action="/signup/processLogin" method="get" >

<div class="container" align="center" >
	<h3>Sign into Fitness Buzz</h3>
    <div class="container" align="center">
    <label align="center"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
	</div>
	
<div class="container" align="center" >
	
	<label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pwd" required>
	
</div>
		
		<br>
		<table align="center"><tr><td>
	
    <button type="submit" >Login</button></td><td>
	<button type="reset">Reset</button>
	</td></tr></table>
  
</form>

<h5>New to FITBUZZ ? </h5> <a href="registration.jsp">Create an account</a>

</body>
</html>
