<html>
<h2>Registration Form</h2>  
    <form action ="formValidation.php"  method="post">
    <lebel for="fname">First Name : </lebel>
    <input type="text" id="fname" name="fname" required >
     
    <br>

    <lebel for="lname">Last Name : </lebel>
    <input type="text" id="lname" name="lname" required>
    
    <br>

    <lebel for="email">Email : </lebel>
    <input type="text" id="email" name="email"required>

    <br>

    <lebel for="address">Address : </lebel>
    <!-- <input type="text" id="address" name="address"/> -->
    <textarea id="address" name="address" required>
</textarea>
    <br>
     
    
    <lebel for="photo">Photo : </lebel>
    <input type="file" id="photo" name="photo" accept="image/*" required>
    <br>

    <button type="submit"  class="btn btn-primary" name="submit">Submit</button>
    <button type ="button" class="btn btn-secondary" id="cancel" name="cancel" >Cancel</button>


</form>


<script>
        // Get a reference to the "Cancel" button
        const cancelButton = document.getElementById("cancel");
        // Add an event listener to the "Cancel" button
        cancelButton.addEventListener("click", function() {
            // Get a reference to the form and reset all its fields to their default values
            const form = document.querySelector("form");
            form.reset();
        });
    </script>

<!-- <script>
    function cancel(){

        window.location.reload();

        document.getElementById("fname").value="";
        document.getElementById("lname").value="";
        document.getElementById("email").value="";
        document.getElementById("address").value="";
        document.getElementById("phtot").value="";

        var errors=document.querySelectorAll("#error");
        for(let i=0;i<error.length;i++){
            errors[i].innerHTML="";
        }
    }
    </script> -->
</html>