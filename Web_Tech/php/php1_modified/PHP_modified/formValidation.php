<html>

<body>
    <?php
    $con = mysqli_connect('localhost', 'root', '', 'form');
    $sql="SELECT * FROM info_table";
    $result=mysqli_query($con,$sql);
    $row=mysqli_fetch_assoc($result);

    $fname = $row['fname'];
    $lname = $row['lname'];
    $email = $row['email'];
    $address = $row['addressDetails'];
    $photo = $row['photo'];

    if (empty($fname) || empty($lname) || empty($email) || empty($address) || empty($photo)) {
        echo '<div class="alert alert-danger mt-3" role="alert">Please fill in all fields.</div>';
    } else {

        echo '
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                        <p><strong>First Name:</strong> ' . $fname . '</p>
                            <p><strong>Last Name:</strong> ' . $lname . '</p>
                            <p><strong>Email:</strong> ' . $email . '</p>
                            <p><strong>Address:</strong> ' . $address . '</p>
                            
                        </div>
                        <div class="col-md-6">
                        <img src="image_server/'.$photo.'"  alt="Photo" >
                        </div>
                    </div>
                </div>';
    }



    ?>

</body>

</html>