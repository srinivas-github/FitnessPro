<!DOCTYPE html>
<html>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
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

<form action="/saveUserGoals">

<div class="container" align="center" >
	<h3>Goal Setting</h3>
	
	<table align="center" >
	<tr>
	<td>
	<label align="center"><b>No of Step's</b></label>
	</td>
	<td>
	    <input type="text" placeholder="Enter NO of Steps" name="noofsteps" required >
</td>
    
	</tr>
	
	
	<tr>
	<td>
	<label align="center"><b>PushUp's</b></label>
	</td>
	<td>
	    <input type="text" placeholder="Enter Pushup's" name="pushups" required >
</td>
    
	</tr>
	
	
	<tr>
	<td>
	<label align="center"><b>Cycling</b></label>
	</td>
	<td>
	    <input type="text" placeholder="Enter KM's" name="cyling" required >
</td>
    
	</tr>
	
	
	<tr>
	<td>
	<label align="center"><b>Ab's</b></label>
	</td>
	<td>
	    <input type="text" placeholder="Enter no of ABs" name="abs" required>
</td>
    
	</tr>
	
	
	<tr>
	<td>
	<label align="center"><b>Squats</b></label>
	</td>
	<td>
	    <input type="text" name="squats" required>
</td>
    
	</tr>
	
	
	
	
	</table>
	
	
		
		<br>
		<table align="center"><tr><td>
	
    <button type="submit" >Submit</button></td><td>
	<button type="reset">Reset</button>
	</td></tr></table>
  
</form>


</body>
</html>
