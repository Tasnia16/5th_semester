
<html>
    <body>
<?php

if(isset($_POST['submit'])){
 $fname=$_POST['fname'];
 $lname=$_POST['lname'];
 $email=$_POST['email'];
 $address=$_POST['address'];
 $photo=$_FILES['photo']['name'];

 if (empty($fname) || empty($lname) || empty($email) || empty($address) || empty($photo) ) {
    echo '<div class="alert alert-danger mt-3" role="alert">Please fill in all fields.</div>';
} 

else{

    echo '
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                        <p><strong>First Name:</strong> '.$fname.'</p>
                            <p><strong>Last Name:</strong> '.$lname.'</p>
                            <p><strong>Email:</strong> '.$email.'</p>
                            <p><strong>Address:</strong> '.$address.'</p>
                            
                        </div>
                        <div class="col-md-6">
                        <img src="'.$photo.'" alt="Photo" >
                        </div>
                    </div>
                </div>';
}

}

?>

</body>
    </html>