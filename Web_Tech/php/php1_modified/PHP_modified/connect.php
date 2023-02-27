<?php
if (isset($_POST['submit'])) {
   $con = mysqli_connect('localhost', 'root', '', 'form');
   $fname = $_POST['fname'];
   $lname = $_POST['lname'];
   $email = $_POST['email'];
   $address = $_POST['address'];
   $imageName = $_FILES['photo']['name'];

   if ($con->connect_error) {
      die('Connect Failes : ' . $con->connect_error);
   } else {
      $tmp_imageLocation = $_FILES['photo']['tmp_name'];

      $uploadLocation = "image_server/";

      move_uploaded_file($tmp_imageLocation, $uploadLocation . $imageName);

      $sql1 = $con->prepare("INSERT INTO info_table (fname,lname,email,addressDetails,photo)
    values(?,?,?,?,?)");

      $sql1->bind_param("sssss", $fname, $lname, $email, $address, $imageName);
      $sql1->execute();
      echo "Registration okkkk..........";
      $sql1->close();
      $con->close();
      header("Location:formValidation.php");
   }
}
?>