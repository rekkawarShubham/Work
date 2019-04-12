<?php
include_once("conn.php");
if(isset($_POST["submit"]))
{
      
      $name=$_POST["sname"];
      $roll=$_POST["sroll"];
      $dept=$_POST["sdept"];
      $class=$_POST["sclass"];
      $perc = $_POST["sper"];


      $sql = "insert into student1 values($roll,'$name','$dept','$class',$perc)";

      $result = mysqli_query($conn,$sql);

      if($result)
      {
      	echo "<script>alert('$roll stored successfully ')</script>";
        header("Location: viewrecord.php");
      }
      else{
      	echo "error occured";
      }
}
