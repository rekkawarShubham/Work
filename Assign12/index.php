<!DOCTYPE html>
<html>
<head>
	<title>My PHP ASS</title>
</head>
<body>
    
    <form method="POST" action="process.php">
    	<table>
    		<tr>
    			<td><label for="sname"> Student NAme</label></td>
    			<td><input type="text" name="sname" id="sname" placeholder="sname" required></td>
    		</tr>

    		<tr>
    			<td><label for="sroll"> Student Roll</label></td>
    			<td><input type="text" name="sroll" id="sroll" placeholder="sroll" required></td>
    		</tr>

    		<tr>
    			<td><label for="sdept"> Department</label></td>
    			<td><input type="text" name="sdept" id="sdept" placeholder="sdept" required></td>
    		</tr>
    	</table>
    	
    	<input type="submit" name="submit" value="submit">
    </form>

</body>
</html>