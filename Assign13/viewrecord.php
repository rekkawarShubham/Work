<?php
include_once "conn.php";

  $query="select * from student1 order by student_perc";

  $result=mysqli_query($conn,$query);
?>
<table><th>Name</th><th>Roll No</th><th>Class </th><th> Department </th><th> Percentage</th>

<?php
  
  if(mysqli_num_rows($result)>0)
  {
  	while($row = mysqli_fetch_assoc($result))
  	{
  		echo "<tr><td>".$row["student_name"]."</td><td>".$row["student_rollno"]."</td><td>".$row["student_class"]."</td><td>".$row["student_dept"]."</td><td>".$row["student_perc"]."</td></tr>";
  	}
  }

  echo "</table>";

