<?php
include("conn.php");
if(isset($_POST["submit"]))
 	{
 		$name=$_POST["sname"];
 		$roll=$_POST["sroll"];
 		$dept=$_POST["sdept"];


 		$sql="insert into student (student_rollno,student_name,student_dept) values ($roll,'$name','$dept') ";

 		$result=mysqli_query($conn,$sql);

 		if($result)
 		{
 			echo "Record of $roll stored successfully";
 		}
 		else
 		{
 			echo "Errorrr occured";
 		}
 	}

