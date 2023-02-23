<?php
 $fname=$_POST['fname'];
 $lname=$_POST['lname'];
 $email=$_POST['email'];
 $address=$_POST['address'];
 $photo=$_POST['photo'];
 $con= mysqli_connect('localhost','root','password','form');

 if($con->connect_error)
 {
    die('Connect Failes : ' .$con->connect_error);
 }

 else{
    $sql1=$con->prepare("insert into Form(fname,lname,email,address,photo)
    values(?,?,?,?,?)");

    $sql1->bind_param("yehh", $fname,$lname,$email,$address,$photo);
    $sql1->execute();
    echo "Registration okkkk..........";
    $sql1->close();
    $con->close(); 
 }

 ?>